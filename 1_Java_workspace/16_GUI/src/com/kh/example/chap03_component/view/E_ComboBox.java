package com.kh.example.chap03_component.view;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class E_ComboBox {
	public E_ComboBox() {
		JFrame frame = new JFrame();
		frame.setSize(300, 200);
		
		String[] animals = {"dog", "cat", "tiger"};
		
		//타입 지정해주지 않으면 rawtypes 경고메시지 뜸 ->제네릭 설정해줘야함 (타입제한)
		JComboBox<String> animalList = new JComboBox<String>(animals);
		animalList.setSelectedIndex(1); //이렇게 하면 cat먼저 선택된채로 보임
		
		JLabel label = new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		
		frame.add(animalList, "North");
		frame.add(label, "South");
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		animalList.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> cb = (JComboBox<String>)e.getSource(); //getSource() ->이벤트 일어날곳이 어디야!
				String name = (String)cb.getSelectedItem(); //String으로 형변환 하여 받아옴!
				Image img = new ImageIcon("image/" + name + ".PNG").getImage().getScaledInstance(150, 150, 0);
				label.setIcon(new ImageIcon(img));
			}
			
		});
	}
}
