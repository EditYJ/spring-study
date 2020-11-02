package com.edityj.mapper;

import com.edityj.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
  List<User> getUserList();

  int insertUser(User user);

  int deleteUser(@Param("id") int id);
}
