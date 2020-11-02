package com.edityj.dao;

import com.edityj.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestUserMapper {

  @Test
  public void UserMapper() throws IOException {
    String resource = "mybatis-config.xml";
    InputStream inputStream = Resources.getResourceAsStream(resource);
    SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

    final SqlSession sqlSession = sqlSessionFactory.openSession();
    final UserMapper mapper = sqlSession.getMapper(UserMapper.class);
    final List<User> userList = mapper.getUserList();
    for (User user : userList) {
      System.out.println(user);
    }
  }
}
