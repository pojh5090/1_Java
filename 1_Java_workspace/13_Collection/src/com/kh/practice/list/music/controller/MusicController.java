package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	private List<Music> list = new ArrayList();
	
	public boolean addList(Music music) {
		return list.add(music);		
	}
	public int addAtZero(Music music) {
		list.set(0, music);
		if(list.contains(music)) {
			return 1;
		} else {
			return 0;
		}		
	}
	public List printAll() {
		return list;
	}	
//	public Music searchMusic(String title) {
//		if(list.contains(title)) {
//			
//		}
//	}
//	public Music setMusic(String title, Music music) {
//		
//	}
	public int ascTitle() {
		return 0;
	}
	public int descSinger() {
		return 0;
	}
	
}
