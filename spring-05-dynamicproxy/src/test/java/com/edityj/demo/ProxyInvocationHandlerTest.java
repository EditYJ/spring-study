package com.edityj.demo;

import com.edityj.service.User;
import com.edityj.service.UserImpl;
import org.junit.Test;

public class ProxyInvocationHandlerTest {

  @Test
  public void ProxyInvocationHandler(){
    User user = new UserImpl();

    final ProxyInvocationHandler handler = new ProxyInvocationHandler();
    handler.setUser(user);
    final User proxy = (User) handler.getProxy();
    proxy.add();
  }
}
