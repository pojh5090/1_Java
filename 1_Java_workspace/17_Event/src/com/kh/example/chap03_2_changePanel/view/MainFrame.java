package com.kh.example.chap03_2_changePanel.view;

import javax.swing.JFrame;
//�� Ʋ�� �ٰ� �ʳװ� �˾Ƽ� �ٿ�!
public class MainFrame extends JFrame{
	public MainFrame() {
		setSize(300, 200);
		
		new MainPage(this);
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
