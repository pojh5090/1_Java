package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.kh.practice.list.music.model.compare.AscTitle;
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
	
	public Music searchMusic(String title) {
		for(int i = 0; i < list.size(); i++) {
			Music music = (Music)list.get(i);
			if(title.equals(music.getTitle()))
				return (Music)list.get(i);
		}
		return null;
	}
	
	public Music removeMusic(String title) {
		for(int i = 0; i < list.size(); i++) {
			Music music = (Music)list.get(i);
			if(title.equals(music.getTitle()))
				return (Music)list.remove(i);
		}
		return null;
	}
	
	public Music setMusic(String title, Music music) {
		for(int i = 0; i < list.size(); i++) {
			Music smusic = (Music)list.get(i);
			if(title.equals(smusic.getTitle())) 
				return (Music)list.set(i, smusic);						
		}
		return null;
	}
	
	public int ascTitle() {
		list.sort(new AscTitle());
		
		return 1;
	}
	
	public int descSinger() {
		Collections.sort(list);
		return 1;
	}
	
}
