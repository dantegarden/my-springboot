package com.example.myspringboot.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: lij
 * @create: 2019-10-16 23:41
 */
@Configuration
@ComponentScan(basePackages = {"com.example.myspringboot"}, excludeFilters = {
        @ComponentScan.Filter(type= FilterType.ANNOTATION, classes = {Controller.class})
}, useDefaultFilters = true)
public class RootConfig {
}
