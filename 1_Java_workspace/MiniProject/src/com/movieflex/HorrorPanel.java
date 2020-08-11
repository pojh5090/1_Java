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
import javax.xml.soap.Text;

public class HorrorPanel extends JPanel{
   private JFrame frame;
   private static Icon resizeIcon(Icon actIcon1, int resizedWidth, int resizedHeight) {
      Image img = ((ImageIcon) actIcon1).getImage();
       Image resizedImage = img.getScaledInstance(resizedWidth,  resizedHeight, java.awt.Image.SCALE_SMOOTH);
       return new ImageIcon(resizedImage);
   }   
   public HorrorPanel(JFrame frame5) {
      
      this.frame = frame5;
      
      frame5.setTitle("공포 영화");
      setSize(900, 900);     
      setBackground(Color.black);      

      JButton act1, act2, act3, act4, act5;
      JPanel panel1, panel2, panel3, panel4, panel5;

      JTextArea explain = new JTextArea();
      Font font1 = new Font("NanumGothic",Font.BOLD,13);
      explain.setBackground(new Color(197,192,189));
      JScrollPane scr1 = new JScrollPane(explain,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
       scr1.setBounds(200,650,500,150);
       explain.setEditable(false);
       explain.setFont(font1);
      
       panel1 = new JPanel();
       ImageIcon actIcon1 = new ImageIcon("images/s_anna.jpg");
       act1 = new JButton();
       act1.setBackground(Color.black);
       act1.setSize(200,200);
       panel1.add(act1);
       panel1.setBounds(100, 150, 200, 200);      
       int offset1 = act1.getInsets().left;
       act1.setIcon(resizeIcon(actIcon1, act1.getWidth() - offset1, act1.getHeight() - offset1));
       
       
       panel2 = new JPanel();
       ImageIcon actIcon2 = new ImageIcon("images/s_con.jpg");
       act2 = new JButton();
       act2.setBackground(Color.black);
       act2.setSize(200,200);
       panel2.add(act2);
       panel2.setBounds(370, 150, 200, 200);      
       int offset2 = act2.getInsets().left;
       act2.setIcon(resizeIcon(actIcon2, act2.getWidth() - offset2, act2.getHeight() - offset2));
       
      
       panel3 = new JPanel();
       ImageIcon actIcon3 = new ImageIcon("images/s_creep.jpg");
       act3 = new JButton();
       act3.setBackground(Color.black);
       act3.setSize(200,200);
       panel3.add(act3);
       panel3.setBounds(650, 150, 200, 200);   
       int offset3 = act3.getInsets().left;
       act3.setIcon(resizeIcon(actIcon3, act3.getWidth() - offset3, act3.getHeight() - offset3));

       
       panel4 = new JPanel();
       ImageIcon actIcon4 = new ImageIcon("images/s_gon.jpg");
       act4 = new JButton();
       act4.setBackground(Color.black);
       act4.setSize(200,200);
       panel4.add(act4);
       panel4.setBounds(200, 400, 200, 200);   
       int offset4 = act4.getInsets().left;
       act4.setIcon(resizeIcon(actIcon4, act4.getWidth() - offset4, act4.getHeight() - offset4));
       
      
       panel5 = new JPanel();
       ImageIcon actIcon5 = new ImageIcon("images/s_others.jpg");
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
        
                 explain.setEditable(false);                
             
             }
         });
         
         
         act5.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                   explain.setText("");
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
             }
        });

       
       JButton back = new JButton("뒤로가기");
      back.setBounds(10, 800, 100, 40);
      back.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            new MainFrame();
            frame5.dispose();
         }      
      });
      
      frame5.add(scr1);
      frame5.add(panel1);
      frame5.add(panel2);
      frame5.add(panel3);
      frame5.add(panel4);
      frame5.add(panel5);
      frame5.add(back);
      frame5.add(this);
   }

}
