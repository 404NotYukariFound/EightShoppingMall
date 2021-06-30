package com.eight.bean;

import java.sql.Timestamp;

public class user {
	private Long user_id;
	private String username;
	private String password;
	private Integer user_status;
	private Timestamp modified_time;

	public user() {
	}

	public user(Long user_id, String username, String password, Integer user_status, Timestamp modified_time) {
		this.user_id = user_id;
		this.username = username;
		this.password = password;
		this.user_status = user_status;
		this.modified_time = modified_time;
	}

	public Long getUser_id() {
		return user_id;
	}

	public void setUser_id(Long user_id) {
		this.user_id = user_id;
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

	public Integer getUser_status() {
		return user_status;
	}

	public void setUser_status(Integer user_status) {
		this.user_status = user_status;
	}

	public Timestamp getModified_time() {
		return modified_time;
	}

	public void setModified_time(Timestamp modified_time) {
		this.modified_time = modified_time;
	}

	@Override
	public String toString(){
		return "user {" + 
				", user_id='" + user_id + '\'' + 
				", username='" + username + '\'' + 
				", password='" + password + '\'' + 
				", user_status='" + user_status + '\'' + 
				", modified_time='" + modified_time + '\'' + 
				"}";
	}
}