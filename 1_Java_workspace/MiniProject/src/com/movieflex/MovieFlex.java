package com.movieflex;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
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
      
      JButton btn = new JButton("로그인");
      button.add(btn);
      
      btn.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            String idd = id.getText().trim();
            String pww = pass.getText().trim();
            
            if(idd.length() == 0 || pww.length() == 0) {
            	JOptionPane.showMessageDialog(null, "아이디 또는 비밀번호를 입력하셔야 합니다.", "아이디나 비번을 입력!", JOptionPane.WARNING_MESSAGE);
            	return;
            }
            
            if(idd.equals("user01") && pww.equals("pass01")) {
            	JOptionPane.showMessageDialog(null, "로그인 성공", "MovieFlex", JOptionPane.DEFAULT_OPTION);
            	new newWindow();  //->성공시 메인화면 보이는 코드!
            	return;
            }
            
            JOptionPane.showMessageDialog(null, "로그인 실패", "MovieFlex", JOptionPane.DEFAULT_OPTION);
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
////여기 새로운 창 띄워지는 곳!!////
class newWindow extends JFrame {
	newWindow() {
		setLayout(null);
		setTitle("반갑습니다! MovieFlex 입니다");
		
		JPanel NewContainer = new JPanel();

		setContentPane(NewContainer);
		
		//맨위 배너
		JPanel BigTitle = new JPanel();
		BigTitle.setPreferredSize(new Dimension(900, 80));
		BigTitle.setBackground(Color.BLACK);
	    JLabel titleLabel = new JLabel("MOVIE FLEX");
	    titleLabel.setFont(new Font("Serif", Font.BOLD, 50));
	    titleLabel.setForeground(Color.red);
	    titleLabel.setHorizontalAlignment(JLabel.CENTER);
	    
	    //장르선택-콤보박스
	    String[] genreList = {"장르", "액션", "코미디", "로맨스", "공포", "애니", "다큐" };
	    JComboBox<String> genreCombo = new JComboBox<String>(genreList);
	    genreCombo.setBounds(10, 100, 150, 50);
	    
	    BigTitle.add(titleLabel);
		NewContainer.add(BigTitle);
		NewContainer.add(genreCombo);
		
		setSize(900, 900);
		setResizable(false);
		setVisible(true);
		setLocationRelativeTo(null);  
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
