package com.kh.example.chap01_use.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class C_Inner {
	private JButton button1, button2;
	private JLabel label;   //�̷��� �ʵ常 ���ָ� MyEventŬ���������� ���� ����!
	
	public C_Inner() {
		JFrame frame = new JFrame();
		frame.setSize(250, 200);
		
		JPanel panel = new JPanel();
		button1 = new JButton("��ư1");
		button2 = new JButton("��ư2");
		label = new JLabel("���� ��ư�� ������ �ʾҽ��ϴ�.");
		
		panel.add(button1);
		panel.add(button2);
		panel.add(label);
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		button1.addActionListener(new MyEvent());  //�̺�Ʈ �������ֱ�~
		button2.addActionListener(new MyEvent());
	}
	
	class MyEvent implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			if(e.getSource() == button1) {
				label.setText("��ư1�� ���Ƚ��ϴ�.");
			} else if(e.getSource() == button2) {
				label.setText("��ư2�� ���Ƚ��ϴ�.");
			}
		}
		
	}
}
