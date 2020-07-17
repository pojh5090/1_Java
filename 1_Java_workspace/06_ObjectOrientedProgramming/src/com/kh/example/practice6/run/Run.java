package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		Book bk = new Book();
		bk.inform();
		System.out.println();
		
		Book bk3 = new Book("똥강아지", "출판사1", "강진희");
		bk3.inform();
		System.out.println();
		
		Book bk5 = new Book("해바라기", "출판사2", "강감찬", 10000, 1.2);
		bk5.inform();
		System.out.println();
	}

}
