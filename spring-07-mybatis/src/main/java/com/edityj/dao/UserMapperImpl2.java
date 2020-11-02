package com.edityj.dao;

import com.edityj.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {
  public List<User> getUserList() {
    return getSqlSession().getMapper(UserMapper.class).getUserList();
  }
}
