package com.kh.chap03_assis.part02_object.model.vo;

import java.io.Serializable;
                               //직렬화를 해서 데이터화 하겠다~
public class Member implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6401299854443126947L; //해주는것이 좋다.

	private String userId;
	private String userPwd;
	private String userName;
	private String email;
	
	private int age;
	private char gender;
	private transient double point; //point는 변환하고 싶지 않을 때 ,,
	//이러면 point영역에 0.0(기본값)이 들어감
	
	public Member() {}
	public Member(String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}
	public Member(String userId, String userPwd, String userName, String email, int age, 
			     char gender, double point) 
	{
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.email = email;
		this.age = age;
		this.gender = gender;
		this.point = point;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public double getPoint() {
		return point;
	}
	public void setPoint(double point) {
		this.point = point;
	}
	public String toString(){
		return userId + ", " + userPwd + ", " + userName + ", " + email + ", " +
	           age + ", " + gender + ", " + point;
	}
}
