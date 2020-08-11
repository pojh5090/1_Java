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

public class ComedyPanel extends JPanel{
   private JFrame frame;
   private static Icon resizeIcon(Icon actIcon1, int resizedWidth, int resizedHeight) {
      Image img = ((ImageIcon) actIcon1).getImage();
       Image resizedImage = img.getScaledInstance(resizedWidth,  resizedHeight, java.awt.Image.SCALE_SMOOTH);
       return new ImageIcon(resizedImage);
   }   
   public ComedyPanel(JFrame frame3) {
      
      this.frame = frame3;
      
      frame3.setTitle("코미디 영화");
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
     
       //테드
       panel1 = new JPanel();
       ImageIcon actIcon1 = new ImageIcon("images/c_ted2.jpg");
       act1 = new JButton();
       act1.setBackground(Color.black);
       act1.setSize(200,200);
       panel1.add(act1);
       panel1.setBounds(100, 150, 200, 200);      
       int offset1 = act1.getInsets().left;
       act1.setIcon(resizeIcon(actIcon1, act1.getWidth() - offset1, act1.getHeight() - offset1));
       
       //미스터주
       panel2 = new JPanel();
       ImageIcon actIcon2 = new ImageIcon("images/c_mr.jpg");
       act2 = new JButton();
       act2.setBackground(Color.black);
       act2.setSize(200,200);
       panel2.add(act2);
       panel2.setBounds(370, 150, 200, 200);      
       int offset2 = act2.getInsets().left;
       act2.setIcon(resizeIcon(actIcon2, act2.getWidth() - offset2, act2.getHeight() - offset2));
       
       //시동
       panel3 = new JPanel();
       ImageIcon actIcon3 = new ImageIcon("images/c_sidong.jpg");
       act3 = new JButton();
       act3.setBackground(Color.black);
       act3.setSize(200,200);
       panel3.add(act3);
       panel3.setBounds(650, 150, 200, 200);   
       int offset3 = act3.getInsets().left;
       act3.setIcon(resizeIcon(actIcon3, act3.getWidth() - offset3, act3.getHeight() - offset3));

       //예스맨
       panel4 = new JPanel();
       ImageIcon actIcon4 = new ImageIcon("images/c_yes.jpg");
       act4 = new JButton();
       act4.setBackground(Color.black);
       act4.setSize(200,200);
       panel4.add(act4);
       panel4.setBounds(200, 400, 200, 200);   
       int offset4 = act4.getInsets().left;
       act4.setIcon(resizeIcon(actIcon4, act4.getWidth() - offset4, act4.getHeight() - offset4));
       
       //청년경찰
       panel5 = new JPanel();
       ImageIcon actIcon5 = new ImageIcon("images/c_kyung.jpg");
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
                       "<19곰테드2>" + "       "  + "\r\n\r\n" +
                        " 왕따에게도 왕따 당하던 8살 존, \r\n" + 
                        " 존의 크리스마스 소원으로 살아 움직이게 된 테드! \r\n" + 
                        " 무적의 썬더 버디로 30년 동안 \r\n" + 
                        " 철없고 끈끈한 우정을 이어가던 둘은\r\n" + 
                        " 테드가 인간이 아니라 물건(?)이라는 법원의 판결로 멘붕에 빠진다.\r\n" + 
                        " 빡친 테드는 존과 함께 자신의 인권(?)을 입증하기 위해\r\n" + 
                        " 승률 99.8% 변호사 사만다를 찾아가는데...\r\n" 
                      );
                  
                explain.setEditable(false);
            }
         });
         
         act2.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                explain.setText("");
                 explain.append("<미스터 주>" + "       "  + "\r\n\r\n" +
                         " 동물의 말이 들리는 순간,\r\n" + 
                         " 수사의 파트너가 바뀐다!\r\n\r\n" + 
                         " 국가정보국 에이스 요원 태주.\r\n" + 
                         " 특사로 파견된 VIP 경호 임무를 수행하던 중,\r\n" + 
                         " 갑작스러운 사고로 VIP는 사라지고\r\n" + 
                         " 설상가상 온갖 동물들의 말이 들리기 시작한다.\r\n" + 
                         " 갑자기 이상한 행동을 하는 태주를 의심하는 민국장과 만식을 뒤로 하고,  \r\n" + 
                         " 태주는 군견 알리와 함께 VIP를 찾아 나서는데…\r\n" 
                         );
                   
                 explain.setEditable(false);
                
             }
         });
         
         act3.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                explain.setText("");
                 explain.append("<시동 >" + "       "  + "\r\n\r\n" +
                         " 인생 뭐 있어?\r\n" + 
                         " 일단 한번 살아보는 거야!\r\n\r\n" + 
                         " '엄마'에게 1일 1강스파이크를 버는 반항아 '택일'\r\n" + 
                         " 절친 '상필'(정해인)이 빨리 돈을 벌고 싶다며 사회로 뛰어들 때,\r\n" + 
                         " 무작정 집을 뛰쳐나간 '택일'은\r\n" + 
                         " 우연히 찾은 장품반점에서 남다른 포스의 주방장 '거석이형'을 만나게 된다.\r\n" + 
                         " 강렬한 첫 인사를 나누자마자, \r\n" + 
                         " 인생 최대 적수가 된 '거석이형'과 '택일'.\r\n" + 
                         " 세상 무서울 것 없던 '택일'은 장품반점에서 상상도 못한 이들을 만나\r\n" + 
                         " 진짜 세상을 맛보게 되는데...\r\n"
                         );
                   
                 explain.setEditable(false);
             }
         });
         
         act4.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {  
                 explain.setText("");
                  explain.append(
                         "<예스맨>" + "       "  + "\r\n\r\n" +
                         " 인생을 바꾸는 유쾌한 외침 ‘YES’! \r\n" + 
                         " 그런데 하늘이 무너져도 ‘YES’? \r\n\r\n" + 
                         " 대출회사 상담 직원 칼 알렌은  \r\n" + 
                         " ‘NO’라는 말을 입에 달고 사는 매사 부정적인 남자. \r\n" + 
                         " 하지만 친구의 권유로 ‘인생역전 자립프로그램’에 가입하면서\r\n" +
                         " 그의 인생이 180도 뒤바뀐다!  \r\n" + 
                         " ‘긍정적인 사고가 행운을 부른다’는 프로그램 규칙에 따라  \r\n" +
                         " 모든 일에 ‘YES’라고 대답하기로 결심하고 \r\n" +
                         " 하지만 이 남자, 접수되는 대출 신청서류마다 YES, \r\n" +
                         " 구매강요 온라인 쇼핑몰 메일에도 YES, \r\n" +
                         " 정말 이렇게 ‘YES’ 해도 되는 걸까?\r\n" 
                          );                       
        
                 explain.setEditable(false);                
             
             }
         });
         
         
         act5.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                   explain.setText("");
                   explain.append("<청년경찰>" + "       "  + "\r\n\r\n" +
                         " 현장경험 전무, 수사는 책으로 배웠다!\r\n" + 
                         " “그냥 우리가 잡아볼게요”\r\n\r\n" + 
                         " 의욕충만 경찰대생 기준(박서준) X 이론백단 경찰대생 희열(강하늘)\r\n" + 
                         " 둘도 없는 친구인 두 사람은 외출을 나왔다 우연히 납치 사건을 목격하게 된다\r\n." + 
                         " 목격자는 오직 두 사람 뿐! \r\n" + 
                         " 기준과 희열은 학교에서 배운 대로 지체 없이 경찰에 신고한다.\r\n" + 
                         " 하지만 복잡한 절차와 부족한 증거로 \r\n" + 
                         " 수사는 전혀 진행될 기미가 보이지 않는 상황!\r\n" + 
                         " 기준과 희열은 직접 발로 뛰는 수사에 나서기로 하고\r\n" + 
                         " 예측 불가능한 상황을 마주하게 되는데…\r\n" 
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
