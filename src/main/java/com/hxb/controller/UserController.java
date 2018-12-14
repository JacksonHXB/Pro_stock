package com.hxb.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

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
	@PostMapping("/user/login")
	public User login(String username, String password, HttpSession httpSession){
		User user = userService.login(username, password);
		if(user != null){
			httpSession.setAttribute("currentUser", user);	//将当前用户存入session中
			if(user.getPassword().equals(password)){//判断和密码是否相等
				return user;
			}
		}
		return null;
	}
}












































































