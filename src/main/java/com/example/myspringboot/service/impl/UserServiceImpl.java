package com.example.myspringboot.service.impl;

import com.example.myspringboot.model.UserInfo;
import com.example.myspringboot.service.UserService;
import com.sun.xml.internal.bind.v2.model.core.ID;
import org.springframework.stereotype.Service;

/**
 * @description:
 * @author: lij
 * @create: 2019-10-16 23:32
 */
@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserInfo getUserInfoById(Long id) {
        return new UserInfo(id, id + "_name");
    }
}
