package com.edityj.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dog {
  private String name;

  public void shout() {
    System.out.println(name + "正在叫：汪汪~");
  }

  public String getName() {
    return name;
  }

  @Value("小黑")
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Dog{" +
        "name='" + name + '\'' +
        '}';
  }
}
