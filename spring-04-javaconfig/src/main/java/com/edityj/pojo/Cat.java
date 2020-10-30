package com.edityj.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Cat {
  private String name;

  public void shout() {
    System.out.println(name + "正在叫：喵喵~");
  }

  public String getName() {
    return name;
  }

  @Value("小红")
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
