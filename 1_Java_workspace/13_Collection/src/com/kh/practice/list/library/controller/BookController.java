package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	ArrayList<Book> booklist = new ArrayList<Book>(3);
	
	public BookController() {
		booklist.add(new Book("자바의 정석", "남궁 성", "기타", 20000));
		booklist.add(new Book("쉽게 배우는 알고리즘", "문병로", "기타", 15000));
		booklist.add(new Book("대화의 기술", "강보람", "인문", 17500));
		booklist.add(new Book("암 정복기", "박신우", "의료", 21000));	
	}
	public void insertBook(Book bk) {
		booklist.add(bk);
	}
	public ArrayList selectList() {
		return (ArrayList)booklist;
	}
	public ArrayList searchBook(String keyword) {
		ArrayList<Book> searchList = new ArrayList<Book>();
		
		for(int i = 0; i < booklist.size(); i++) {
			if(booklist.get(i).getTitle().contains(keyword)) {
				searchList.add(booklist.get(i));
			}
		}
		return (ArrayList)searchList;
	}
	
	public Book deleteBook(String title, String author){
		Book removeBook = null;
		for(int i = 0; i < booklist.size(); i++) {
			if(booklist.get(i).getTitle().equals(title)) {
				if(booklist.get(i).getAuthor().equals(author))
					 removeBook = booklist.get(i);
					booklist.remove(i);
			}
		}
		return removeBook;	
	}
	public int ascBook() {
		return 0;
	}
}
