package com.edityj.dao;

import com.edityj.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestUserMapper {

  @Test
  public void UserMapper() {
    final ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    final UserMapper userMapper = context.getBean("userMapper", UserMapper.class);
    final List<User> userList = userMapper.getUserList();
    for (User user : userList) {
      System.out.println(user);
    }
  }
}
