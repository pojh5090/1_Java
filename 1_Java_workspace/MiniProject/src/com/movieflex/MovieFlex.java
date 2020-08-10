package com.movieflex;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MovieFlex {
   JFrame main = new JFrame("MovieFlex");
   JPanel title = new JPanel();
   JPanel login = new JPanel();
   JPanel button = new JPanel();
   
   public MovieFlex() {
      main.setLayout(new BorderLayout());
      main.getContentPane().setBackground(Color.BLACK);
      JLabel titleLabel = new JLabel("MOVIE FLEX");
      titleLabel.setFont(new Font("Serif", Font.BOLD, 30));
      titleLabel.setForeground(Color.red);
      titleLabel.setHorizontalAlignment(JLabel.CENTER);
      
      JTextField id = new JTextField(15);
      JPanel idPanel = new JPanel();
      JLabel idLabel = new JLabel("I D");
      idLabel.setFont(new Font("Serif", Font.BOLD, 11));
      idLabel.setHorizontalAlignment(JLabel.CENTER);
      idPanel.add(idLabel);
      idPanel.add(id);
      login.add(idPanel);
      
      JPasswordField pass = new JPasswordField(15);
      JPanel passPanel = new JPanel();
      JLabel passLabel = new JLabel("PASSWORD");
      passLabel.setFont(new Font("Serif", Font.BOLD, 11));
      passLabel.setHorizontalAlignment(JLabel.CENTER);
      passPanel.add(passLabel);
      passPanel.add(pass);
      login.add(passPanel);
      
      JButton btn = new JButton("�α���");
      button.add(btn);
      
      btn.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            String idd = id.getText().trim();
            String pww = pass.getText().trim();
            
            if(idd.length() == 0 || pww.length() == 0) {
            	JOptionPane.showMessageDialog(null, "���̵� �Ǵ� ��й�ȣ�� �Է��ϼž� �մϴ�.", "���̵� ����� �Է�!", JOptionPane.WARNING_MESSAGE);
            	return;
            }
            
            if(idd.equals("user01") && pww.equals("pass01")) {
            	JOptionPane.showMessageDialog(null, "user01�� ȯ���մϴ�!", "MovieFlex", JOptionPane.DEFAULT_OPTION);
            	new MainFrame();  //->������ ����ȭ�� ���̴� �ڵ�!
            	main.dispose();
            	return;
            }
            
            JOptionPane.showMessageDialog(null, "���̵�� ��й�ȣ�� �ٽ� �Է��� �ּ���.", "MovieFlex", JOptionPane.DEFAULT_OPTION);
            id.setText("");
            pass.setText("");
         }
      });        
      main.add(titleLabel,BorderLayout.NORTH);
      main.add(login,BorderLayout.CENTER);
      main.add(button,BorderLayout.SOUTH);
      
      main.setSize(450,200);
      main.setVisible(true);
      main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      main.setLocationRelativeTo(null);  
   }
}
