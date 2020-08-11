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
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class ActionPanel extends JPanel{
   private JFrame frame;
   private static Icon resizeIcon(Icon actIcon1, int resizedWidth, int resizedHeight) {
      Image img = ((ImageIcon) actIcon1).getImage();
       Image resizedImage = img.getScaledInstance(resizedWidth,  resizedHeight, java.awt.Image.SCALE_SMOOTH);
       return new ImageIcon(resizedImage);
   }   
   public ActionPanel(JFrame frame2) {
      
      this.frame = frame2;
      
      frame2.setTitle("�׼� ��ȭ");
      setSize(900, 900);   
      setBackground(Color.black);      

      JButton act1, act2, act3, act4, act5;
      JPanel panel1, panel2, panel3, panel4, panel5;
         
      //��Ʈ
      Font font1 = new Font("NanumGothic", Font.BOLD, 13);
      
      JTextArea explain = new JTextArea();
      explain.setBackground(new Color(197,192,189));
      JScrollPane scr1 = new JScrollPane(explain,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
      scr1.setBounds(200,650,500,150);
      explain.setEditable(false);
      explain.setFont(font1); 
      
      //�ڼ��� ���� ��ư
      JButton closer = new JButton("�ڼ��� ����");
      closer.setFont(font1);
      closer.setBounds(720, 700, 120, 50);
      
       //�����
       panel1 = new JPanel();
       ImageIcon actIcon1 = new ImageIcon("images/a_avengers.jpg");
       act1 = new JButton();
       act1.setBackground(Color.black);
       act1.setSize(200,200);
       panel1.add(act1);
       panel1.setBounds(100, 150, 200, 200);      
       int offset1 = act1.getInsets().left;
       act1.setIcon(resizeIcon(actIcon1, act1.getWidth() - offset1, act1.getHeight() - offset1));
       
       //������
       panel2 = new JPanel();
       ImageIcon actIcon2 = new ImageIcon("images/a_berlin.jpg");
       act2 = new JButton();
       act2.setBackground(Color.black);
       act2.setSize(200,200);
       panel2.add(act2);
       panel2.setBounds(370, 150, 200, 200);      
       int offset2 = act2.getInsets().left;
       act2.setIcon(resizeIcon(actIcon2, act2.getWidth() - offset2, act2.getHeight() - offset2));
       
       //�г��� ����
       panel3 = new JPanel();
       ImageIcon actIcon3 = new ImageIcon("images/a_bunno.jpg");
       act3 = new JButton();
       act3.setBackground(Color.black);
       act3.setSize(200,200);
       panel3.add(act3);
       panel3.setBounds(650, 150, 200, 200);   
       int offset3 = act3.getInsets().left;
       act3.setIcon(resizeIcon(actIcon3, act3.getWidth() - offset3, act3.getHeight() - offset3));

       //�̼����ļ���
       panel4 = new JPanel();
       ImageIcon actIcon4 = new ImageIcon("images/a_mission.jpg");
       act4 = new JButton();
       act4.setBackground(Color.black);
       act4.setSize(200,200);
       panel4.add(act4);
       panel4.setBounds(200, 400, 200, 200);   
       int offset4 = act4.getInsets().left;
       act4.setIcon(resizeIcon(actIcon4, act4.getWidth() - offset4, act4.getHeight() - offset4));
       
       //����׶���
       panel5 = new JPanel();
       ImageIcon actIcon5 = new ImageIcon("images/a_under.jpg");
       act5 = new JButton();
       act5.setBackground(Color.black);
       act5.setSize(200,200);
       panel5.add(act5);
       panel5.setBounds(500, 400, 200, 200);  
       int offset5 = act5.getInsets().left;
       act5.setIcon(resizeIcon(actIcon5, act5.getWidth() - offset5, act5.getHeight() - offset5));
       
       //�̺�Ʈ ó��-��ȭ ����
         act1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               explain.setText("");
                explain.append(
                       "<����� ���Ǵ�Ƽ ��>" + "       "  + "\r\n\r\n" +
                       "���Ǵ�Ƽ �� ���� ���ݸ� ��Ƴ��� ����\r\n" + 
                        " ������ ����� �� �����\r\n" + 
                        " ���� ���� �׵��� ���� ��� ���� �ɾ���!\r\n" + 
                        " \r\n" + 
                        " ������ �����\r\n" + 
                        " ����� �ٲ� ������ ������ ��������!"); 
                explain.setEditable(false);
            }
         });
         
         act2.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                explain.setText("");
                 explain.append("<������>" + "       "  + "\r\n\r\n" +
                        " �Ŵ��� ������ ���� ������ ����� ���� ������\r\n" + 
                        " �� ���� �����ϴ� ������ ��� �������� \r\n" + 
                        " �ҹ�����ŷ���Ҹ� �����ϴ� �� �����Ҹ�,\r\n" + 
                        " �������� �������� �ʴ� �ϸ�\r\n" + 
                        " ����Ʈ�� ��п�� ǥ������ ���縦 �˰� �ȴ�.\r\n\r\n" + 
                        " ���� ��ü�� �������� ���� �ڸ� �Ѵ� ��������\r\n" + 
                         " �� ���Ŀ� ������\r\n" + 
                         " ��û�� ������ ���� �˰� �Ǹ鼭\r\n"  +
                         " ������ �� ���� ���⿡ ������.\r\n\r\n"  +
                         " ������ ����� ������ ������ �ָ���\r\n"  +
                         " ���θ� �Ѵ� �̵��� �������� �߰���!\r\n\r\n" + 
                         " �ʴ��� �׼� ������Ʈ�� ��������!\r\n\r\n" 
                         );
                   
                 explain.setEditable(false);
                
             }
         });
         
         act3.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                explain.setText("");
                 explain.append("<�г��� ����>" + "       "  + "\r\n\r\n" +
                         " ����ģ ����� �ǿ� ���� �� ȯ���ء�\r\n\r\n" + 
                         " ���ٸ� ���̽� �Ƿ��� ���� ���\r\n" + 
                         " �ڵ���, ������ �ӵ�, ������ ���̽��� ���� ������ �����̴�.\r\n" + 
                         " ����� �״� ���� �������� ������ �����ϱ� ����\r\n" + 
                         " ���Ĺ���� �ϰ� ���̽��� �����ϸ� ���� ������ �ִ�.\r\n\r\n" + 
                         " ��Ʈ��Ʈ ���̽��� ������ ��� ��\r\n" + 
                         " ����� �ִ� ���̽� ���� �������� �������� ������ ������ �ǰ�\r\n" + 
                         " �Ǹ� ���� ���� �� ���̽��� ������ ���� �����Ѵ�. \r\n\r\n" +
                         " ����� ��� ���� ��ٴ� \r\n" +
                         " ���̽��� �����ϱ�� �����ϰ�  \r\n" +
                         " ����õ���� ���迡 ���� �鿩���� �Ǵµ��� \r\n"
                         );
                   
                 explain.setEditable(false);
             }
         });
         
         act4.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {  
                  explain.setText("");
                  explain.append(
                         "<�̼� ���ļ���>" + "       "  + "\r\n\r\n" +
                        " �������� �ٹ��⸦ ��ã�� ���� ����õ���� ���� ��, \r\n" + 
                        " ���� ��Ʈ(�� ũ����)�� �ӹ��� �����ϰ�, \r\n" + 
                        " ������ ����� ���ϴ� ������ �Ѵ�. \r\n" + 
                        " ����, �ٹ���� ������ ���ʶ߸����� ����� �׷������� �տ� �Ѿ��. \r\n\r\n" + 
                        
                        " ���踦 �����ų �� ����� ���� ����  \r\n" + 
                        " ���� �ְ� �����̱��, IMF�� ���� ��Ʈ�� \r\n" + 
                        " ���� ������� ������ ���̹�, �߾������� CIA�� ��� �����  \r\n" + 
                        
                        " ������ ������ �ξ�߸� �Ѵ�. \r\n\r\n" + 
                        " �̺��� �� �Ұ����� �̼��� ������! \r\n" + 
                        " ���� �ִ� �Ը�, �ְ� �׼��� ����϶�!\r\n" 
                          );                       
                  
                 explain.setEditable(false);                
             
             }
         });
         
         
         act5.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                   explain.setText("");
                   explain.append("<����׶���>" + "       "  + "\r\n\r\n" +
                        " ����׶����� ��� ���� �ڼ� ����� ���� ���� �︸���� ���ڰ� �ȴ�.\r\n" + 
                         " ����Ȱ���� �Ϸ� �����⽺ź�� ���ٰ� \r\n" + 
                         " �ΰ��ο��� ���������� �����ϴ� ������ �ι����� ������ ���� �Ǵµ�!\r\n\r\n" + 
                         " �׸��Ͽ� ���� ����� �߶� ���� �ڱⰡ ���� �� ó�� �ٹ̰�\r\n" + 
                         " ���� ���� ������ ������� ������ �ȴ�.\r\n\r\n" + 
                         " �� ������� ���� ���������� ���� �ڵ��̴�.\r\n\r\n" + 
                         " 4�� ��\r\n" + 
                         " ���� �ڱ��� ��ȹ�� ��õ�ϰ� �Ǵµ�...\r\n"                        
                         );
                   
                   explain.setEditable(false);
             }
        });
         
         
      //�ڼ��� ���� �̺�Ʈ ó��
      closer.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			if(explain.getText().equals("�����")) {
				createAven();
			}
		}
    	  
      });
       
      JButton back = new JButton("�ڷΰ���");
      back.setBounds(10, 800, 100, 40);
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
   
   public void createAven() {
	   JInternalFrame ChildWin = new JInternalFrame("�����", true, true, true, true);
	   ChildWin.setBackground(Color.pink);
	   ChildWin.setSize(500, 500);
	   
	   ChildWin.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
   }

}