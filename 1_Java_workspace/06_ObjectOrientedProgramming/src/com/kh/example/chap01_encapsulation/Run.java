package com.kh.example.chap01_encapsulation;

public class Run {

	public static void main(String[] args) {
		Account a = new Account();
		a.displayBalance();
		
		a.deposit(1000000);
		a.displayBalance();
		
		a.deposit(1500000);
		a.displayBalance();
		
		a.withdraw(500000);
		a.displayBalance();
		
		//a.balance -= 2000000;  //캡슐화가 필요한 이유 (private 붙이기 전)
				
		a.withdraw(500000);
		a.displayBalance();
	}

}
