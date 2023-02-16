package com.dphone.referral.controller;

import java.util.Date;
import java.util.Objects;

import com.dphone.referral.entity.Referral;

public class ReferralBean {
	
	private int referralId;
	
	private String firstName;
	
	private String lastName;
	
	private String mobile;
	
	private String email;
	
	private int userId;
	
	private Date dateOfReferral;
	
	private boolean status;
	
	// Constructors
	
	public ReferralBean(){
		super();
	}

	public ReferralBean(int referralId, String firstName, String lastName, String mobile, String email, int userId,
			Date dateOfReferral, boolean status) {
		super();
		this.referralId = referralId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobile = mobile;
		this.email = email;
		this.userId = userId;
		this.dateOfReferral = dateOfReferral;
		this.status = status;
	}

	
	// Getters & Setters
	
	public int getReferralId() {
		return referralId;
	}

	public void setReferralId(int referralId) {
		this.referralId = referralId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Date getDateOfReferral() {
		return dateOfReferral;
	}

	public void setDateOfReferral(Date dateOfReferral) {
		this.dateOfReferral = dateOfReferral;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	
	// HashCode & Equals Method
	
	@Override
	public int hashCode() {
		return Objects.hash(referralId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Referral other = (Referral) obj;
		return referralId == other.getReferralId();
	}

	
	// ToString Method
	
	@Override
	public String toString() {
		return "Referral [referralId=" + referralId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", mobile=" + mobile + ", email=" + email + ", userId=" + userId + ", dateOfReferral="
				+ dateOfReferral + ", status=" + status + "]";
	}
	
	
}

