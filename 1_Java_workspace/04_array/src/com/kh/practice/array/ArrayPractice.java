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
		
		System.out.print("양의 정수 : ");
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
		String[] arr = {"사과", "귤", "포도", "복숭아", "참외" };
		
		System.out.print(arr[1]);		
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String str = sc.next();
		
		int arr[] = new int[str.length()];
		
		//System.out.println(arr.length);
		
		for(int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		
		System.out.print("문자 : ");		
		char c = sc.next().charAt(0);
		
		System.out.print(str + "에 " + c + "가 존재하는 위치(인덱스) : " );
		int count = 0;		
		for(int i = 0; i < arr.length; i++) {			
			if(c == arr[i]) {				
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println();
		System.out.println("i 개수 : " + count);
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("0~6 사이 숫자 입력 : ");
		int num = sc.nextInt();
		
		char[] day = {'월', '화', '수', '목', '금', '토', '일'};
				
		if(num >= 0 && num <= 6) {
			for(int i = 0; i < 7; i++) {
				if(num == i)
					System.out.print(day[i] + "요일");
			}
		} else {
			System.out.println("잘못 입력 하셨습니다.");
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int length = sc.nextInt();
		
		int[] arr = new int[length];
		
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("총 합 : " + sum);
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 : ");
		int num = sc.nextInt();
		
		if(num < 3 || num % 2 == 0) {
			System.out.println("다시 입력하세요.");
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
		
		System.out.print("치킨 이름을 입력하세요 : ");
		String name = sc.next();
		
		String[] arr = {"양념", "후라이드", "뿌링클", "반반", "간장"};
		
		for(int i = 0; i < arr.length; i++) {
			if(name.equals(arr[i]) ) {
				System.out.println(name + "치킨 배달 가능");
				break;
			} else {
				System.out.println(name + "치킨은 없는 메뉴");
				break;
			}
		}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민등록번호(-포함) : ");
		
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
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
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
		
		System.out.print("문자열 : ");
		String str = sc.next();
		
		int count = str.length();
		
		char[] carr = new char[str.length()];
		for(int i = 0; i < carr.length; i++) {
			carr[i] = str.charAt(i);
		}
		
		System.out.print("문자열에 있는 문자 : ");
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
		System.out.println("문자 개수 : " + count);		
	}
	
	public void practice16() {  //깊은복사로 해보기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열의 크기를 입력하세요 : ");
		int num = sc.nextInt();
		
		String[] arr = new String[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print(i + "번째 문자열 : ");
			arr[i] = sc.next();
		}		
		
		System.out.print("더 값을 입력하시겠습니까?(y/n) : ");
		char ch = sc.next().charAt(0);

		if(ch == 'y') {
			System.out.print("더 입력하고 싶은 개수 : ");
			int num2 = sc.nextInt();
			//String arr2[] = new int[num]
			
		} else {
			//출력
		}
//		do {
//			System.out.print("더 값을 입력 하시겠습니까?(Y/N) : ");
//			ch = sc.next().charAt(0);
//			switch(ch) {
//			case 'y' : 
//				System.out.print("더 입력하고 싶은 개수 : ");
//				int num2 = sc.nextInt();
//				int[] arr2 = new int[num2];
//				for(int i = num + 1; i < num1 + num2; )
//			case 'n' :
//			}
//		} while (ch != 'n');
	}
}
