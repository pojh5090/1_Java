package com.kh.example.chap03.branch;

import java.util.Scanner;

public class A_Break {
	//break���� ���� ����� �ݺ����� ����
	public void method1() {
		// ���ڿ��� �Է� �޾� ���� ������ ����ϴ� ���α׷�
		// end�� �ԷµǴ� �ݺ� ����
		// do~ while ���
		Scanner sc = new Scanner(System.in);
		
//		String str ="";
//		do {
//			System.out.print("���ڿ� �Է� : ");
//			str = sc.nextLine();
//			System.out.println("���� �� : " + str.length());
//		} while(!str.equals("end"));
		
		do {
			System.out.print("���ڿ� �Է�: ");
			String str = sc.nextLine();
			if(str.equals("end")) {
				break;
			}
			System.out.println("���� �� : " + str.length());  //break �ɸ��� ���� ����X
		} while(true);
	}
}
