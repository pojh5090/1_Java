package com.kh.example.test.model.vo2;

import com.kh.example.test.model.vo.Parent;

public class Child3 {
	public Child3() {
		Parent p = new Parent();
//		p.num = 10;  
//		p.dNum = 20;  ->다른 패키지라서
//		p.bool = false;  ->다른패키지면 후손이라도 되야하는데 아니라서
		p.ch = 'a';    
	}
}
