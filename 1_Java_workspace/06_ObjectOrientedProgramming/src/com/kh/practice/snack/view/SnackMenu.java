package com.kh.practice.snack.view;

import java.util.Scanner;

import com.kh.practice.snack.controller.SnackController;

public class SnackMenu {
	Scanner sc = new Scanner(System.in);
	SnackController scr = new SnackController();
	
	public void menu() {
		System.out.println("�������� �Է��ϼ���.");
		System.out.print("���� : ");
		String kkind = sc.nextLine();
		System.out.print("�̸� : ");
		String nname = sc.nextLine();
		System.out.print("�� : ");
		String fflavor = sc.nextLine();
		System.out.print("���� : ");
		int nnumOf = sc.nextInt();
		System.out.print("���� : ");
		int pprice = sc.nextInt();
		
		System.out.println(scr.saveData(kkind, nname, fflavor, nnumOf, pprice));
		
		System.out.print("�ڼ��� ������ Ȯ���Ͻðڽ��ϱ�?(y/n) : ");
		String op = sc.next();
		
		if(op.equals("y")) {
			System.out.println(scr.confirmData());
		}
	}
}