package com.kh.practice1.func;

import java.util.Scanner;

public class VariablePractice1 {
	public void print() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		
		System.out.print("성별을 입력하세요(남/여) : ");
		String sexStr = sc.next();
		
//		String sexStr = sc.nextLine();
//		char sex = sexStr.charAt(0);
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		System.out.print("키를 입력하세요(cm) : ");
		double height = sc.nextDouble();
		
		System.out.println("키 " + height + "cm인 " + age + "살 " + sexStr + "자 " + name + 
				"님 반갑습니다^^");
	}
}
