package com.eight.mvc;

/**
 * @Author liwei
 * @Date 2020/9/5 10:57
 * @Version 1.0
 */


import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionBindingEvent;
import java.net.URISyntaxException;
import java.util.Map;

/**
 * 该注解 ：表示不用在web.xml里配置，注解后自动配置
 */
@WebListener()
public class ContextConfigListener implements ServletContextListener,
        HttpSessionListener, HttpSessionAttributeListener {

    // Public constructor is required by servlet spec
    public ContextConfigListener() {
    }

    // -------------------------------------------------------
    // ServletContextListener implementation
    // -------------------------------------------------------

    /**
     * 监听器的生命周期
     * 表示项目启动后执行该方法的内容
     * @param sce 上下文
     */
    public void contextInitialized(ServletContextEvent sce) {
      /* This method is called when the servlet context is
         initialized(when the Web application is deployed).
         You can initialize servlet context related data here.
      */
        try {
            /*
            加载工厂类，注入Bean
             */
            String iocFactory = "com.eight.ioc.BeanFactory";
            Class.forName(iocFactory);

            Map<String,ControllerMapping> controllerMapping = new Configuration().config();
            /*
            服务端给网页（jsp）传数据，把数据放入某个作用域：request、session、application
             */
            //这是applicaton(全局变量)
            sce.getServletContext().setAttribute("com.eight.web.controller",controllerMapping);
        } catch (URISyntaxException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void contextDestroyed(ServletContextEvent sce) {
      /* This method is invoked when the Servlet Context
         (the Web application) is undeployed or
         Application Server shuts down.
      */
    }

    // -------------------------------------------------------
    // HttpSessionListener implementation
    // -------------------------------------------------------
    public void sessionCreated(HttpSessionEvent se) {
        /* Session is created. */
    }

    public void sessionDestroyed(HttpSessionEvent se) {
        /* Session is destroyed. */
    }

    // -------------------------------------------------------
    // HttpSessionAttributeListener implementation
    // -------------------------------------------------------

    public void attributeAdded(HttpSessionBindingEvent sbe) {
      /* This method is called when an attribute
         is added to a session.
      */
    }

    public void attributeRemoved(HttpSessionBindingEvent sbe) {
      /* This method is called when an attribute
         is removed from a session.
      */
    }

    public void attributeReplaced(HttpSessionBindingEvent sbe) {
      /* This method is invoked when an attibute
         is replaced in a session.
      */
    }
}
