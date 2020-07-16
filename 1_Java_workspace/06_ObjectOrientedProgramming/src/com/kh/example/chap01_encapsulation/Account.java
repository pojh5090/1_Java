package com.kh.example.chap01_encapsulation;

public class Account {
	private String name = "������";
	private String phone = "010-1234-1234";
	private String pwd = "q1w2e3r4";
	private int bankCode = 3030;
	private int balance = 0;  //�ܾ�
	
	//�Ա��� ���� �޼ҵ�
	public void deposit(int money) {
		if(money > 0) {
			balance += money;
			System.out.println(name + "���� ���¿� " + money + "���� �ԱݵǾ����ϴ�.");
		} else {
			System.out.println("�߸��� �ݾ��� �ԷµǾ����ϴ�.");
		}
	}
	
	//����� ���� �޼ҵ�
	public void withdraw(int money) {
		if(money <= balance) {
			balance -= money;
			System.out.println(name + "���� ���¿��� " + money + "���� ��ݵǾ����ϴ�.");
		} else {
			System.out.println("�߸��� �ݾ��� �ԷµǾ����ϴ�.");
		}
	}
	
	//�ܾ� ��ȸ�� ���� �޼ҵ�
	public void displayBalance() {
		System.out.println(name + "���� ���¿� �ܾ��� " + balance + "���Դϴ�.");
	}
}
