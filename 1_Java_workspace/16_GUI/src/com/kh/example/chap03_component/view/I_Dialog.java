package com.kh.example.chap03_component.view;

import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class I_Dialog {
	public I_Dialog() {
		JFrame frame = new JFrame();
		
		JPanel panel = new JPanel();
		JButton button1 = new JButton("Simple Dialog");
		panel.add(button1);
		
		Dialog dialog = new Dialog(frame, "���ο� â �̸�");
		dialog.setBounds(150, 250, 200, 200);
		
		JLabel label = new JLabel("simple dialog test");
		label.setHorizontalAlignment(JLabel.CENTER);
		
		dialog.add(label, "North");
		
		button1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setVisible(true);	
			}
		});
		
		JButton button2 = new JButton("close");
		dialog.add(button2, "Center");
		
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.dispose(); //������ �ϰڴ�
			}		
		});
		
		JButton button3 = new JButton("Input dialog");
		panel.add(button3);
		
		button3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// 1. �Է� ���̾�α�
//				String result = JOptionPane.showInputDialog("������ �Է��ϼ���");
//				System.out.println(result); //->�ܼ�â�� ���� ��µ�! + ��� ������ null ��µ�
				
				// 2. Ȯ�� ���̾�α�
//				int result = JOptionPane.showConfirmDialog(null, "Ȯ���Ͻðڽ��ϱ�?", "Ȯ��â", JOptionPane.YES_NO_CANCEL_OPTION);
//				System.out.println(result);                
				
				// 3. �޽��� ���̾�α�
				JOptionPane.showMessageDialog(null, "�����մϴ�", "dager", JOptionPane.ERROR_MESSAGE);
				JOptionPane.showMessageDialog(null, "�����մϴ�", "dager", JOptionPane.INFORMATION_MESSAGE);
				JOptionPane.showMessageDialog(null, "�����մϴ�", "dager", JOptionPane.PLAIN_MESSAGE);
				JOptionPane.showMessageDialog(null, "�����մϴ�", "dager", JOptionPane.QUESTION_MESSAGE);
				JOptionPane.showMessageDialog(null, "�����մϴ�", "dager", JOptionPane.WARNING_MESSAGE);
				
			}
		});
		
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
