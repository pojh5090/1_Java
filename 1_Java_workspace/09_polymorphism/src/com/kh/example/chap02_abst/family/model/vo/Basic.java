package com.kh.example.chap02_abst.family.model.vo;

import java.io.Serializable;

public interface Basic extends Cloneable, Serializable{
	
	/*public static final*/ double PI = 3.14;
	void eat();
	public abstract void sleep();
}
