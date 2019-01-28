package com.cc.springmvc.service;

import com.cc.springmvc.domain.User;

import java.util.List;

public interface UserService {

    List<User> findAll();

    void saveUser(User user);
}
