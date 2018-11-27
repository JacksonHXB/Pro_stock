package com.hxb.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.hxb.entity.User;

@Mapper
public interface UserDao {
	
	/*查询所有用户*/
	public List<User> queryUsers();
	
	/*根据用户名查询用户*/
	public User queryUserByName(String username);
	
}
