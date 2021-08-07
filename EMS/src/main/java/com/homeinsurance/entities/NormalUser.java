package com.homeinsurance.entities;

import javax.persistence.*;

@Entity
public class NormalUser {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int normalUserId;
	private String username;
	private String email;
	private String password;
	private String userType;

	public NormalUser() {
		// TODO Auto-generated constructor stub
	}

	public NormalUser(String username, String email, String password, String userType) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.userType = userType;
	}

	public int getNormalUserId() {
		return normalUserId;
	}

	public void setNormalUserId(int normalUserId) {
		this.normalUserId = normalUserId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "NormalUser [normalUserId=" + normalUserId + ", username=" + username + ", email=" + email + ", password=" + password + ", userType=" + userType + "]";
	}
	

}
