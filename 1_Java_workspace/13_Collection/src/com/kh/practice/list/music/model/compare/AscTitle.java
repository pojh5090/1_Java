package com.kh.practice.list.music.model.compare;

import java.util.Comparator;

import com.kh.practice.list.music.model.vo.Music;

public class AscTitle implements Comparator<Music>{
	@Override
	public int compare(Music o1, Music o2) {
		String standardTitle = o1.getTitle();
		String objectTitle = o2.getTitle();
		return -standardTitle.compareTo(objectTitle);
	}
}
