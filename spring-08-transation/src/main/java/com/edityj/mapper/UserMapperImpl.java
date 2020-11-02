package com.edityj.mapper;

import com.edityj.pojo.User;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {
  public List<User> getUserList() {

    final User user = new User(4, "俞杰", "12344444");
    insertUser(user);
    deleteUser(4);

    return getSqlSession().getMapper(UserMapper.class).getUserList();
  }

  public int insertUser(User user) {
    return getSqlSession().getMapper(UserMapper.class).insertUser(user);
  }

  public int deleteUser(int id) {
    return getSqlSession().getMapper(UserMapper.class).deleteUser(id);
  }
}
