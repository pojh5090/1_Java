package com.kh.example.chap02.run;

import com.kh.example.chap02.LoopPractice;
import com.kh.example.chap02.loop.A_For;
import com.kh.example.chap02.loop.B_While;
import com.kh.example.chap02.loop.C_DoWhile;

public class Run {

	public static void main(String[] args) {
		A_For af = new A_For();
		//af.method9();
		
		B_While bw = new B_While();
		//bw.method1_1();
		//bw.method8();
		//bw.method9();
		//bw.method10();
		//bw.method12();
		
		C_DoWhile cd = new C_DoWhile();
		//cd.method1();
		
		LoopPractice lp = new LoopPractice();
		//lp.method2();
		//lp.method5();
		//lp.method6();
		lp.method14();
	}

}
