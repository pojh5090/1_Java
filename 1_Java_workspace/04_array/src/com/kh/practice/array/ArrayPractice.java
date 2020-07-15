package com.kh.practice.array;

import java.util.Scanner;

public class ArrayPractice {
	public void practice1() {
		int[] arr = new int[10];
		
		int value = 1;
		for(int i = 0; i < 10; i++) {
			arr[i] = value++;
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice2() {
		int[] arr = new int[10];
		
		int value = 10;
		for(int i = 0; i < 10; i++) {
			arr[i] = value--;
		}
		
		for(int i = 0; i < 10; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		int num = sc.nextInt();
		
		int[] arr = new int[num];
		
		int value = 1;
		for(int i = 0; i < num; i++) {
			arr[i] = value++;
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice4() {
		String[] arr = {"���", "��", "����", "������", "����" };
		
		System.out.print(arr[1]);		
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� : ");
		String str = sc.next();
		
		int arr[] = new int[str.length()];
		
		//System.out.println(arr.length);
		
		for(int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		
		System.out.print("���� : ");		
		char c = sc.next().charAt(0);
		
		System.out.print(str + "�� " + c + "�� �����ϴ� ��ġ(�ε���) : " );
		int count = 0;		
		for(int i = 0; i < arr.length; i++) {			
			if(c == arr[i]) {				
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println("i ���� : " + count);
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0~6 ���� ���� �Է� : ");
		int num = sc.nextInt();
		
		char[] day = {'��', 'ȭ', '��', '��', '��', '��', '��'};
				
		if(num >= 0 && num <= 6) {
			for(int i = 0; i < 7; i++) {
				if(num == i)
					System.out.print(day[i] + "����");
			}
		} else {
			System.out.println("�߸� �Է� �ϼ̽��ϴ�.");
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int length = sc.nextInt();
		
		int[] arr = new int[length];
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.print("�迭 " + i + "��° �ε����� ���� �� : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("�� �� : " + sum);
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� : ");
		int num = sc.nextInt();
		
		if(num < 3 || num % 2 == 0) {
			System.out.println("�ٽ� �Է��ϼ���.");
			practice8();
		}
		
		int[] arr = new int[num];
		int mid = (num / 2);
		int value = 0;

		for(int i = 0; i < arr.length; i++) {
			if(i <= mid) {
				arr[i] = ++value;
			} else {
				arr[i] = value - 1;
				value--;
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice9() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ġŲ �̸��� �Է��ϼ��� : ");
		String name = sc.next();
		
		String[] arr = {"���", "�Ķ��̵�", "�Ѹ�Ŭ", "�ݹ�", "����"};
		
		for(int i = 0; i < arr.length; i++) {
			if(name.equals(arr[i]) ) {
				System.out.println(name + "ġŲ ��� ����");
				break;
			} else {
				System.out.println(name + "ġŲ�� ���� �޴�");
				break;
			}
		}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�ֹε�Ϲ�ȣ(-����) : ");
		
		String num = sc.next();
		char[] arr = new char[14];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = num.charAt(i);
		}
		
		for(int i = 0; i < 8; i++) {
			System.out.print(arr[i]);
		}
		
		for(int i = 8; i < arr.length; i++) {
			System.out.print("*");
		}		
	}
	
	public void practice11() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
		}
		for(int i = 0; i < 10; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	public void practice12() {
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
		}
		for(int i = 0; i < 10; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int min = 100;
		int max = 1;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < min)
				min = arr[i];
			if(arr[i] > max)
				max = arr[i];
		}
		
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
	}
	
	public void practice13() {
		int[] arr = new int[10];
		
		for(int i = 0; i < 10; i++) {
			arr[i] = (int)(Math.random() * 10 + 1);
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j])
					i--;
			}
		}
		for(int i = 0; i < 10; i++) {
			System.out.print(arr[i] + " ");
		}		
	}
	
	public void practice14() {
		int[] arr = new int[6];
		
		for(int i = 0; i < 6; i++) {
			arr[i] = (int)(Math.random() * 45 + 1);
			for(int j = 0; j < i; j++) {
				if(arr[i] == arr[j])
					i--;
			}
		}
		int temp = 0;
		for(int i = 0; i < 6; i++) {
			for(int j = i; j < 6; j++) {
				if(arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}
		
		for(int i = 0; i < 6; i++) {
			System.out.print(arr[i] + " ");
		}	
	}
	
	public void practice15() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ� : ");
		String str = sc.next();
		
		int count = str.length();
		
		char[] carr = new char[str.length()];
		for(int i = 0; i < carr.length; i++) {
			carr[i] = str.charAt(i);
		}
		
		System.out.print("���ڿ��� �ִ� ���� : ");
		for(int i = 0; i < carr.length ; i++) {			
			if(i != (carr.length -1)) {
				System.out.print(carr[i] + ", ");
			} else {
				System.out.print(carr[i]);
			}			
			for(int j = 0; j < i; j++) {
				if(carr[i] == carr[j])
					count--;
			}
		}		
		System.out.println();
		System.out.println("���� ���� : " + count);		
	}
	
	public void practice16() {  //��������� �غ���
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�迭�� ũ�⸦ �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		String[] arr = new String[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print(i + "��° ���ڿ� : ");
			arr[i] = sc.next();
		}		
		
		System.out.print("�� ���� �Է��Ͻðڽ��ϱ�?(y/n) : ");
		char ch = sc.next().charAt(0);

		if(ch == 'y') {
			System.out.print("�� �Է��ϰ� ���� ���� : ");
			int num2 = sc.nextInt();
			//String arr2[] = new int[num]
			
		} else {
			//���
		}
//		do {
//			System.out.print("�� ���� �Է� �Ͻðڽ��ϱ�?(Y/N) : ");
//			ch = sc.next().charAt(0);
//			switch(ch) {
//			case 'y' : 
//				System.out.print("�� �Է��ϰ� ���� ���� : ");
//				int num2 = sc.nextInt();
//				int[] arr2 = new int[num2];
//				for(int i = num + 1; i < num1 + num2; )
//			case 'n' :
//			}
//		} while (ch != 'n');
	}
}
