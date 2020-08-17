package com.kh.practice.charCheck.view;

import java.util.Scanner;

import com.kh.practice.charCheck.controller.CharacterController;
import com.kh.practice.charCheck.exception.CharCheckException;

public class CharacterMenu {
	public void menu() {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자열 : ");
		String input = sc.nextLine();
		
		int count = 0;
		try {
			count = new CharacterController().countAlpha(input);	
			System.out.println("'" + input + "'에 포함된 영문자 개수 : " + count);
		} catch(CharCheckException e) {
			e.printStackTrace();
		}

	}
}
