package com.dphone.user.dao;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.dphone.user.bean.UserBean;
import com.dphone.user.entity.UserEntity;

public class UserDaoImpl {
	@Autowired
	public UserDao userdao;
	
	public int getUserId(String username) {
		try {
			return userdao.getUserId(username);
		} catch (Exception e) {
			// TODO: handle exception
			return 0;
		}
	}

	public Boolean addUser(UserBean userBean) {
		// TODO Auto-generated method stub
		Boolean addStatus = false;
		try {
			UserEntity userEntity = new UserEntity();
			BeanUtils.copyProperties(userBean, userEntity);
			userdao.save(userEntity);
			
			addStatus = userdao.existsByUsername(userBean.getUsername());
			
		} catch (Exception e) {
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
			
			updateStatus = !userEntity.equals(userdao.getReferenceById(userBean.getUserId()));
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		
		return updateStatus;
	}

	public UserBean showUserInfo(String username) {
		// TODO Auto-generated method stub
		int userId = userdao.getUserId(username);
		UserEntity userEntity = userdao.getReferenceById(userId);
		UserBean userBean = new UserBean();
		BeanUtils.copyProperties(userEntity, userBean);
		return userBean;
	}

	public Boolean deleteUser(String username) {
		// TODO Auto-generated method stub
		Boolean deleteStatus = false;
		try {
			int userId = userdao.getUserId(username);
			userdao.deleteById(userId);	
			deleteStatus = !userdao.existsById(userId);
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		return deleteStatus;
	}
	
	public Boolean isValidUser(String username) {
		// TODO Auto-generated method stub
		Boolean validStatus = false;
		try {
			int userId = userdao.getUserId(username);
			validStatus = userdao.existsById(userId);
			
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		return validStatus;
	}

	public Integer getPoints(String username) {
		// TODO Auto-generated method stub
		Integer referralPoints = null;
		try {
			int userId = userdao.getUserId(username);
			referralPoints = userdao.getUserReferralPoints(userId);
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		return referralPoints;
	}

	public Boolean updatePoints(String username, int refPoints) {
		// TODO Auto-generated method stub
		Boolean updatePointStatus;
		try {
			int userId = userdao.getUserId(username);
			
			UserEntity userEntity = userdao.getReferenceById(userId);
			userEntity.setRefPoints(userEntity.getRefPoints() + refPoints);
			int prevPoints = userdao.getUserReferralPoints(userId);
			userdao.save(userEntity);
//			userdao.updateUserReferralPoints(userId, refPoints);
			int currPoints = userdao.getUserReferralPoints(userId);
			updatePointStatus = (currPoints == prevPoints + refPoints) ? true : false;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
		return updatePointStatus;
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
