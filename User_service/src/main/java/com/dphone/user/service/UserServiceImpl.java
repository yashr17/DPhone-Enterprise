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
	public Boolean addUser(UserBean userBean) {
		// TODO Auto-generated method stub
		Boolean addStatus = userDaoImpl.addUser(userBean);
		return addStatus;
	}

	@Override
	public Boolean updateUser(UserBean userBean) {
		// TODO Auto-generated method stub
		Boolean updateStatus = userDaoImpl.updateUser(userBean);
		return updateStatus;
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
	
	@Override
	public Boolean isValidUser(int userId) {
		// TODO Auto-generated method stub
		Boolean validStatus = userDaoImpl.isValidUser(userId);
		return validStatus;
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
