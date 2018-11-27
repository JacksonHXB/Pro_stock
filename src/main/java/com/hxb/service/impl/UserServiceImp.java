package com.hxb.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hxb.dao.UserDao;
import com.hxb.entity.User;
import com.hxb.service.UserService;

@Service
public class UserServiceImp implements UserService{
	
	
	@Autowired
	UserDao userDao;
	
	/*查询所有用户*/
	@Override
	public List<User> getUsers(){
		return userDao.queryUsers();
	}

	/*用户登陆*/
	@Override
	public User login(String username, String password) {
		User user = userDao.queryUserByName(username);
		if(user.get){
			
		}
		
		return null;
	}
	
}
