package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		Book bk = new Book();
		bk.inform();
		System.out.println();
		
		Book bk3 = new Book("�˰�����", "���ǻ�1", "������");
		bk3.inform();
		System.out.println();
		
		Book bk5 = new Book("�عٶ��", "���ǻ�2", "������", 10000, 1.2);
		bk5.inform();
		System.out.println();
	}

}
