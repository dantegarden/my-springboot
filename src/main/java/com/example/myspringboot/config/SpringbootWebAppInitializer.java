package com.example.myspringboot.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @description:
 * @author: lij
 * @create: 2019-10-16 23:41
 */
public class SpringbootWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    /**RC*/
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {RootConfig.class};
    }
    /**SC*/
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {ServletConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        //拦截所有请求
        return new String[] {"/"};
    }
}
