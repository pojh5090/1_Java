package com.kh.example.chap01_use.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class B_Other {
	//������ Ŭ���� ������ֱ�
	public B_Other() {
		JFrame frame = new JFrame();
		frame.setSize(250, 200);
		
		JPanel panel = new JPanel();
		JButton button1 = new JButton("��ư1");
		JButton button2 = new JButton("��ư2");
		JLabel label = new JLabel("���� ��ư�� ������ �ʾҽ��ϴ�.");
		
		panel.add(button1);
		panel.add(button2);
		panel.add(label);
		
		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		button1.addActionListener(new MyEvent(label)); //���� �̷��� �Ѱ��ֱ�!
		button2.addActionListener(new MyEvent(label)); //label�� �����ϱ����� �Ű������� �Ѱ��ֱ�
	}
}
//MyEvent ��ü�� �̺�Ʈ �Ǵ°�
class MyEvent implements ActionListener {
	
	private JLabel label;
	
	//�Ű����� ������ ���� ��������
	public MyEvent(JLabel label) {
		this.label = label;     //�޾ƿ� �Ű����� label�� ���⼭�� ���ϼ�����
	}
	@Override
	public void actionPerformed(ActionEvent e) {		
		String button = e.getActionCommand();
//		System.out.println(button);
		if(button.equals("��ư1")) {
			label.setText("��ư1�� ���Ƚ��ϴ�.");
		} else if(button.equals("��ư2")) {
			label.setText("��ư2�� ���Ƚ��ϴ�.");
		}
	}	
}
