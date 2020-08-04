package com.kh.example.chap03_component.view;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class C_CheckBox {
	public C_CheckBox() {
		JFrame frame = new JFrame();
		
		String[] fruits = {"apple", "orange", "banana"};
		
		JCheckBox[] buttons = new JCheckBox[3];
		for(int i = 0; i < buttons.length; i++) {
			buttons[i] = new JCheckBox(fruits[i]);
		}
		
		JPanel checkPanel = new JPanel();
		for(int i = 0; i < buttons.length; i++) {
			checkPanel.add(buttons[i]);
		}
		
		JPanel resultPanel = new JPanel();
		JLabel text = new JLabel("������ ������ �����ϴ�.");
		resultPanel.add(text);
		
		frame.add(checkPanel, "North");
		frame.add(resultPanel, "Center");
		
		frame.pack();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		for(int i = 0; i < buttons.length; i++) {
			buttons[i].addItemListener(new ItemListener() {

				@Override
				public void itemStateChanged(ItemEvent e) {
					String result = "";
					int count = 0;
					
					for(int i = 0; i < buttons.length; i++) {
						if(buttons[i].isSelected()) {
							result += buttons[i].getText() + " ";
							count++;
						}						
						text.setText(result);
					}
					if(count == 0) {
						text.setText("������ ������ �����ϴ�.");
					}
				}			
			});
		}
	}
}
