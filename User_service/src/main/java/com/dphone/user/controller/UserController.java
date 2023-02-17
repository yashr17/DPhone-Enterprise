package com.dphone.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dphone.user.bean.UserBean;
import com.dphone.user.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;

	// Create new User - C
	@RequestMapping(value = "/add-user", method = RequestMethod.POST)
	public ResponseEntity<Boolean> addUser(@RequestBody UserBean userBean) {
		Boolean addStatus =  this.userService.addUser(userBean);
		return new ResponseEntity<Boolean>(addStatus, HttpStatus.OK);
	}

	// Update existing User - U
	@RequestMapping(value = "/update-user", method = RequestMethod.PUT)
	public ResponseEntity<Boolean> updateUser(@RequestBody UserBean userBean) {
		Boolean updateStatus = this.userService.updateUser(userBean);
		return new ResponseEntity<Boolean>(updateStatus, HttpStatus.OK);
	}
	
	// Get User data - R
	@RequestMapping(value = "/{userId}/user-info", method = RequestMethod.GET)
	public ResponseEntity<UserBean> showUserInfo(@PathVariable("userId") int userId) {
		UserBean userBean = userService.showUserInfo(userId);
		return new ResponseEntity<UserBean>(userBean, HttpStatus.OK);
	}
	
	// Delete User - D
	@RequestMapping(value = "/{userId}/delete-user", method = RequestMethod.DELETE)
	public ResponseEntity<Boolean> deleteUser(@PathVariable("userId") int userId){
		Boolean deleteStatus = this.userService.deleteUser(userId);
		return new ResponseEntity<Boolean>(deleteStatus, HttpStatus.OK);
	}
	
	// User validation
	@RequestMapping(value = "/{userId}/user-validation", method = RequestMethod.GET)
	public ResponseEntity<Boolean> isValidUser(@PathVariable("userId") int userId) {
		Boolean validStatus = this.userService.isValidUser(userId);
		return new ResponseEntity<Boolean>(validStatus, HttpStatus.OK);
	}
	
	// Fetch referrals created by user
	
	
	/*
	 * 
	 * 
	 * Testing endpoints below
	 * 
	 * 
	 */
	
	// Endpoint to be mapped to error 404 page, yet to be done
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public ResponseEntity<String> homePage() {
		String responseString = "Service under maintenance";
		return new ResponseEntity<String>(responseString, HttpStatus.BAD_GATEWAY);
	}
	
	// Test endpoint
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String test() {
		return "test function in api working fine";
	}
	
	// Test endpoint to test service layer
	@RequestMapping(value = "/test-service", method = RequestMethod.GET)
	public String testService() {
		return this.userService.testService();
	}
	
	// Test endpoint to test @Query
	@RequestMapping(value = "/show-all-user", method = RequestMethod.GET)
	public ResponseEntity<List<String>> getUsername() {
		List<String> list = this.userService.getUsername();
		return new ResponseEntity<List<String>>(list,HttpStatus.OK);
	}
}
