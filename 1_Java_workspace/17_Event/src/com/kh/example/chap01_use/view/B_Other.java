package com.kh.example.chap01_use.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class B_Other {
	//별도의 클래스 만들어주기
	public B_Other() {
		JFrame frame = new JFrame();
		frame.setSize(250, 200);
		
		JPanel panel = new JPanel();
		JButton button1 = new JButton("버튼1");
		JButton button2 = new JButton("버튼2");
		JLabel label = new JLabel("아직 버튼이 눌리지 않았습니다.");
		
		panel.add(button1);
		panel.add(button2);
		panel.add(label);
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		button1.addActionListener(new MyEvent(label)); //여기 이렇게 넘겨주기!
		button2.addActionListener(new MyEvent(label)); //label에 접근하기위해 매개변수로 넘겨주기
	}
}
//MyEvent 자체가 이벤트 되는것
class MyEvent implements ActionListener {
	
	private JLabel label;
	
	//매개변수 생성자 여기 만들어줬다
	public MyEvent(JLabel label) {
		this.label = label;     //받아온 매개변수 label이 여기서도 쓰일수있음
	}
	@Override
	public void actionPerformed(ActionEvent e) {		
		String button = e.getActionCommand();
//		System.out.println(button);
		if(button.equals("버튼1")) {
			label.setText("버튼1이 눌렸습니다.");
		} else if(button.equals("버튼2")) {
			label.setText("버튼2가 눌렸습니다.");
		}
	}	
}
