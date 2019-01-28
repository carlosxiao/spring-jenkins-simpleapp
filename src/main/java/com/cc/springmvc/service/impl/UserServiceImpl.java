package com.cc.springmvc.service.impl;

import com.cc.springmvc.domain.User;
import com.cc.springmvc.mapper.UserMapper;
import com.cc.springmvc.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public void saveUser(User user) {
        userMapper.saveUser(user);
    }
}
