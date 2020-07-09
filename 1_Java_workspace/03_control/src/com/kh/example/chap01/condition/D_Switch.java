package com.kh.example.chap01.condition;

import java.util.Scanner;

public class D_Switch {
	//���ǽ��� ��� ���� case���� ã�� ����� �����ϴ� ���ǹ�
	//�ش��ϴ� ���� case�� ���� ��쿡�� default�� ��ɹ� ����
	
	//case�� ���๮ ���̿��� �ݷ�(:)�� �����
	//break�� ������ ������ �ʰ� ��� ����
	
	//switch(����) {
	// case ��1 : ���๮1; break;  -->������ ���� ��1�̸� ����
	// case ��2 : ���๮2; break;  -->������ ���� ��2�̸� ����
	// default : ���๮3;          -->������ ���� case���� ������ ����
	// }
	
	public void method1() {
		//���� �� ���� �����ȣ ���� 1���� �Է¹޾�
		//���� ��ȣ ���ڿ� �ش��ϴ� ����� �����ϰ� ����Ͻÿ�.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù ��° �� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° �� : ");
		int num2 = sc.nextInt();
		
		System.out.print("������(+, -, *, /) : ");
		char op = sc.next().charAt(0);
		
		int result = 0;
		
		switch(op) {
		case '+' :
			result = num1 + num2;
			break;
		case '-' :
			result = num1 - num2;
			break;
		case '*' :
			result = num1 * num2;
			break;
		case '/' :
			result = num1 / num2;
			break;
		default:
			System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
		}	
		System.out.println(num1 + " " + op + " " + num2 + " = " + result);
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("�ſ�� ���ϰ��� �Դϴ�!^^");
		System.out.println("���, �ٳ���, ������, Ű�� �ֽ��ϴ�~ ���� ���ϰ� �������!");
		System.out.println("� ������ ������ �ñ��ϼ���? : ");
		String fruit = sc.next();
		
		int price = 0;
		
		switch(fruit) {     //���� break ���ָ� ����~~
		case "���" : 
			price = 1000;
			break;
		case "�ٳ���" :
			price = 3000;
			break;
		case "������" :
			price = 2000;
			break;
		case "Ű��" :
			price = 5000;
			break;
		default :
			System.out.println("�� ������ �����ϴ�.");
		}
		System.out.println(fruit + "�� ������ " + price + "�� �Դϴ�.");
	}
	
	public void method3() {
		//1������ 12������ �Է¹޾� �ش��ϴ� ���� ������ ��¥�� ����ϼ���.
		//2���� 28
		//1,3,5,7,8,10,12 ->31��
		//4,6,9,11->30��
		Scanner sc = new Scanner(System.in);
		System.out.print("1�� ~ 12������ �� �ϳ��� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
//		switch(num) {
//		case 1 : System.out.println("31��"); break;
//		case 2 : System.out.println("28��"); break;
//		case 3 : System.out.println("31��"); break;
//		case 4 : System.out.println("30��"); break;
//		case 5 : System.out.println("31��"); break;
//		case 6 : System.out.println("30��"); break;
//		case 7 : System.out.println("31��"); break;
//		case 8 : System.out.println("31��"); break;
//		case 9 : System.out.println("30��"); break;
//		case 10 : System.out.println("31��"); break;
//		case 11 : System.out.println("30��"); break;
//		case 12 : System.out.println("31��"); break;
//		default : System.out.println("1���� 12������ ���ڸ� �Է��ϼ���");
//		}
		
		switch(num) {
		case 1 : case 3 : case 5 : case 7 : case 8 : 
		case 10 : case 12 :
			System.out.println("31�� ���� �Դϴ�."); break;
		case 4 : case 6 : case 9 : case 11 :
			System.out.println("30�� ���� �Դϴ�."); break;
		case 2 : 
			System.out.println("28�� ���� �Դϴ�."); break;
		default :
			System.out.println("1���� 12������ ���ڸ� �Է��ϼ���");
		}
	}
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("****�츮�� �޴��Դϴ�.****");
		System.out.println("1. �����ϰ� ����ϱ�");
		System.out.println("2. �ſ�� ���� ����");
		System.out.println("3. ���� ���� ����ϱ�");
		System.out.print("�޴� ��ȣ : ");		
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1 :
//			System.out.println("���� ���");
			method1();  //ȣ���Ѱ���!
			break;
		case 2 :
//			System.out.println("�ſ��");
			method2();
			break;
		case 3 :
//			System.out.println("����");
			method3();
			break;
		default :
			System.out.println("�޴� ��ȣ�� �ٽ� �Է����ּ���.");
		}	
	}
}
