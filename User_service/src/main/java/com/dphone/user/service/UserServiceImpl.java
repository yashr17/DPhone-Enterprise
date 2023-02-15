package com.dphone.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dphone.user.bean.UserBean;
import com.dphone.user.dao.UserDaoImpl;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDaoImpl userDaoImpl;


	@Override
	public String addUser(UserBean userBean) {
		// TODO Auto-generated method stub
		userDaoImpl.addUser(userBean);
		return "added successfully";
	}

	@Override
	public UserBean updateUser(UserBean userBean) {
		// TODO Auto-generated method stub
		UserBean updatedUserBean = userDaoImpl.updateUser(userBean);
		return updatedUserBean;
	}

	@Override
	public UserBean showUserInfo(int userId) {
		// TODO Auto-generated method stub
		UserBean userBean = userDaoImpl.showUserInfo(userId);
		return userBean;
	}

	@Override
	public String deleteUser(int userId) {
		// TODO Auto-generated method stub
		String messageString = userDaoImpl.deleteUser(userId);
		return messageString;
	}
	
	/*
	 * 
	 * Testing methods below
	 * 
	 */
	
	@Override
	public String testService() {
		// TODO Auto-generated method stub
		return "testService working";
	}

	@Override
	public List<String> getUsername() {
		// TODO Auto-generated method stub
		List<String> list = userDaoImpl.getUsername();
		return list;
	}

}
