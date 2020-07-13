package com.kh.example.chap02.loop;

import java.util.Scanner;

public class B_While {
	//while(���ǽ�) {
	//   ���๮��;
	//   [������ or �б⹮;]
	//}
	//���ǽ� Ȯ��-> (���ǽ��� true�� ��) ���๮�� ���� -> ���ǽ� Ȯ�� -> (�ݺ�)
	//���ǽ� ����� false�� �� ������ �ݺ�
	public void method1() {
		//1���� 5���� ���
		int i = 1;
		while(i <= 5) {
			System.out.println(i);
			i++;
		}
	}
	
	public void method1_1() {
		//�ڱ�Ұ� 5�� �ϱ�
		int i = 1;
		while(i <= 5) {
			System.out.println("�� �̸��� ������");
			i++;
		}
	}
	
	public void method2() {
		//5���� 1���� ����ϱ�
		int i = 5;
		while(i >= 1) {
			System.out.println(i);
			i--;
		}
	}
	
	public void method3() {
		//1~10 Ȧ���� ���
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i += 2;			
		}
	}
	
	public void method4() {
		//���� �� ���� �Է¹޾� �� ���� ���� ���
		//ù��° �� �� ũ�� �Է��ص� �ǵ��� �ϱ�
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �� �Է� : ");
		int start = sc.nextInt();
		
		System.out.print("ū �� �Է� : ");
		int end = sc.nextInt();
		
		int min = 0;
		int max = 0;
		
		if(start > end) {
			min = end;
			max = start;
		} else {
			min = start;
			max = end;
		}
		
		while(min < max) {
			System.out.println(min+1);
			min++;
		}
			
	}
	
	public void method4_1() {
		// ���� �ϳ��� �Է� �޾� �� ���� 1~9 ������ ���϶��� �� ���� ������ ���
		// ���� �ȸ����� ���߶�� ���
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �ϳ� �Է� : ");
		int num = sc.nextInt();		
		
		if(num >= 1 && num <= 9) {
			int i = 1;
			while(i < 10) {
				System.out.println(num + " X " + i + " = " + (num*i));
				i++;
			}
		} else {
			System.out.println("1~9 ��  �ٽ� �Է����ּ���.");
		}		
	}
	
	public void method5() {
		//1~10 ������ ������ ���� 1���� ���������� ���� �հ�		
		//random() : double   --> �̰� ��ȯ���� �˷��ִ°���!
		int num = (int)(Math.random() * 10 + 1);
		int i = 1;
		int sum = 0;
		
		while(i <= num) {
			sum += i;
			i++;
		}
		System.out.println("������ : " + num + ", �հ�� : " + sum);
	}
	
	public void method6() {
		// ���ڿ��� �Է� �޾� �ε��� ���� ���� ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է� : ");
		String str = sc.nextLine();
		
		System.out.println("���� �Է��� ���ڿ� : " + str);

		//length() : ���ڿ��� ���� ��ȯ(int)
//		for(int i = 0; i < str.length(); i++) {
//			char ch = str.charAt(i);
//			System.out.println(i + " : " + ch);			
//		}
		int i = 0;
		while(i < str.length()) {
			char ch = str.charAt(i);
			System.out.println(i + " : " + ch);
			i++;
		}
	}
	
	public void method7() {
		// 2�� ~9�� while ��ø����
		int i = 2;		
		while(i <= 9) {
			int j = 1;   //j�� �ȿ��ٰ� ���ֱ�!!
			while(j <= 9) {
				System.out.println(i + " X " + j + " = " + i*j);
				j++;
			}
			i++;
		}
	}
	
	public void method8() {
		// �Ƴ��α� �ð�
		int i = 0;		
		while(i <= 23) {
			int j = 0;
			while(j <= 59) {
				System.out.println(i + "�� " + j + "��");
				j++;
			}
			i++;
		}
	}
	
	public void method9() {
		//�� �ٿ� �� ǥ(*)�� 5 �� ��µǴµ� �� ���� ����ڰ� �Է��� �� ��ŭ ���
		//ex -> 3
		//*****
		//*****
		//*****
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �� �Է�: ");
		int row = sc.nextInt();
		int i = 0;
		while(i < row) {
			System.out.println("*****");
			i++;
		}
		
		
		
	}
	public void method10() {
		//�� �ٿ� ��ǥ ���ڸ� �Է��� �� ���� ĭ �� ��ŭ �Է�
		//��, �� ���� ĭ ���� ��ġ�ϴ� ��ġ���� �� ��ȣ�� ���� ���� ���
		//ex
		// �� �� : 4, ĭ �� : 5
		// 1****
		// *2***
		// **3**
		// ****4
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� �� �Է� : ");
		int row = sc.nextInt();
		
		System.out.print("ĭ �� �Է� : ");
		int kan = sc.nextInt();
		
		int i = 1;
		
		while(i <= row) {
			int j = 1;
			while(j <= kan) {
				if(i == j) {
					System.out.print(i);
				} else {
					System.out.print("*");
				}
				j++;
			}
			System.out.println();
			i++;
		}
		
	}
	
	public void method11() {
		Scanner sc = new Scanner(System.in);
		
		int menu = 0;
		while(menu != 9) {
			System.out.println("1. 1~5 ���");
			System.out.println("1. 5~1 ���");
			System.out.println("1. 1~10���� Ȧ�� ���");
			System.out.println("9. ����");
			System.out.print("�޴� ��ȣ : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1 : method1(); break;
			case 2 : method2(); break;
			case 3 : method3(); break;
			case 9 : System.out.println("�����մϴ�."); break;
			default : System.out.println("�߸��Է��ϼ̽��ϴ�.");
			}
		}
	}
	
	public void method12() {
		Scanner sc = new Scanner(System.in);
		
//		while(true) {  // while(true) �ȿ� switch���� ������ method11ó�� �����.
//			// ���� �ݺ���!
//			System.out.println("1. 1~5 ���");
//			System.out.println("2. 5~1 ���");
//			System.out.println("3. 1~10 �� Ȧ���� ���");
//			System.out.println("9. ����");
//			System.out.print("�޴� ���� : ");
//			
//			int menu = sc.nextInt();
//			switch(menu) {
//			case 1 : method1(); break;
//			case 2 : method2(); break;
//			case 3 : method3(); break;
//			case 9 : System.out.println("�����մϴ�."); return;
//			//return�� ���� �ҷ��� �޼ҵ�(=main) ���� �ǵ��ư��°���.
//			//�׷��� ������ main �޼ҵ�� ���ư��°��� �ƴ�.			
//			default: System.out.println("�߸� �Է��ϼ̽��ϴ�.");
//			}
//		}
		int menu = 0;
		do {
			System.out.println("1. 1~5 ���");
			System.out.println("2. 5~1 ���");
			System.out.println("3. 1~10 �� Ȧ���� ���");
			System.out.println("9. ����");
			System.out.print("�޴� ���� : ");
				
			menu = sc.nextInt();
			switch(menu) {
			case 1 : method1(); break;
			case 2 : method2(); break;
			case 3 : method3(); break;
			case 9 : System.out.println("�����մϴ�."); return;	
			default: System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		} while(menu != 9);		
	}
}
