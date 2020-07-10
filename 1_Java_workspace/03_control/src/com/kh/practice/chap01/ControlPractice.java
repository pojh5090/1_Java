package com.kh.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	public void practice1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("7. 종료");
		System.out.print("메뉴 번호를 입력하세요 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 :
			System.out.println("입력 메뉴입니다.");
			break;
		
		case 2 :
			System.out.println("수정 메뉴입니다.");
			break;
		
		case 3 :
			System.out.println("조회 메뉴입니다.");
			break;
		
		case 4 :
			System.out.println("삭제 메뉴입니다.");
			break;
		
		case 7 :
			System.out.println("프로그램이 종료됩니다.");
			break;
		}
		
	}
	
	public void practice2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		if(num > 0) {
			if(num % 2 == 0) {
				System.out.println("짝수다");
			}
			else {
				System.out.println("홀수다");
			}
		}
		else {
			System.out.println("양수만 입력해주세요.");
		}		
	}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어점수 : ");
		int kor = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int mat = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		int sum = kor + mat + eng;
		double aver = sum / 3;
		
		if(kor >= 40) {
			if(mat >= 40) {
				if(eng >= 40) {
					if(aver >= 60) {
						System.out.println("국어 : " + kor);
						System.out.println("수학 : " + mat);
						System.out.println("영어 : " + eng);
						System.out.println("합계 : " + sum);
						System.out.println("평균 : " + aver);
						System.out.println("축하합니다, 합격입니다!");
					}
					else {
						System.out.println("불합격입니다.");
					}
				}			
			}
		} else {
			System.out.println("불합격입니다.");
		}
	}
	
	public void practice4() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int num = sc.nextInt();
		
		switch(num) {
		case 1 : case 2 : case 12 :
			System.out.println("겨울");
			break;
		case 3 : case 4 : case 5 :
			System.out.println("봄");
			break;
		case 9 : case 10 : case 11 :
			System.out.println("가을");
			break;
		case 6 : case 7 : case 8 :
			System.out.println("여름");
			break;
		default :
			System.out.println(num + "월은 잘못 입력된 달입니다.");
		}
	}
	
	public void practice5() {
		Scanner sc = new Scanner(System.in);
		
		String id = "aaa";
		String pw = "bbb";
		
		
		System.out.print("아이디 : ");
		String lid = sc.next();
		
		System.out.print("비밀번호 : ");
		String lpw = sc.next();
		
		if(lid.equals(id)) {
			if(lpw.equals(pw)) {
				System.out.println("로그인 성공");
			}
			else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		} else {
			System.out.println("아이디가 틀렸습니다.");
		}		
	}
	
	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String rank = sc.next();
		
		switch(rank) {
		case "관리자" :
			System.out.println("회원관리, 게시글 관리, 게시글 작성, 게시글 조회, 댓글 작성");
			break;
		case "회원" :
			System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
			break;
		case "비회원" :
			System.out.println("게시글 조회");
			break;
		}
	}
	
	public void practice7() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		
		System.out.println("BMI 지수 : " + bmi);
		
		if(bmi < 18.5) {
			System.out.println("저체중");
		} else if( bmi < 23) {
			System.out.println("정상체중");
		} else if( bmi < 25) {
			System.out.println("과체중");
		} else if( bmi < 30) {
			System.out.println("비만");
		} else {
			System.out.println("고도 비만");
		}
	}
	
	public void practice8() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("피연산자1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("피연산자2 입력 : ");
		int num2 = sc.nextInt();
		
		System.out.print("연산자를 입력(+,-,*,/): ");
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
			System.out.println("잘못 입력하셨습니다. 프로그램을 종려합니다.");
		}
		
		System.out.println(num1 + " " + op + " " + num2 + " = " + result);
	}
	
	public void practice9() {
		//6회 이상 결석시 fail
		Scanner sc = new Scanner(System.in);
		
		System.out.print("중간 고사 점수 : ");
		int mid = sc.nextInt();
		double midj = mid * 0.2;
		
		System.out.print("기말 고사 점수 : ");
		int fin = sc.nextInt();
		double finj = fin * 0.3;
		
		System.out.print("과제 점수 : ");
		int hom = sc.nextInt();
		double homj = hom * 0.3;
		
		System.out.print("출석 회수: ");
		int att = sc.nextInt();
		double attj = att;
		
		double sum = midj + finj + homj + attj;
		
		System.out.println("==========결과==========");
		
		if(att >= 15 ) {
			System.out.println("중간 고사 점수(20) : " + midj);
			System.out.println("기말 고사 점수(30) : " + finj);
			System.out.println("과제 점수       (30) : " + homj);
			System.out.println("출석 점수       (20) : " + attj);
			System.out.println("총점    : " + sum);
			if(sum >= 70) {
				System.out.println("Pass");
			} else {
				System.out.println("Fail [점수 미달]");
			}
		} else {
			System.out.println("Fail [출석 회수 부족(" + att + "/20)]");
		}
	}
	
	public void practice10() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("실행할 기능을 선택하세요.");
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		System.out.println("9. P/F");
		System.out.print("선택 : ");		
		int menu = sc.nextInt();
		
		switch(menu) {
		case 1 :
			practice1();  //호출한거임!
			break;
		case 2 :
			practice2();  //호출한거임!
			break;
		case 3 :
			practice3();  //호출한거임!
			break;
		case 4 :
			practice4();  //호출한거임!
			break;
		case 5 :
			practice5();  //호출한거임!
			break;
		case 6 :
			practice6();  //호출한거임!
			break;
		case 7 :
			practice7();  //호출한거임!
			break;
		case 8 :
			practice8();  //호출한거임!
			break;
		case 9 :
			practice9();  //호출한거임!
			break;
		default :
			System.out.println("번호를 다시 입력해주세요.");
		}	
	}
	
}
