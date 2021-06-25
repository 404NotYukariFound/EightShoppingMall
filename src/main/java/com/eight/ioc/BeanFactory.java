package com.eight.ioc;


import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class BeanFactory {

    /**
     * 饿汉模式
     */
    private static BeanFactory instance = new BeanFactory();

    public static Map<String, Object> map = new HashMap<String, Object>();

    static List<Element> list;

    //静态块：JVM遇到静态块会直接执行
    static {
        try {
            SAXReader reader = new SAXReader();
            //表示BeanFactory类要用applicationContext.xml文件
            InputStream in = Class.forName("com.eight.ioc.BeanFactory")
                    .getResourceAsStream("/applicationContext.xml");
            Document doc = reader.read(in);
            // xPathExpression：xPath表达式
            list = doc.selectNodes("/beans/bean");
            for (Element ele : list) {
                parseElement(ele);
            }
        } catch (ClassNotFoundException | DocumentException | SecurityException | IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    /**
     * 解析xml的数据
     * @param ele
     */
    public static void parseElement(Element ele) {
        try {
            /**
             * 通过反射创建对象
             */
            Object beanObj = null;
            Class clazz = null;
            String id = ele.attributeValue("id");
            if (map.get(id) == null) {
                clazz = Class.forName(ele.attributeValue("class"));
                beanObj = clazz.newInstance();
                map.put(id, beanObj);
            }

            //ele是否有子元素
            Object obj = null;
            String ref = "";
            List<Element> childElements = ele.elements();//得到ele的子元素集合
            for (Element childEle : childElements) {
                ref = childEle.attributeValue("ref");
                obj = map.get(ref);
                //刚开始无法获取ref的value，因为第一次的遍历list从第一个元素开始，后面的ref没有填入
                // 所以虽然ref没有遍历到，如果ref存在，则在这里面递归，直至找到ref并且执行后 结束
                if (obj == null) {
                    for (Element el : list) {
                        String ids = el.attributeValue("id");
                        if (ids.equals(ref)) {
                            parseElement(el);// 递归处理，直至找到ref对应的id
                        }
                    }
                }
                obj = map.get(ref);
                if (clazz != null) {
                    Method methods[] = clazz.getDeclaredMethods();
                    for (Method m : methods) {
                        if (m.getName().startsWith("set") && m.getName().toLowerCase().contains(ref.toLowerCase())) {
                        /*
                        反射调用类的setXXX方法实现bean的自动注入
                         */
                            //需要类有set方法，否则这个方法，只是把id和class进行key-value绑定，然后传出去
                            m.invoke(beanObj, obj);
                        }
                    }
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SecurityException | IllegalArgumentException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }



    private BeanFactory() {
    }

    public static BeanFactory getInstance() {
        return instance;
    }

    public Object getBean(String id) {
        return map.get(id);
    }
}