package com.kh.example.chap01_thread.run;

import com.kh.example.chap01_thread.thread.Thread1;
import com.kh.example.chap01_thread.thread.Thread2;
import com.kh.example.chap01_thread.thread.Thread3;

public class Run {

	public static void main(String[] args) {
		Thread1 thread1 = new Thread1();
		thread1.start(); //run() 말고 start 실행시켜야함!
		
		Thread2 t2 = new Thread2();
//		t2.start();
		Thread thread2 = new Thread(t2);
		thread2.start();
		
		Thread3 thread3 = new Thread3();
		thread3.start();
	}

}
