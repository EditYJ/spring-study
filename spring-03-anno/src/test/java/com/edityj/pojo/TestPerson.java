package com.edityj.pojo;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {
  @Test
  public void Person(){
    final ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    final Person person = context.getBean("person", Person.class);
    System.out.println(person);
    person.getCat().shout();
    person.getDog().shout();
  }
}
