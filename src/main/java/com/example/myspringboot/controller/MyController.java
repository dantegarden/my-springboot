package com.example.myspringboot.controller;

import com.example.myspringboot.model.UserInfo;
import com.example.myspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: lij
 * @create: 2019-10-16 23:33
 */
@RestController
@RequestMapping("/my")
public class MyController {

    @Autowired
    private UserService userService;

    @GetMapping("/get/{id}")
    public ResponseEntity<UserInfo> getUserInfo(@PathVariable Long id){
        UserInfo userInfo = userService.getUserInfoById(id);
        return ResponseEntity.ok(userInfo);
    }
}
