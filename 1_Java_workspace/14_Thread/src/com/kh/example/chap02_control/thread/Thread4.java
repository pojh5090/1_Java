package com.kh.example.chap02_control.thread;

public class Thread4 implements Runnable {

	@Override
	public void run() {
		for(int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000); 
				System.out.println(i + "��");
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}		
	System.out.println("ī��Ʈ ����");
	}
}
