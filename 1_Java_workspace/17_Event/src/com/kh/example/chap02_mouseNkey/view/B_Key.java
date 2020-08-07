package com.kh.example.chap02_mouseNkey.view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class B_Key extends JFrame implements KeyListener {
	
	public B_Key() {
		setSize(300, 200);
		
		JTextField tf = new JTextField(20);
		add(tf);
		
		tf.addKeyListener(this);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public void display(String s, KeyEvent e) {
		char c = e.getKeyChar();
		
		boolean isAlt = e.isAltDown();  //Alt누르면 true 반환! (밑에도 마찬가지..)
		boolean isControl = e.isControlDown();
		boolean isShift = e.isShiftDown();
		
		String modifiers = isAlt + " " + isControl + " " + isShift;
		System.out.println(s + " " + c + " " + modifiers);
	}
	
	@Override //입력할때
	public void keyTyped(KeyEvent e) {
		display("keyTyed", e);
	}

	@Override //누르고 있을 때
	public void keyPressed(KeyEvent e) {
		display("keyPressed", e);
	}

	@Override //뗐을 때
	public void keyReleased(KeyEvent e) {
		display("keyReleased", e);
	}

}
