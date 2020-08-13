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
   //��ư �׵θ�
   private LineBorder line = new LineBorder(Color.black,2,false);
   //���콺 �̺�Ʈ
   private MouseEv me = new MouseEv();
   
   public int number = 0;
   //��Ʈ
   Font font1 = new Font("NanumGothic", Font.BOLD, 13);
   public ActionPanel(JFrame frame2) {
      
      this.frame = frame2;
      
      frame2.setTitle("�׼� ��ȭ");
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
      
      //�ڼ��� ���� ��ư
      JButton closer = new JButton("�ڼ��� ����");
      closer.setFont(font1);
      closer.setBounds(720, 700, 110, 40);
      
       //�����
       ImageIcon actIcon1 = new ImageIcon("images/a_avengers.jpg");
       act1 = new JButton();
       act1.setBorder(line);            
       act1.addMouseListener(me);
       act1.setBounds(100, 150, 200, 210);      
       int offset1 = act1.getInsets().left;
       act1.setIcon(resizeIcon(actIcon1, act1.getWidth() - offset1, act1.getHeight() - offset1));
       
       //������
       ImageIcon actIcon2 = new ImageIcon("images/a_berlin.jpg");
       act2 = new JButton();
       act2.setBorder(line);            
       act2.addMouseListener(me);
       act2.setBounds(370, 150, 200, 210);      
       int offset2 = act2.getInsets().left;
       act2.setIcon(resizeIcon(actIcon2, act2.getWidth() - offset2, act2.getHeight() - offset2));
       
       //�г��� ����
       ImageIcon actIcon3 = new ImageIcon("images/a_bunno.jpg");
       act3 = new JButton();
       act3.setBorder(line);            
       act3.addMouseListener(me);
       act3.setBounds(650, 150, 200, 210);   
       int offset3 = act3.getInsets().left;
       act3.setIcon(resizeIcon(actIcon3, act3.getWidth() - offset3, act3.getHeight() - offset3));

       //�̼����ļ���
       ImageIcon actIcon4 = new ImageIcon("images/a_mission.jpg");
       act4 = new JButton();
       act4.setSize(200,200);
       act4.setBorder(line);            
       act4.addMouseListener(me);
       act4.setBounds(200, 400, 200, 210);   
       int offset4 = act4.getInsets().left;
       act4.setIcon(resizeIcon(actIcon4, act4.getWidth() - offset4, act4.getHeight() - offset4));
       
       //����׶���
       ImageIcon actIcon5 = new ImageIcon("images/a_under.jpg");
       act5 = new JButton();
       act5.setBorder(line);            
       act5.addMouseListener(me);
       act5.setBounds(500, 400, 200, 210);  
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
                number = 1;
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
                 number = 2;
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
                 number = 3;
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
                  number = 4; 
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
                   number = 5;
                   explain.setEditable(false);
             }
        });
         
         
      //�ڼ��� ���� �̺�Ʈ ó��
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
       
      JButton back = new JButton("�ڷΰ���");
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
          
          JLabel inform = new JLabel("���� ������ �ݱ�");
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
          
         setTitle("�����");
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
          
          JLabel inform = new JLabel("���� ������ �ݱ�");
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
          
         setTitle("������");
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
          
          JLabel inform = new JLabel("���� ������ �ݱ�");
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
          
         setTitle("�г��� ����");
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
          
          JLabel inform = new JLabel("���� ������ �ݱ�");
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
          
         setTitle("�̼����ļ���");
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
          
          JLabel inform = new JLabel("���� ������ �ݱ�");
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
          
         setTitle("����׶���");
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