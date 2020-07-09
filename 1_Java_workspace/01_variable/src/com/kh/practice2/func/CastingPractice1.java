package com.kh.practice2.func;

import java.util.Scanner;

public class CastingPractice1 {
	public void cast() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("¹®ÀÚ : ");
		
		String munStr = sc.nextLine();
		char mun = munStr.charAt(0);
		int mmm = mun;
		
		System.out.println(mun + " unicode : " + mmm);
	}

	
}
