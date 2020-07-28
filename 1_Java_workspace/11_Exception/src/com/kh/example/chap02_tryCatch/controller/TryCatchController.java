package com.kh.example.chap02_tryCatch.controller;

import java.io.IOException;

public class TryCatchController {
	public void method1() {
		System.out.println("method1() 호출됨...");
		try {
			method2();
			System.out.println("나는 출력이 될까 안될까?");  //출력 안되고 바로 catch로 넘어감~
		} catch (IOException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("Exception으로 잡음");
		} finally {
			System.out.println("예외 여부와 상관없이 무조건 수행");
		}
		System.out.println("method1() 종료됨...");
	}
	
	public void method2() throws IOException {
		System.out.println("method2() 호출됨...");
		
//		throw new NullPointerException("null이 들어왔다!");  //( )안에 에러메시지 쓸 수 있음!
		//  --->Unchecked Exception -> 우리가 꼭 예외처리 해주지 않아도 됨으로 에러X

		throw new IOException("강제로 IOException을 발생시켰습니다.");
		
//		System.out.println("method2() 종료됨...");
	}
}
