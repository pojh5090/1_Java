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
   //��ư �׵θ�
   private LineBorder line = new LineBorder(Color.black,2,false);
   //���콺 �̺�Ʈ
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

      //��Ʈ
      Font font1 = new Font("NanumGothic", Font.BOLD, 13);
      Font font2 = new Font("���� ���", Font.BOLD, 18);

      //TextArea
      JTextArea explain = new JTextArea();
      explain.setBackground(new Color(197,192,189));
      JScrollPane scr1 = new JScrollPane(explain,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
      scr1.setBounds(200,650,500,150);
      explain.setEditable(false);
      explain.setFont(font1); 
      
      //���� �߰�
      rank1 = new JLabel("1��");
      rank1.setFont(font2);
      rank1.setForeground(Color.white);
      
      rank2 = new JLabel("2��");
      rank2.setFont(font2);
      rank2.setForeground(Color.white);
      
      rank3 = new JLabel("3��");
      rank3.setFont(font2);
      rank3.setForeground(Color.white);
      
      rank4 = new JLabel("4��");
      rank4.setFont(font2);
      rank4.setForeground(Color.white);
      
      rank5 = new JLabel("5��");
      rank5.setFont(font2);
      rank5.setForeground(Color.white);
      
      // �����
      panel1 = new JPanel();
      ImageIcon actIcon1 = new ImageIcon("images/a_avengers.jpg");      
      act1 = new JButton(); //��ư�� ���� �߰�
      act1.setSize(200,200);
      act1.setBorder(line);
      act1.addMouseListener(me);
      panel1.setBackground(Color.black);
      panel1.add(rank1);
      panel1.add(act1);
      panel1.setBounds(100, 150, 200, 225);      
      int offset1 = act1.getInsets().left;
      act1.setIcon(resizeIcon(actIcon1, act1.getWidth() - offset1, act1.getHeight() - offset1));
           
      
      // ��󷣵�
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

      //��Ǫ���
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

      //�����Ҹ�
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

      //��ٿ� Ÿ��
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

      //�̺�Ʈ ó��-��ȭ ����
      act1.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            explain.setText("");
            explain.append(
                  "<����� ����>" + "       "  + "\r\n\r\n" +
                        "�ڡڡڡڡ� 10 | ���� 3000��ŭ ����մϴ�      \r\n" + 
                        " �� smc7**** | 2019.04.24 10:31 \r\n" + 
                        "�ڡڡڡڡ� 10 | ���̾������ �����ؼ� ���̾������ ������.. \r\n" + 
                        " �� uboal**** | 2019.04.24 10:32 \r\n" +  
                        "�ڡڡڡڡ� 10 | ����ι����� ���� �����˰ڽ��ϱ� \r\n" + 
                        " �� fgew**** | 2019.04.24 10:35 \r\n" +  
                        "�ڡڡڡڡ� 10 | ĸƾ�� �ູ�ϸ� �װɷ� �ƾ�... \r\n" + 
                        " �� wegw**** | 2019.04.24 10:37 \r\n" +  
                        "�ڡڡڡڡ� 10 | �� ���� 3�ð����� ȭ����� �Ȱ��� ;;; \r\n" + 
                        " �� uhth**** | 2019.04.24 10:38 \r\n" +  
                        "�ڡڡڡڡ� 10 | �丣�� ����� �뷱���� ���ؼ���� �� �а��� ���� \r\n" + 
                        " �� qwd**** | 2019.04.24 10:38 \r\n" +  
                        "�ڡڡڡڡ� 10 | �丣 ��������� ���ִ� ����� �����\r\n" + 
                        " �� irnyt**** | 2019.04.24 10:39 \r\n" +  
                        "�ڡڡڡڡ� 10 | ��ȭ �ʰ� �� ���ۿ� ���»������ �����ؼ� ���� �������ּ���ФФ� \r\n" + 
                        " �� qcds**** | 2019.04.24 10:45 \r\n" +  
                        "�ڡڡڡڡ� 10 | ��¥ ����̶�¸��ۿ� �ȳ��ɴϴ�... \r\n" + 
                        " �� avde**** | 2019.04.24 10:47 \r\n" +  
                        "�ڡڡڡڡ� 10 | �Ͽ��� ��Ÿũ�� �Ͽ��� ������ ���� �� �ʹ� �����ߴ�.. \r\n" + 
                        " �� qrb**** | 2019.04.24 10:50 \r\n" +  
                        "�ڡڡڡڡ� 10 | ���� ���̶�� ���� ����̹��Ͻǵ� \r\n" + 
                        " �� ueg**** | 2019.04.24 10:57 \r\n" +
                        "�ڡڡڡڡ� 10 | �丣 ��������� ���ִ� ����� �����\r\n" + 
                        " �� irnyt**** | 2019.04.24 10:39 \r\n" +  
                        "�ڡڡڡڡ� 10 | ��ȭ �ʰ� �� ���ۿ� ���»������ �����ؼ� ���� �������ּ���ФФ� \r\n" + 
                        " �� qcds**** | 2019.04.24 10:45 \r\n" +  
                        "�ڡڡڡڡ� 10 | ��¥ ����̶�¸��ۿ� �ȳ��ɴϴ�... \r\n" + 
                        " �� avde**** | 2019.04.24 10:47 \r\n" +  
                        "�ڡڡڡڡ� 10 | �Ͽ��� ��Ÿũ�� �Ͽ��� ������ ���� �� �ʹ� �����ߴ�.. \r\n" + 
                        " �� qrb**** | 2019.04.24 10:50 \r\n" +  
                        "�ڡڡڡڡ� 10 | ���� ���̶�� ���� ����̹��Ͻǵ� \r\n" + 
                        " �� ueg**** | 2019.04.24 10:57 \r\n" 
                  );

            explain.setEditable(false);
         }
      });

      act2.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            explain.setText("");
            explain.append(
                  "<��󷣵�>" + "       "  + "\r\n\r\n" +
                        "�ڡڡڡڡ� 10 | ó�� �������� ������ �� ������ �������Ŷ���     \r\n" + 
                        " �� wer**** | 2019.04.24 10:31 \r\n" + 
                        "�ڡڡڡڡ� 8 | '�׷��� �츮 �� �س���?'��� ���ϴ� ���� ������ ������ȯ�� �������� �ʴ´� \r\n" + 
                        " �� qasw**** | 2019.04.24 10:32 \r\n" +  
                        "�ڡڡڡڡ� 10 | ���� ������ ���� ���� ������ ��ȭ \r\n" + 
                        " �� kty**** | 2019.04.24 10:35 \r\n" +  
                        "�ڡڡڡڡ� 10 | ��ȭ ���ۺ��� ��¦�����. ���ݱ��� �� ���ǿ�ȭ �߿��� �ְ��. \r\n" + 
                        " �� fer**** | 2019.04.24 10:37 \r\n" +  
                        "�ڡڡڡڡ� 8 | �� ���� 3�ð����� ȭ����� �Ȱ��� ;;; \r\n" + 
                        " �� uhth**** | 2019.04.24 10:38 \r\n" +  
                        "�ڡڡڡڡ� 10 |  �ٽ� ���ư��ٸ� ���ݰ� �޶�����? \r\n" + 
                        " �� qwd**** | 2019.04.24 10:38 \r\n" +  
                        "�ڡڡڡڡ� 10 |  ������ ¦�� ���� ���.\r\n" + 
                        " �� irnyt**** | 2019.04.24 10:39 \r\n" +  
                        "�ڡڡڡڡ� 8 | ���ɴ����̳�������..�Ф� \r\n" + 
                        " �� qcds**** | 2019.04.24 10:45 \r\n" +  
                        "�ڡڡڡڡ� 10 | ��¥ ����̶�¸��ۿ� �ȳ��ɴϴ�... \r\n" + 
                        " �� avde**** | 2019.04.24 10:47 \r\n" +  
                        "�ڡڡڡڡ� 10 |  ��ȭ���ٰ� �ڼ�ĥ���̤� \r\n" + 
                        " �� qrb**** | 2019.04.24 10:50 \r\n" +  
                        "�ڡڡڡڡ� 10 |  ������ �ְ��� �����ÿ�ȭ�� �����Ф� �ѳ� �����!!! \r\n" + 
                        " �� ueg**** | 2019.04.24 10:57 \r\n" +
                        " �� uhth**** | 2019.04.24 10:38 \r\n" +  
                        "�ڡڡڡ١� 6 |  �ٽ� ���ư��ٸ� ���ݰ� �޶�����? \r\n" + 
                        " �� qwd**** | 2019.04.24 10:38 \r\n" +  
                        "�ڡڡڡڡ� 10 |  ������ ¦�� ���� ���.\r\n" + 
                        " �� irnyt**** | 2019.04.24 10:39 \r\n" +
                        "�ڡڡڡڡ� 10 | ó�� �������� ������ �� ������ �������Ŷ���     \r\n" + 
                        " �� smc7**** | 2019.04.24 10:31 \r\n" + 
                        "�ڡڡڡڡ� 8 | '�׷��� �츮 �� �س���?'��� ���ϴ� ���� ������ ������ȯ�� �������� �ʴ´� \r\n" + 
                        " �� uboal**** | 2019.04.24 10:32 \r\n" +  
                        "�ڡڡڡڡ� 10 | ���� ������ ���� ���� ������ ��ȭ \r\n" + 
                        " �� fgew**** | 2019.04.24 10:35 \r\n" 
                     
                     
                           );

            explain.setEditable(false);

         }
      });

      act3.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            explain.setText("");
            explain.append(
                  "<��Ǫ�Ҵ� ����>" + "       "  + "\r\n\r\n" +
                        "�ڡڡڡڡ�  10  | ������ ���´٤� �Ҵ� ����ٰ� �������� �̻��ϰ� ���������´٤Ф�     \r\n" + 
                        " �� iokj**** | 2019.04.24 10:31 \r\n" + 
                        "�ڡڡڡڡ� 10 | ������ ȯ���� �� ���� ��ŭ �Ϳ��� ȲȦ�� ĳ���� �Ф� \r\n" + 
                        " �� iyi**** | 2019.04.24 10:32 \r\n" +  
                        "�ڡڡڡڡ�  10  | ��Ǫ�Ҵ� 3�� ���� �������� \r\n" + 
                        " �� fwq**** | 2019.04.24 10:35 \r\n" +  
                        "�ڡڡڡڡ� 10 | ���� ���̾�(�߻�)! �Ҷ� ���C���� \r\n" + 
                        " �� wegw**** | 2019.04.24 10:37 \r\n" +  
                        "�ڡڡڡڡ� 10 | �� ���� 3�ð����� ȭ����� �Ȱ��� ;;; \r\n" + 
                        " �� uhth**** | 2019.04.24 10:38 \r\n" +  
                        "�ڡڡڡ١�  6 | ���³��� ������̴�.\r\n" + 
                        " �� qwd**** | 2019.04.24 10:38 \r\n" +  
                        "�ڡڡڡڡ� 8 |  ������ ���� �ƿ�, 3���� �ʹ� ��ٷ�����\r\n" + 
                        " �� irnyt**** | 2019.04.24 10:39 \r\n" +  
                        "�ڡڡڡڡ� 10 | ��ȭ �ʰ� �� ���ۿ� ���»������ �����ؼ� ���� �������ּ���ФФ� \r\n" + 
                        " �� qcds**** | 2019.04.24 10:45 \r\n" +  
                        "�ڡڡڡڡ� 8 | ��¥ ����̶�¸��ۿ� �ȳ��ɴϴ�... \r\n" + 
                        " �� avde**** | 2019.04.24 10:47 \r\n" +  
                        "�ڡڡڡڡ� 10 | �̰� ���� Ÿ�̱׸����� ���� \r\n" + 
                        " �� qrb**** | 2019.04.24 10:50 \r\n" +  
                        "�ڡڡڡڡ� 10 | �ð��� �ʹ� ���� ��������� �ְ��� \r\n" + 
                        " �� ueg**** | 2019.04.24 10:57 \r\n" +
                        "�ڡڡڡڡ� 10 | ������ ��ȭ ~ �������׿�\r\n" + 
                        " �� irnyt**** | 2019.04.24 10:39 \r\n" +  
                        "�ڡڡڡڡ� 10 | �Ϳ��� ��հ� ������ �׼�. ������ϴ�  \r\n" + 
                        " �� qcds**** | 2019.04.24 10:45 \r\n" +  
                        "�ڡڡڡڡ�  10 | ��¥ ����̶�¸��ۿ� �ȳ��ɴϴ�... \r\n" + 
                        " �� avde**** | 2019.04.24 10:47 \r\n" +  
                        "�ڡڡڡڡ� 10 | ���ΰ��Ӹ� �ƴ϶� �ǿ��� �� ��������� \r\n" + 
                        " �� qrb**** | 2019.04.24 10:50 \r\n" +  
                        "�ڡڡڡڡ� 10 | ������ ��ȭ.. �������� ������ \r\n" + 
                        " �� ueg**** | 2019.04.24 10:57 \r\n" 
                  );

            explain.setEditable(false);
         }
      });

      act4.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {  
            explain.setText("");
            explain.append(
                  "<�����Ҹ� ����>" + "       "  + "\r\n\r\n" +
                        "�ڡڡڡڡ� 10 | �����Ҹ� �Ҿƹ��� �̤� �ϴÿ� ���ż� ���ϰ� �ູ�ϰ� ��������      \r\n" + 
                        " ��yree**** | 2019.04.24 10:31 \r\n" + 
                        "�ڡڡڡڡ� 10 | \r\n" + "�ΰ��� ���� ������ �ʿ����. �ϴ� �ѹ� ����. \r\n" + 
                        " �� rinn**** | 2019.04.24 10:32 \r\n" +  
                        "�ڡڡڡڡ� 10 | ���� �︰ ��ȭ,,, �� �λ����� ���� ������ ������ ��ȭ,,, ���� �Ҹ� �⸳�ϴ�,,, \r\n" + 
                        " �� dbhd**** | 2019.04.24 10:35 \r\n" +  
                        "�ڡڡڡڡ� 10 | �ʹ� §�ϳ׿�... ������ �ָ��� \r\n" + 
                        " �� whdf**** | 2019.04.24 10:37 \r\n" +  
                        "�ڡڡڡڡ� 10 | �ѹ��� �����ϸ� �ȵǳ��� ��������� \r\n" + 
                        " �� uhth**** | 2019.04.24 10:38 \r\n" +  
                        "�ڡڡڡڡ� 10 | ������ ���� �� �޸��� ������ �ϱ���� ��ť \r\n" + 
                        " �� qwd**** | 2019.04.24 10:38 \r\n" +  
                        "�ڡڡڡڡ� 10 | ����̶�� �ױ����� �� ���ߵ� ��ȭ��!!!��\r\n" + 
                        " �� irnyt**** | 2019.04.24 10:39 \r\n" +  
                        "�ڡڡ١١� 4  | ������ �̰� �� ���嵵 ������ ��;\r\n" + 
                        " �� qcds**** | 2019.04.24 10:45 \r\n" +  
                        "�ڡڡڡڡ� 10 | �����մϴ�.. �ʹ� ���ۿ��\r\n" + 
                        " �� avde**** | 2019.04.24 10:47 \r\n" +  
                        "�ڡڡڡڡ� 10 | �ΰ��� �߾����� �ʹ��� �������� ǥ���ߴ�. �� ��⿡ �ڼ��� \r\n" + 
                        " �� qrb**** | 2019.04.24 10:50 \r\n" +  
                        "�ڡڡڡڡ� 10 | �� �� ���� ���� �̰�... \r\n" + 
                        " �� ueg**** | 2019.04.24 10:57 \r\n" +
                        "�ڡڡڡڡ� 10 | �������� �����س��� �����ź��� ������.... \r\n" + 
                        " �� irnyt**** | 2019.04.24 10:39 \r\n" +  
                        "�ڡڡڡڡ� 10 | ��ť���͸� �������� �ϳ� ������ \r\n" + 
                        " �� qcds**** | 2019.04.24 10:45 \r\n" +  
                        "�ڡڡڡڡ� 10 | ����� �ҿ��� �̽�����.. \r\n" + 
                        " �� avde**** | 2019.04.24 10:47 \r\n" +  
                        "�ڡڡڡڡ� 10 | ó������ ��ȭ�� ������ �ޱ�ϴ� \r\n" + 
                        " �� qrb**** | 2019.04.24 10:50 \r\n" +  
                        "�ڡڡڡڡ� 10 | ��⸸�� ������ ���� ����� ��ȭ �������Դϴ� \r\n" + 
                        " �� ueg**** | 2019.04.24 10:57 \r\n" 
                  );                       

            explain.setEditable(false);                

         }
      });


      act5.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            explain.setText("");
            explain.append(
                  "<��ٿ� Ÿ�� ����>" + "       "  + "\r\n\r\n" +
                        "�ڡڡڡڡ� 10 | ������ �����ϰ� ���ִ� ���� ���������� ��ȭ ��~��      \r\n" + 
                        " �� ste**** | 2019.04.24 10:31 \r\n" + 
                        "�ڡڡڡڡ� 10 | ��Խ��ϴ� ��ȸ�����ϴ� \r\n" + 
                        " �� kyy**** | 2019.04.24 10:32 \r\n" +  
                        "�ڡڡڡڡ� 10 | ���� ���������� ��ȭ�Դϴ�. �ðܿ� ���� \r\n" + 
                        " �� wer**** | 2019.04.24 10:35 \r\n" +  
                        "�ڡڡڡ١� 8 | ����ÿ �ƾƴ��� �� �̻ڳ׿�^^ \r\n" + 
                        " �� poi**** | 2019.04.24 10:37 \r\n" +  
                        "�ڡڡڡڡ� 10 | ��� ���� �ʾҴ� ��������� ������ ������ \r\n" + 
                        " �� qswd**** | 2019.04.24 10:38 \r\n" +  
                        "�ڡڡڡڡ� 10 | ��ȭ�� ���� ������ �����Ѵ�. �̰Ǹ����̶�� \r\n" + 
                        " �� qwd**** | 2019.04.24 10:38 \r\n" +  
                        "�ڡڡڡڡ� 10 | �αٰŸ����Դٰ� ������ ���Ʊ��� �����.\r\n" + 
                        " �� irnyt**** | 2019.04.24 10:39 \r\n" +  
                        "�ڡڡڡڡ� 10 | �̿�ȭ�� 2�� 3������ �Ʊ������� �����Դϴ�.^^ \r\n" + 
                        " �� qcds**** | 2019.04.24 10:45 \r\n" +  
                        "�ڡڡڡڡ� 10 | �� �ϰ��̿����� � �µ��� �ٲ������� .. �ְ� \r\n" + 
                        " �� avde**** | 2019.04.24 10:47 \r\n" +  
                        "�ڡڡڡڡ� 10 | �����մϴ�. ����������� ��ȭ \r\n" + 
                        " �� qrb**** | 2019.04.24 10:50 \r\n" +  
                        "�ڡڡڡڡ� 10 | ���������� �̰����� ��ü ���� \r\n" + 
                        " �� ueg**** | 2019.04.24 10:57 \r\n" +
                        "�ڡڡڡڡ� 10 |  �ٽú�����մ¿�ȭ..������ů\r\n" + 
                        " �� irnyt**** | 2019.04.24 10:39 \r\n" +  
                        "�ڡڡڡڡ� 10 | ������ ����� ���ƿ� ���������� ����� ����Ʈ ���� \r\n" + 
                        " �� qcds**** | 2019.04.24 10:45 \r\n" +  
                        "�ڡڡڡڡ� 10 | ��¥ ����̶�¸��ۿ� �ȳ��ɴϴ�... \r\n" + 
                        " �� avde**** | 2019.04.24 10:47 \r\n" +  
                        "�ڡڡڡڡ� 10 | �� �޸��������� �������� �����ȴ� \r\n" + 
                        " �� qrb**** | 2019.04.24 10:50 \r\n" +  
                        "�ڡڡڡڡ� 10 | ������ȭ�׿� �����ѿ�ȭ�׿� \r\n" + 
                        " �� ueg**** | 2019.04.24 10:57 \r\n" 
                  );

            explain.setEditable(false);
         }
      });



      JButton back = new JButton("�ڷΰ���");
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