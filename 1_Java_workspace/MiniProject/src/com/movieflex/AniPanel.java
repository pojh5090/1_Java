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

public class AniPanel extends JPanel{
   private JFrame frame;
   private static Icon resizeIcon(Icon actIcon1, int resizedWidth, int resizedHeight) {
      Image img = ((ImageIcon) actIcon1).getImage();
       Image resizedImage = img.getScaledInstance(resizedWidth,  resizedHeight, java.awt.Image.SCALE_SMOOTH);
       return new ImageIcon(resizedImage);
   }   
   //��ư �׵θ�
   private LineBorder line = new LineBorder(Color.black, 2, false);
   //���콺 �̺�Ʈ
   private MouseEv me = new MouseEv();
   
   public int number = 0;
   //��Ʈ
   Font font1 = new Font("NanumGothic", Font.BOLD, 13);
   public AniPanel(JFrame frame3) {
      
      this.frame = frame3;
      
      frame3.setTitle("�ִϸ��̼�");
      setSize(900, 900);   
      setBackground(Color.black);      

      JButton act1, act2, act3, act4, act5;
      JPanel panel1, panel2, panel3, panel4, panel5;
      
      
      //TextArea
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
      
      panel1 = new JPanel();
      ImageIcon actIcon1 = new ImageIcon("images/an_dragon.jpg");
      act1 = new JButton();
      act1.setSize(200,200);
      act1.setBorder(line);            
      act1.addMouseListener(me);
      panel1.setBackground(Color.black);
      panel1.add(act1);
      panel1.setBounds(100, 150, 200, 210);      
      int offset1 = act1.getInsets().left;
      act1.setIcon(resizeIcon(actIcon1, act1.getWidth() - offset1, act1.getHeight() - offset1));
       
       panel2 = new JPanel();
       ImageIcon actIcon2 = new ImageIcon("images/an_kung.jpg");
       act2 = new JButton();
       act2.setSize(200,200);
       act2.setBorder(line);            
       act2.addMouseListener(me);
       panel2.setBackground(Color.black);
       panel2.add(act2);
       panel2.setBounds(370, 150, 200, 210);      
       int offset2 = act2.getInsets().left;
       act2.setIcon(resizeIcon(actIcon2, act2.getWidth() - offset2, act2.getHeight() - offset2));
       
       panel3 = new JPanel();
       ImageIcon actIcon3 = new ImageIcon("images/an_name.jpg");
       act3 = new JButton();
       act3.setSize(200,200);
       act3.setBorder(line);            
       act3.addMouseListener(me);
       panel3.setBackground(Color.black);
       panel3.add(act3);
       panel3.setBounds(650, 150, 200, 210);   
       int offset3 = act3.getInsets().left;
       act3.setIcon(resizeIcon(actIcon3, act3.getWidth() - offset3, act3.getHeight() - offset3));

       panel4 = new JPanel();
       ImageIcon actIcon4 = new ImageIcon("images/an_surek.jpg");
       act4 = new JButton();
       act4.setSize(200,200);
       act4.setBorder(line);            
       act4.addMouseListener(me);
       panel4.setBackground(Color.black);
       panel4.add(act4);
       panel4.setBounds(200, 400, 200, 210);   
       int offset4 = act4.getInsets().left;
       act4.setIcon(resizeIcon(actIcon4, act4.getWidth() - offset4, act4.getHeight() - offset4));
       
       panel5 = new JPanel();
       ImageIcon actIcon5 = new ImageIcon("images/an_zoo.jpg");
       act5 = new JButton();
       act5.setSize(200,200);
       act5.setBorder(line);            
       act5.addMouseListener(me);
       panel5.setBackground(Color.black);
       panel5.add(act5);
       panel5.setBounds(500, 400, 200, 210);  
       int offset5 = act5.getInsets().left;
       act5.setIcon(resizeIcon(actIcon5, act5.getWidth() - offset5, act5.getHeight() - offset5));
       
       //�̺�Ʈ ó��-��ȭ ����
         act1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               explain.setText("");
                explain.append(
                       "<�巡�� ����̱� 3>" + "       "  + "\r\n\r\n" +
                       "������ ���� �׵��� ������ ������ ���۵ȴ�!\r\n" + 
                       "������ ģ�� ���Ű� ���������� Ȱ������\r\n" + 
                       " ����� �巡���� �����ϸ� ��ȭ�Ӱ� ��ư��� ��ũ��.\r\n" + 
                       " ���ο� �巡�� ������Ʈ ǻ����� �Ѿư� ���������� ã�ٰ�\r\n" + 
                       " ������ �巡���� �Ķ���̽� ��������塯�� �쿬�� �߰��ϰ� �ȴ�.\r\n" + 
                       " ������ ��ȭ�� ���, ���� �־��� �巡�� ���� �׸����� ��������\r\n" + 
                       " �巡����� ������ ��ũ���� ��ȭ���� �����ޱ� �����ϴµ���");
                 number = 1; 
                explain.setEditable(false);
            }
         });
         
         act2.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                explain.setText("");
                 explain.append("<��Ǫ�Ҵ� 2>" + "       "  + "\r\n\r\n" +
                             "�׺��� ���ƿ��̴�!\r\n" + 
                             "����� ���ϴ� ���� ���簡 �Ǿ� ������ 5�ι�� �Բ� ��Ǫ�� ��Ű�� �� ��.\r\n"
                             + "������ ���� ����� �ŵ쳪�� ���� ��Ǫ ��ο� ��Ǫ ���ÿ� �����ϴ� ��,\r\n"
                             + "�� ������ ��Ǫ ��ε��� �ϳ� �� �� �����ϰ� �ִٴ� �ҽ��� ��� �ȴ�.\r\n" + 
                             "������ �ٶ��� ������ �ָ��� �Ҹ����� �迡���︮�� ������ �Ҹ��� �� ũ��,\r\n"
                             + "���� ������ ��� �տ����� ���� �� �ߴ� õ������ �Ҵ� ��.\r\n"
                             + "������ �����Ϸ��� ������ ��Ǫ�� ���Ѿ� �Ѵٴ� ������ �̼��� �־�����.\r\n"
                             + "���� ������ 5�ι�� �Բ� ��Ǫ�� ���� ������.\r\n" + "\r\n" +
                             " ���� ���� �� ������ ��к��⿡ �¼� ��Ǫ�� ���ѳ� �� ������?");
                 number = 2;  
                 explain.setEditable(false);
                
             }
         });
         
         act3.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                explain.setText("");
                 explain.append("<���� �̸��� >" + "       "  + "\r\n\r\n" +
                         "���� ���� �� ���� �ʸ�, ã�� �־�\r\n" + 
                         " \r\n" + 
                         " õ�� ���� �ٰ����� ����\r\n" + 
                         " ������ ���۵ȴ�\r\n" + 
                         " \r\n" + 
                         " ���쿡 ��� �ҳ� ��ŸŰ���� �ð� ��� �ҳ� �������ϡ���\r\n" + 
                         " ������ ���� �ڹٲ�� �ű��� ���� �۴�\r\n" + 
                         " ���� ����, ���� ģ����, ���� ǳ���...\r\n" + 
                         " �ݺ��Ǵ� �ް� �귯���� �ð� ��, ��ħ�� ���ݴ´�\r\n" + 
                         " �츮, ���� �ڹٲ� �ž�?\r\n" + 
                         " \r\n" + 
                         " ���� ���� �� ���� �� ���\r\n" + 
                         " �ݵ�� ������ �ϴ� ����� �Ǵ�\r\n" + 
                         " \r\n" + 
                         " ���ο��� ���� �޸� Ȯ���ϸ�\r\n" + 
                         " ���� ģ���� �Ǿ�� ��ŸŰ���� �������ϡ�\r\n" + 
                         " �������ϰ� �� �̻� ���� �ٲ��� ����\r\n" + 
                         " �ڽŵ��� Ư���ϰ� �̾����־����� ������\r\n" + 
                         " ��ŸŰ���� �������ϡ��� ������ ���µ�...\r\n" + 
                         " \r\n" + 
                         " �ذ� ���� ���� ���\r\n" + 
                         " ������ �� �Ǵ� ���\r\n" + 
                         " ���� �̸���?\r\n"
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
                         "<����>" + "       "  + "\r\n\r\n" +
                         "������ �Ƹ��ٿ� ���� �ǿ����� �̳��� �ձ��� ���س� ����.\r\n"
                         + "�׵鵵 �������� �ູ�ϰ� ���...����� �� �������ٵ�!\r\n"
                         + "���� �������Ե� ��ΰ� �ٶ�� ���ǿ����� �ñ�?\r\n"
                         + "�� ������ ����� �ƺ��� �������� �ݺ��Ǵ� �ϻ� ������ ����\r\n"
                         + "����鿡�� ���� �ְ�, ���� ��嵵 ���� �ϴ� �����ο��� ������ �޲۴�.\r\n"
                         + "���Ϸ�� �����ο����ٸ� �׾ ���� ���ھ���, ��Ż�� �޲ٴ� ����\r\n"
                         + "���̳��� ������ �����Ϸ��� �Ǵ� ������ ����! \r\n"
                         + "�׷����� �跫�� �ӾƳѾ ������ ���� �̳��� ���󡯿� �������� ����.\r\n" 
                         + "���� �������� �ٲ����� ����\r\n"
                         + "��ģ ��Ű�� ������ ��ģ ���� ����ϸ� ����� ġ��,\r\n"
                         + "�� �ϳ��� ��� �ǿ����� ����ű�� ������,\r\n"
                         + "��ȭ���� ����̴� �� �̻� ��ȭ�� ���� �ʴ� D������ ����̰� �Ǿ� �ִ�.\r\n"
                         + "ģ����� �ձ�, �ϳ����� ����� ��ã�� ���� ������ ������ �̾߱�!");                       
                  number = 4; 
                 explain.setEditable(false);                
             
             }
         });
         
         
         act5.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                   explain.setText("");
                   explain.append("<�����Ǿ�>" + "       "  + "\r\n\r\n" +
                        "������ ��� ���� ���� 1��, �����Ǿ�\r\n" + 
                        " ���� ���� ��� �߻�!\r\n" + 
                        " ����ġ���� ��� �;���!��\r\n" + 
                        " \r\n" + 
                        " ���� �ְ� ���õ� ������ ��Ÿ���� �ֵ��ϴ� ���� �����Ǿ�.\r\n" + 
                        " �� ���� �ܼ��� ȥ���� ��Ʈ�� ���� ��������� �߻��Ѵ�!\r\n" + 
                        " �����Ǿ� ������ �䳢 ������ �ֵ� ȩ���� 48�ð� �ȿ� ��� �ذ��� ���� ����\r\n" + 
                        " ������ ���� ���� �� ���ϵ忡�� ���� ���縦 �����ϴµ���\r\n" + 
                        " \r\n" + 
                        " ���� ��ġ�� �߰����� �ż��谡 ������!\r\n" 
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
               new BigDragon();
            } else if(number == 2) {
               new BigKung();
            } else if(number == 3) {
               new BigName();
            } else if(number == 4) {
               new BigSurek();
            } else {
               new BigZoo();
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
      frame3.add(panel1);
      frame3.add(panel2);
      frame3.add(panel3);
      frame3.add(panel4);
      frame3.add(panel5);
      frame3.add(back);
      frame3.add(closer);
      frame3.add(this);
   }
   class BigDragon extends JFrame {
      public BigDragon() {
            setLayout(null);
      
          JPanel BigP1 = new JPanel();
          ImageIcon BigI1 = new ImageIcon("images/an_dragon.jpg");
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
          
         setTitle("�巡�� ����̱�3");
         setSize(410, 500);      
         setLocationRelativeTo(null);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      

      }
   }
   
   class BigKung extends JFrame {
      public BigKung() {
            setLayout(null);
      
          JPanel BigP2 = new JPanel();
          ImageIcon BigI2 = new ImageIcon("images/an_kung.jpg");
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
          
         setTitle("��Ǫ�Ҵ�2");
         setSize(410, 500);      
         setLocationRelativeTo(null);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      

      }
   }
   
   class BigName extends JFrame {
      public BigName() {
            setLayout(null);
      
          JPanel BigP3 = new JPanel();
          ImageIcon BigI3 = new ImageIcon("images/an_name.jpg");
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
          
         setTitle("���� �̸���");
         setSize(410, 500);      
         setLocationRelativeTo(null);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      

      }
   }
   
   class BigSurek extends JFrame {
      public BigSurek() {
            setLayout(null);
      
          JPanel BigP4 = new JPanel();
          ImageIcon BigI4 = new ImageIcon("images/an_surek.jpg");
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
          
         setTitle("����");
         setSize(410, 500);      
         setLocationRelativeTo(null);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      

      }
   }
   
   class BigZoo extends JFrame {
      public BigZoo() {
            setLayout(null);
      
          JPanel BigP5 = new JPanel();
          ImageIcon BigI5 = new ImageIcon("images/an_zoo.jpg");
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
          
         setTitle("�����Ǿ�");
         setSize(410, 500);      
         setLocationRelativeTo(null);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      

      }
   }
}