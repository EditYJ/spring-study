package com.edityj.dao;

import com.edityj.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class TestUserMapper {
  //  1. 编写数据源配置
  //  2. 配置SqlSessionFactoryBean
  //  3. 配置SqlSessionTemplate
  //  4. 编写实现类，注入SqlSessionTemplate
  //  5. 测试
  @Test
  public void UserMapper() {
    final ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    final UserMapper userMapper = context.getBean("userMapper2", UserMapper.class);
    final List<User> userList = userMapper.getUserList();
    for (User user : userList) {
      System.out.println(user);
    }
  }
}
