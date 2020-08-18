package com.kh.practice.list.music.model.compare;

import java.util.Comparator;

import com.kh.practice.list.music.model.vo.Music;

public class AscTitle implements Comparator<Music>{
	@Override
	public int compare(Music o1, Music o2) {
		String standard = o1.getTitle();
		String object = o2.getTitle();
		
		int result = standard.compareTo(object);
		
		String singer1 = o1.getSinger();
		String singer2 = o2.getSinger();
		
		if(result == 0) {
			return singer1.compareTo(singer2);
		}
		return result;
	}
}
