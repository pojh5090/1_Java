package com.kh.example.chap01_thread.thread;

public class Thread1 extends Thread {
	@Override  //ctrl + space
	public void run() {
		setName("귀여운 Thread1");
		for(int i = 0; i < 10; i++) {
			//getName() : thread클래스의 메소드, 지금 현재 thread의 이름을 반환해줌
			System.out.println(getName() + " ON...");
			try {
				Thread.sleep(1000);  //스레드 지연 메소드 (1000 => 1초)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
