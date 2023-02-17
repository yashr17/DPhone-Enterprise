package com.dphone.user.service;

import java.util.List;

import com.dphone.user.bean.UserBean;

public interface UserService {
	
	public String testService();

	public Boolean addUser(UserBean userBean);

	public Boolean updateUser(UserBean userBean);

	public UserBean showUserInfo(int userId);

	public Boolean deleteUser(int userId);

	public List<String> getUsername();

	public Boolean isValidUser(int userId);
}
