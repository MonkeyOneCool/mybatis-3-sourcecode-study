package org.apache.ibatis.demo.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.demo.entity.UserDO;

import java.util.List;

/**
 * 用户Mapper
 *
 * @author Robert Hou
 * @since 2020年11月27日 22:37
 **/
public interface UserDAO {

  List<UserDO> list();

  UserDO getById(@Param("id") Long id);
}
