package com.dphone.referral.controller;

import java.util.Date;
import java.util.Objects;

import com.dphone.referral.entity.Referral;

import jakarta.persistence.Entity;

public class ReferralBean {
	
	// Attributes
	
	private int referralId;
	
	private String firstName;
	
	private String lastName;
	
	private String mobile;
	
	private String email;
	
	private String referralCode;
	
	private int userId;
	
	private Date dateOfReferral;
	
	private boolean status;
	
	// Constructors
	
	public ReferralBean(){
		super();
	}

	public ReferralBean(int referralId, String firstName, String lastName, String mobile, String email, String referralCode, int userId,
			Date dateOfReferral, boolean status) {
		super();
		this.referralId = referralId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobile = mobile;
		this.email = email;
		this.referralCode = referralCode;
		this.userId = userId;
		this.dateOfReferral = dateOfReferral;
		this.status = status;
	}
	
	
	// Getters & Setters
	
	
	public int getReferralId() {
		return referralId;
	}

	public String getReferralCode() {
		return referralCode;
	}

	public void setReferralCode(String referralCode) {
		this.referralCode = referralCode;
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

	@Override
	public int hashCode() {
		return Objects.hash(referralCode, referralId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ReferralBean other = (ReferralBean) obj;
		return Objects.equals(referralCode, other.referralCode) && referralId == other.referralId;
	}

	@Override
	public String toString() {
		return "ReferralBean [referralId=" + referralId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", mobile=" + mobile + ", email=" + email + ", referralCode=" + referralCode + ", userId=" + userId
				+ ", dateOfReferral=" + dateOfReferral + ", status=" + status + "]";
	}

	
	// HashCode & Equals Method
	
	
	
}
