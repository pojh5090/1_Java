package com.kh.example.chap01_use.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class A_Anonymous {
	public void anonymousMethod() {
		JFrame frame = new JFrame();
		frame.setSize(250, 200);
		
		JPanel panel = new JPanel();
		JButton button1 = new JButton("��ư1");
		JButton button2 = new JButton("��ư2");
		JLabel label = new JLabel("���� ��ư�� ������ �ʾҽ��ϴ�.");
		
		panel.add(button1);
		panel.add(button2);
		panel.add(label);
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("��ư1�� ���Ƚ��ϴ�.");
				System.out.println(e.getSource());
			}
			
		});
	
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				label.setText("��ư2�� ���Ƚ��ϴ�.");
				System.out.println(e.getSource());
			}
		});
	}
}
