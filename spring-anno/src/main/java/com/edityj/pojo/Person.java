package com.edityj.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Person {
  private Cat cat;

  private Dog dog;

  @Value("老王")
  private String name;

  @Override
  public String toString() {
    return "Person{" +
        "cat=" + cat +
        ", dog=" + dog +
        ", name='" + name + '\'' +
        '}';
  }

  public Cat getCat() {
    return cat;
  }

  @Autowired
  @Qualifier("bigCat")
  public void setCat(Cat cat) {
    this.cat = cat;
  }

  public Dog getDog() {
    return dog;
  }

  @Autowired
  public void setDog(Dog dog) {
    this.dog = dog;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
