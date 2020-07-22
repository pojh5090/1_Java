package com.kh.example.test.controller;

import com.kh.example.test.model.vo.Child1;
import com.kh.example.test.model.vo.Child2;
import com.kh.example.test.model.vo.Parent;

public class InheritanceTest {
	public void method() {
		System.out.println("Parent클래스의 num필드 접근");
		Parent p = new Parent();
		p.setNum(9);
		System.out.println("Parent 안에 있는 num : " + p.getNum());
		
		System.out.println("Child1클래스의 str필드 접근");
		Child1 c1 = new Child1();
		c1.setStr("Hello");
		System.out.println("Child1 안에 있는 str : " + c1.getStr());
		
		System.out.println("Child1클래스의 num필드 접근");
		c1.setNum(99);
		System.out.println("Child1 안에 있는 num : " + c1.getNum());
		
		System.out.println("Child2클래스의 str필드 접근");  
		Child2 c2 = new Child2();
		c2.setStr("World");
		System.out.println("Child2 안에 있는 str : " + c2.getStr());
		
		System.out.println("Child2클래스가 상속받은 Parent의 필드 접근"); //parent클래스 상속받은거 확인
		//c2.num //The field Parent.num is not visible  ->private 이였기 때문
		c2.setNum(999);   //여기서 Num은 Parent꺼!~!~! (그냥 쓰면 안되고 이렇게 써줘야함)
		System.out.println("Child2 안에 있는 num : " + c2.getNum());
		System.out.println("Parent 안에 있는 num : " + p.getNum()); //안바껴있다 + 연결X
		
	}
}
