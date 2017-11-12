package com.yinghang.emple;

public class User {
	private String userId;
	private String userName;
	private double userMany;
	public User() {}
	public User(String userId,String userName,double userMany) {
		this.userId=userId;
		this.userName=userName;
		this.userMany=userMany;
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public double getUserMany() {
		return userMany;
	}
	public void setUserMany(double userMany) {
		this.userMany = userMany;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userMany=" + userMany + "]";
	}
	
}
