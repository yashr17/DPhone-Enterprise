package com.dphone.user.dao;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.dphone.user.bean.UserBean;
import com.dphone.user.entity.UserEntity;

public class UserDaoImpl {
	@Autowired
	public UserDao userdao;

	public void addUser(UserBean userBean) {
		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(userBean, userEntity);
		userdao.save(userEntity);
	}

	public UserBean updateUser(UserBean userBean) {
		
		UserEntity userEntity = new UserEntity();
		UserBean updatedUserBean = new UserBean();
		
		try {
			int userId = userBean.getUserId();
			BeanUtils.copyProperties(userBean, userEntity);
			userdao.save(userEntity);
			
			UserEntity updatedUserEntity = userdao.getReferenceById(userId);
			BeanUtils.copyProperties(updatedUserEntity, updatedUserBean);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return updatedUserBean;
	}

	public UserBean showUserInfo(int userId) {
		UserEntity userEntity = userdao.getReferenceById(userId);
		UserBean userBean = new UserBean();
		BeanUtils.copyProperties(userEntity, userBean);
		return userBean;
	}

	public String deleteUser(int userId) {
		// TODO Auto-generated method stub
		try {
			userdao.deleteById(userId);			
		} catch (Exception e) {
			// TODO: handle exception
			return "User with userId: " + userId + " does not exist";
		}
		return null;
	}
	
	/*
	 * 
	 * Testing methpds below
	 * 
	 */
	
	public List<String> getUsername() {
		List<String> list = userdao.getUsername();
		return list;
	}
	
}
