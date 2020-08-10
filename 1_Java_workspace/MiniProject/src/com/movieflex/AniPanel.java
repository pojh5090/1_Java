package com.movieflex;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class AniPanel extends JPanel{
	private JFrame frame;
	public AniPanel(JFrame frame2) {
		
		this.frame = frame2;
		
		setSize(800, 800);

		
		JButton back = new JButton("뒤로가기");
		back.setBounds(10, 800, 100, 40);
		back.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new MainFrame();
				frame2.dispose();
			}		
		});
		
		frame2.add(back);
		frame2.add(this);
	}

}
