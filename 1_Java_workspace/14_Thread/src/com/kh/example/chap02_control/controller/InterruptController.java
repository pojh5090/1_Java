package com.kh.example.chap02_control.controller;

import java.util.Scanner;

import com.kh.example.chap02_control.thread.Thread5;

public class InterruptController {
	
	public void sleepInterrupt() {
		Thread5 th5 = new Thread5();
		Thread thread = new Thread(th5);
		thread.start();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아무값이나 입력하세요: ");
		String input = sc.next();
		
		System.out.println("입력한 값: " + input);
		thread.interrupt(); //interrupted 상태를 true로 바꿔줌	
		//이 메소드가 sleep이랑 같이 쓰일 때,
		//이 메소드가 true로 바꿀때 sleep이 다시 false로 바꾸고 계속 돌아감..
		
		System.out.println("isInterrupted() : " + thread.isInterrupted());
		
	}
}
