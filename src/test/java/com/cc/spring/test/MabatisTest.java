package com.cc.spring.test;

import com.cc.springmvc.domain.User;
import com.cc.springmvc.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MabatisTest {

    @Test
    public void testMybatis() throws IOException {
        // 加载配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("slqmap-config.xml");
        // 创建SqlSessionFactory对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        // 创建sqlSession对象
        SqlSession sqlSession = factory.openSession(true);
        // 获取代理对象
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        // 调用方法查询数据
        List<User> userList = userMapper.findAll();
        for(User u : userList) {
            System.out.println(u);
        }

    }
}
