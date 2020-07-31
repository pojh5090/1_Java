package com.kh.practice.list.library.controller;

import java.util.ArrayList;
import java.util.Collections;

import com.kh.practice.list.library.model.vo.Book;

public class BookController {
	ArrayList<Book> booklist = new ArrayList<Book>(3);
	
	public BookController() {
		booklist.add(new Book("�ڹ��� ����", "���� ��", "��Ÿ", 20000));
		booklist.add(new Book("���� ���� �˰���", "������", "��Ÿ", 15000));
		booklist.add(new Book("��ȭ�� ���", "������", "�ι�", 17500));
		booklist.add(new Book("�� ������", "�ڽſ�", "�Ƿ�", 21000));	
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
	
	public Book deleteBook(String title, String author) {
		Book removeBook = null;

		for(int i = 0; i < booklist.size(); i++) {
			if(((Book)booklist.get(i)).getTitle().equals(title) && ((Book)booklist.get(i)).getAuthor().equals(author)) {
				removeBook = (Book)booklist.remove(i);
			}
		}
		return removeBook;	
	}
	public int ascBook() {
		Collections.sort(booklist);
		return 1;
	}
}
