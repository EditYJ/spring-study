package com.edityj.diylog;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect()
public class Log {

  @Before("execution(* com.edityj.service.User.*(..))")
  public void beforeLog(){
    System.out.println("=======方法执行前=======");
  }

  @After("execution(* com.edityj.service.User.*(..))")
  public void afterLog(){
    System.out.println("=======方法执行后=======");
  }
}
