package com.dphone.user.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dphone.user.bean.UserBean;
import com.dphone.user.dao.UserDaoImpl;

@RestController
public class UserController {
	private UserDaoImpl userDaoImpl;
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ResponseEntity<String> homePage() {
		System.out.println("Servuce under maintenance");
		return new ResponseEntity<String>("Error page", HttpStatus.BAD_GATEWAY);
	}
	
	@RequestMapping(value = "/add-user", method = RequestMethod.POST)
	public ResponseEntity<String> addUser(@RequestBody UserBean userBean) {
		userDaoImpl.addUser(userBean);
		return new ResponseEntity<String>("User added successfully", HttpStatus.OK);
	}
	
	@RequestMapping(value = "/show-all-users", method = RequestMethod.POST)
	public ResponseEntity<List<UserBean>> showAllUsers() {
		List<UserBean> userBeanList = userDaoImpl.showAllUsers();
		return new ResponseEntity<List<UserBean>>(userBeanList, HttpStatus.OK);
	}
 }
