package com.movieflex;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.BorderFactory;
import javax.swing.JButton;
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
      
      JButton btn = new JButton("로그인");
      button.add(btn);
      
      btn.addActionListener(new ActionListener() {
         Scanner sc = new Scanner(System.in);
         @Override
         public void actionPerformed(ActionEvent e) {
            String id = sc.nextLine();
            String pw = sc.nextLine();
            if(id != null && id.equals("user01")) {
               if(pw != null && pw.equals("pass01")) {
                  JOptionPane.showInternalMessageDialog(null, "로그인 되었습니다", "Login",JOptionPane.PLAIN_MESSAGE);
               }
            } else {
               JOptionPane.showInternalMessageDialog(null, "없는 아이디 입니다.", " X ",JOptionPane.WARNING_MESSAGE);
            }
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
