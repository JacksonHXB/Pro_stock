package com.hxb.service;

import java.util.List;


import com.hxb.entity.User;

public interface UserService {
	
	/*获取所有用户*/
	public List<User> getUsers();
	
	/*用户登陆*/
	public User login(String username, String password);
}
