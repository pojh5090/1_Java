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

public class ComedyPanel extends JPanel{
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
   
   //��Ʈ
   Font font1 = new Font("NanumGothic", Font.BOLD, 13);
   public int number = 0;
   public ComedyPanel(JFrame frame3) {
      
      this.frame = frame3;
      
      frame3.setTitle("�ڹ̵� ��ȭ");
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
       
       //�ڼ��� ���� ��ư
       JButton closer = new JButton("�ڼ��� ����");
       closer.setFont(font1);
       closer.setBounds(720, 700, 110, 40);
     
       //�׵�
       ImageIcon actIcon1 = new ImageIcon("images/c_ted2.jpg");
       act1 = new JButton();
       act1.setBorder(line);            
       act1.addMouseListener(me);
       act1.setBounds(100, 150, 200, 210);      
       int offset1 = act1.getInsets().left;
       act1.setIcon(resizeIcon(actIcon1, act1.getWidth() - offset1, act1.getHeight() - offset1));
       
       //�̽�����
       ImageIcon actIcon2 = new ImageIcon("images/c_mr.jpg");
       act2 = new JButton();
       act2.setBorder(line);            
       act2.addMouseListener(me);
       act2.setBounds(370, 150, 200, 200);      
       int offset2 = act2.getInsets().left;
       act2.setIcon(resizeIcon(actIcon2, act2.getWidth() - offset2, act2.getHeight() - offset2));
       
       //�õ�
       ImageIcon actIcon3 = new ImageIcon("images/c_sidong.jpg");
       act3 = new JButton();
       act3.setBorder(line);            
       act3.addMouseListener(me);
       act3.setBounds(650, 150, 200, 210);   
       int offset3 = act3.getInsets().left;
       act3.setIcon(resizeIcon(actIcon3, act3.getWidth() - offset3, act3.getHeight() - offset3));

       //������
       ImageIcon actIcon4 = new ImageIcon("images/c_yes.jpg");
       act4 = new JButton();
       act4.setBorder(line);            
       act4.addMouseListener(me);
       act4.setBounds(200, 400, 200, 210);   
       int offset4 = act4.getInsets().left;
       act4.setIcon(resizeIcon(actIcon4, act4.getWidth() - offset4, act4.getHeight() - offset4));
       
       //û�����
       ImageIcon actIcon5 = new ImageIcon("images/c_kyung.jpg");
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
                       "<19���׵�2>" + "       "  + "\r\n\r\n" +
                        " �յ����Ե� �յ� ���ϴ� 8�� ��, \r\n" + 
                        " ���� ũ�������� �ҿ����� ��� �����̰� �� �׵�! \r\n" + 
                        " ������ ��� ����� 30�� ���� \r\n" + 
                        " ö���� ������ ������ �̾�� ����\r\n" + 
                        " �׵尡 �ΰ��� �ƴ϶� ����(?)�̶�� ������ �ǰ�� ��ؿ� ������.\r\n" + 
                        " ��ģ �׵�� ���� �Բ� �ڽ��� �α�(?)�� �����ϱ� ����\r\n" + 
                        " �·� 99.8% ��ȣ�� �縸�ٸ� ã�ư��µ�...\r\n" 
                      );
                number = 1; 
                explain.setEditable(false);
            }
         });
         
         act2.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                explain.setText("");
                 explain.append("<�̽��� ��>" + "       "  + "\r\n\r\n" +
                         " ������ ���� �鸮�� ����,\r\n" + 
                         " ������ ��Ʈ�ʰ� �ٲ��!\r\n\r\n" + 
                         " ���������� ���̽� ��� ����.\r\n" + 
                         " Ư��� �İߵ� VIP ��ȣ �ӹ��� �����ϴ� ��,\r\n" + 
                         " ���۽����� ���� VIP�� �������\r\n" + 
                         " ���󰡻� �°� �������� ���� �鸮�� �����Ѵ�.\r\n" + 
                         " ���ڱ� �̻��� �ൿ�� �ϴ� ���ָ� �ǽ��ϴ� �α���� ������ �ڷ� �ϰ�,  \r\n" + 
                         " ���ִ� ���� �˸��� �Բ� VIP�� ã�� �����µ���\r\n" 
                         );
                 number = 2;   
                 explain.setEditable(false);
                
             }
         });
         
         act3.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                explain.setText("");
                 explain.append("<�õ� >" + "       "  + "\r\n\r\n" +
                         " �λ� �� �־�?\r\n" + 
                         " �ϴ� �ѹ� ��ƺ��� �ž�!\r\n\r\n" + 
                         " '����'���� 1�� 1��������ũ�� ���� ���׾� '����'\r\n" + 
                         " ��ģ '����'(������)�� ���� ���� ���� �ʹٸ� ��ȸ�� �پ�� ��,\r\n" + 
                         " ������ ���� ���ĳ��� '����'��\r\n" + 
                         " �쿬�� ã�� ��ǰ�������� ���ٸ� ������ �ֹ��� '�ż�����'�� ������ �ȴ�.\r\n" + 
                         " ������ ù �λ縦 �����ڸ���, \r\n" + 
                         " �λ� �ִ� ������ �� '�ż�����'�� '����'.\r\n" + 
                         " ���� ������ �� ���� '����'�� ��ǰ�������� ��� ���� �̵��� ����\r\n" + 
                         " ��¥ ������ ������ �Ǵµ�...\r\n"
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
                         "<������>" + "       "  + "\r\n\r\n" +
                         " �λ��� �ٲٴ� ������ ��ħ ��YES��! \r\n" + 
                         " �׷��� �ϴ��� �������� ��YES��? \r\n\r\n" + 
                         " ����ȸ�� ��� ���� Į �˷���  \r\n" + 
                         " ��NO����� ���� �Կ� �ް� ��� �Ż� �������� ����. \r\n" + 
                         " ������ ģ���� ������ ���λ����� �ڸ����α׷����� �����ϸ鼭\r\n" +
                         " ���� �λ��� 180�� �ڹٲ��!  \r\n" + 
                         " ���������� ��� ����� �θ��١��� ���α׷� ��Ģ�� ����  \r\n" +
                         " ��� �Ͽ� ��YES����� ����ϱ�� ����ϰ� \r\n" +
                         " ������ �� ����, �����Ǵ� ���� ��û�������� YES, \r\n" +
                         " ���Ű��� �¶��� ���θ� ���Ͽ��� YES, \r\n" +
                         " ���� �̷��� ��YES�� �ص� �Ǵ� �ɱ�?\r\n" 
                          );                       
                  number = 4; 
                 explain.setEditable(false);                
             
             }
         });
         
         
         act5.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                   explain.setText("");
                   explain.append("<û�����>" + "       "  + "\r\n\r\n" +
                         " ������� ����, ����� å���� �����!\r\n" + 
                         " ���׳� �츮�� ��ƺ��Կ䡱\r\n\r\n" + 
                         " �ǿ��游 ������� ����(�ڼ���) X �̷й�� ������� ��(���ϴ�)\r\n" + 
                         " �ѵ� ���� ģ���� �� ����� ������ ���Դ� �쿬�� ��ġ ����� ����ϰ� �ȴ�\r\n." + 
                         " ����ڴ� ���� �� ��� ��! \r\n" + 
                         " ���ذ� ���� �б����� ��� ��� ��ü ���� ������ �Ű��Ѵ�.\r\n" + 
                         " ������ ������ ������ ������ ���ŷ� \r\n" + 
                         " ����� ���� ����� ��̰� ������ �ʴ� ��Ȳ!\r\n" + 
                         " ���ذ� ���� ���� �߷� �ٴ� ���翡 ������� �ϰ�\r\n" + 
                         " ���� �Ұ����� ��Ȳ�� �����ϰ� �Ǵµ���\r\n" 
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
               new BigTed();
            } else if(number == 2) {
               new BigMr();
            } else if(number == 3) {
               new BigSidong();
            } else if(number == 4) {
               new BigYes();
            } else {
               new BigKyung();
            }
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
      frame3.add(act1);
      frame3.add(act2);
      frame3.add(act3);
      frame3.add(act4);
      frame3.add(act5);
      frame3.add(back);
      frame3.add(closer);
      frame3.add(this);
   }
   class BigTed extends JFrame {
      public BigTed() {
            setLayout(null);
      
          JPanel BigP1 = new JPanel();
          ImageIcon BigI1 = new ImageIcon("images/c_ted2.jpg");
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
          
         setTitle("19�� �׵�2");
         setSize(410, 500);      
         setLocationRelativeTo(null);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      

      }
   }
   
   class BigMr extends JFrame {
      public BigMr() {
            setLayout(null);
      
          JPanel BigP2 = new JPanel();
          ImageIcon BigI2 = new ImageIcon("images/c_mr.jpg");
          JButton BB2 = new JButton();
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
          
         setTitle("�̽��� ��");
         setSize(410, 500);      
         setLocationRelativeTo(null);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      

      }
   }
   
   class BigSidong extends JFrame {
      public BigSidong() {
            setLayout(null);
      
          JPanel BigP3 = new JPanel();
          ImageIcon BigI3 = new ImageIcon("images/c_sidong.jpg");
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
          
         setTitle("�õ�");
         setSize(410, 500);      
         setLocationRelativeTo(null);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      

      }
   }
   
   class BigYes extends JFrame {
      public BigYes() {
            setLayout(null);
      
          JPanel BigP4 = new JPanel();
          ImageIcon BigI4 = new ImageIcon("images/c_yes.jpg");
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
          
         setTitle("������");
         setSize(410, 500);      
         setLocationRelativeTo(null);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      

      }
   }
   
   class BigKyung extends JFrame {
      public BigKyung() {
            setLayout(null);
      
          JPanel BigP5 = new JPanel();
          ImageIcon BigI5 = new ImageIcon("images/c_kyung.jpg");
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
          
         setTitle("û�����");
         setSize(410, 500);      
         setLocationRelativeTo(null);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      

      }
   }

}