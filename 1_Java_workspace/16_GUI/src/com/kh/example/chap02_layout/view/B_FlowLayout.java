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
		// : ���ʿ��� ���������� �帣���� ������Ʈ�� ��ġ�Ǵ� ���̾ƿ�
		setLayout(new FlowLayout());
		add(new JButton("1��"));
		add(new JButton("2��"));
		add(new JButton("3��"));
		add(new JButton("4��"));
		add(new JButton("5��"));
		add(new JButton("6��"));
		add(new JButton("7��"));
		add(new JButton("8��"));
		add(new JButton("9��"));
		add(new JButton("10��"));
		add(new JButton("11��"));
		add(new JButton("12��"));
		add(new JButton("13��"));
		add(new JButton("14��"));
		add(new JButton("15��"));
		
		//���� ���� �ϱ� ->default�� ��� ����
		setLayout(new FlowLayout(FlowLayout.LEFT));
		setLayout(new FlowLayout(FlowLayout.LEADING));
		
		//������ ���� �ϱ�
		setLayout(new FlowLayout(FlowLayout.RIGHT));
		setLayout(new FlowLayout(FlowLayout.TRAILING));
		
		
	}
}
