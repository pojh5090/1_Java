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

public class DocuPanel extends JPanel{
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
   public DocuPanel(JFrame frame2) {
      
      this.frame = frame2;
      
      frame2.setTitle("다큐멘터 영화");
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
      
       //액팅 오브 킬링
       panel1 = new JPanel();
       ImageIcon actIcon1 = new ImageIcon("images/d_acting.jpg");
       act1 = new JButton();
       act1.setSize(200,200);
       act1.setBorder(line);            
       act1.addMouseListener(me);
       panel1.setBackground(Color.black);
       panel1.add(act1);
       panel1.setBounds(100, 150, 200, 210);      
       int offset1 = act1.getInsets().left;
       act1.setIcon(resizeIcon(actIcon1, act1.getWidth() - offset1, act1.getHeight() - offset1));
       
       //잉여들의 히치하이킹
       panel2 = new JPanel();
       ImageIcon actIcon2 = new ImageIcon("images/d_hiking.jpg");
       act2 = new JButton();
       act2.setSize(200,200);
       act2.setBorder(line);            
       act2.addMouseListener(me);
       panel2.setBackground(Color.black);
       panel2.add(act2);
       panel2.setBounds(370, 150, 200, 210);      
       int offset2 = act2.getInsets().left;
       act2.setIcon(resizeIcon(actIcon2, act2.getWidth() - offset2, act2.getHeight() - offset2));
       
       //님아, 그 강을 건너지 마오
       panel3 = new JPanel();
       ImageIcon actIcon3 = new ImageIcon("images/d_nim.jpg");
       act3 = new JButton();
       act3.setSize(200,200);
       act3.setBorder(line);            
       act3.addMouseListener(me);
       panel3.setBackground(Color.black);
       panel3.add(act3);
       panel3.setBounds(650, 150, 200, 210);   
       int offset3 = act3.getInsets().left;
       act3.setIcon(resizeIcon(actIcon3, act3.getWidth() - offset3, act3.getHeight() - offset3));

       //워낭 소리
       panel4 = new JPanel();
       ImageIcon actIcon4 = new ImageIcon("images/d_sori.jpg");
       act4 = new JButton();
       act4.setSize(200,200);
       act4.setBorder(line);            
       act4.addMouseListener(me);
       panel4.setBackground(Color.black);
       panel4.add(act4);
       panel4.setBounds(200, 400, 200, 210);   
       int offset4 = act4.getInsets().left;
       act4.setIcon(resizeIcon(actIcon4, act4.getWidth() - offset4, act4.getHeight() - offset4));
       
       //울지마 톤즈
       panel5 = new JPanel();
       ImageIcon actIcon5 = new ImageIcon("images/d_tons.jpg");
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
                       "<액팅 오브 킬링>" + "       "  + "\r\n\r\n" +
                       "가해자가 승리한 세상!\r\n" + 
                        " 대학살의 기억은 그들에게 낯선 공포와 악몽에 시달리게 하고,\r\n" + 
                        " 영화는 예기치 못한 반전을 맞는다.\r\n" + 
                        " \r\n" + 
                        "“당신이 저지른 학살을, 다시 재연해보지 않겠습니까?”\r\n" + 
                        "전대미문의 방법으로 인간의 도덕성을 뒤흔드는 충격의 다큐멘터리!");
                 number = 1;
                explain.setEditable(false);
            }
         });
         
         act2.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                explain.setText("");
                 explain.append(
                      "<잉여들의 히치하이킹>" + "       "  + "\r\n\r\n" +
                        "대한민국 잉여청년 4인방의 놀랍도록 무모한 유럽 평정기!\r\n" + 
                         "파리, 로마, 이스탄불, 런던까지…\r\n" + 
                         "전 유럽을 발칵 뒤집어 놓은\r\n" + 
                         " 무일푼 잉여들의 물물교환 유럽 평정기!\r\n" + 
                         "단돈 80만원과 카메라 1대만 들고 무작정 유럽 행 비행기에 몸을 싣는다.\r\n" +
                         "과연 이들의 꿈은 이뤄질 수 있을까?\r\n" + 
                         "이들의 파란만장한 365일간의 여정이 지금부터 시작된다.\r\n" 
                         );
                 number = 2;
                 explain.setEditable(false);
                
             }
         });
         
         act3.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                explain.setText("");
                 explain.append(
                       "<님아 그 강을 건너지 마오>" + "       "  + "\r\n\r\n" +
                        "우리는 76년째 연인입니다.\r\n" + 
                        "89세 소녀감성 강계열 할머니, 98세 로맨티스트 조병만 할아버지\r\n" + 
                         "이들은 어딜 가든 고운 빛깔의 커플 한복을 입고 두 손을 꼭 잡고 걷는 노부부이다.\r\n" + 
                         "비가 내리는 마당, 점점 더 잦아지는 할아버지의 기침소리를 듣던 할머니는\r\n" +
                         "친구를 잃고 홀로 남은 강아지를 바라보며 머지 않아 다가올 또 다른 이별을 준비한다.\r\n" 
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
                         "<워낭 소리>" + "       "  + "\r\n\r\n" +
                        "사람과 사랑을 울리는... (워낭소리)\r\n" + 
                         "초록 논에 물이 돌 듯 온기를 전하는 이야기\r\n" +
                         "팔순 농부와 마흔 살 소, 삶의 모든 것이 기적이었다\r\n" + 
                         "초록 논에 물이 돌 듯 온기를 전하는 이야기\r\n" +
                         "귀가 잘 안 들리는 최노인이지만 희미한 소의 워낭 소리도 귀신같이 듣고 \r\n" + 
                         "한 쪽 다리가 불편하지만 소 먹일 풀을 베기 위해 매일 산을 오른다.\r\n" 
                          );                       
                  number = 4;
                 explain.setEditable(false);                        
             }
         });
               
         act5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                      explain.setText("");
                      explain.append(
                          "<울지마 톤즈>" + "       "  + "\r\n\r\n" +
                           "2010년 2월, 아프리카 수단 남쪽의 작은 마을 톤즈. \r\n" + 
                            "남 수단의 자랑인 톤즈 브라스 밴드가 마을을 행진했다\r\n" + 
                            "이 세상 마지막 길을 떠난 사람, \r\n"
                            + "마흔 여덟의 나이로 짧은 생을 마감한 故 이태석 신부다\r\n" + 
                            "톤즈의 아버지이자, 의사였고, 선생님, 지휘자, 건축가였던 쫄리 신부님...\r\n" + 
                            "자신의 모든 것을 바쳐 온몸 다해 그들을 사랑했던...\r\n"
                            + "헌신적인 그의 삶이 스크린에서 펼쳐진다.\r\n" 
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
               new BigActing();
            } else if(number == 2) {
               new BigHiking();
            } else if(number == 3) {
               new BigNim();
            } else if(number == 4) {
               new BigSori();
            } else {
               new BigTons();
            }
         }
            
         });
       
       JButton back = new JButton("뒤로가기");
      back.setBounds(80, 700, 100, 40);
      back.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            new MainFrame();
            frame2.dispose();
         }      
      });
      
      frame2.add(scr1);
      frame2.add(panel1);
      frame2.add(panel2);
      frame2.add(panel3);
      frame2.add(panel4);
      frame2.add(panel5);
      frame2.add(back);
      frame2.add(closer);
      frame2.add(this);
   }
   class BigActing extends JFrame {
         public BigActing() {
               setLayout(null);
         
             JPanel BigP1 = new JPanel();
             ImageIcon BigI1 = new ImageIcon("images/d_acting.jpg");
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
             
            setTitle("액팅 오브 킬링");
            setSize(410, 500);      
            setLocationRelativeTo(null);
            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      

         }
      }
      
      class BigHiking extends JFrame {
         public BigHiking() {
               setLayout(null);
         
             JPanel BigP2 = new JPanel();
             ImageIcon BigI2 = new ImageIcon("images/d_hiking.jpg");
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
             
            setTitle("잉여들의 히치하이킹");
            setSize(410, 500);      
            setLocationRelativeTo(null);
            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      

         }
      }
      
      class BigNim extends JFrame {
         public BigNim() {
               setLayout(null);
         
             JPanel BigP3 = new JPanel();
             ImageIcon BigI3 = new ImageIcon("images/d_nim.jpg");
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
             
            setTitle("님아 그 강을 건너지 마오");
            setSize(410, 500);      
            setLocationRelativeTo(null);
            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      

         }
      }
      
      class BigSori extends JFrame {
         public BigSori() {
               setLayout(null);
         
             JPanel BigP4 = new JPanel();
             ImageIcon BigI4 = new ImageIcon("images/d_sori.jpg");
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
             
            setTitle("워낭 소리");
            setSize(410, 500);      
            setLocationRelativeTo(null);
            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      

         }
      }
      
      class BigTons extends JFrame {
         public BigTons() {
               setLayout(null);
         
             JPanel BigP5 = new JPanel();
             ImageIcon BigI5 = new ImageIcon("images/d_tons.jpg");
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
             
            setTitle("울지마 톤즈");
            setSize(410, 500);      
            setLocationRelativeTo(null);
            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      

         }
      }

   }