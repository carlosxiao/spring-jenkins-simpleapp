package com.cc.springmvc.mapper;

import com.cc.springmvc.domain.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {

    @Select("select * from user")
    List<User> findAll();

    @Insert("insert into user (name,username,password,type) values(#{name}, #{username}, #{password}, #{type})")
    void saveUser(User user);
}
