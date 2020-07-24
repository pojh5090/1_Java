package com.kh.example.chap02_abst.family.controller;

import com.kh.example.chap02_abst.family.model.vo.Baby;
import com.kh.example.chap02_abst.family.model.vo.Basic;
import com.kh.example.chap02_abst.family.model.vo.Family;
import com.kh.example.chap02_abst.family.model.vo.Mother;

public class FamilyController {
	public void method() {
		//Family f = new Family();  --> 추상클래스라 객체생성 안되는거임, 
		
		//대신 참조변수 가능
//		Family m = new Mother("어머니", 50, 70, "출산");
//		Family b = new Baby("베이비", 3.5, 70);
//		
//		System.out.println(m);
//		System.out.println(b);
//		
////		m.eat();
////		b.eat();
////		
////		m.sleep();
////		b.sleep();
//				
//		System.out.println(m);
//		System.out.println(b);
		
//		Basic b = new Basic();  //-> 인터페이스 이기 때문에 객체생성 불가능
		Basic mother = new Mother("어머니", 50, 70, "출산");
		Basic baby = new Baby("베이비", 3.5, 70);
		
		mother.eat();
		baby.eat();
		
		System.out.println(mother);
		System.out.println(baby);
	}
}
