package com.edityj.demo;

import com.edityj.service.User;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {

  public void setUser(User user) {
    this.user = user;
  }

  private User user;

  // 生成代理类
  public Object getProxy() {
    return Proxy.newProxyInstance(this.getClass().getClassLoader(), user.getClass().getInterfaces(), this);
  }

  // 处理代理实例，并返回结果
  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
    final Object res = method.invoke(user, args);
    return res;
  }
}
