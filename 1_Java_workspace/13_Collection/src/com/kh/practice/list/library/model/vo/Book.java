package com.kh.practice.list.library.model.vo;

import com.kh.example.list.model.vo.Student;

public class Book {
	private String title;
	private String author;
	private String category;
	private int price;
	
	public Book() {}
	public Book(String title, String author, String category, int price) {
		this.title = title;
		this.author = author;
		this.category = category;
		this.price = price;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String toString() {
		return "        (" + title + " / " + author + " / " + category + " / " + price + ")";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		Book other = (Book)obj; //형변환 먼저
		if(title == null) {
			if(other.title != null) {
				return false; 
			}
		} else if(!title.equals(other.title)) {
			return false;
		}
		return true;
	}
	public int compareTo(Object o) {
		return 0;
	}
	
}
