package com.movieflex;

import java.awt.Color;
import java.awt.Dimension;
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

public class Top5Panel extends JPanel{
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
   
   public Top5Panel(JFrame frame3) {

      JPanel BigTitle = new JPanel();
      BigTitle.setPreferredSize(new Dimension(900, 150));
      BigTitle.setBackground(Color.BLACK);
      JLabel titleLabel = new JLabel("TOP5");
      titleLabel.setFont(new Font("Serif", Font.BOLD, 60));
      titleLabel.setForeground(Color.red);
      titleLabel.setHorizontalAlignment(JLabel.CENTER);
      BigTitle.add(titleLabel);

      this.frame = frame3;

      frame3.setTitle("Top5");
      setSize(900, 900);   
      setBackground(Color.black);      

      JButton act1, act2, act3, act4, act5;
      JPanel panel1, panel2, panel3, panel4, panel5;
      JLabel rank1, rank2, rank3, rank4, rank5;

      //폰트
      Font font1 = new Font("NanumGothic", Font.BOLD, 13);
      Font font2 = new Font("맑은 고딕", Font.BOLD, 18);

      //TextArea
      JTextArea explain = new JTextArea();
      explain.setBackground(new Color(197,192,189));
      JScrollPane scr1 = new JScrollPane(explain,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
      scr1.setBounds(200,650,500,150);
      explain.setEditable(false);
      explain.setFont(font1); 
      
      //순위 추가
      rank1 = new JLabel("1위");
      rank1.setFont(font2);
      rank1.setForeground(Color.white);
      
      rank2 = new JLabel("2위");
      rank2.setFont(font2);
      rank2.setForeground(Color.white);
      
      rank3 = new JLabel("3위");
      rank3.setFont(font2);
      rank3.setForeground(Color.white);
      
      rank4 = new JLabel("4위");
      rank4.setFont(font2);
      rank4.setForeground(Color.white);
      
      rank5 = new JLabel("5위");
      rank5.setFont(font2);
      rank5.setForeground(Color.white);
      
      // 어벤져스
      panel1 = new JPanel();
      ImageIcon actIcon1 = new ImageIcon("images/a_avengers.jpg");      
      act1 = new JButton(); //버튼에 글자 추가
      act1.setSize(200,200);
      act1.setBorder(line);
      act1.addMouseListener(me);
      panel1.setBackground(Color.black);
      panel1.add(rank1);
      panel1.add(act1);
      panel1.setBounds(100, 150, 200, 225);      
      int offset1 = act1.getInsets().left;
      act1.setIcon(resizeIcon(actIcon1, act1.getWidth() - offset1, act1.getHeight() - offset1));
           
      
      // 라라랜드
      panel2 = new JPanel();
      ImageIcon actIcon2 = new ImageIcon("images/r_lala.jpg");
      act2 = new JButton();
      act2.setSize(200,200);
      act2.setBorder(line);
      act2.addMouseListener(me);
      panel2.setBackground(Color.black);
      panel2.add(rank2);
      panel2.add(act2);    
      panel2.setBounds(370, 150, 200, 225);    
      int offset2 = act2.getInsets().left;
      act2.setIcon(resizeIcon(actIcon2, act2.getWidth() - offset2, act2.getHeight() - offset2));

      //쿵푸펜더
      panel3 = new JPanel();
      ImageIcon actIcon3 = new ImageIcon("images/an_kung.jpg");
      act3 = new JButton();
      act3.setSize(200,200);
      act3.setBorder(line);
      act3.addMouseListener(me);
      panel3.setBackground(Color.black);
      panel3.add(rank3);
      panel3.add(act3);   
      panel3.setBounds(650, 150, 200, 225);    
      int offset3 = act3.getInsets().left;
      act3.setIcon(resizeIcon(actIcon3, act3.getWidth() - offset3, act3.getHeight() - offset3));

      //워낭소리
      panel4 = new JPanel();
      ImageIcon actIcon4 = new ImageIcon("images/d_sori.jpg");
      act4 = new JButton();
      act4.setSize(200,200);
      act4.setBorder(line);
      act4.addMouseListener(me);
      panel4.setBackground(Color.black);
      panel4.add(rank4);
      panel4.add(act4);
      panel4.setBounds(200, 400, 200, 225);   
      int offset4 = act4.getInsets().left;
      act4.setIcon(resizeIcon(actIcon4, act4.getWidth() - offset4, act4.getHeight() - offset4));

      //어바웃 타임
      panel5 = new JPanel();
      ImageIcon actIcon5 = new ImageIcon("images/r_about.jpg");
      act5 = new JButton();
      act5.setSize(200,200);
      act5.setBorder(line);
      act5.addMouseListener(me);
      panel5.setBackground(Color.black);
      panel5.add(rank5);
      panel5.add(act5);    
      panel5.setBounds(500, 400, 200, 225);  
      int offset5 = act5.getInsets().left;
      act5.setIcon(resizeIcon(actIcon5, act5.getWidth() - offset5, act5.getHeight() - offset5));

      //이벤트 처리-영화 설명
      act1.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            explain.setText("");
            explain.append(
                  "<어벤져스 평점>" + "       "  + "\r\n\r\n" +
                        "★★★★★ 10 | 마블 3000만큼 사랑합니다      \r\n" + 
                        " ㄴ smc7**** | 2019.04.24 10:31 \r\n" + 
                        "★★★★★ 10 | 아이언맨으로 시작해서 아이언맨으로 끝난다.. \r\n" + 
                        " ㄴ uboal**** | 2019.04.24 10:32 \r\n" +  
                        "★★★★★ 10 | 히어로물보고 울줄 누가알겠습니까 \r\n" + 
                        " ㄴ fgew**** | 2019.04.24 10:35 \r\n" +  
                        "★★★★★ 10 | 캡틴이 행복하면 그걸로 됐어... \r\n" + 
                        " ㄴ wegw**** | 2019.04.24 10:37 \r\n" +  
                        "★★★★★ 10 | 와 내가 3시간동안 화장실을 안갔어 ;;; \r\n" + 
                        " ㄴ uhth**** | 2019.04.24 10:38 \r\n" +  
                        "★★★★★ 10 | 토르의 뱃살은 밸런스를 위해서라는 게 학계의 정설 \r\n" + 
                        " ㄴ qwd**** | 2019.04.24 10:38 \r\n" +  
                        "★★★★★ 10 | 토르 등장씬보다 멋있는 어벤져스 집결씬\r\n" + 
                        " ㄴ irnyt**** | 2019.04.24 10:39 \r\n" +  
                        "★★★★★ 10 | 영화 늦게 볼 수밖에 없는사람들을 생각해서 스포 자제해주세요ㅠㅠㅠ \r\n" + 
                        " ㄴ qcds**** | 2019.04.24 10:45 \r\n" +  
                        "★★★★★ 10 | 진짜 대박이라는말밖에 안나옵니다... \r\n" + 
                        " ㄴ avde**** | 2019.04.24 10:47 \r\n" +  
                        "★★★★★ 10 | 하워드 스타크와 하워드 포츠가 만날 때 너무 애잔했다.. \r\n" + 
                        " ㄴ qrb**** | 2019.04.24 10:50 \r\n" +  
                        "★★★★★ 10 | 마블 팬이라면 보고 기분이묘하실듯 \r\n" + 
                        " ㄴ ueg**** | 2019.04.24 10:57 \r\n" +
                        "★★★★★ 10 | 토르 등장씬보다 멋있는 어벤져스 집결씬\r\n" + 
                        " ㄴ irnyt**** | 2019.04.24 10:39 \r\n" +  
                        "★★★★★ 10 | 영화 늦게 볼 수밖에 없는사람들을 생각해서 스포 자제해주세요ㅠㅠㅠ \r\n" + 
                        " ㄴ qcds**** | 2019.04.24 10:45 \r\n" +  
                        "★★★★★ 10 | 진짜 대박이라는말밖에 안나옵니다... \r\n" + 
                        " ㄴ avde**** | 2019.04.24 10:47 \r\n" +  
                        "★★★★★ 10 | 하워드 스타크와 하워드 포츠가 만날 때 너무 애잔했다.. \r\n" + 
                        " ㄴ qrb**** | 2019.04.24 10:50 \r\n" +  
                        "★★★★★ 10 | 마블 팬이라면 보고 기분이묘하실듯 \r\n" + 
                        " ㄴ ueg**** | 2019.04.24 10:57 \r\n" 
                  );

            explain.setEditable(false);
         }
      });

      act2.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            explain.setText("");
            explain.append(
                  "<라라랜드>" + "       "  + "\r\n\r\n" +
                        "★★★★★ 10 | 처음 들을때는 몰랐다 이 음악이 슬퍼질거란걸     \r\n" + 
                        " ㄴ wer**** | 2019.04.24 10:31 \r\n" + 
                        "★★★★☆ 8 | '그래도 우리 잘 해냈지?'라고 말하는 듯한 마지막 눈빛교환이 잊혀지질 않는다 \r\n" + 
                        " ㄴ qasw**** | 2019.04.24 10:32 \r\n" +  
                        "★★★★★ 10 | 내일 죽으면 오늘 보러 갈만한 영화 \r\n" + 
                        " ㄴ kty**** | 2019.04.24 10:35 \r\n" +  
                        "★★★★★ 10 | 영화 시작부터 깜짝놀랐다. 지금까지 본 음악영화 중에서 최고다. \r\n" + 
                        " ㄴ fer**** | 2019.04.24 10:37 \r\n" +  
                        "★★★★☆ 8 | 와 내가 3시간동안 화장실을 안갔어 ;;; \r\n" + 
                        " ㄴ uhth**** | 2019.04.24 10:38 \r\n" +  
                        "★★★★★ 10 |  다시 돌아간다면 지금과 달랐을까? \r\n" + 
                        " ㄴ qwd**** | 2019.04.24 10:38 \r\n" +  
                        "★★★★★ 10 |  슬프기 짝이 없는 상상.\r\n" + 
                        " ㄴ irnyt**** | 2019.04.24 10:39 \r\n" +  
                        "★★★★☆ 8 | 왤케눈물이나오는지..ㅠㅠ \r\n" + 
                        " ㄴ qcds**** | 2019.04.24 10:45 \r\n" +  
                        "★★★★★ 10 | 진짜 대박이라는말밖에 안나옵니다... \r\n" + 
                        " ㄴ avde**** | 2019.04.24 10:47 \r\n" +  
                        "★★★★★ 10 |  영화보다가 박수칠뻔ㅜㅜ \r\n" + 
                        " ㄴ qrb**** | 2019.04.24 10:50 \r\n" +  
                        "★★★★★ 10 |  내생애 최고의 뮤지컬영화로 뽑음ㅠㅠ 넘넘 재밌음!!! \r\n" + 
                        " ㄴ ueg**** | 2019.04.24 10:57 \r\n" +
                        " ㄴ uhth**** | 2019.04.24 10:38 \r\n" +  
                        "★★★☆☆ 6 |  다시 돌아간다면 지금과 달랐을까? \r\n" + 
                        " ㄴ qwd**** | 2019.04.24 10:38 \r\n" +  
                        "★★★★★ 10 |  슬프기 짝이 없는 상상.\r\n" + 
                        " ㄴ irnyt**** | 2019.04.24 10:39 \r\n" +
                        "★★★★★ 10 | 처음 들을때는 몰랐다 이 음악이 슬퍼질거란걸     \r\n" + 
                        " ㄴ smc7**** | 2019.04.24 10:31 \r\n" + 
                        "★★★★☆ 8 | '그래도 우리 잘 해냈지?'라고 말하는 듯한 마지막 눈빛교환이 잊혀지질 않는다 \r\n" + 
                        " ㄴ uboal**** | 2019.04.24 10:32 \r\n" +  
                        "★★★★★ 10 | 내일 죽으면 오늘 보러 갈만한 영화 \r\n" + 
                        " ㄴ fgew**** | 2019.04.24 10:35 \r\n" 
                     
                     
                           );

            explain.setEditable(false);

         }
      });

      act3.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            explain.setText("");
            explain.append(
                  "<쿵푸팬더 평점>" + "       "  + "\r\n\r\n" +
                        "★★★★★  10  | 눈물이 나온다ㅠ 팬더 웃기다가 진지빨면 이상하게 눈무리나온다ㅠㅠ     \r\n" + 
                        " ㄴ iokj**** | 2019.04.24 10:31 \r\n" + 
                        "★★★★★ 10 | 값으로 환산할 수 없을 만큼 귀엽고 황홀한 캐릭터 ㅠㅠ \r\n" + 
                        " ㄴ iyi**** | 2019.04.24 10:32 \r\n" +  
                        "★★★★★  10  | 쿵푸팬더 3도 빨리 나왔으면 \r\n" + 
                        " ㄴ fwq**** | 2019.04.24 10:35 \r\n" +  
                        "★★★★★ 10 | 셴이 파이어(발사)! 할때 개멌있음 \r\n" + 
                        " ㄴ wegw**** | 2019.04.24 10:37 \r\n" +  
                        "★★★★★ 10 | 와 내가 3시간동안 화장실을 안갔어 ;;; \r\n" + 
                        " ㄴ uhth**** | 2019.04.24 10:38 \r\n" +  
                        "★★★☆☆  6 | 보는내내 눈이즐겁다.\r\n" + 
                        " ㄴ qwd**** | 2019.04.24 10:38 \r\n" +  
                        "★★★★☆ 8 |  형보다 나은 아우, 3편이 너무 기다려진다\r\n" + 
                        " ㄴ irnyt**** | 2019.04.24 10:39 \r\n" +  
                        "★★★★★ 10 | 영화 늦게 볼 수밖에 없는사람들을 생각해서 스포 자제해주세요ㅠㅠㅠ \r\n" + 
                        " ㄴ qcds**** | 2019.04.24 10:45 \r\n" +  
                        "★★★★☆ 8 | 진짜 대박이라는말밖에 안나옵니다... \r\n" + 
                        " ㄴ avde**** | 2019.04.24 10:47 \r\n" +  
                        "★★★★★ 10 | 이거 보고 타이그리스에 빠짐 \r\n" + 
                        " ㄴ qrb**** | 2019.04.24 10:50 \r\n" +  
                        "★★★★★ 10 | 시간이 너무 빨리 지나갔어요 최고예요 \r\n" + 
                        " ㄴ ueg**** | 2019.04.24 10:57 \r\n" +
                        "★★★★★ 10 | 내면의 평화 ~ 감동적네요\r\n" + 
                        " ㄴ irnyt**** | 2019.04.24 10:39 \r\n" +  
                        "★★★★★ 10 | 귀엽고 재밌고 유쾌한 액션. 맘에듭니다  \r\n" + 
                        " ㄴ qcds**** | 2019.04.24 10:45 \r\n" +  
                        "★★★★★  10 | 진짜 대박이라는말밖에 안나옵니다... \r\n" + 
                        " ㄴ avde**** | 2019.04.24 10:47 \r\n" +  
                        "★★★★★ 10 | 주인공뿐만 아니라 악역도 잘 대접해줬다 \r\n" + 
                        " ㄴ qrb**** | 2019.04.24 10:50 \r\n" +  
                        "★★★★★ 10 | 내면의 평화.. 눈물나게 멋졌다 \r\n" + 
                        " ㄴ ueg**** | 2019.04.24 10:57 \r\n" 
                  );

            explain.setEditable(false);
         }
      });

      act4.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {  
            explain.setText("");
            explain.append(
                  "<워낭소리 평점>" + "       "  + "\r\n\r\n" +
                        "★★★★★ 10 | 워낭소리 할아버지 ㅜㅜ 하늘에 가셔서 소하고 행복하게 지내세요      \r\n" + 
                        " ㄴyree**** | 2019.04.24 10:31 \r\n" + 
                        "★★★★★ 10 | \r\n" + "인간의 삶은 연출이 필요없음. 일단 한번 보셈. \r\n" + 
                        " ㄴ rinn**** | 2019.04.24 10:32 \r\n" +  
                        "★★★★★ 10 | 나를 울린 영화,,, 내 인생관과 닮은 우정을 보여준 영화,,, 죽은 소를 기립니다,,, \r\n" + 
                        " ㄴ dbhd**** | 2019.04.24 10:35 \r\n" +  
                        "★★★★★ 10 | 너무 짠하네요... 눈물이 주르륵 \r\n" + 
                        " ㄴ whdf**** | 2019.04.24 10:37 \r\n" +  
                        "★★★★★ 10 | 한번더 개봉하면 안되나요 보고싶은데 \r\n" + 
                        " ㄴ uhth**** | 2019.04.24 10:38 \r\n" +  
                        "★★★★★ 10 | 각박한 세상 속 메마른 정신을 일깨우는 다큐 \r\n" + 
                        " ㄴ qwd**** | 2019.04.24 10:38 \r\n" +  
                        "★★★★★ 10 | 사람이라면 죽기전에 꼭 봐야될 영화다!!!ㅠ\r\n" + 
                        " ㄴ irnyt**** | 2019.04.24 10:39 \r\n" +  
                        "★★☆☆☆ 4  | 솔직히 이건 소 입장도 들어봐야 됨;\r\n" + 
                        " ㄴ qcds**** | 2019.04.24 10:45 \r\n" +  
                        "★★★★★ 10 | 존경합니다.. 너무 슬퍼요ㅠ\r\n" + 
                        " ㄴ avde**** | 2019.04.24 10:47 \r\n" +  
                        "★★★★★ 10 | 인간의 추악함을 너무나 생것으로 표현했다. 그 용기에 박수를 \r\n" + 
                        " ㄴ qrb**** | 2019.04.24 10:50 \r\n" +  
                        "★★★★★ 10 | 안 울 수가 없다 이건... \r\n" + 
                        " ㄴ ueg**** | 2019.04.24 10:57 \r\n" +
                        "★★★★★ 10 | 마지막에 나무해놓고 죽은거보고 눈물이.... \r\n" + 
                        " ㄴ irnyt**** | 2019.04.24 10:39 \r\n" +  
                        "★★★★★ 10 | 다큐멘터리 수작중의 하나 감동적 \r\n" + 
                        " ㄴ qcds**** | 2019.04.24 10:45 \r\n" +  
                        "★★★★★ 10 | 사람과 소와의 이심전심.. \r\n" + 
                        " ㄴ avde**** | 2019.04.24 10:47 \r\n" +  
                        "★★★★★ 10 | 처음으로 영화에 평점을 메깁니다 \r\n" + 
                        " ㄴ qrb**** | 2019.04.24 10:50 \r\n" +  
                        "★★★★★ 10 | 몇년만에 평점을 쓰게 만드는 영화 감동적입니다 \r\n" + 
                        " ㄴ ueg**** | 2019.04.24 10:57 \r\n" 
                  );                       

            explain.setEditable(false);                

         }
      });


      act5.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            explain.setText("");
            explain.append(
                  "<어바웃 타임 평점>" + "       "  + "\r\n\r\n" +
                        "★★★★★ 10 | 가슴을 따뜻하게 해주는 정말 완전소중한 영화 ㅠ~ㅠ      \r\n" + 
                        " ㄴ ste**** | 2019.04.24 10:31 \r\n" + 
                        "★★★★★ 10 | 재밋습니다 후회없습니다 \r\n" + 
                        " ㄴ kyy**** | 2019.04.24 10:32 \r\n" +  
                        "★★★★★ 10 | 가슴 따뜻해지는 영화입니다. 올겨울 강추 \r\n" + 
                        " ㄴ wer**** | 2019.04.24 10:35 \r\n" +  
                        "★★★☆☆ 8 | 레이첼 맥아덤스 넘 이쁘네요^^ \r\n" + 
                        " ㄴ poi**** | 2019.04.24 10:37 \r\n" +  
                        "★★★★★ 10 | 기대 하지 않았던 길모퉁이의 맛집의 따뜻함 \r\n" + 
                        " ㄴ qswd**** | 2019.04.24 10:38 \r\n" +  
                        "★★★★★ 10 | 영화를 보면 누구나 공감한다. 이건명작이라고 \r\n" + 
                        " ㄴ qwd**** | 2019.04.24 10:38 \r\n" +  
                        "★★★★★ 10 | 두근거리러왔다가 감동과 교훈까지 얻고간다.\r\n" + 
                        " ㄴ irnyt**** | 2019.04.24 10:39 \r\n" +  
                        "★★★★★ 10 | 이영화는 2번 3번봐도 아깝지않을 명작입니다.^^ \r\n" + 
                        " ㄴ qcds**** | 2019.04.24 10:45 \r\n" +  
                        "★★★★★ 10 | 몇 일간이였지만 삶에 태도를 바꿔줬으니 .. 최고 \r\n" + 
                        " ㄴ avde**** | 2019.04.24 10:47 \r\n" +  
                        "★★★★★ 10 | 강추합니다. 기분좋아지는 영화 \r\n" + 
                        " ㄴ qrb**** | 2019.04.24 10:50 \r\n" +  
                        "★★★★★ 10 | 벅차오르는 이감동은 대체 머지 \r\n" + 
                        " ㄴ ueg**** | 2019.04.24 10:57 \r\n" +
                        "★★★★★ 10 |  다시봐도재밌는영화..뭔가뭉킁\r\n" + 
                        " ㄴ irnyt**** | 2019.04.24 10:39 \r\n" +  
                        "★★★★★ 10 | 간만에 제대로 돌아온 로코장인의 제대된 데이트 무비 \r\n" + 
                        " ㄴ qcds**** | 2019.04.24 10:45 \r\n" +  
                        "★★★★★ 10 | 진짜 대박이라는말밖에 안나옵니다... \r\n" + 
                        " ㄴ avde**** | 2019.04.24 10:47 \r\n" +  
                        "★★★★★ 10 | 내 메마른감성에 물대포를 쏴버렸다 \r\n" + 
                        " ㄴ qrb**** | 2019.04.24 10:50 \r\n" +  
                        "★★★★★ 10 | 좋은영화네요 따뜻한영화네요 \r\n" + 
                        " ㄴ ueg**** | 2019.04.24 10:57 \r\n" 
                  );

            explain.setEditable(false);
         }
      });



      JButton back = new JButton("뒤로가기");
      back.setBounds(80, 700, 100, 40);
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