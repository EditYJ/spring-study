package com.edityj.mapper;

import com.edityj.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestUserMapper {

  @Test
  public void UserMapper() throws IOException {
    final ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    final UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
    final List<User> userList = userMapper.getUserList();
    for (User user : userList) {
      System.out.println(user);
    }
  }
}
