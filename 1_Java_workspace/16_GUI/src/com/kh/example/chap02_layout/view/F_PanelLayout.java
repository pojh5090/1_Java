package com.kh.example.chap02_layout.view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class F_PanelLayout extends JFrame {
	public F_PanelLayout() {
		super("F_PanelLayout");

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 500, 500);
		
		setLayout(null);
		
		JLabel lb = new JLabel("이름 : ");
		lb.setLocation(50, 100);
		lb.setSize(150, 50);	
		
		JTextField tf = new JTextField(20);
		tf.setBounds(110, 110, 200, 50);
				
		JButton btn = new JButton("추가");
		btn.setBounds(350, 100, 100, 50);
	
		JPanel panel = new JPanel();
		panel.setSize(500, 500);
		panel.setLayout(null);
		
		panel.add(lb);
		panel.add(tf);
		panel.add(btn);
		
		add(panel);  //최종적으로 panel을 frame에 붙여야 함!
		
		setVisible(true);
	}
}
