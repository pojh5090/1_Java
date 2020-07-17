package com.kh.example.chap05_constructor.model.vo;

import java.util.Date;

public class User {
	private String userId;
	private String userPwd;
	private String userName;
	private Date enrollDate;
	
	// 생성자의 사용 목적
	//   1. 객체 생성
	//   2. 매개변수로 전달받은 값으로 필드 초기화
	
	// 생성자 사용 시 주의사항
	//   1. 반드시 이름이 클래스명과 동일 (대/소문자 구분)
	//   2. 반환형이 존재하지 않음
	
	// 기본 생성자
	//   아무 매개 변수가 없는 생성자
	//   JVM이 기본적으로 생성해줌
	//   단, 매개변수 있는 생성자를 만든다면 자동 생성이 되지 않음
	//   따라서 반드시 처음에 만들어 주고 시작 ***
	public User() {}
	
	// 매개변수 생성자
	//    객체 생성과 필드 초기화, 두가지 목적으로 사용
	//    같은 이름의 생성자를 만들려고 하는 경우 오버로딩 적용 되게 만들어 사용
	public User(String userId, String userPwd, String userName, Date enrollDate) {
		//여기 필드 초기화!
//		this.userId = userId;        //한 공간에서 같은이름 쓰면, 전역변수 말고 지역변수로 인식함!!!!!
//		this.userPwd = userPwd;      
//		this.userName = userName;
		this(userId, userPwd, userName);  //-->이렇게 해서 밑에 있는 매개변수 3개짜리 User불러옴!
		this.enrollDate = enrollDate;
	}
	
	public User(String userId, String userPwd, String userName) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
	}
	
	public void inform() {
		System.out.println(userId + ", " + userPwd + ", " + userName + ", " + enrollDate);
		
	}
}
