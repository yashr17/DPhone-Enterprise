package com.dphone.user.service;

import java.util.List;

import com.dphone.user.bean.UserBean;

public interface UserService {
	
	public String testService();

	public String addUser(UserBean userBean);

	public UserBean updateUser(UserBean userBean);

	public UserBean showUserInfo(int userId);

	public String deleteUser(int userId);

	public List<String> getUsername();
}
