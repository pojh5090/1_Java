package com.kh.example.chap03_component.view;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class D_ImageLabel {
	public D_ImageLabel() {
		JFrame frame = new JFrame();
		frame.setSize(250, 300);
		JPanel panel = new JPanel();
		
//		ImageIcon ii = new ImageIcon("image/user.PNG");
//		JLabel label = new JLabel(ii);
		Image icon = new ImageIcon("image/user.PNG").getImage().getScaledInstance(150, 150, 0);
		JLabel label = new JLabel(new ImageIcon(icon));
		
		JButton button = new JButton("�̹��� ����");
		
		panel.add(label, "North");
		panel.add(button, "Center");
		
		frame.add(panel);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				Image icon = new ImageIcon("image/dog.PNG").getImage().getScaledInstance(150, 150, 0);
				label.setIcon(new ImageIcon(icon));		
			}		
		});
	}
}
