package com.kh.example.test.model.vo2;

import com.kh.example.test.model.vo.Parent;

public class Child4 extends Parent{
	public Child4() {
//		super.num = 10;
//		super.dNum = 10.0; ->불가능, 같은 패키지내 또는 해당클래스 내부만 가능
//		super.bool = false; ->가능, 다른패키지 이지만 상속받아서
		super.ch = 'a';
	}
}
