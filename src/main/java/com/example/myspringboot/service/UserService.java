package com.example.myspringboot.service;

import com.example.myspringboot.model.UserInfo;

public interface UserService {
    UserInfo getUserInfoById(Long id);
}
