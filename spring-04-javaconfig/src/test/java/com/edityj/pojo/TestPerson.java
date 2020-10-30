package com.edityj.pojo;

import com.edityj.config.AppConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestPerson {

  @Test
  public void Person() {
    final AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    final Person person = context.getBean("person", Person.class);
    System.out.println(person);
    person.getDog().shout();
    person.getCat().shout();
  }
}
