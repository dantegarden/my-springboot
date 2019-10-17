package com.example.myspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description:
 * @author: lij
 * @create: 2019-10-17 00:08
 */
@Controller
public class IndexController {
    @RequestMapping(value = "/index", produces="text/html;charset=UTF-8")
    public String index(){
        return "index";
    }
}
