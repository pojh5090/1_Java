package com.kh.example.chap02_throws.run;

import com.kh.example.chap02_throws.controller.ThrowsController;

public class Run {

	public static void main(String[] args) /*throws Exception*/ {
		ThrowsController tc = new ThrowsController();
		
		try {
			tc.method1();
		} catch (Exception e) {			
//			e.printStackTrace(); 
			//->에러 메세지의 발생 근원지를 찾아서 단계별로 에러를 보여줌 (예외 이름,위치 출력)
			System.out.println("예외 상황이 발생했습니다.");
		} 
		
		System.out.println("정상적으로 종료됨...");
	}
}
