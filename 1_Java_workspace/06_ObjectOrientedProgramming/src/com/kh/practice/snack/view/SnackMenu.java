package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {
	Scanner sc = new Scanner(System.in);
	SnackController scr = new SnackController();
	
	public void menu() {
		System.out.println("스낵류를 입력하세요.");
		System.out.print("종류 : ");
		String kkind = sc.nextLine();
		System.out.print("이름 : ");
		String nname = sc.nextLine();
		System.out.print("맛 : ");
		String fflavor = sc.nextLine();
		System.out.print("개수 : ");
		int nnumOf = sc.nextInt();
		System.out.print("가격 : ");
		int pprice = sc.nextInt();
		
		System.out.println(scr.saveData(kkind, nname, fflavor, nnumOf, pprice));
		
		System.out.print("자세한 정보를 확인하시겠습니까?(y/n) : ");
		String op = sc.next();
		
		if(op.equals("y")) {
			System.out.println(scr.confirmData());
		}
	}
}