package com.springjpa.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "USERS_DTLS")
public class User {
	@Id
	@Column(name = "USER_ ID")
	private Integer userId;
	@Column(name = "USER_NAME")
	private String username;
	@Column(name = "USER_PHNO")
	private Long userPhno;
	@Column(name = "USER_AGE")
	private Integer userAge;
	@Column(name = "USER_COUNTRY")
	private String userCountry;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Long getUserPhno() {
		return userPhno;
	}
	public void setUserPhno(int i) {
		this.userPhno = (long) i;
	}
	public Integer getUserAge() {
		return userAge;
	}
	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}
	public String getUserCountry() {
		return userCountry;
	}
	public void setUserCountry(String userCountry) {
		this.userCountry = userCountry;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", username=" + username + ", userPhno=" + userPhno + ", userAge=" + userAge
				+ ", userCountry=" + userCountry + "]";
	}
	
	

}
