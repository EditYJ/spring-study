package com.edityj.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("bigCat")
public class Cat {
  @Value("小红")
  private String name;

  public void shout() {
    System.out.println(name + "在喊叫: 喵喵~~");
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Cat{" +
        "name='" + name + '\'' +
        '}';
  }
}
