package com.kh.example.chap02.loop;

import java.util.Scanner;

public class B_While {
	//while(조건식) {
	//   실행문장;
	//   [증감식 or 분기문;]
	//}
	//조건식 확인-> (조건식이 true일 때) 실행문장 수행 -> 조건식 확인 -> (반복)
	//조건식 결과가 false가 될 때까지 반복
	public void method1() {
		//1부터 5까지 출력
		int i = 1;
		while(i <= 5) {
			System.out.println(i);
			i++;
		}
	}
	
	public void method1_1() {
		//자기소개 5번 하기
		int i = 1;
		while(i <= 5) {
			System.out.println("내 이름은 강진희");
			i++;
		}
	}
	
	public void method2() {
		//5부터 1까지 출력하기
		int i = 5;
		while(i >= 1) {
			System.out.println(i);
			i--;
		}
	}
	
	public void method3() {
		//1~10 홀수만 출력
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i += 2;			
		}
	}
	
	public void method4() {
		//정수 두 개를 입력받아 그 사이 숫자 출력
		//첫번째 수 더 크게 입력해도 되도록 하기
		Scanner sc = new Scanner(System.in);
		
		System.out.print("작은 수 입력 : ");
		int start = sc.nextInt();
		
		System.out.print("큰 수 입력 : ");
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
		// 정수 하나를 입력 받아 그 수가 1~9 사이의 수일때만 그 수의 구구단 출력
		// 조건 안맞으면 맞추라고 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();		
		
		if(num >= 1 && num <= 9) {
			int i = 1;
			while(i < 10) {
				System.out.println(num + " X " + i + " = " + (num*i));
				i++;
			}
		} else {
			System.out.println("1~9 수  다시 입력해주세요.");
		}		
	}
	
	public void method5() {
		//1~10 사이의 난수를 정해 1부터 난수까지의 정수 합계		
		//random() : double   --> 이건 반환값을 알려주는거임!
		int num = (int)(Math.random() * 10 + 1);
		int i = 1;
		int sum = 0;
		
		while(i <= num) {
			sum += i;
			i++;
		}
		System.out.println("난수는 : " + num + ", 합계는 : " + sum);
	}
	
	public void method6() {
		// 문자열을 입력 받아 인덱스 별로 문자 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력 : ");
		String str = sc.nextLine();
		
		System.out.println("내가 입력한 문자열 : " + str);

		//length() : 문자열의 길이 반환(int)
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
		// 2단 ~9단 while 중첩으로
		int i = 2;		
		while(i <= 9) {
			int j = 1;   //j는 안에다가 써주기!!
			while(j <= 9) {
				System.out.println(i + " X " + j + " = " + i*j);
				j++;
			}
			i++;
		}
	}
	
	public void method8() {
		// 아날로그 시계
		int i = 0;		
		while(i <= 23) {
			int j = 0;
			while(j <= 59) {
				System.out.println(i + "시 " + j + "분");
				j++;
			}
			i++;
		}
	}
	
	public void method9() {
		//한 줄에 별 표(*)가 5 번 출력되는데 그 줄은 사용자가 입력한 수 만큼 출력
		//ex -> 3
		//*****
		//*****
		//*****
		Scanner sc = new Scanner(System.in);
		
		System.out.print("줄 수 입력: ");
		int row = sc.nextInt();
		int i = 0;
		while(i < row) {
			System.out.println("*****");
			i++;
		}
		
		
		
	}
	public void method10() {
		//한 줄에 별표 문자를 입력한 줄 수와 칸 수 만큼 입력
		//단, 줄 수와 칸 수가 일치하는 위치에는 줄 번호에 대한 정수 출력
		//ex
		// 줄 수 : 4, 칸 수 : 5
		// 1****
		// *2***
		// **3**
		// ****4
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("줄 수 입력 : ");
		int row = sc.nextInt();
		
		System.out.print("칸 수 입력 : ");
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
			System.out.println("1. 1~5 출력");
			System.out.println("1. 5~1 출력");
			System.out.println("1. 1~10사이 홀수 출력");
			System.out.println("9. 종료");
			System.out.print("메뉴 번호 : ");
			menu = sc.nextInt();
			
			switch(menu) {
			case 1 : method1(); break;
			case 2 : method2(); break;
			case 3 : method3(); break;
			case 9 : System.out.println("종료합니다."); break;
			default : System.out.println("잘못입력하셨습니다.");
			}
		}
	}
	
	public void method12() {
		Scanner sc = new Scanner(System.in);
		
//		while(true) {  // while(true) 안에 switch문을 넣으면 method11처럼 실행됨.
//			// 무한 반복문!
//			System.out.println("1. 1~5 출력");
//			System.out.println("2. 5~1 출력");
//			System.out.println("3. 1~10 중 홀수만 출력");
//			System.out.println("9. 종료");
//			System.out.print("메뉴 선택 : ");
//			
//			int menu = sc.nextInt();
//			switch(menu) {
//			case 1 : method1(); break;
//			case 2 : method2(); break;
//			case 3 : method3(); break;
//			case 9 : System.out.println("종료합니다."); return;
//			//return은 나를 불러준 메소드(=main) 에게 되돌아가는것임.
//			//그러나 무조건 main 메소드로 돌아가는것은 아님.			
//			default: System.out.println("잘못 입력하셨습니다.");
//			}
//		}
		int menu = 0;
		do {
			System.out.println("1. 1~5 출력");
			System.out.println("2. 5~1 출력");
			System.out.println("3. 1~10 중 홀수만 출력");
			System.out.println("9. 종료");
			System.out.print("메뉴 선택 : ");
				
			menu = sc.nextInt();
			switch(menu) {
			case 1 : method1(); break;
			case 2 : method2(); break;
			case 3 : method3(); break;
			case 9 : System.out.println("종료합니다."); return;	
			default: System.out.println("잘못 입력하셨습니다.");
			}
		} while(menu != 9);		
	}
}
