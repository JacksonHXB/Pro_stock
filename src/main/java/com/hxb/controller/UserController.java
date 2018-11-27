package com.hxb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hxb.entity.User;
import com.hxb.service.UserService;

/*用户控制层*/
@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	
	/*查询所有用户*/
	@GetMapping("/user/getAll")
	public List<User> getUsers(){
		return userService.getUsers();
	}
	
	/*用户登陆*/
	@PostMapping("/login")
	public User login(String username, String password){
		User user = userService.login(username, password);
		return null;
	}
}












































































