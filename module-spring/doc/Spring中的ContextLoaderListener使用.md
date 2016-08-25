作用：在启动Web容器时，自动装配Spring applicationContext.xml的配置信息。

如果在web.xml中不写任何参数配置信息，默认的路径是"/WEB-INF/applicationContext.xml，在WEB-INF目录下创建的xml文件的名称必须是applicationContext.xml。

如果是要自定义文件名可以在web.xml里加入contextConfigLocation这个context参数：
```
<context-param>  
    <param-name>contextConfigLocation</param-name>  
    <param-value>  
        /WEB-INF/classes/applicationContext-*.xml   
    </param-value>  
</context-param> 
```

在ContextLoaderListener中关联了ContextLoader这个类，所以整个加载配置过程由ContextLoader来完成。看看它的API说明
第一段说明ContextLoader可以由 ContextLoaderListener和ContextLoaderServlet生成。如果查看ContextLoaderServlet的API，可以看到它也关联了ContextLoader这个类而且它实现了HttpServlet。这个接口
    第二段，ContextLoader创建的是 XmlWebApplicationContext这样一个类，它实现的接口是WebApplicationContext->ConfigurableWebApplicationContext->ApplicationContext->
BeanFactory这样一来spring中的所有bean都由这个类来创建
 
IUploaddatafileManager uploadmanager = (IUploaddatafileManager) ContextLoaderListener.getCurrentWebApplicationContext().getBean("uploadManager");
