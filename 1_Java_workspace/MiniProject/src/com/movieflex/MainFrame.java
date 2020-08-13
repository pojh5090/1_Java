package com.movieflex;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame extends JFrame {
   JFrame frame = new JFrame();
   JPanel Container = new JPanel();


   public MainFrame() {         

      frame.setLayout(null);
      frame.setTitle("반갑습니다! MovieFlex 입니다");
      Container.setBackground(Color.black);
      Container.setBounds(0, 100, 900, 800);

      // 영화사 로고 데코 
      JPanel decoTitle = new JPanel();
      decoTitle.setBounds(0, 800, 900, 100);
      decoTitle.setBackground(Color.BLACK);
      JLabel decoLabel = new JLabel("");
      Font font = new Font("xfighters", Font.BOLD, 60);
      decoLabel.setFont(font);
      decoLabel.setForeground(Color.BLACK);
      decoLabel.setHorizontalAlignment(JLabel.CENTER);
      decoTitle.add(decoLabel);

      Image deco = new ImageIcon("images/full.PNG").getImage().getScaledInstance(800, 70, 10);
      JLabel decoLabel1 = new JLabel(new ImageIcon(deco));       
      decoTitle.add(decoLabel1);


      //폰트
      Font font1 = new Font("맑은 고딕", Font.BOLD, 20);

      //맨위 배너
      JPanel BigTitle = new JPanel();
      BigTitle.setBounds(0, 0, 900, 100);
      //BigTitle.setPreferredSize(new Dimension(900, 150));            
      Image title = new ImageIcon("images/title.PNG").getImage().getScaledInstance(900, 100, 0);
      JLabel titleLabel = new JLabel(new ImageIcon(title));
      BigTitle.add(titleLabel);

      //장르선택-콤보박스
      String[] genreList = {"장르", "액션", "코미디", "로맨스", "공포", "애니", "다큐", "Top5" };
      JComboBox<String> genreCombo = new JComboBox<String>(genreList);
      //       genreCombo.setPreferredSize(new Dimension(90, 45));
      genreCombo.setFont(font1);
      genreCombo.setBounds(100, 200, 90, 45);

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
            } else if (index == 6) {
               DocuPanel page6 = new DocuPanel(frame);
               changePanel(page6);
            } else {
               Top5Panel page7 = new Top5Panel(frame);
               changePanel(page7);
            }
         }    
      });

      //안내문구
      JPanel Welcome = new JPanel();
      Welcome.setBackground(Color.black);
      //Welcome.setPreferredSize(new Dimension(900, 400));
      Welcome.setBounds(0, 150, 700, 100 );
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

      //오늘의 추천 영화   
      JPanel RPanel = new JPanel();
      RPanel.setBackground(Color.black);
      JLabel Recommand = new JLabel("오늘의 추천 영화");
      Recommand.setForeground(Color.white);
      Recommand.setFont(font1);
      RPanel.add(Recommand);
      RPanel.setBounds(0, 300, 90, 10);

      //추천 영화 이미지
      JPanel ImagePanel1 = new JPanel();
      ImagePanel1.setBounds(100, 500, 200, 200);
      Image Rmovie1 = new ImageIcon("images/a_mission.jpg").getImage().getScaledInstance(400, 400, 0);
      JLabel Rlabel1 = new JLabel(new ImageIcon(Rmovie1));
      ImagePanel1.setBackground(Color.black);
      ImagePanel1.add(Rlabel1);

      JPanel ImagePanel2 = new JPanel();
      ImagePanel2.setBounds(100, 500, 200, 200);
      Image Rmovie2 = new ImageIcon("images/c_ted2.jpg").getImage().getScaledInstance(400, 400, 0);
      JLabel Rlabel2 = new JLabel(new ImageIcon(Rmovie2));
      ImagePanel2.setBackground(Color.black);
      ImagePanel2.add(Rlabel2);

      JPanel ImagePanel3 = new JPanel();
      ImagePanel3.setBounds(100, 500, 200, 200);
      Image Rmovie3 = new ImageIcon("images/r_about.jpg").getImage().getScaledInstance(400, 400, 0);
      JLabel Rlabel3 = new JLabel(new ImageIcon(Rmovie3));
      ImagePanel3.setBackground(Color.black);
      ImagePanel3.add(Rlabel3);


      //영화이미지 넘기기 버튼
      JPanel thro = new JPanel();
      CardLayout card = new CardLayout();
      thro.setLayout(card);

      JPanel buttons = new JPanel();
      buttons.setLayout(new FlowLayout());
      buttons.setBackground(Color.black);
      buttons.setBounds(300, 700, 500, 100); 
      JButton left = new JButton("이전"); // 위치 코드는 어디에? 
      JButton right = new JButton("다음"); // ㄴ Panel을 설정하여 거기안에 버튼 2개를 설정함 결국 버튼의 크기는 Panel의 크기로 자동 설정이 된 코드임
      buttons.add(left);
      buttons.add(right);

      left.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            card.previous(thro);
         }
      });
      right.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            card.next(thro);
         }
      });
      thro.add(ImagePanel1, "1");
      thro.add(ImagePanel2, "2");
      thro.add(ImagePanel3, "3");

      Container.add(Welcome);
      Container.add(genreCombo);
      Container.add(RPanel);   
      Container.add(thro);
      Container.add(buttons);

      frame.add(decoTitle); // 영화사 로고 데코 

      frame.add(BigTitle);
      frame.add(Container);

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