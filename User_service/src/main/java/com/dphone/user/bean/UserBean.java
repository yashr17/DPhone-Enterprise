package com.dphone.user.bean;

public class UserBean {
	
	private int userId;
	private String fname;
	private String lname;
	private String address;
	private String mobile;
	private String email;
	private String username;
	private String password;

	public UserBean() {
		// TODO Auto-generated constructor stub
		super();
	}

	public UserBean(int userId, String fname, String lname, String address, String mobile, String email,
			String username, String password) {
		super();
		this.userId = userId;
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
		this.username = username;
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "UserEntity [userId=" + userId + ", fname=" + fname + ", lname=" + lname + ", address=" + address
				+ ", mobile=" + mobile + ", email=" + email + ", username=" + username + ", password=" + password + "]";
	}
}
