package com.kh.example.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {
	public void method1() {
		// 키보드로 문자열 값을 입력 받아 출력 반복 실행
		// exit가 들어올 때 까지 반복
		Scanner sc = new Scanner(System.in);
	
		// 1. while		
//		String str = "";  
//		while(!str.equals("exit")) {
//			System.out.print("문자열을 입력하세요 : ");
//			str = sc.nextLine();
//			System.out.println("내가 입력한 문자열 : " + str);			
//		}
//		String str = null; 하면 NullPointerException 에러남
//		이유 : while(!str.equals("exit")) 이거 실행할때,
//		null.equals 처럼 실행하라는거니까 오류..	
		
		// 2. do~while
		String str = null;  //여기서는 가능, str의 실제 문자열로 덮어쓰였기 때문.
		do {
			System.out.print("문자열을 입력하세요 : ");
			str = sc.nextLine();
			System.out.println("내가 입력한 문자열 : " + str);
		} while(!str.equals("exit"));			
	}
}
