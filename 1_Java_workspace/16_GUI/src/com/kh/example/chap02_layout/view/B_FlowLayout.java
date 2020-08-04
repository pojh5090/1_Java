package com.kh.example.chap02_layout.view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class B_FlowLayout extends JFrame{
	public B_FlowLayout() {
		super("B_FlowLayout");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		setBounds(300, 200, 800, 500);
		
		// FlowLayout
		// : 왼쪽에서 오른쪽으로 흐르듯이 컴포넌트가 배치되는 레이아웃
		setLayout(new FlowLayout());
		add(new JButton("1번"));
		add(new JButton("2번"));
		add(new JButton("3번"));
		add(new JButton("4번"));
		add(new JButton("5번"));
		add(new JButton("6번"));
		add(new JButton("7번"));
		add(new JButton("8번"));
		add(new JButton("9번"));
		add(new JButton("10번"));
		add(new JButton("11번"));
		add(new JButton("12번"));
		add(new JButton("13번"));
		add(new JButton("14번"));
		add(new JButton("15번"));
		
		//왼쪽 정렬 하기 ->default는 가운데 정렬
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setLayout(new FlowLayout(FlowLayout.LEADING));
		
		//오른쪽 정렬 하기
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		setLayout(new FlowLayout(FlowLayout.TRAILING));
		
		
	}
}
