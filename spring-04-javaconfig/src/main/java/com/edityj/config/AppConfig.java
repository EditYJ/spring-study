package com.edityj.config;

import com.edityj.pojo.Cat;
import com.edityj.pojo.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.edityj.pojo")
public class AppConfig {

  @Bean
  public Dog dog() {
    return new Dog();
  }

  @Bean
  public Cat newCat(){
    return new Cat();
  }
}
