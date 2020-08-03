package com.kh.example.chap02_control.run;

import com.kh.example.chap02_control.controller.InterruptController;
import com.kh.example.chap02_control.thread.Thread4;

public class Run {

	public static void main(String[] args) {
		Thread4 thread4 = new Thread4();
		Thread th4 = new Thread(thread4);
//		th4.start();
		
		InterruptController itc = new InterruptController();
		itc.sleepInterrupt();
	}
}
