package com.kh.example.chap03_2_changePanel.view;

import javax.swing.JFrame;
//내 틀을 줄게 너네가 알아서 붙여!
public class MainFrame extends JFrame{
	public MainFrame() {
		setSize(300, 200);
		
		new MainPage(this);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
