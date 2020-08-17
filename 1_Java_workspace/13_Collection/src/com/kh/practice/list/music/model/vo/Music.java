package com.kh.practice.list.music.model.vo;

import java.util.Comparator;

import com.kh.example.list.model.vo.Student;

public class Music implements Comparable<Music>{
	private String title;
	private String singer;
	
	public Music() {}
	public Music(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String toString() {
		return singer + " - " + title;
	}
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((singer == null) ? 0 : singer.hashCode());
		
		return result;
	}
	
	public boolean equals(Object obj) {
		//객체 자체 비교
		if(this == obj) {
			return true;
		}
		if(obj == null) {
			return false; 
		}
		if(getClass() != obj.getClass()) {
			return false;  
		}				
		//객체 필드 비교
		Music other = (Music)obj; //형변환 먼저
		if(title == null) {
			if(other.title != null) {
				return false; 
			}
		} else if(!title.equals(other.title)) {
			return false;
		}
		if(singer == null) {
			if(other.singer != null) {
				return false; 
			}
		} else if(!singer.equals(other.singer)) {
			return false;
		}
		return true;
	}
	
	@Override
	public int compareTo(Music o) {
		String otherTitle = o.getTitle();		
		int result = title.compareTo(otherTitle);		
		return result;
	}

}
