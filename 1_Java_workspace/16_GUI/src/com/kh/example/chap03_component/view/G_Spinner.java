package com.kh.example.chap03_component.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;

public class G_Spinner {
	public G_Spinner() {
		JFrame frame = new JFrame();
		frame.setSize(500, 120);
		
		JPanel panel = new JPanel();
		
		// ListModel
		String[] items = {"소설", "잡지", "전공서적", "취미"};
		SpinnerListModel listModel = new SpinnerListModel(items); 
		JSpinner listSpinner = new JSpinner(listModel); //Spinner 따로 만들어줘야함
		panel.add(listSpinner);
		
		// NumberModel
		SpinnerNumberModel numberModel = new SpinnerNumberModel(1, 0, 9, 1);
		                                                //시작 값,최소 값 ,최대 값,증가 값
		JSpinner numberSpinner = new JSpinner(numberModel);
		panel.add(numberSpinner);		
		
		// DateModel
		Calendar calendar = Calendar.getInstance();
		
		Date today = calendar.getTime();
		
		calendar.add(Calendar.YEAR, -50); //오늘로부터 50년 전
		Date start = calendar.getTime();
		
		calendar.add(Calendar.YEAR, +100); //오늘러부터 50년 후를 만들고싶다
		Date end = calendar.getTime();
		
		SpinnerDateModel dateModel = new SpinnerDateModel(today, start, end, Calendar.YEAR);
		JSpinner dateSpinner = new JSpinner(dateModel);
		dateSpinner.setEditor(new JSpinner.DateEditor(dateSpinner, "yyyy/MM/dd HH:mm:ss"));
		panel.add(dateSpinner);
		
		JButton button = new JButton("전송");
		panel.add(button);
		
		JPanel resultPanel = new JPanel();
		JLabel text = new JLabel();
		resultPanel.add(text);
		
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				text.setText(listSpinner.getValue() + 
						", " + numberSpinner.getValue() + 
						", " + dateSpinner.getValue());		
			}
			
		});
		
		
		frame.add(panel, "North");
		frame.add(resultPanel, "Center");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
