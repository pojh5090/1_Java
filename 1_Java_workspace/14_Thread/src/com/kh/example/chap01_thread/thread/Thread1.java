package com.kh.example.chap01_thread.thread;

public class Thread1 extends Thread {
	@Override  //ctrl + space
	public void run() {
		setName("�Ϳ��� Thread1");
		for(int i = 0; i < 10; i++) {
			//getName() : threadŬ������ �޼ҵ�, ���� ���� thread�� �̸��� ��ȯ����
			System.out.println(getName() + " ON...");
			try {
				Thread.sleep(1000);  //������ ���� �޼ҵ� (1000 => 1��)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
