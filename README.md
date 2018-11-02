# springboot-dubbo
使用springBoot和dubbo搭建入门实例

项目使用技术
SpringBoot+Dubbo+zookeeper(自己本地搭建)

dubbo-admin说明：
（1）dubbo admin在dubbo源码最新版本已被改名，我使用的是dubbo-admin-2.6
（2）下载dubbo-admin源代码在本地进行编译打包，同时在tomcat8容器中不兼容，可放置到tomcat7容器当中
（3）dubbo-admin-2.6解压之后修改dubbo.properties中zookeeper的地址

运行项目：
（1）分别运行springboot-dubbo项目的两个子模块，访问网址http://localhost:8087/hello 查看是否有“hello...demo”
（2）dubbo-admin在tomcat7(端口为8080)运行之后，访问网址http://localhost:8080/dubbo-admin-2.6.0，输入用户名和密码 
