package com.kh.example.chap03_component.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;

public class H_Slider {
	public H_Slider() {
		JFrame frame = new JFrame();
		frame.setSize(300, 200);
		
		JPanel panel1 = new JPanel();
		JLabel label = new JLabel("�����̴��� ������������", JLabel.CENTER);
		panel1.add(label);
		
		JPanel panel2 = new JPanel();
		JSlider slider = new JSlider(0, 30, 15);
		                 //         �ּҰ�, �ִ밪, �⺻��
		slider.setMajorTickSpacing(10); //ū ���� ����
		slider.setMinorTickSpacing(1);  //���� ���� ����
		slider.setPaintTicks(true); //���� ǥ��
		slider.setPaintLabels(true); //���ݿ� �� ǥ��
		
		JButton button = new JButton("����");
		panel2.add(slider);
		panel2.add(button);
		
		JPanel resultPanel = new JPanel();
		JLabel text = new JLabel("��� �� : ");
		JLabel result = new JLabel();
		resultPanel.add(text);
		resultPanel.add(result);
		
		frame.add(panel1, "North");
		frame.add(panel2, "Center");
		frame.add(resultPanel, "South");
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				result.setText(slider.getValue() + "");
			}
			
		});
		
		frame.pack();
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
