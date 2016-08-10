## Intellj

1. Intellj IDEA显示行号
> File>setting>editor>appearance>general>show line numbers

2. src中资源文件编译进classes文件夹
> IDEA的maven项目中，默认源代码目录下的xml等资源文件并不会在编译的时候一块打包进classes文件夹，而是直接舍弃掉。<br>
> Eclipse的src目录下的xml等资源文件在编译的时候会自动打包进输出到classes文件夹。<br>
> 解决方案：
>> 1. 将xml等资源文件放置到src/main/resources文件夹<br>
>> 2. 配置maven的pom文件配置，在pom文件中找到<build>节点，添加下列代码：<br>
>> ```
      <build>
        <resources>
            <resource>
                <directory>src/main/java</directory>
                <includes>
                    <include>**/*.xml</include>
                </includes>
            </resource>
        </resources>
    </build>
    ```

---

## Tomcat

1. 修改端口
在Tomcat的conf文件夹里有个server.xml文件，修改里面的<Connector port="80"