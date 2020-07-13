package com.kh.example.chap02;

import java.util.Scanner;

public class LoopPractice {
	public void method1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num >= 1 ) {
			for(int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1�̻��� ���ڸ� �Է��ϼ���.");
		}
	}
	
	public void method2() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num >= 1 ) {
			for(int i = 1; i <= num; i++) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
			method2();
		}
	}
	
	public void method3() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			for(int i = 0; i <= num-1 ; ++i) {
				System.out.print(num-i + " ");
			} 
		} else {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
		}
	}
	
	public void method4() {
		Scanner sc = new Scanner(System.in);
		System.out.print("1�̻��� ���ڸ� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num >= 1) {
			for(int i = 0; i <= num-1 ; ++i) {
				System.out.print(num-i + " ");
			} 
		} else {
			System.out.println("1�̻��� ���ڸ� �Է����ּ���.");
			method4();
		}
	}
	
	public void method5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ �ϳ� �Է��϶� : ");
		int num = sc.nextInt();
		int sum = 0;
		for(int i = 1; i <= num; ++i) {
			if(i == num) {
				sum += i;
				System.out.print(i + " = " + sum);
			} else {
				sum += i;
				System.out.print(i + " + ");
			}					
		} 
	}
	
	public void method6() {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		
		int start = 0;
		int end = 0;
		
		if(num1 < 1 || num2 < 1) {
			System.out.println("1 �̻��� ���� �Է��϶�.");
		} else {
			if(num1 > num2) {
				start = num2;
				end = num1;
			} else {
				start = num1;
				end = num2;
			}
			for(; start <= end; start++) {
				System.out.print(start + " ");
			}
		}
	}
	
	public void method7() {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("ù ��° ���� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�� ��° ���� : ");
		int num2 = sc.nextInt();
		
		int start = 0;
		int end = 0;
		
		if(num1 < 1 || num2 < 1) {
			System.out.println("1 �̻��� ���� �Է��϶�.");
			method7();
		} else {
			if(num1 > num2) {
				start = num2;
				end = num1;
			} else {
				start = num1;
				end = num2;
			}
			for(; start <= end; start++) {
				System.out.print(start + " ");
			}
		}
	}
	
	public void method8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int dan = sc.nextInt();
		System.out.println("====" + dan + "====");
		
		for(int i = 1; i <= 9; i++) {			
			System.out.println(dan + " * " + i + " = " + dan*i);
		}
	}
	
	public void method9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int dan = sc.nextInt();
		
		if(dan > 9) {
			System.out.println("9������ ���ڸ� �Է����ּ���.");
		} else {
			for(; dan <= 9; dan++) {
				System.out.println("====" + dan + "====");
				for(int j = 1; j <= 9; j++) {
					System.out.println(dan + " * " + j + " = " + dan*j);
				}
				System.out.println();
			}
		}
	}
	
	public void method10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int dan = sc.nextInt();
		
		if(dan > 9) {
			System.out.println("9������ ���ڸ� �Է����ּ���.");
			method10();
		} else {
			for(; dan <= 9; dan++) {
				System.out.println("====" + dan + "====");
				for(int j = 1; j <= 9; j++) {
					System.out.println(dan + " * " + j + " = " + dan*j);
				}
				System.out.println();
			}
		}
	}
	
	public void method11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		int start = sc.nextInt();
		
		System.out.print("���� : ");
		int jump = sc.nextInt();
		
		int i = 0;
		do {
			System.out.print(start + " ");
			start += jump; 
			i++;
		} while(i <= 9);
	}
	
	public void method12() {
		Scanner sc = new Scanner(System.in);
		
		String str ="";
		do {
			System.out.print("������(+, -, *, /, %) : ");
			str = sc.next();
			char op = str.charAt(0);
			
			if(str.equals("exit")) {
				System.out.println("���α׷��� �����մϴ�.");
				break;
			}
			
			System.out.print("����1 : ");
			int num1 = sc.nextInt();
			
			System.out.print("����2 : ");
			int num2 = sc.nextInt();
			
			if(op == '/' && num2 == 0) {
				System.out.println("0���� ���� �� �����ϴ�. �ٽ� �Է����ּ���.");
				method12();
			}
			
			switch(op) {
			case '+' : System.out.println(num1 + " + " + num2 + " = " + (num1+num2)); break;
			case '-' : System.out.println(num1 + " - " + num2 + " = " + (num1-num2)); break;
			case '*' : System.out.println(num1 + " * " + num2 + " = " + (num1*num2)); break;
			case '/' : System.out.println(num1 + " / " + num2 + " = " + (num1/num2)); break;	
			default: System.out.println("���� �������Դϴ�.");
			}
		} while(!str.equals("exit"));	
	}	
	
	public void method13() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	public void method14() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		for(int i = num-1; i >= 0; i--) {
			for(int j = 0; j <= i; ++j) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
