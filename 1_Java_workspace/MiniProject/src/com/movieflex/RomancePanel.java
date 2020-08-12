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
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

import com.movieflex.ActionPanel.BigAven;
import com.movieflex.ActionPanel.BigBer;
import com.movieflex.ActionPanel.BigBunno;
import com.movieflex.ActionPanel.BigMission;
import com.movieflex.ActionPanel.BigUnder;

public class RomancePanel extends JPanel{
   private JFrame frame;
   private static Icon resizeIcon(Icon actIcon1, int resizedWidth, int resizedHeight) {
      Image img = ((ImageIcon) actIcon1).getImage();
       Image resizedImage = img.getScaledInstance(resizedWidth,  resizedHeight, java.awt.Image.SCALE_SMOOTH);
       return new ImageIcon(resizedImage);
   }   
   //버튼 테두리
   private LineBorder line = new LineBorder(Color.black,2,false);
   //마우스 이벤트
   private MouseEv me = new MouseEv();
   
   public int number = 0;
   //폰트
   Font font1 = new Font("NanumGothic", Font.BOLD, 13);
   public RomancePanel(JFrame frame4) {
      
      this.frame = frame4;
      
      frame4.setTitle("멜로영화");
      setSize(900, 900);      
      setBackground(Color.black);      

      JButton act1, act2, act3, act4, act5;
      JPanel panel1, panel2, panel3, panel4, panel5;
  
      //TextArea
      JTextArea explain = new JTextArea();
      JScrollPane scr1 = new JScrollPane(explain,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
       scr1.setBounds(200,650,500,150);
       explain.setEditable(false);
       explain.setFont(font1); 
       explain.setBackground(new Color(197,192,189));
       
       //자세히 보기 버튼
       JButton closer = new JButton("자세히 보기");
       closer.setFont(font1);
       closer.setBounds(720, 700, 110, 40);
      
       //나의 소녀시대
       panel1 = new JPanel();
       ImageIcon actIcon1 = new ImageIcon("images/r_my.jpg");
       act1 = new JButton();
       act1.setSize(200,200);
       act1.setBorder(line);            
       act1.addMouseListener(me);
       panel1.setBackground(Color.black);
       panel1.add(act1);
       panel1.setBounds(100, 150, 200, 210);      
       int offset1 = act1.getInsets().left;
       act1.setIcon(resizeIcon(actIcon1, act1.getWidth() - offset1, act1.getHeight() - offset1));
       
       //노트북
       panel2 = new JPanel();
       ImageIcon actIcon2 = new ImageIcon("images/r_note.jpg");
       act2 = new JButton();
       act2.setSize(200,200);
       act2.setBorder(line);            
       act2.addMouseListener(me);
       panel2.setBackground(Color.black);
       panel2.add(act2);
       panel2.setBounds(370, 150, 200, 210);      
       int offset2 = act2.getInsets().left;
       act2.setIcon(resizeIcon(actIcon2, act2.getWidth() - offset2, act2.getHeight() - offset2));
       
       //라라랜드
       panel3 = new JPanel();
       ImageIcon actIcon3 = new ImageIcon("images/r_lala.jpg");
       act3 = new JButton();
       act3.setSize(200,200);
       act3.setBorder(line);            
       act3.addMouseListener(me);
       panel3.setBackground(Color.black);
       panel3.add(act3);
       panel3.setBounds(650, 150, 200, 210);   
       int offset3 = act3.getInsets().left;
       act3.setIcon(resizeIcon(actIcon3, act3.getWidth() - offset3, act3.getHeight() - offset3));

       //어바웃 타임
       panel4 = new JPanel();
       ImageIcon actIcon4 = new ImageIcon("images/r_about.jpg");
       act4 = new JButton();
       act4.setSize(200,200);
       act4.setBorder(line);            
       act4.addMouseListener(me);
       panel4.setBackground(Color.black);
       panel4.add(act4);
       panel4.setBounds(200, 400, 200, 210);   
       int offset4 = act4.getInsets().left;
       act4.setIcon(resizeIcon(actIcon4, act4.getWidth() - offset4, act4.getHeight() - offset4));
       
       //지금 만나러 갑니다
       panel5 = new JPanel();
       ImageIcon actIcon5 = new ImageIcon("images/r_zigum.jpg");
       act5 = new JButton();
       act5.setSize(200,200);
       act5.setBorder(line);            
       act5.addMouseListener(me);
       panel5.setBackground(Color.black);
       panel5.add(act5);
       panel5.setBounds(500, 400, 200, 210);  
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
                 number = 1;
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
                 number = 2;  
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
                 number = 3; 
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
                  number = 4;
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
                   number = 5;
                   explain.setEditable(false);
             }
        });

         //자세히 보기 이벤트 처리
         closer.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            if(number == 1) {
               new BigMy();
            } else if(number == 2) {
               new BigNote();
            } else if(number == 3) {
               new BigLala();
            } else if(number == 4) {
               new BigAbout();
            } else {
               new BigZigum();
            }
         }
            
         });
         
       JButton back = new JButton("뒤로가기");
      back.setBounds(80, 700, 100, 40);
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
      frame4.add(closer);
      frame4.add(this);
   }
   class BigMy extends JFrame {
      public BigMy() {
            setLayout(null);
      
          JPanel BigP1 = new JPanel();
          ImageIcon BigI1 = new ImageIcon("images/r_my.jpg");
          JButton BB1 = new JButton();
          BB1.setSize(400,400);
          BB1.setBorder(line);
          BigP1.add(BB1);
          BigP1.setSize(400, 410); 
          BigP1.setBackground(Color.black); 
          int offset2 = BB1.getInsets().left;
          BB1.setIcon(resizeIcon(BigI1, BB1.getWidth() - offset2, BB1.getHeight() - offset2));
          
          JLabel inform = new JLabel("사진 눌러서 닫기");
          inform.setBounds(150, 400, 200, 90);
          inform.setFont(font1);
          
          add(BigP1);
          add(inform);
          
          BB1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               setVisible(false);
            }          
          });
          
         setTitle("나의 소녀시대");
         setSize(410, 500);      
         setLocationRelativeTo(null);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      

      }
   }
   
   class BigNote extends JFrame {
      public BigNote() {
            setLayout(null);
      
          JPanel BigP2 = new JPanel();
          ImageIcon BigI2 = new ImageIcon("images/r_note.jpg");
          JButton BB2 = new JButton();
          BB2.setSize(400,400);
          BB2.setBorder(line);
          BigP2.add(BB2);
          BigP2.setSize(400, 410); 
          BigP2.setBackground(Color.black); 
          int offset2 = BB2.getInsets().left;
          BB2.setIcon(resizeIcon(BigI2, BB2.getWidth() - offset2, BB2.getHeight() - offset2));
          
          JLabel inform = new JLabel("사진 눌러서 닫기");
          inform.setBounds(150, 400, 200, 90);
          inform.setFont(font1);
          
          add(BigP2);
          add(inform);
          
          BB2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               setVisible(false);
            }          
          });
          
         setTitle("노트북");
         setSize(410, 500);      
         setLocationRelativeTo(null);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      

      }
   }
   
   class BigLala extends JFrame {
      public BigLala() {
            setLayout(null);
      
          JPanel BigP3 = new JPanel();
          ImageIcon BigI3 = new ImageIcon("images/r_lala.jpg");
          JButton BB3 = new JButton();
          BB3.setSize(400,400);
          BB3.setBorder(line);
          BigP3.add(BB3);
          BigP3.setSize(400, 410); 
          BigP3.setBackground(Color.black);      
          int offset2 = BB3.getInsets().left;
          BB3.setIcon(resizeIcon(BigI3, BB3.getWidth() - offset2, BB3.getHeight() - offset2));
          
          JLabel inform = new JLabel("사진 눌러서 닫기");
          inform.setBounds(150, 400, 200, 90);
          inform.setFont(font1);
          
          add(BigP3);
          add(inform);
          
          BB3.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               setVisible(false);
            }          
          });
          
         setTitle("라라랜드");
         setSize(410, 500);      
         setLocationRelativeTo(null);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      

      }
   }
   
   class BigAbout extends JFrame {
      public BigAbout() {
            setLayout(null);
      
          JPanel BigP4 = new JPanel();
          ImageIcon BigI4 = new ImageIcon("images/r_about.jpg");
          JButton BB4 = new JButton();
          BB4.setSize(400,400);
          BB4.setBorder(line);
          BigP4.add(BB4);
          BigP4.setSize(400, 410); 
          BigP4.setBackground(Color.black);   
          int offset2 = BB4.getInsets().left;
          BB4.setIcon(resizeIcon(BigI4, BB4.getWidth() - offset2, BB4.getHeight() - offset2));
          
          JLabel inform = new JLabel("사진 눌러서 닫기");
          inform.setBounds(150, 400, 200, 90);
          inform.setFont(font1);
          
          add(BigP4);
          add(inform);
          
          BB4.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               setVisible(false);
            }          
          });
          
         setTitle("어바웃 타임");
         setSize(410, 500);      
         setLocationRelativeTo(null);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      

      }
   }
   
   class BigZigum extends JFrame {
      public BigZigum() {
            setLayout(null);
      
          JPanel BigP5 = new JPanel();
          ImageIcon BigI5 = new ImageIcon("images/r_zigum.jpg");
          JButton BB5 = new JButton();
          BB5.setSize(400,400);
          BB5.setBorder(line);
          BigP5.add(BB5);
          BigP5.setSize(400, 410); 
          BigP5.setBackground(Color.black);  
          int offset2 = BB5.getInsets().left;
          BB5.setIcon(resizeIcon(BigI5, BB5.getWidth() - offset2, BB5.getHeight() - offset2));
          
          JLabel inform = new JLabel("사진 눌러서 닫기");
          inform.setBounds(150, 400, 200, 90);
          inform.setFont(font1);
          
          add(BigP5);
          add(inform);
          
          BB5.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
               setVisible(false);
            }          
          });
          
         setTitle("지금 만나러 갑니다");
         setSize(410, 500);      
         setLocationRelativeTo(null);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      

      }
   }

}