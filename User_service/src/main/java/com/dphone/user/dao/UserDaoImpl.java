package com.dphone.user.dao;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.dphone.user.bean.UserBean;
import com.dphone.user.entity.UserEntity;

public class UserDaoImpl {
	@Autowired
	public UserDao userdao;

	public Boolean addUser(UserBean userBean) {
		// TODO Auto-generated method stub
		Boolean addStatus = false;
		try {
			UserEntity userEntity = new UserEntity();
			BeanUtils.copyProperties(userBean, userEntity);
			userdao.save(userEntity);
			
			addStatus = userdao.existsById(userBean.getUserId());
			
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			return false;
		}
		return addStatus;
	}

	public Boolean updateUser(UserBean userBean) {
		// TODO Auto-generated method stub
		Boolean updateStatus = false;
		try {
			UserEntity userEntity = new UserEntity();
			BeanUtils.copyProperties(userBean, userEntity);
			userdao.save(userEntity);
			
			updateStatus = userEntity.equals(userdao.getReferenceById(userBean.getUserId()));
			
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			return false;
		}
		
		return updateStatus;
	}

	public UserBean showUserInfo(int userId) {
		// TODO Auto-generated method stub
		UserEntity userEntity = userdao.getReferenceById(userId);
		UserBean userBean = new UserBean();
		BeanUtils.copyProperties(userEntity, userBean);
		return userBean;
	}

	public Boolean deleteUser(int userId) {
		// TODO Auto-generated method stub
		Boolean deleteStatus = false;
		try {
			userdao.deleteById(userId);	
			deleteStatus = !userdao.existsById(userId);
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			return false;
		}
		return deleteStatus;
	}
	
	public Boolean isValidUser(int userId) {
		// TODO Auto-generated method stub
		Boolean validStatus = false;
		try {
			validStatus = userdao.existsById(userId);
			
		} catch (IllegalArgumentException e) {
			// TODO: handle exception
			return false;
		}
		return validStatus;
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
