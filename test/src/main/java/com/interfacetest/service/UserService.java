package com.interfacetest.service;


import com.interfacetest.entry.User;
import com.interfacetest.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    /**
     * test
     */
    @Autowired
    private UserMapper userMapper;
    public List<User> queryUser(){
        return  userMapper.queryUser();
    }
}
