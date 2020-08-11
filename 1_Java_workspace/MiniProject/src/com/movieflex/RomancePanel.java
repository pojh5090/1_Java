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

public class RomancePanel extends JPanel{
   private JFrame frame;
   private static Icon resizeIcon(Icon actIcon1, int resizedWidth, int resizedHeight) {
      Image img = ((ImageIcon) actIcon1).getImage();
       Image resizedImage = img.getScaledInstance(resizedWidth,  resizedHeight, java.awt.Image.SCALE_SMOOTH);
       return new ImageIcon(resizedImage);
   }   
   public RomancePanel(JFrame frame4) {
      
      this.frame = frame4;
      
      frame4.setTitle("멜로영화");
      setSize(900, 900);      
      setBackground(Color.black);      

      JButton act1, act2, act3, act4, act5;
      JPanel panel1, panel2, panel3, panel4, panel5;

      //폰트
      Font font1 = new Font("NanumGothic", Font.BOLD, 13);
      
      //TextArea
      JTextArea explain = new JTextArea();
      JScrollPane scr1 = new JScrollPane(explain,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
       scr1.setBounds(200,650,500,150);
       explain.setEditable(false);
       explain.setFont(font1); 
       explain.setBackground(new Color(197,192,189));
      
       //나의 소녀시대
       panel1 = new JPanel();
       ImageIcon actIcon1 = new ImageIcon("images/r_my.jpg");
       act1 = new JButton();
       act1.setBackground(Color.black);
       act1.setSize(200,200);
       panel1.add(act1);
       panel1.setBounds(100, 150, 200, 200);      
       int offset1 = act1.getInsets().left;
       act1.setIcon(resizeIcon(actIcon1, act1.getWidth() - offset1, act1.getHeight() - offset1));
       
       //노트북
       panel2 = new JPanel();
       ImageIcon actIcon2 = new ImageIcon("images/r_note.jpg");
       act2 = new JButton();
       act2.setBackground(Color.black);
       act2.setSize(200,200);
       panel2.add(act2);
       panel2.setBounds(370, 150, 200, 200);      
       int offset2 = act2.getInsets().left;
       act2.setIcon(resizeIcon(actIcon2, act2.getWidth() - offset2, act2.getHeight() - offset2));
       
       //라라랜드
       panel3 = new JPanel();
       ImageIcon actIcon3 = new ImageIcon("images/r_lala.jpg");
       act3 = new JButton();
       act3.setBackground(Color.black);
       act3.setSize(200,200);
       panel3.add(act3);
       panel3.setBounds(650, 150, 200, 200);   
       int offset3 = act3.getInsets().left;
       act3.setIcon(resizeIcon(actIcon3, act3.getWidth() - offset3, act3.getHeight() - offset3));

       //어바웃 타임
       panel4 = new JPanel();
       ImageIcon actIcon4 = new ImageIcon("images/r_about.jpg");
       act4 = new JButton();
       act4.setBackground(Color.black);
       act4.setSize(200,200);
       panel4.add(act4);
       panel4.setBounds(200, 400, 200, 200);   
       int offset4 = act4.getInsets().left;
       act4.setIcon(resizeIcon(actIcon4, act4.getWidth() - offset4, act4.getHeight() - offset4));
       
       //지금 만나러 갑니다
       panel5 = new JPanel();
       ImageIcon actIcon5 = new ImageIcon("images/r_zigum.jpg");
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
                       "<나의 소녀시대>" + "       "  + "\r\n\r\n" +
                        " 고마워, 내 소중한 추억이 되어줘서\r\n\r\n" + 
                        " 돌아가고 싶은 리즈시절(?) 숨기고 싶은 흑역사(!)\r\n" + 
                        " 1994년 대책 없이 용감했던 고딩시절,\r\n" + 
                        " 유덕화 마누라가 꿈인 평범한 소녀 ‘린전신’과\r\n" + 
                        " 학교를 주름잡는 비범한 소년 ‘쉬타이위’의 \r\n" + 
                        " 첫사랑 밀어주기 작전\r\n" 
                      );
                  
                explain.setEditable(false);
            }
         });
         
         act2.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                explain.setText("");
                 explain.append("<노트북>" + "       "  + "\r\n\r\n" +
                         " 17살, ‘노아’는 밝고 순수한 ‘앨리’를 보고 첫눈에 반한다.\r\n" + 
                         " 빠른 속도로 서로에게 빠져드는 둘.\r\n" + 
                         " 그러나 이들 앞에 놓인 장벽에 막혀 이별하게 된다.\r\n\r\n" + 
                         " 24살, ‘앨리’는 우연히 신문에서 ‘노아’의 소식을 접하고\r\n" + 
                         " 잊을 수 없는 첫사랑 앞에서\r\n" + 
                         " 다시 한 번 선택의 기로에 서게 되는데…\r\n\r\n" + 
                         " 열일곱의 설렘, 스물넷의 아픈 기억, 그리고 마지막까지…\r\n" +
                         " 한 사람을 지극히 사랑했으니 내 인생은 성공한 인생입니다\r\n" 
                         );
                   
                 explain.setEditable(false);
                
             }
         });
         
         act3.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                explain.setText("");
                 explain.append("<라라랜드>" + "       "  + "\r\n\r\n" +
                         " 황홀한 사랑, 순수한 희망, 격렬한 열정…\r\n" + 
                         " 이 곳에서 모든 감정이 폭발한다!\r\n\r\n" + 
                         " 꿈을 꾸는 사람들을 위한 별들의 도시 ‘라라랜드’.\r\n" + 
                         " 재즈 피아니스트 ‘세바스찬’과 배우 지망생 ‘미아’,\r\n" + 
                         " 인생에서 가장 빛나는 순간 만난 두 사람은\r\n" + 
                         " 미완성인 서로의 무대를 만들어가기 시작한다.\r\n" 
                         );
                   
                 explain.setEditable(false);
             }
         });
         
         act4.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {  
                 explain.setText("");
                  explain.append(
                         "<어바웃 타임>" + "       "  + "\r\n\r\n" +
                         " 모태솔로 팀은 성인이 된 날,  \r\n" + 
                         " 아버지로부터 놀랄만한 가문의 비밀을 듣게 된다. \r\n" + 
                         " 바로 시간을 되돌릴 수 있는 능력이 있다는 것! \r\n" + 
                         " 그것이 비록 히틀러를 죽이거나 여신과 뜨거운 사랑을 할 수는 없지만, \r\n" + 
                         " 여자친구는 만들어 줄 순 있으리.. \r\n\r\n" + 
                         " 꿈을 위해 런던으로 간 팀은 \r\n" + 
                         " 우연히 만난 사랑스러운 여인 메리에게 첫눈에 반하게 된다. \r\n" + 
                         " 그녀의 사랑을 얻기 위해 자신의 특별한 능력을 마음껏 발휘하는 팀. \r\n" + 
                         " 꿈에 그리던 그녀와 매일매일 최고의 순간을 보낸다.\r\n\r\n" +
                         " 하지만 그와 그녀의 사랑이 완벽해질수록 \r\n" +
                         " 팀을 둘러싼 주변 상황들은 미묘하게 엇갈리고,\r\n" +
                         " 예상치 못한 사건들이 여기저기 나타나기 시작하는데…\r\n" 
                          );                       
        
                 explain.setEditable(false);                
             
             }
         });
         
         
         act5.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                   explain.setText("");
                   explain.append("<지금 만나러 갑니다>" + "       "  + "\r\n\r\n" +
                         " 세상을 떠난 그녀가 다시 돌아왔다.\r\n" + 
                         " 모든 기억을 잃은 채.\r\n" + 
                         " 비가 오는 날 다시 돌아오겠다는 \r\n" + 
                         " 믿기 힘든 약속을 남기고 세상을 떠난 ‘수아’.\r\n" + 
                         " 그로부터 1년 뒤 장마가 시작되는 어느 여름 날,\r\n" + 
                         " 세상을 떠나기 전과 다름없는 모습의 ‘수아’가 나타난다.\r\n" + 
                         " 하지만 ‘수아’는 ‘우진’이 누구인지조차도 기억하지 못한다.\r\n\r\n" + 
                         " 자신을 기억하지 못해도 \r\n" + 
                         " 그녀가 곁에 있다는 사실만으로 행복에 젖은 ‘우진’과\r\n" + 
                         " 자신이 기억하지 못하는 그와의 이야기가 궁금한 ‘수아’.\r\n\r\n" + 
                         " 기다려 주세요\r\n" + 
                         " 지금 만나러 갑니다\r\n" 
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
            frame4.dispose();
         }      
      });
      
      frame4.add(scr1);
      frame4.add(panel1);
      frame4.add(panel2);
      frame4.add(panel3);
      frame4.add(panel4);
      frame4.add(panel5);
      frame4.add(back);
      frame4.add(this);
   }

}
