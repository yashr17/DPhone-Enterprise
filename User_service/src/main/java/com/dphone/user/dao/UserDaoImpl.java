package com.dphone.user.dao;

import java.util.ArrayList;
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

	public List<UserBean> showAllUsers() {
		List<UserEntity> userEntityList = userdao.findAll();
		List<UserBean> userBeanList = new ArrayList<UserBean>();
		for (UserEntity userEntity : userEntityList) {
			UserBean userBean = new UserBean();
			BeanUtils.copyProperties(userEntity, userBean);
			userBeanList.add(userBean);
		}
		return userBeanList;
	}
	
	
}
