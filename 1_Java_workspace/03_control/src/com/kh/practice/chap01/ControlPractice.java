package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("7. ����");
		System.out.print("�޴� ��ȣ�� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 :
			System.out.println("�Է� �޴��Դϴ�.");
			break;
		
		case 2 :
			System.out.println("���� �޴��Դϴ�.");
			break;
		
		case 3 :
			System.out.println("��ȸ �޴��Դϴ�.");
			break;
		
		case 4 :
			System.out.println("���� �޴��Դϴ�.");
			break;
		
		case 7 :
			System.out.println("���α׷��� ����˴ϴ�.");
			break;
		}
		
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڸ� �� �� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			if(num % 2 == 0) {
				System.out.println("¦����");
			}
			else {
				System.out.println("Ȧ����");
			}
		}
		else {
			System.out.println("����� �Է����ּ���.");
		}		
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�������� : ");
		int kor = sc.nextInt();
		
		System.out.print("�������� : ");
		int mat = sc.nextInt();
		
		System.out.print("�������� : ");
		int eng = sc.nextInt();
		
		int sum = kor + mat + eng;
		double aver = sum / 3;
		
		if(kor >= 40) {
			if(mat >= 40) {
				if(eng >= 40) {
					if(aver >= 60) {
						System.out.println("���� : " + kor);
						System.out.println("���� : " + mat);
						System.out.println("���� : " + eng);
						System.out.println("�հ� : " + sum);
						System.out.println("��� : " + aver);
						System.out.println("�����մϴ�, �հ��Դϴ�!");
					}
					else {
						System.out.println("���հ��Դϴ�.");
					}
				}			
			}
		} else {
			System.out.println("���հ��Դϴ�.");
		}
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 ������ ���� �Է� : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 : case 2 : case 12 :
			System.out.println("�ܿ�");
			break;
		case 3 : case 4 : case 5 :
			System.out.println("��");
			break;
		case 9 : case 10 : case 11 :
			System.out.println("����");
			break;
		case 6 : case 7 : case 8 :
			System.out.println("����");
			break;
		default :
			System.out.println(num + "���� �߸� �Էµ� ���Դϴ�.");
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		String id = "aaa";
		String pw = "bbb";
		
		
		System.out.print("���̵� : ");
		String lid = sc.next();
		
		System.out.print("��й�ȣ : ");
		String lpw = sc.next();
		
		if(lid.equals(id)) {
			if(lpw.equals(pw)) {
				System.out.println("�α��� ����");
			}
			else {
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			}
		} else {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		}		
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ Ȯ���ϰ��� �ϴ� ȸ�� ��� : ");
		String rank = sc.next();
		
		switch(rank) {
		case "������" :
			System.out.println("ȸ������, �Խñ� ����, �Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�");
			break;
		case "ȸ��" :
			System.out.println("�Խñ� �ۼ�, �Խñ� ��ȸ, ��� �ۼ�");
			break;
		case "��ȸ��" :
			System.out.println("�Խñ� ��ȸ");
			break;
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ű(m)�� �Է��� �ּ��� : ");
		double height = sc.nextDouble();
		
		System.out.print("������(kg)�� �Է��� �ּ��� : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		
		System.out.println("BMI ���� : " + bmi);
		
		if(bmi < 18.5) {
			System.out.println("��ü��");
		} else if( bmi < 23) {
			System.out.println("����ü��");
		} else if( bmi < 25) {
			System.out.println("��ü��");
		} else if( bmi < 30) {
			System.out.println("��");
		} else {
			System.out.println("�� ��");
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ǿ�����1 �Է� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�ǿ�����2 �Է� : ");
		int num2 = sc.nextInt();
		
		System.out.print("�����ڸ� �Է�(+,-,*,/): ");
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
		default :
			System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
		}
		
		System.out.println(num1 + " " + op + " " + num2 + " = " + result);
	}
	
	public void practice9() {
		//6ȸ �̻� �Ἦ�� fail
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�߰� ��� ���� : ");
		int mid = sc.nextInt();
		double midj = mid * 0.2;
		
		System.out.print("�⸻ ��� ���� : ");
		int fin = sc.nextInt();
		double finj = fin * 0.3;
		
		System.out.print("���� ���� : ");
		int hom = sc.nextInt();
		double homj = hom * 0.3;
		
		System.out.print("�⼮ ȸ��: ");
		int att = sc.nextInt();
		double attj = att;
		
		double sum = midj + finj + homj + attj;
		
		System.out.println("==========���==========");
		
		if(att >= 15 ) {
			System.out.println("�߰� ��� ����(20) : " + midj);
			System.out.println("�⸻ ��� ����(30) : " + finj);
			System.out.println("���� ����       (30) : " + homj);
			System.out.println("�⼮ ����       (20) : " + attj);
			System.out.println("����    : " + sum);
			if(sum >= 70) {
				System.out.println("Pass");
			} else {
				System.out.println("Fail [���� �̴�]");
			}
		} else {
			System.out.println("Fail [�⼮ ȸ�� ����(" + att + "/20)]");
		}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ ����� �����ϼ���.");
		System.out.println("1. �޴� ���");
		System.out.println("2. ¦��/Ȧ��");
		System.out.println("3. �հ�/���հ�");
		System.out.println("4. ����");
		System.out.println("5. �α���");
		System.out.println("6. ���� Ȯ��");
		System.out.println("7. BMI");
		System.out.println("8. ����");
		System.out.println("9. P/F");
		System.out.print("���� : ");		
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1 :
			practice1();  //ȣ���Ѱ���!
			break;
		case 2 :
			practice2();  //ȣ���Ѱ���!
			break;
		case 3 :
			practice3();  //ȣ���Ѱ���!
			break;
		case 4 :
			practice4();  //ȣ���Ѱ���!
			break;
		case 5 :
			practice5();  //ȣ���Ѱ���!
			break;
		case 6 :
			practice6();  //ȣ���Ѱ���!
			break;
		case 7 :
			practice7();  //ȣ���Ѱ���!
			break;
		case 8 :
			practice8();  //ȣ���Ѱ���!
			break;
		case 9 :
			practice9();  //ȣ���Ѱ���!
			break;
		default :
			System.out.println("��ȣ�� �ٽ� �Է����ּ���.");
		}	
	}
	
}
