package com.kh.example.chap02_control.thread;

public class Thread5 implements Runnable {

	// interrupt() : �������� �۾��� ��ҽ�Ű�� �޼ҵ�
	// void interrupt()
	//     ���� ������ ���ο� interrupted��� �ʵ� ���� true�� �ٲ������ν�
	//     �����忡 ���� �۾��� ����϶�� ��û
	
	// boolean isInterrupted()
	//     ���� �������� interrupted�ʵ� ��ȯ
	
	// static boolean interrupted()
	//     ���� �������� interrupted���¸� ��ȯ�ϰ� false�� �ʱ�ȭ
	
	@Override
	public void run() {
		int count = 0;
		
		while(count < 10 && !Thread.currentThread().isInterrupted()) {
			try {
				Thread.sleep(1000);
				System.out.println((++count) + "��");
			} catch (InterruptedException e) {
//				e.printStackTrace();
				//����� ������ ������ �Ǿ�����!
				System.out.println(count + "�ʿ� ī��Ʈ ����");
				Thread.currentThread().interrupt(); //-->�̷��� �ѹ��� �߻����������� ��
				//�ٽ� true�� ���� �ٲ���
			}
		}
	}
}
