package com.kh.example.chap02.loop;

import java.util.Scanner;

public class A_For {
	// for(�ʱ��; ���ǽ�; ������) {
	//    ���� ����;
	// }
	// �ʱ�� -> ���ǽ� Ȯ�� -> (���ǽ��� true�� ��) ���๮�� ���� -> ������ -> ���ǽ� Ȯ�� -> (�ݺ�)
	// ���ǽ��� ����� false�� �� �� ���� �ݺ�
	
	// for�� �ȿ� �ִ� �ʱ��, ���ǽ�, ������ ���� ����
	// �ʱ���� ��������, ������ ��������, ������ �󸶳� �Ǵ��� �Ұ�ȣ ���� �ƴϾ ��򰡿��� ǥ���ؾ� ��
	// �ᱹ for() �ȿ����� ������ �� ��� �ʿ��� ���	
	public void method1() {
		// 1���� 5���� ���
		for(int i = 1; i <= 5; i++) {
			System.out.println(i + " �ݺ�");
		}
	}
	
	public void method1_1() {
		// �ڱ�Ұ� �ټ��� �ϱ� : �� �̸��� �ڽſ��
//		for(int i = 0; i <= 4; i++)  //==> 0 1 2 3 4
		for(int i = 0; i < 5; i++) {
			System.out.println("�� �̸��� �ڽſ��");
		}
	}
	
	public void method2() {
		// 5���� 1���� ���
//		for(int i =5; i > 0; --i) {
//			System.out.println(i);
//		}
		for(int i = 1; i <= 5; i++) {
			System.out.println(6 - i);
		}
	}
	
	public void method2_1() {
		// 8���� 3���� ���
		for(int i = 8; i > 2; --i) {
			System.out.println(i);
		}
	}
	
	public void method3() {
		// 1~10 ������ Ȧ����
//		for(int i = 1; i <= 10; i++) {
//			if(i % 2 != 0) {
//				System.out.println(i);
//			}
//		}
		for(int i = 1; i <= 10; i += 2) {
			System.out.println(i);
		}
	}
	
	public void method4() {
		//���� �� ���� �Է� �޾� �� ���� ���� ���
		//���� �ΰ� �Է��ϼ���.
		//�� , ù��° ���ڸ� �ι��� ���ں��� �۰� �Է�.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° �� �Է�: ");
		int num1 = sc.nextInt();
		
		System.out.print("�ι�° �� �Է�: ");
		int num2 = sc.nextInt();
		
//		for(int i = num1; i <= num2; ++i) {
//			System.out.print(i + " ");
//		}
//		for(; num1 <= num2; num1++) {
//			System.out.print(num1 + " ");
//		}
		
		int max = 0;  //�� ���� �� ū ���� ���� 
		int min = 0;  //�� ���� �� ���� ���� ����
		
		if(num1 <= num2) {
			max = num2;
			min = num1;
		} else {  //�ݴ� ��Ȳ
			max = num1;
			min = num2;
		}
		
		for(int i = min; i <= max; i++) {
			System.out.print(i + " ");
		}
		
	}
	
	public void method4_1() {
		// ������ �ϳ� �Է� �޾� �� ���� 1~9������ �����϶��� �� ���� ������ ���
		// ������ ���� ������ "1~9 ������ ����� �Է��ؾ� �մϴ�. " ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~9 ������ ���ڸ� �Է��ϼ��� : ");
		int gugu = sc.nextInt();
		
		if(gugu >= 1 && gugu <= 9) {
			for(int i = 1; i <= 9; ++i) {
				System.out.println(gugu + " x " + i + " = " + gugu*i );
			}
		} else {
			System.out.println("1~9������ ����� �Է��ؾ� �մϴ�.");
		}
	}
	
	public void method5() {
		//1���� 10������ ������ ������ ���� 1���� ���������� �հ�
		//���� �� ���� �޼ҵ� : Math.random();
		// 0�̻� 1�̸��� �Ǽ��� �������� ��ȯ(double)
		// 0�ܰ�) 0 <= Math.random() < 1   (�Ǽ�)
		// 1�ܰ�) 0 <= Math.random() * 10 < 10 : 0~9.99999999
		// 2�ܰ�) 1 <= Math.random()*10 + 1 < 11  : 1~10.9999999
		// 3�ܰ�) 1 < (int)(Math.random() * 10 + 1) < 11
		
		int num = (int)(Math.random() * 10 + 1);
		int sum = 0;
		
		for(int i = 1; i <= num; ++i ) {
			sum += i;
		}
		System.out.println("������ : " + num);
		System.out.println("�հ�� : " + sum);
		
	}
	
	public void method6() {
		//��ø for�� : for�� �ȿ� for��
		//2�ܺ��� 9�ܱ��� ���
		for(int i = 2; i <= 9; ++i) {
			for(int j = 1; j <= 9; ++j ) {
				System.out.println(i + " X " + j + " = " + (i*j));
			}
		}
	}
	
	public void method7() {
		//�Ƴ��α� �ð� : 0�� 0�� ~ 23�� 59��
		for(int i = 0; i <= 23; i++) {
			for(int j = 0; j <= 59; j++) {
				System.out.println(i + "�� " + j + "��" );
			}
		}
	}
	
	public void method8() {
		//�� �ٿ� �� ǥ(*)�� 5 �� ��µǴµ� �� ���� ����ڰ� �Է��� �� ��ŭ ���
		//ex -> 3
		//*****
		//*****
		//*****
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��ض�: ");
		int row = sc.nextInt();
		
		for(int i = 0; i < row; ++i ) {
			for(int j = 0; j < 5; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void method9() {
		//�� �ٿ� ��ǥ ���ڸ� �Է��� �� ���� ĭ �� ��ŭ �Է�
		//��, �� ���� ĭ ���� ��ġ�ϴ� ��ġ���� �� ��ȣ�� ���� ���� ���
		//ex
		// �� �� : 4, ĭ �� : 5
		// 1****
		// *2***
		// **3**
		// ****4
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ���� �Է�: ");
		int row = sc.nextInt();
		
		System.out.print("ĭ ���� �Է�: ");
		int kan = sc.nextInt();
		
		for(int i = 1; i <= row; ++i) {
			for(int j = 1; j <= kan; ++j) {
				if(i == j) {
					System.out.printf("%d", j);
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	
	
}
