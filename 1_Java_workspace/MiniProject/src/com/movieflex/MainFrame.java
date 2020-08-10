package com.movieflex;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MainFrame extends JFrame{
	JFrame frame = new JFrame();
	JPanel Container = new JPanel();
	
	public MainFrame() {			
		
		frame.setLayout(new BorderLayout());
		frame.setTitle("반갑습니다! MovieFlex 입니다");
		Container.setBackground(Color.black);
		
		//맨위 배너
		JPanel BigTitle = new JPanel();
		BigTitle.setPreferredSize(new Dimension(900, 200));
		BigTitle.setBackground(Color.BLACK);
	    JLabel titleLabel = new JLabel("MOVIE FLEX");
	    titleLabel.setFont(new Font("Serif", Font.BOLD, 60));
	    titleLabel.setForeground(Color.red);
	    titleLabel.setHorizontalAlignment(JLabel.CENTER);
	    BigTitle.add(titleLabel);
	    
	    //장르선택-콤보박스
	    String[] genreList = {"장르", "액션", "코미디", "로맨스", "공포", "애니", "다큐" };
	    JComboBox<String> genreCombo = new JComboBox<String>(genreList);
	    genreCombo.setPreferredSize(new Dimension(70, 50));
	    Container.add(genreCombo);
	    
	    genreCombo.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox<String> cb = (JComboBox<String>)e.getSource();
				int index = cb.getSelectedIndex();
				
				if(index == 0) {
					
				} else if(index == 1) {
					ActionPanel page1 = new ActionPanel(frame);
					changePanel(page1);
				} else if(index == 2) {
					ComedyPanel page2 = new ComedyPanel(frame);
					changePanel(page2);
				} else if(index == 3) {
					RomancePanel page3 = new RomancePanel(frame);
					changePanel(page3);
				} else if(index == 4) {
					HorrorPanel page4 = new HorrorPanel(frame);
					changePanel(page4);
				} else if (index == 5) {
					AniPanel page5 = new AniPanel(frame);
					changePanel(page5);
				} else {
					DocuPanel page6 = new DocuPanel(frame);
					changePanel(page6);
				}
			}    
	    });
	    
	    //안내문구
	    JPanel Welcome = new JPanel();
	    Welcome.setBackground(Color.black);
	  	Welcome.setPreferredSize(new Dimension(900, 400));
	  	Welcome.setBackground(Color.BLACK);
	  	JLabel welComeLabel = new JLabel("반갑습니다! 장르를 선택해 주세요.");
	  	welComeLabel.setFont(new Font("SansSerif", Font.BOLD, 35));
	  	welComeLabel.setForeground(Color.white);
	  	welComeLabel.setHorizontalAlignment(JLabel.CENTER);
	  	Welcome.add(welComeLabel);
	  	
	  	//웃는 이미지
		Image icon = new ImageIcon("images/haha.PNG").getImage().getScaledInstance(150, 150, 0);
		JLabel label = new JLabel(new ImageIcon(icon));	    
		Welcome.add(label);
	    
		Container.add(Welcome);
	    frame.add(BigTitle, "North");
	    frame.add(Container, "Center");
		
		frame.setSize(900, 900);
		frame.setResizable(false);
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);  
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void changePanel(JPanel panel) {
		frame.remove(Container);
		frame.revalidate();
		frame.repaint();
	}
}


