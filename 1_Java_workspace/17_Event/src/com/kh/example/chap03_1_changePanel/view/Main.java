package com.kh.example.chap03_1_changePanel.view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {
	
	private JPanel panel;
	
	public Main() {
		setSize(300, 200);
		Panel1 panel1 = new Panel1();	
		add(panel1);
		
		panel1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				remove(panel1); //기존 패널 지워주기
				
				Panel2 panel2 = new Panel2();
				add(panel2);   //새로운 패널 붙여주기
				revalidate();  
				repaint();   //두개 세트로 꼭 써주기 
			}
		});
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
