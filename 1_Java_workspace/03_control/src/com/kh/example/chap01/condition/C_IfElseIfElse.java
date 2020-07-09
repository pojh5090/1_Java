package com.kh.example.chap01.condition;

import java.util.Scanner;

public class C_IfElseIfElse {
	//if-else if ��
	//if(���ǽ�1) {
	//   ������ ����1;
	// }  else if(���ǽ�2) {
	//   ������ ����2;
	// } else {
	//   ������ ����3;
	// }
	//���� ������ �� �� �ִ� ���ǹ�
	//if���� ���ǽ��� ��� ���� ��(true)�̸� if�� �ȿ� �ִ� ���๮��1 ����
	//if���� ���ǽ��� ��� ���� ����(false)�̰� else if���� ���ǽ� ��� ���� ��(true)�̸� else if �ȿ� �ִ� ���๮��2 ����
	//�Ѵ� ����(false)�̶�� ���๮��3 ����
	// ==>if������ true��� ������ �Ǿ����� �� �Ʒ� ������� ������� ����
	//   else if���� ������ �� �� �ְ�, else���� ���� �� �� ����.
	public void method1() {
		//�Է��� ���ڰ� ������� 0���� �������� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �Է��϶� : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("����Դϴ�.");
		} else if(num == 0) {
			System.out.println("0 �Դϴ�.");
		} else {
			System.out.println("�����Դϴ�.");
		}
	}
	
	public void method2() {
		//������ �ϳ� �Է� �޾� ����� ������ ������ ��� ���
		//90�� �̻��� A���,
		//90�� �̸� 80�� �̻��� B���
		//80�� �̸� 70�� �̻��� C���
		//70�� �̸� 60�� �̻��� D���
		//60�� �̸��� F���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int score = sc.nextInt();
		char grade = ' ';
		
		if(score >= 90) {
			grade ='A';
		} else if( score >= 80 ) {  //�̷��� ���� �Ѱ��� �־ ������µ�..(�ؿ� �Ű�X)
			grade ='B';
		} else if( score >= 70 ) {
			grade ='C';
		} else if( score >= 60 ) {
			grade ='D';
		} else {
			grade ='F';
		}
		
		System.out.printf("����� ������ %d���̰� ����� %c�Դϴ�.", score, grade);
	} 
	
	public void method3() {
		//���� �������� �� ��� �� �߰� ���� �̻��� ��쿡�� ��޿� +��� ���ڸ� �߰��� ����ض�.
		//��) 95�� �̻��� ����� A+, 90�� �̻��� A, ...
		
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int score = sc.nextInt();
		String grade = "";
		
		if(score >= 90) {
			grade = "A";
			if(score >= 95)
				grade += "+";
		} else if( score >= 80 ) {
			grade = "B";
			if(score >= 85)
				grade += "+";
		} else if( score >= 70 ) {
			grade = "C";
			if(score >= 75)
				grade += "+";
		} else if( score >= 60 ) {
			grade = "D";
			if(score >= 65)
				grade += "+";
		} else {
			grade = "F";
		}
		
		System.out.printf("����� ������ %d���̰� ����� %s�Դϴ�.", score, grade);
	}
}
