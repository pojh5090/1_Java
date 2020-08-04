package com.kh.example.chap03_component.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class A_Text {
	public A_Text() {
		JFrame frame = new JFrame();
		frame.setSize(800, 300);
		
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(3, 2)); //행과 열
		panel.setSize(800, 300);
		
		// TextField : 한 줄짜리 글을 입력할 수 있는 텍스트 상자
		JTextField id = new JTextField(30);
		panel.add(new JLabel("ID"));
		panel.add(id);
		
		// PasswordField : 비밀번호를 입력할 수 있는 TextField
		//                 입력한 값을 볼 수 없으며 한글 입력 불가
		JPasswordField password = new JPasswordField(30);
		panel.add(new JLabel("PASSWORD"));
		panel.add(password);
		
		// TextArea : 여러 줄의 텍스트를 입력 할 수 있는 상자
		JTextArea textArea = new JTextArea(10, 30);
		textArea.setEditable(false); // 내용 수정 불가능(read only)
		
		JButton btn = new JButton("보내기");
		
		frame.add(panel, BorderLayout.NORTH);
		frame.add(textArea, BorderLayout.CENTER);
		frame.add(btn, BorderLayout.SOUTH);
		
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = "id = " + id.getText() + "\n";
				id.setText("");  //->보내기 버튼 누르면 아이디 칸 지워주기
				
				String showPwd = "";
				char[] pwdArr = password.getPassword();
				for(int i = 0; i < pwdArr.length; i++) {
					showPwd += pwdArr[i] + "";
				}
				
				text += "password = " + showPwd + "\n";
				password.setText("");
				
				textArea.append(text);
				id.requestFocus(); //-->보낸 후에도 커서가 깜박였으면 좋겠다
			}			
		});
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
