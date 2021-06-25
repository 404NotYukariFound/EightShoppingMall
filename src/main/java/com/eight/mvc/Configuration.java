package com.eight.mvc;

import com.eight.mvc.annotation.Controller;
import com.eight.mvc.annotation.RequestMapping;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.reflect.MethodUtils;

import java.io.File;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

/**
 * 项目启动时就运行 该类！！！！
 * 获取注解和类和注解的方法
 * 方便日后使用
 */
public class Configuration {

    public Map<String, ControllerMapping> config() throws URISyntaxException {
        //最终目的 是存储 key：注解名  value：存有 类和带有注解的方法的  bean类
        Map<String, ControllerMapping> controllerMapping = new HashMap<String, ControllerMapping>();
        //根据配置文件获取里面的key和value
        ResourceBundle bundle = ResourceBundle.getBundle("config");
        //根据key获取value
        String controllerPackageName = bundle.getString("controller.package");
        /**
         * 把报名转换为路径
         */
        //  /代表classpath路径，即当前项目路径,转为uri，可以网络访问
        URI uri = Configuration.class.getResource("/" + controllerPackageName.replace(".", "/")).toURI();
        System.out.println(uri.toString());
        //访问uri，获得该下的内容
        File file = new File(uri);

        String controllerClassNames[] = file.list();
        for (String className : controllerClassNames) {
            if (className.endsWith(".class")) {
                String fullClassName = controllerPackageName + "." + StringUtils.substringBefore(className, ".class");
                System.out.println("全类名：" + fullClassName);
                try {
                    //把类存入jvm内存中，并且创建一个接口给对象访问
                    Class controllerClass = Class.forName(fullClassName);
                /*
                如果clazz中有Controller注解，才进一步处理
                 */
                    if (controllerClass.isAnnotationPresent(Controller.class)) {
                        Method methods[] = MethodUtils.getMethodsWithAnnotation(controllerClass, RequestMapping.class);
                    /*
                    把注解的信息暂时存储到一个map中，以便在Servlet中收到相应的请求后，找到相应的控制器的方法去处理请求
                     */
                        for (Method method : methods) {
                            RequestMapping annotation = method.getAnnotation(RequestMapping.class);
                            ControllerMapping mapping = new ControllerMapping(controllerClass, method);
                            System.out.println("注解的值：" + annotation.value());
                            controllerMapping.put(annotation.value(), mapping);
                        }
                    }
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        }
        return controllerMapping;
    }
}
