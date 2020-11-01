package com.edityj.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

  @Test
  public void User(){
    final ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    // 动态代理的是接口
    final User user = context.getBean("user", User.class);
    user.add();
  }
}
