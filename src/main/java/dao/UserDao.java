package dao;

import entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Copyright (C), 2002-2018
 * *
 *
 * @author Zhang Ling
 * @date 2018-11-30
 * @desc
 */
@Mapper
@Repository
public interface UserDao {


	User selectUserByUsername(String username);




}
