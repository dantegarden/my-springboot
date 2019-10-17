package com.example.myspringboot;

import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.WebResourceRoot;
import org.apache.catalina.core.StandardContext;
import org.apache.catalina.startup.Tomcat;
import org.apache.catalina.webresources.DirResourceSet;
import org.apache.catalina.webresources.StandardRoot;

import javax.servlet.ServletException;
import java.io.File;

/**
 * @description: 启动类
 * @author: lij
 * @create: 2019-10-16 23:27
 */
@Slf4j
public class TomcatApp {

    private static final int PORT = 8080;

    public static void main(String[] args) throws LifecycleException, ServletException {
        start();
    }

    public static void start() throws LifecycleException, ServletException {
        //创建Tomcat容器和设置端口
        Tomcat tomcatServer = new Tomcat();
        tomcatServer.setPort(PORT);

        StandardContext ctx = (StandardContext) tomcatServer.addWebapp("/", new File("src/main").getAbsolutePath());
        ctx.setReloadable(false);
        WebResourceRoot resources = new StandardRoot(ctx);

        File additionWebInfClasses = new File("target/classes");
        //告诉Tomcat项目的class目录，根目录
        resources.addPreResources(
                new DirResourceSet(resources, "/WEB-INF/classes", additionWebInfClasses.getAbsolutePath(), "/"));
        //启动容器
        tomcatServer.start();
        tomcatServer.getServer().await();
    }


}
