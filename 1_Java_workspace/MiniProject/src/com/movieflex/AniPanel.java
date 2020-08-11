package com.movieflex;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class AniPanel extends JPanel{
   private JFrame frame;
   private static Icon resizeIcon(Icon actIcon1, int resizedWidth, int resizedHeight) {
      Image img = ((ImageIcon) actIcon1).getImage();
       Image resizedImage = img.getScaledInstance(resizedWidth,  resizedHeight, java.awt.Image.SCALE_SMOOTH);
       return new ImageIcon(resizedImage);
   }   
   public AniPanel(JFrame frame3) {
      
      this.frame = frame3;
      
      frame3.setTitle("애니메이션");
      setSize(900, 900);   
      setBackground(Color.black);      

      JButton act1, act2, act3, act4, act5;
      JPanel panel1, panel2, panel3, panel4, panel5;
         
      //폰트
      Font font1 = new Font("NanumGothic", Font.BOLD, 13);
      
      //TextArea
      JTextArea explain = new JTextArea();
      explain.setBackground(new Color(197,192,189));
      JScrollPane scr1 = new JScrollPane(explain,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
      scr1.setBounds(200,650,500,150);
      explain.setEditable(false);
      explain.setFont(font1); 
      
      panel1 = new JPanel();
      ImageIcon actIcon1 = new ImageIcon("images/an_dragon.jpg");
      act1 = new JButton();
      act1.setBackground(Color.black);
      act1.setSize(200,200);
      panel1.add(act1);
      panel1.setBounds(100, 150, 200, 200);      
      int offset1 = act1.getInsets().left;
      act1.setIcon(resizeIcon(actIcon1, act1.getWidth() - offset1, act1.getHeight() - offset1));
       
       panel2 = new JPanel();
       ImageIcon actIcon2 = new ImageIcon("images/an_kung.jpg");
       act2 = new JButton();
       act2.setBackground(Color.black);
       act2.setSize(200,200);
       panel2.add(act2);
       panel2.setBounds(370, 150, 200, 200);      
       int offset2 = act2.getInsets().left;
       act2.setIcon(resizeIcon(actIcon2, act2.getWidth() - offset2, act2.getHeight() - offset2));
       
       panel3 = new JPanel();
       ImageIcon actIcon3 = new ImageIcon("images/an_name.jpg");
       act3 = new JButton();
       act3.setBackground(Color.black);
       act3.setSize(200,200);
       panel3.add(act3);
       panel3.setBounds(650, 150, 200, 200);   
       int offset3 = act3.getInsets().left;
       act3.setIcon(resizeIcon(actIcon3, act3.getWidth() - offset3, act3.getHeight() - offset3));

       panel4 = new JPanel();
       ImageIcon actIcon4 = new ImageIcon("images/an_surek.jpg");
       act4 = new JButton();
       act4.setBackground(Color.black);
       act4.setSize(200,200);
       panel4.add(act4);
       panel4.setBounds(200, 400, 200, 200);   
       int offset4 = act4.getInsets().left;
       act4.setIcon(resizeIcon(actIcon4, act4.getWidth() - offset4, act4.getHeight() - offset4));
       
       panel5 = new JPanel();
       ImageIcon actIcon5 = new ImageIcon("images/an_zoo.jpg");
       act5 = new JButton();
       act5.setBackground(Color.black);
       act5.setSize(200,200);
       panel5.add(act5);
       panel5.setBounds(500, 400, 200, 200);  
       int offset5 = act5.getInsets().left;
       act5.setIcon(resizeIcon(actIcon5, act5.getWidth() - offset5, act5.getHeight() - offset5));
       
       //이벤트 처리-영화 설명
         act1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               explain.setText("");
                explain.append(
                       "<드래곤 길들이기 3>" + "       "  + "\r\n\r\n" +
                       "영원히 기억될 그들의 마지막 모험이 시작된다!\r\n" + 
                       "영원한 친구 히컵과 투슬리스의 활약으로\r\n" + 
                       " 사람과 드래곤이 공존하며 평화롭게 살아가는 버크섬.\r\n" + 
                       " 새로운 드래곤 ‘라이트 퓨어리’를 쫓아간 투슬리스를 찾다가\r\n" + 
                       " 히컵은 드래곤의 파라다이스 ‘히든월드’를 우연히 발견하게 된다.\r\n" + 
                       " 하지만 평화도 잠시, 역대 최악의 드래곤 헌터 그리멜의 등장으로\r\n" + 
                       " 드래곤들의 안전과 버크섬의 평화까지 위협받기 시작하는데…");
                  
                explain.setEditable(false);
            }
         });
         
         act2.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                explain.setText("");
                 explain.append("<쿵푸팬더 2>" + "       "  + "\r\n\r\n" +
                             "그분이 돌아오셨다!\r\n" + 
                             "그토록 원하던 용의 전사가 되어 무적의 5인방과 함께 쿵푸를 지키게 된 포.\r\n"
                             + "진정한 용의 전사로 거듭나기 위해 시푸 사부와 쿵푸 수련에 매진하던 중,\r\n"
                             + "셴 선생이 쿵푸 사부들을 하나 둘 씩 제거하고 있다는 소식을 듣게 된다.\r\n" + 
                             "여전히 바람을 가르는 주먹의 소리보다 배에서울리는 꼬르륵 소리가 더 크고,\r\n"
                             + "오랜 숙적인 계단 앞에서는 맥을 못 추는 천방지축 팬더 포.\r\n"
                             + "수련을 시작하려는 포에게 쿵푸를 지켜야 한다는 막중한 미션이 주어진다.\r\n"
                             + "포는 무적의 5인방과 함께 쿵푸의 길을 떠난다.\r\n" + "\r\n" +
                             " 과연 포는 셴 선생의 비밀병기에 맞서 쿵푸를 지켜낼 수 있을까?");
                   
                 explain.setEditable(false);
                
             }
         });
         
         act3.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                explain.setText("");
                 explain.append("<너의 이름은 >" + "       "  + "\r\n\r\n" +
                         "아직 만난 적 없는 너를, 찾고 있어\r\n" + 
                         " \r\n" + 
                         " 천년 만에 다가오는 혜성\r\n" + 
                         " 기적이 시작된다\r\n" + 
                         " \r\n" + 
                         " 도쿄에 사는 소년 ‘타키’와 시골에 사는 소녀 ‘미츠하’는\r\n" + 
                         " 서로의 몸이 뒤바뀌는 신기한 꿈을 꾼다\r\n" + 
                         " 낯선 가족, 낯선 친구들, 낯선 풍경들...\r\n" + 
                         " 반복되는 꿈과 흘러가는 시간 속, 마침내 깨닫는다\r\n" + 
                         " 우리, 서로 뒤바뀐 거야?\r\n" + 
                         " \r\n" + 
                         " 절대 만날 리 없는 두 사람\r\n" + 
                         " 반드시 만나야 하는 운명이 되다\r\n" + 
                         " \r\n" + 
                         " 서로에게 남긴 메모를 확인하며\r\n" + 
                         " 점점 친구가 되어가는 ‘타키’와 ‘미츠하’\r\n" + 
                         " 언제부턴가 더 이상 몸이 바뀌지 않자\r\n" + 
                         " 자신들이 특별하게 이어져있었음을 깨달은\r\n" + 
                         " ‘타키’는 ‘미츠하’를 만나러 가는데...\r\n" + 
                         " \r\n" + 
                         " 잊고 싶지 않은 사람\r\n" + 
                         " 잊으면 안 되는 사람\r\n" + 
                         " 너의 이름은?\r\n"
                            );
                   
                 explain.setEditable(false);
             }
         });
         
         act4.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {  
                 explain.setText("");
                  explain.append(
                         "<슈렉>" + "       "  + "\r\n\r\n" +
                         "슈렉이 아름다운 공주 피오나와 겁나먼 왕국을 구해낸 이후.\r\n"
                         + "그들도 오래오래 행복하게 살았...더라면 참 좋았을텐데!\r\n"
                         + "과연 슈렉에게도 모두가 바라던 해피엔딩이 올까?\r\n"
                         + "한 가정의 평범한 아빠와 남편으로 반복되는 일상에 따분한 슈렉\r\n"
                         + "사람들에게 겁을 주고, 진흙 목욕도 실컷 하던 자유로웠던 시절을 꿈꾼다.\r\n"
                         + "‘하루라도 자유로워진다면 죽어도 한이 없겠어’라며, 일탈을 꿈꾸던 슈렉\r\n"
                         + "‘겁나먼 세상’을 차지하려는 악당 럼펠의 등장! \r\n"
                         + "그럴싸한 계략에 속아넘어가 ‘완전 딴판 겁나먼 세상’에 떨어지고 만다.\r\n" 
                         + "완전 딴판으로 바뀌어버린 세상\r\n"
                         + "절친 동키는 슈렉을 미친 괴물 취급하며 줄행랑 치고,\r\n"
                         + "단 하나의 사랑 피오나는 하이킥을 날리고,\r\n"
                         + "장화신은 고양이는 더 이상 장화를 신지 않는 D라인의 고양이가 되어 있다.\r\n"
                         + "친구들과 왕국, 하나뿐인 사랑을 되찾기 위한 슈렉의 마지막 이야기!");                       
        
                 explain.setEditable(false);                
             
             }
         });
         
         
         act5.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                   explain.setText("");
                   explain.append("<주토피아>" + "       "  + "\r\n\r\n" +
                        "누구나 살고 싶은 도시 1위, 주토피아\r\n" + 
                        " 연쇄 실종 사건 발생!\r\n" + 
                        " “미치도록 잡고 싶었다!”\r\n" + 
                        " \r\n" + 
                        " 교양 있고 세련된 라이프 스타일을 주도하는 도시 주토피아.\r\n" + 
                        " 이 곳을 단숨에 혼란에 빠트린 연쇄 실종사건이 발생한다!\r\n" + 
                        " 주토피아 최초의 토끼 경찰관 주디 홉스는 48시간 안에 사건 해결을 지시 받자\r\n" + 
                        " 뻔뻔한 사기꾼 여우 닉 와일드에게 협동 수사를 제안하는데…\r\n" + 
                        " \r\n" + 
                        " 스릴 넘치는 추격전의 신세계가 열린다!\r\n" 
                        );
                   
                   explain.setEditable(false);
             }
        });

       
       JButton back = new JButton("뒤로가기");
      back.setBounds(10, 800, 100, 40);
      back.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            new MainFrame();
            frame3.dispose();
         }      
      });
      
      frame3.add(scr1);
      frame3.add(panel1);
      frame3.add(panel2);
      frame3.add(panel3);
      frame3.add(panel4);
      frame3.add(panel5);
      frame3.add(back);
      frame3.add(this);
   }

}
