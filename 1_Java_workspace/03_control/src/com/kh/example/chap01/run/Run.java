package com.kh.example.chap01.run;

import com.kh.example.chap01.condition.A_If;
import com.kh.example.chap01.condition.B_IfElse;
import com.kh.example.chap01.condition.C_IfElseIfElse;
import com.kh.example.chap01.condition.D_Switch;



public class Run {

	public static void main(String[] args) {
		A_If ai = new A_If();
		//ai.method1();
		//ai.method2();
		//ai.method3();
		//ai.method4();
		
		B_IfElse bie = new B_IfElse();
		//bie.method1();
		//bie.method2();
		//bie.method3();
		//bie.method4();
		
		C_IfElseIfElse cie = new C_IfElseIfElse();
		//cie.method1();
		//cie.method2();
		//cie.method3();
		
		D_Switch ds = new D_Switch();
		//ds.method1();
		//ds.method2();
		//ds.method3();
		ds.method4();
	}

}
