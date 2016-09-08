tomcat配置项目的图片路径不在项目下的处理

```
<Host appBase="webapps" autoDeploy="true" name="localhost" unpackWARs="true" xmlNamespaceAware="false" xmlValidation="false">

     <Context docBase="weibo" path="/weibo" reloadable="true" source="org.eclipse.jst.jee.server:weibo"/>
          <!-- 设置图片虚拟路径[访问时路径为/static_img] -->
     <Context path="/static_img" docBase="F:\temp" reloadable="false" />
</Host>
<!-- 也可以这样设置图片虚拟路径 -->
<Host name="10.0.0.123" appBase="webapps"
            unpackWARs="true" autoDeploy="true"
            xmlValidation="false" xmlNamespaceAware="false">

	 <Context path="" docBase="F:\temp" reloadable="false" ></Context>
</Host>
```