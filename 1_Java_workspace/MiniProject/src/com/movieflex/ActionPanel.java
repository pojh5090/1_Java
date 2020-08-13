package com.movieflex;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.LineBorder;

public class ActionPanel extends JPanel{
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
   public ActionPanel(JFrame frame2) {
      
      this.frame = frame2;
      
      frame2.setTitle("액션 영화");
      setSize(900, 900);   
      setBackground(Color.black);      

      JButton act1, act2, act3, act4, act5;
      JPanel panel1, panel2, panel3, panel4, panel5;
      
      JTextArea explain = new JTextArea();
      explain.setBackground(new Color(197,192,189));
      JScrollPane scr1 = new JScrollPane(explain,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
      scr1.setBounds(200,650,500,150);
      explain.setEditable(false);
      explain.setFont(font1); 
      
      //자세히 보기 버튼
      JButton closer = new JButton("자세히 보기");
      closer.setFont(font1);
      closer.setBounds(720, 700, 110, 40);
      
       //어벤저스
       ImageIcon actIcon1 = new ImageIcon("images/a_avengers.jpg");
       act1 = new JButton();
       act1.setBorder(line);            
       act1.addMouseListener(me);
       act1.setBounds(100, 150, 200, 210);      
       int offset1 = act1.getInsets().left;
       act1.setIcon(resizeIcon(actIcon1, act1.getWidth() - offset1, act1.getHeight() - offset1));
       
       //베를린
       ImageIcon actIcon2 = new ImageIcon("images/a_berlin.jpg");
       act2 = new JButton();
       act2.setBorder(line);            
       act2.addMouseListener(me);
       act2.setBounds(370, 150, 200, 210);      
       int offset2 = act2.getInsets().left;
       act2.setIcon(resizeIcon(actIcon2, act2.getWidth() - offset2, act2.getHeight() - offset2));
       
       //분노의 질주
       ImageIcon actIcon3 = new ImageIcon("images/a_bunno.jpg");
       act3 = new JButton();
       act3.setBorder(line);            
       act3.addMouseListener(me);
       act3.setBounds(650, 150, 200, 210);   
       int offset3 = act3.getInsets().left;
       act3.setIcon(resizeIcon(actIcon3, act3.getWidth() - offset3, act3.getHeight() - offset3));

       //미션임파서블
       ImageIcon actIcon4 = new ImageIcon("images/a_mission.jpg");
       act4 = new JButton();
       act4.setSize(200,200);
       act4.setBorder(line);            
       act4.addMouseListener(me);
       act4.setBounds(200, 400, 200, 210);   
       int offset4 = act4.getInsets().left;
       act4.setIcon(resizeIcon(actIcon4, act4.getWidth() - offset4, act4.getHeight() - offset4));
       
       //언더그라운드
       ImageIcon actIcon5 = new ImageIcon("images/a_under.jpg");
       act5 = new JButton();
       act5.setBorder(line);            
       act5.addMouseListener(me);
       act5.setBounds(500, 400, 200, 210);  
       int offset5 = act5.getInsets().left;
       act5.setIcon(resizeIcon(actIcon5, act5.getWidth() - offset5, act5.getHeight() - offset5));
       
       //이벤트 처리-영화 설명
         act1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               explain.setText("");
                explain.append(
                       "<어벤져스 인피니티 워>" + "       "  + "\r\n\r\n" +
                       "인피니티 워 이후 절반만 살아남은 지구\r\n" + 
                        " 마지막 희망이 된 어벤져스\r\n" + 
                        " 먼저 떠난 그들을 위해 모든 것을 걸었다!\r\n" + 
                        " \r\n" + 
                        " 위대한 어벤져스\r\n" + 
                        " 운명을 바꿀 최후의 전쟁이 펼쳐진다!"); 
                explain.setEditable(false);
                number = 1;
            }
         });
         
         act2.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                explain.setText("");
                 explain.append("<베를린>" + "       "  + "\r\n\r\n" +
                        " 거대한 국제적 음모가 숨겨진 운명의 도시 베를린\r\n" + 
                        " 그 곳에 상주하는 국정원 요원 정진수는 \r\n" + 
                        " 불법무기거래장소를 감찰하던 중 국적불명,\r\n" + 
                        " 지문마저 감지되지 않는 일명\r\n" + 
                        " ‘고스트’ 비밀요원 표종성의 존재를 알게 된다.\r\n\r\n" + 
                        " 그의 정체를 밝혀내기 위해 뒤를 쫓던 정진수는\r\n" + 
                         " 그 배후에 숨겨진\r\n" + 
                         " 엄청난 국제적 음모를 알게 되면서\r\n"  +
                         " 걷잡을 수 없는 위기에 빠진다.\r\n\r\n"  +
                         " 국제적 음모와 각자의 목적에 휘말려\r\n"  +
                         " 서로를 쫓는 이들의 숨막히는 추격전!\r\n\r\n" + 
                         " 초대형 액션 프로젝트가 펼쳐진다!\r\n\r\n" 
                         ); 
                 explain.setEditable(false);
                 number = 2;
             }
         });
         
         act3.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                explain.setText("");
                 explain.append("<분노의 질주>" + "       "  + "\r\n\r\n" +
                         " “미친 놈들의 판에 들어온 걸 환영해”\r\n\r\n" + 
                         " 남다른 레이싱 실력을 가진 쿠바\r\n" + 
                         " 자동차, 아찔한 속도, 극한의 레이스는 그의 꿈이자 열정이다.\r\n" + 
                         " 고아인 그는 아픈 여동생의 수술비를 마련하기 위해\r\n" + 
                         " 음식배달을 하고 레이스에 참여하며 돈을 모으고 있다.\r\n\r\n" + 
                         " 스트리트 레이스에 참가한 어느 날\r\n" + 
                         " 영향력 있는 레이싱 팀의 대장이자 갱스터인 막스를 만나게 되고\r\n" + 
                         " 악명 높은 검은 양 레이스에 참여할 것을 제안한다. \r\n\r\n" +
                         " 상금을 얻기 위해 쿠바는 \r\n" +
                         " 레이스에 참가하기로 결정하고  \r\n" +
                         " 위험천만한 세계에 발을 들여놓게 되는데… \r\n"
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
                         "<미션 임파서블>" + "       "  + "\r\n\r\n" +
                        " 도난당한 핵무기를 되찾아 오는 위험천만한 작전 중, \r\n" + 
                        " 에단 헌트(톰 크루즈)는 임무를 포기하고, \r\n" + 
                        " 팀원의 목숨을 구하는 선택을 한다. \r\n" + 
                        " 이제, 핵무기는 문명을 무너뜨리려는 사악한 테러조직의 손에 넘어갔다. \r\n\r\n" + 
                        
                        " 세계를 멸망시킬 핵 재앙을 막기 위해  \r\n" + 
                        " 세계 최강 스파이기관, IMF의 에단 헌트와 \r\n" + 
                        " 정예 요원들은 숙명의 라이벌, 중앙정보국 CIA의 상급 요원과  \r\n" + 
                        
                        " 불편한 동맹을 맺어야만 한다. \r\n\r\n" + 
                        " 이보다 더 불가능한 미션은 없었다! \r\n" + 
                        " 역대 최대 규모, 최강 액션을 기대하라!\r\n" 
                          );                       
                  number = 4; 
                 explain.setEditable(false);                
             
             }
         });
         
         
         act5.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                   explain.setText("");
                   explain.append("<언더그라운드>" + "       "  + "\r\n\r\n" +
                        " 언더그라운드의 멤버 원은 자석 기술로 돈을 벌은 억만장자 부자가 된다.\r\n" + 
                         " 봉사활동을 하러 투르기스탄에 갔다가 \r\n" + 
                         " 민간인에게 독가스까지 살포하는 독재자 로바흐의 악행을 보게 되는데!\r\n\r\n" + 
                         " 그리하여 원은 비행기 추락 사고로 자기가 죽은 것 처러 꾸미고\r\n" + 
                         " 같이 일을 도모할 멤버들을 모으게 된다.\r\n\r\n" + 
                         " 그 멤버들으 역시 서류상으로 죽은 자들이다.\r\n\r\n" + 
                         " 4년 후\r\n" + 
                         " 원은 자기의 계획을 실천하게 되는데...\r\n"                        
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
            new BigAven();
         } else if(number == 2) {
            new BigBer();
         } else if(number == 3) {
            new BigBunno();
         } else if(number == 4) {
            new BigMission();
         } else {
            new BigUnder();
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
      frame2.add(act1);
      frame2.add(act2);
      frame2.add(act3);
      frame2.add(act4);
      frame2.add(act5);
      frame2.add(back);
      frame2.add(closer);
      frame2.add(this);
   }
   
   class BigAven extends JFrame {
      public BigAven() {
            setLayout(null);
      
          JPanel BigP1 = new JPanel();
          ImageIcon BigI1 = new ImageIcon("images/a_avengers.jpg");
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
          
         setTitle("어벤져스");
         setSize(410, 500);      
         setLocationRelativeTo(null);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      

      }
   }
   
   class BigBer extends JFrame {
      public BigBer() {
            setLayout(null);
      
          JPanel BigP2 = new JPanel();
          ImageIcon BigI2 = new ImageIcon("images/a_berlin.jpg");
          JButton BB2 = new JButton();
          BB2.setBackground(Color.black);
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
          
         setTitle("베를린");
         setSize(410, 500);      
         setLocationRelativeTo(null);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      

      }
   }
   
   class BigBunno extends JFrame {
      public BigBunno() {
            setLayout(null);
      
          JPanel BigP3 = new JPanel();
          ImageIcon BigI3 = new ImageIcon("images/a_bunno.jpg");
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
          
         setTitle("분노의 질주");
         setSize(410, 500);      
         setLocationRelativeTo(null);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      

      }
   }
   
   class BigMission extends JFrame {
      public BigMission() {
            setLayout(null);
      
          JPanel BigP4 = new JPanel();
          ImageIcon BigI4 = new ImageIcon("images/a_mission.jpg");
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
          
         setTitle("미션임파서블");
         setSize(410, 500);      
         setLocationRelativeTo(null);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      

      }
   }
   
   class BigUnder extends JFrame {
      public BigUnder() {
            setLayout(null);
      
          JPanel BigP5 = new JPanel();
          ImageIcon BigI5 = new ImageIcon("images/a_under.jpg");
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
          
         setTitle("언더그라운드");
         setSize(410, 500);      
         setLocationRelativeTo(null);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      

      }
   }
}
class MouseEv implements MouseListener {
   
   private LineBorder a = new LineBorder(Color.red, 2 , false);
   private LineBorder b = new LineBorder(Color.black, 2 , false);
   
   @Override
   public void mouseClicked(MouseEvent e) {
      
   }

   @Override
   public void mouseEntered(MouseEvent e) {
      JButton act1 = (JButton) e.getSource();
      JButton act2 = (JButton) e.getSource();
      JButton act3 = (JButton) e.getSource();
      JButton act4 = (JButton) e.getSource();
      JButton act5 = (JButton) e.getSource();
      act1.setBorder(a);
      act2.setBorder(a);
      act3.setBorder(a);
      act4.setBorder(a);
      act5.setBorder(a);
   }

   @Override
   public void mouseExited(MouseEvent e) {
      JButton act1 = (JButton) e.getSource();
      JButton act2 = (JButton) e.getSource();
      JButton act3 = (JButton) e.getSource();
      JButton act4 = (JButton) e.getSource();
      JButton act5 = (JButton) e.getSource();
      act1.setBorder(b);
      act2.setBorder(b);
      act3.setBorder(b);
      act4.setBorder(b);
      act5.setBorder(b);
   }

   @Override
   public void mousePressed(MouseEvent e) {
      
   }

   @Override
   public void mouseReleased(MouseEvent e) {
      
   }
   
}