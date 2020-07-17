package com.kh.example.chap05_constructor.run;

import java.util.Date;

import com.kh.example.chap05_constructor.model.vo.User;

public class Run {

	public static void main(String[] args) {
		User u1 = new User();
		//            ----- 기본생성자
		u1.inform();
		//The constructor User() is undefined 
		
		User u2 = new User("user01", "pass01", "강건강", new Date());
		u2.inform();
		
		User u3 = new User("user02", "pass02", "남나눔");
		u3.inform();
	}

}
