package com.kh.operator;

import java.util.Scanner;

public class G_Triple {
	public void method1() {
		// �Է��� ������ ������� �ƴ��� �Ǻ�
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();
		
		
		String result = num > 0 ? "�����" : (num < 0 ? "����� �ƴϴ�" : "0�̴�");
		
		System.out.println(num + " : " + result);
	}
	
	public void method2() {
		//�Է��� ������ Ȧ������ ¦������ �Ǻ�
		//¦���� , ¦���Դϴ�
		//Ȧ���� , Ȧ���Դϴ�
		
		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		String result2 = (num % 2) == 0 ? "¦����" : "Ȧ���� ";
		
		System.out.println(num + " : " + result2);
	}
}