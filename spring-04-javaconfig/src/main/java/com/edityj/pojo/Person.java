package com.edityj.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
  private Dog dog;
  private Cat cat;
  private String name;

  public Dog getDog() {
    return dog;
  }

  @Autowired
  public void setDog(Dog dog) {
    this.dog = dog;
  }

  public Cat getCat() {
    return cat;
  }

  @Autowired
  @Qualifier("newCat")
  public void setCat(Cat cat) {
    this.cat = cat;
  }

  public String getName() {
    return name;
  }

  @Value("俞杰")
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Person{" +
        "dog=" + dog +
        ", cat=" + cat +
        ", name='" + name + '\'' +
        '}';
  }
}
