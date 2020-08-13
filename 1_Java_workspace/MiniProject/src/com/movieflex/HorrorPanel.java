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
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import com.movieflex.ActionPanel.BigAven;
import com.movieflex.ActionPanel.BigBer;
import com.movieflex.ActionPanel.BigBunno;
import com.movieflex.ActionPanel.BigMission;
import com.movieflex.ActionPanel.BigUnder;

public class HorrorPanel extends JPanel{
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
   //나이 확인 요소들
   JLabel age;
   JTextField inputAge;  
   private JFrame ageCheck;
   String birth = "";
   int Ibirth = 0;
   JTextArea explain;
   
   public HorrorPanel(JFrame frame5) {
      
      this.frame = frame5;
      
      frame5.setTitle("공포 영화");
      setSize(900, 900);     
      setBackground(Color.black);      

      JButton act1, act2, act3, act4, act5;
      JPanel panel1, panel2, panel3, panel4, panel5;
      JLabel age;
      
      //나이 제한 라벨
      Font font2 = new Font("맑은 고딕", Font.BOLD, 13);
      
      age = new JLabel("19세 미만 관람불가");
      age.setFont(font2);
      age.setForeground(Color.red);

      explain = new JTextArea();
      Font font1 = new Font("NanumGothic",Font.BOLD,13);
      explain.setBackground(new Color(197,192,189));
      JScrollPane scr1 = new JScrollPane(explain,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
      scr1.setBounds(200,650,500,150);
      explain.setEditable(false);
      explain.setFont(font1);
      
      //자세히 보기 버튼
      JButton closer = new JButton("자세히 보기");
      closer.setFont(font1);
      closer.setBounds(720, 700, 110, 40);
      
       ImageIcon actIcon1 = new ImageIcon("images/s_anna.jpg");
       act1 = new JButton();
       act1.setBorder(line);            
       act1.addMouseListener(me);
       act1.setBounds(100, 150, 200, 210);      
       int offset1 = act1.getInsets().left;
       act1.setIcon(resizeIcon(actIcon1, act1.getWidth() - offset1, act1.getHeight() - offset1));
           
       ImageIcon actIcon2 = new ImageIcon("images/s_con.jpg");
       act2 = new JButton();
       act2.setBorder(line);            
       act2.addMouseListener(me);
       act2.setBounds(370, 150, 200, 210);      
       int offset2 = act2.getInsets().left;
       act2.setIcon(resizeIcon(actIcon2, act2.getWidth() - offset2, act2.getHeight() - offset2));
       

       ImageIcon actIcon3 = new ImageIcon("images/s_creep.jpg");
       act3 = new JButton();
       act3.setBorder(line);            
       act3.addMouseListener(me);
       act3.setBounds(650, 150, 200, 210);   
       int offset3 = act3.getInsets().left;
       act3.setIcon(resizeIcon(actIcon3, act3.getWidth() - offset3, act3.getHeight() - offset3));

       ImageIcon actIcon4 = new ImageIcon("images/s_gon.jpg");
       act4 = new JButton();
       act4.setBorder(line);            
       act4.addMouseListener(me);
       act4.setBounds(200, 400, 200, 210);   
       int offset4 = act4.getInsets().left;
       act4.setIcon(resizeIcon(actIcon4, act4.getWidth() - offset4, act4.getHeight() - offset4));
       
      
       panel5 = new JPanel();
       ImageIcon actIcon5 = new ImageIcon("images/s_others.jpg");
       act5 = new JButton();
       act5.setSize(200,200);
       act5.setBorder(line);            
       act5.addMouseListener(me);
       panel5.setBackground(Color.black);
       panel5.add(age);
       panel5.add(act5);
       panel5.setBounds(500, 375, 200, 235);   
       panel5.setBackground(Color.black);
       int offset5 = act5.getInsets().left;
       act5.setIcon(resizeIcon(actIcon5, act5.getWidth() - offset5, act5.getHeight() - offset5));
       
       //이벤트 처리-영화 설명
         act1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               explain.setText("");
                explain.append(
                       "<애나벨>" + "       "  + "\r\n\r\n" +
                       "‘컨저링’ 1년 전, ‘애나벨’이 있었다...\r\n" + 
                       "-1971년 워렌 부부, \r\n"
                       + "로드 아일랜드에 거주하는 페론 가족에게 일어난 초자연적 사건 해결\r\n" + 
                       " -1968년 워렌 부부, ‘애나벨’ 사건 해결\r\n" + 
                       " -1967년 캘리포니아의 신혼부부, ‘애나벨’ 구매\r\n" + 
                       " \r\n" + 
                       " ..‘컨저링’의 1년 전!\r\n" + 
                       "존은 임신 중인 아내 미아에게 흰색의 드레스를 입은 빈티지 인형을 선물한다. \r\n"
                       + "그날 밤, 낯선 부부가 침입해 존과 미아를 공격한다. \r\n"
                       + "한참의 격투 끝에 발견된 건 인형을 무릎 위에 놓고 죽어있는 여인. \r\n"
                       + "여인에게서 흘러내린 피가 인형의 얼굴로 스며들어가는데… 한 달에 한 번,\r\n"
                       + "신부님이 기도로 그 안의 악령을 다스린다는 ‘애나벨’은 그렇게 태어난다...");
                 number = 1;
                explain.setEditable(false);
            }
         });
         
         act2.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                explain.setText("");
                 explain.append("<컨저링>" + "       "  + "\r\n\r\n" +
                        "믿을 수 없겠지만… 이것은 실화다!\r\n" + 
                        "1971년 로드 아일랜드, 해리스빌.\r\n"
                        + "페론 가족은 꿈에 그리던 새 집으로 이사를 간다.\r\n" + 
                        "물론 1863년에 그 집에서 일어난 끔찍한 살인 사건을 전혀 몰랐다.\r\n" + 
                        "또한 그 이후에 일어난 많은 무서운 사건에 대해서도 알지 못했다.\r\n" + 
                        "\r\n"
                        + " 지금까지는…");
                 number = 2;   
                 explain.setEditable(false);
                
             }
         });
         
         act3.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                explain.setText("");
                 explain.append("<소름>" + "       "  + "\r\n\r\n" +
                        "또 하나의 비극이 시작된다. 504호, 초대받지 않은 그가 온다.\r\n" + 
                        "곧 헐릴 낡은 아파트에 이삿짐이 도착한다.\r\n"
                        + "미금 아파트 504호에 새로 입주한 청년의 이름은 용현(김명민 분).\r\n"
                        + "그는 30년 전 504호에서 벌어진 끔찍한 사건을 모른다.\r\n"
                        + "\r\n"
                        + "옆집 여자와 눈이 맞은 사내가 부인을 죽이고 갓난 아이를 버려둔 채\r\n"
                        + "도망쳤다는 과거사를 지금 알고 있는 사람은 많지 않다.\r\n"
                        + "게다가 504호에선 얼마 전 소설가 광태가 화재로 목숨을 잃었다.\r\n" + 
                        "용현은 남편에게 구타당하는 여자 선영(장진영 분)을 알게 된다.\r\n"
                        + "510호에 살며 편의점에서 아르바이트를 하는 그녀\r\n"
                        + "용현이 자신을 도와줄 수 있으리라 직감한다.\r\n"
                        + "\r\n"
                        + "그러던 어느 날 용현이 택시영업을 마치고 돌아온 새벽,\r\n"
                        + "선영은 머리에 피를 흘리며 쓰러진 남편 시체를 보여준다.\r\n"
                        + "용현은 선영을 도와 시체를 묻고 둘은 더 가까워진다.\r\n"
                        + "\r\n"
                        + "그러나 504호에 깃든 저주는 여기서 멈추지 않는다.\r\n"
                        + "\r\n"
                        + "505호에 사는 소설가가 용현에게 말한다.\r\n"
                        + "30년 전 그곳에서 죽은 여인의 시체는 아직 발견되지 않았다고.\r\n"
                        + "등장인물들은 그들도 의식하지 못한 사이 조금씩 광기에 휩싸인다. \r\n");
                 number = 3; 
                 explain.setEditable(false);
             }
         });
         
         act4.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {  
                 explain.setText("");
                  explain.append("<곤지암>" + "       "  + "\r\n\r\n" +
                          "공포 체험의 성지 ‘곤지암 정신병원’\r\n" + 
                          "1979년 환자 42명의 집단 자살과 병원장의 실종 이후,\r\n" + 
                          " 섬뜩한 괴담으로 둘러싸인 곤지암 정신병원으로\r\n" + 
                          " 공포체험을 떠난 7명의 멤버들\r\n" + 
                          " \r\n" + 
                          " 원장실, 집단 치료실, 실험실, 열리지 않는 402호…\r\n" + 
                          " 괴담의 실체를 담아내기 위해\r\n" + 
                          " 병원 내부를 촬영하기 시작하던 멤버들에게\r\n" + 
                          " 상상도 못한 기이하고 공포스러운 일들이\r\n" + 
                          " 실제로 벌어지기 시작 하는데…\r\n" + 
                          " \r\n" + 
                          " 가지 말라는 곳에는 반드시 이유가 있다.\r\n" + 
                          " 소름 끼치는 ‘곤지암 정신병원’ 의 실체를 체험하라!");                       
                  number = 4;
                 explain.setEditable(false);                
             
             }
         });     
         
         act5.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                   explain.setText("");
                   new AgeFrame();
                   number = 5;
             }       
        });
         
         //자세히 보기 이벤트 처리
         closer.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            if(number == 1) {
               new BigAnna();
            } else if(number == 2) {
               new BigCon();
            } else if(number == 3) {
               new BigCreep();
            } else if(number == 4) {
               new BigGon();
            } else {
               new BigOthers();
            }
         }
            
         });
      
      JButton back = new JButton("뒤로가기");
      back.setBounds(80, 700, 100, 40);
      back.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            new MainFrame();
            frame5.dispose();
         }      
      });
      
      frame5.add(scr1);
      frame5.add(act1);
      frame5.add(act2);
      frame5.add(act3);
      frame5.add(act4);
      frame5.add(panel5);
      frame5.add(back);
      frame5.add(closer);
      frame5.add(this);
   }
   
   class BigAnna extends JFrame {
      public BigAnna() {
            setLayout(null);
      
          JPanel BigP1 = new JPanel();
          ImageIcon BigI1 = new ImageIcon("images/s_anna.jpg");
          JButton BB1 = new JButton();
          BB1.setBackground(Color.black);
          BB1.setSize(400,400);
          BigP1.add(BB1);
          BigP1.setSize(400, 400);      
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
          
         setTitle("애나벨");
         setSize(410, 500);      
         setLocationRelativeTo(null);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      

      }
   }
   
   class BigCon extends JFrame {
      public BigCon() {
            setLayout(null);
      
          JPanel BigP2 = new JPanel();
          ImageIcon BigI2 = new ImageIcon("images/s_con.jpg");
          JButton BB2 = new JButton();
          BB2.setBackground(Color.black);
          BB2.setSize(400,400);
          BigP2.add(BB2);
          BigP2.setSize(400, 400);      
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
          
         setTitle("컨저링");
         setSize(410, 500);      
         setLocationRelativeTo(null);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      

      }
   }
   
   class BigCreep extends JFrame {
      public BigCreep() {
            setLayout(null);
      
          JPanel BigP3 = new JPanel();
          ImageIcon BigI3 = new ImageIcon("images/s_creep.jpg");
          JButton BB3 = new JButton();
          BB3.setBackground(Color.black);
          BB3.setSize(400,400);
          BigP3.add(BB3);
          BigP3.setSize(400, 400);      
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
          
         setTitle("소름");
         setSize(410, 500);      
         setLocationRelativeTo(null);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      

      }
   }
   
   class BigGon extends JFrame {
      public BigGon() {
            setLayout(null);
      
          JPanel BigP4 = new JPanel();
          ImageIcon BigI4 = new ImageIcon("images/s_gon.jpg");
          JButton BB4 = new JButton();
          BB4.setBackground(Color.black);
          BB4.setSize(400,400);
          BigP4.add(BB4);
          BigP4.setSize(400, 400);      
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
          
         setTitle("곤지암");
         setSize(410, 500);      
         setLocationRelativeTo(null);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      

      }
   }
   
   class BigOthers extends JFrame {
      public BigOthers() {
            setLayout(null);
      
          JPanel BigP5 = new JPanel();
          ImageIcon BigI5 = new ImageIcon("images/s_others.jpg");
          JButton BB5 = new JButton();
          BB5.setBackground(Color.black);
          BB5.setSize(400,400);
          BigP5.add(BB5);
          BigP5.setSize(400, 400);      
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
          
         setTitle("디아더스");
         setSize(410, 500);      
         setLocationRelativeTo(null);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      

      }
   }  
   class AgeFrame extends JFrame {
      public AgeFrame() {
            setLayout(null);
            
            age = new JLabel("생년월일");
            add(age);
         
            inputAge = new JTextField();
            add(inputAge);
         
            JButton btn1 = new JButton("확인");
            add(btn1);
            
            JLabel example = new JLabel("예 ) 19940312");
            example.setForeground(Color.red);
            add(example);

            age.setBounds(20, 10, 70, 40);
            inputAge.setBounds(95, 10, 120, 30);
            btn1.setBounds(230, 10, 70, 30);
            example.setBounds(95, 40, 100, 30);
         
            setTitle("나이 확인 창");
            setSize(400, 150);      
            setLocationRelativeTo(null);
            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
              
            btn1.addActionListener(new ActionListener() {           
            	@Override
            	public void actionPerformed(ActionEvent e) {   
            	try {
 	               birth = inputAge.getText().trim();
 	               Ibirth = Integer.parseInt(birth);  
 	               if(Ibirth < 20030101) {
 	                  JOptionPane.showMessageDialog(null, "영화 열람이 가능합니다!", "MovieFlex", JOptionPane.DEFAULT_OPTION);
 	                  setVisible(false);    
 	                  explain.append("<디아더스>" + "       "  + "\r\n\r\n" +
 	                                "빛을 보지 못하는 희귀병을 앓는 두 아이와\r\n" + 
 	                                " 그런 아이들을 홀로 지키며 어둠 속에서만 살아가는 여인.\r\n" + 
 	                                " 어느 날 3명의 새로운 하인이 그녀의 집에 찾아왔다.\r\n" + 
 	                                " \r\n" + 
 	                                " 잠이 들면 들려 오는 기괴한 속삭임.\r\n" + 
 	                                " 아무도 없는 방에서 흘러나오는 피아노 소리.\r\n" + 
 	                                " 위 층에서 들려오는 아이들의 발소리…\r\n" + 
 	                                " \r\n" + 
 	                                " 그들이 이 집에 들어온 뒤,\r\n" + 
 	                                " 기이한 일들이 일어나기 시작했다!");   
 	                        explain.setEditable(false);
 	                        return;
 	               } else if(Ibirth >= 20030101) {
 	                  JOptionPane.showMessageDialog(null, "영화 열람이 불가능한 나이입니다.", "MovieFlex", JOptionPane.ERROR_MESSAGE);
 	                  setVisible(false);
 	                  explain.setText("열람 불가");   
 	                  explain.setEditable(false);
 	                  return;
 	               }  else {           
// 	            	   JOptionPane.showMessageDialog(null, "생년월일을 입력해주세요!", "MovieFlex", JOptionPane.WARNING_MESSAGE);
// 		               setVisible(false); 
 	               }
            	} catch (NumberFormatException e1) {
            		JOptionPane.showMessageDialog(null, "생년월일을 입력해주세요!", "MovieFlex", JOptionPane.WARNING_MESSAGE); 
            	}
	          }            
         });
      }
   }
}