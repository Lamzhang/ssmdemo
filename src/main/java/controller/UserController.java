package controller;

import dao.UserDao;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Copyright (C), 2002-2018
 * *
 *
 * @author Zhang Ling
 * @date 2018-12-01
 * @desc
 */
@RestController
public class UserController {

	@Autowired
	private UserDao userDao;

	@RequestMapping("find")
	public User selectUserByname(String userName){
		return userDao.selectUserByUsername("tom");
	}
}
