package com.dphone.user.dao;

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
		int userId = userBean.getUserId();
		UserEntity userEntity = new UserEntity();
		BeanUtils.copyProperties(userBean, userEntity);
		userdao.save(userEntity);
		
		UserEntity updatedUserEntity = userdao.getReferenceById(userId);
		UserBean updatedUserBean = new UserBean();
		BeanUtils.copyProperties(updatedUserEntity, updatedUserBean);
		return updatedUserBean;
	}

	public UserBean showUserInfo(int userId) {
		UserEntity userEntity = userdao.getReferenceById(userId);
		UserBean userBean = new UserBean();
		BeanUtils.copyProperties(userEntity, userBean);
		return userBean;
	}

	public void deleteUser(int userId) {
		// TODO Auto-generated method stub
		userdao.deleteById(userId);
	}
	
	
}
