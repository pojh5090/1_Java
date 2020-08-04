package com.kh.example.chap03_component.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class B_RadioButton {
	public B_RadioButton() {
		JFrame frame = new JFrame();
//		frame.setSize(300, 150);
		
		JPanel topPanel = new JPanel();
		JLabel label = new JLabel("어떤 크기의 음료를 주문하시겠습니까?");
		topPanel.add(label);
		frame.add(topPanel, "North");
		
		JPanel sizePanel = new JPanel();
		
		JRadioButton small = new JRadioButton("Small Size");
		JRadioButton medium = new JRadioButton("Mediun Size");
		JRadioButton large = new JRadioButton("Large Size");
		
		ButtonGroup sizeGroup = new ButtonGroup();
		sizeGroup.add(small);
		sizeGroup.add(medium);
		sizeGroup.add(large);
		
		sizePanel.add(small);
		sizePanel.add(medium);
		sizePanel.add(large);		
		frame.add(sizePanel, "Center");
		
		JPanel resultPanel = new JPanel();
		JLabel text = new JLabel("크기가 선택되지 않았습니다.");
		resultPanel.add(text);
		frame.add(resultPanel, "South");
		
		frame.pack();
		//요소들이 보여질수 있도록 최소한의 크기로 만들어주는것
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		small.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("Small Size가 선택 되었습니다.");
			}
			
		});
		medium.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("Medium Size가 선택 되었습니다.");
			}
			
		});
		large.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText("Large Size가 선택 되었습니다.");
			}
			
		});
	}
}
