package com.kh.example.chap02_layout.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class E_NullLayout extends JFrame {
	public E_NullLayout() {
		super("E_NullLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 500, 500);
		
		//null 써줘야함 ! 기본값이 borderLayout이기 때문
		setLayout(null);
		
		JLabel lb = new JLabel("이름 : ");
		lb.setLocation(50, 100);
		lb.setSize(150, 50);
		add(lb);
		
		JTextField tf = new JTextField(20);
		tf.setBounds(110, 110, 200, 50);
		add(tf);
		
		JButton btn = new JButton("추가");
		btn.setBounds(350, 100, 100, 50);
		add(btn);
		
		setVisible(true);
	}
}
