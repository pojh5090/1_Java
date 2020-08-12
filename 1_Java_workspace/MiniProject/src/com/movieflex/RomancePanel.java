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

public class RomancePanel extends JPanel{
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
   public RomancePanel(JFrame frame4) {
      
      this.frame = frame4;
      
      frame4.setTitle("��ο�ȭ");
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
      
       //���� �ҳ�ô�
       panel1 = new JPanel();
       ImageIcon actIcon1 = new ImageIcon("images/r_my.jpg");
       act1 = new JButton();
       act1.setSize(200,200);
       act1.setBorder(line);            
       act1.addMouseListener(me);
       panel1.setBackground(Color.black);
       panel1.add(act1);
       panel1.setBounds(100, 150, 200, 210);      
       int offset1 = act1.getInsets().left;
       act1.setIcon(resizeIcon(actIcon1, act1.getWidth() - offset1, act1.getHeight() - offset1));
       
       //��Ʈ��
       panel2 = new JPanel();
       ImageIcon actIcon2 = new ImageIcon("images/r_note.jpg");
       act2 = new JButton();
       act2.setSize(200,200);
       act2.setBorder(line);            
       act2.addMouseListener(me);
       panel2.setBackground(Color.black);
       panel2.add(act2);
       panel2.setBounds(370, 150, 200, 210);      
       int offset2 = act2.getInsets().left;
       act2.setIcon(resizeIcon(actIcon2, act2.getWidth() - offset2, act2.getHeight() - offset2));
       
       //��󷣵�
       panel3 = new JPanel();
       ImageIcon actIcon3 = new ImageIcon("images/r_lala.jpg");
       act3 = new JButton();
       act3.setSize(200,200);
       act3.setBorder(line);            
       act3.addMouseListener(me);
       panel3.setBackground(Color.black);
       panel3.add(act3);
       panel3.setBounds(650, 150, 200, 210);   
       int offset3 = act3.getInsets().left;
       act3.setIcon(resizeIcon(actIcon3, act3.getWidth() - offset3, act3.getHeight() - offset3));

       //��ٿ� Ÿ��
       panel4 = new JPanel();
       ImageIcon actIcon4 = new ImageIcon("images/r_about.jpg");
       act4 = new JButton();
       act4.setSize(200,200);
       act4.setBorder(line);            
       act4.addMouseListener(me);
       panel4.setBackground(Color.black);
       panel4.add(act4);
       panel4.setBounds(200, 400, 200, 210);   
       int offset4 = act4.getInsets().left;
       act4.setIcon(resizeIcon(actIcon4, act4.getWidth() - offset4, act4.getHeight() - offset4));
       
       //���� ������ ���ϴ�
       panel5 = new JPanel();
       ImageIcon actIcon5 = new ImageIcon("images/r_zigum.jpg");
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
                       "<���� �ҳ�ô�>" + "       "  + "\r\n\r\n" +
                        " ����, �� ������ �߾��� �Ǿ��༭\r\n\r\n" + 
                        " ���ư��� ���� �������(?) ����� ���� �濪��(!)\r\n" + 
                        " 1994�� ��å ���� �밨�ߴ� �������,\r\n" + 
                        " ����ȭ ������ ���� ����� �ҳ� �������š���\r\n" + 
                        " �б��� �ָ���� ����� �ҳ� ����Ÿ�������� \r\n" + 
                        " ù��� �о��ֱ� ����\r\n" 
                      );
                 number = 1;
                explain.setEditable(false);
            }
         });
         
         act2.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                explain.setText("");
                 explain.append("<��Ʈ��>" + "       "  + "\r\n\r\n" +
                         " 17��, ����ơ��� ��� ������ ���ٸ����� ���� ù���� ���Ѵ�.\r\n" + 
                         " ���� �ӵ��� ���ο��� ������� ��.\r\n" + 
                         " �׷��� �̵� �տ� ���� �庮�� ���� �̺��ϰ� �ȴ�.\r\n\r\n" + 
                         " 24��, ���ٸ����� �쿬�� �Ź����� ����ơ��� �ҽ��� ���ϰ�\r\n" + 
                         " ���� �� ���� ù��� �տ���\r\n" + 
                         " �ٽ� �� �� ������ ��ο� ���� �Ǵµ���\r\n\r\n" + 
                         " ���ϰ��� ����, �������� ���� ���, �׸��� ������������\r\n" +
                         " �� ����� ������ ��������� �� �λ��� ������ �λ��Դϴ�\r\n" 
                         );
                 number = 2;  
                 explain.setEditable(false);
                
             }
         });
         
         act3.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                explain.setText("");
                 explain.append("<��󷣵�>" + "       "  + "\r\n\r\n" +
                         " ȲȦ�� ���, ������ ���, �ݷ��� ������\r\n" + 
                         " �� ������ ��� ������ �����Ѵ�!\r\n\r\n" + 
                         " ���� �ٴ� ������� ���� ������ ���� ����󷣵塯.\r\n" + 
                         " ���� �ǾƴϽ�Ʈ �����ٽ������� ��� ������ ���̾ơ�,\r\n" + 
                         " �λ����� ���� ������ ���� ���� �� �����\r\n" + 
                         " �̿ϼ��� ������ ���븦 ������ �����Ѵ�.\r\n" 
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
                         "<��ٿ� Ÿ��>" + "       "  + "\r\n\r\n" +
                         " ���¼ַ� ���� ������ �� ��,  \r\n" + 
                         " �ƹ����κ��� ������� ������ ����� ��� �ȴ�. \r\n" + 
                         " �ٷ� �ð��� �ǵ��� �� �ִ� �ɷ��� �ִٴ� ��! \r\n" + 
                         " �װ��� ��� ��Ʋ���� ���̰ų� ���Ű� �߰ſ� ����� �� ���� ������, \r\n" + 
                         " ����ģ���� ����� �� �� ������.. \r\n\r\n" + 
                         " ���� ���� �������� �� ���� \r\n" + 
                         " �쿬�� ���� ��������� ���� �޸����� ù���� ���ϰ� �ȴ�. \r\n" + 
                         " �׳��� ����� ��� ���� �ڽ��� Ư���� �ɷ��� ������ �����ϴ� ��. \r\n" + 
                         " �޿� �׸��� �׳�� ���ϸ��� �ְ��� ������ ������.\r\n\r\n" +
                         " ������ �׿� �׳��� ����� �Ϻ��������� \r\n" +
                         " ���� �ѷ��� �ֺ� ��Ȳ���� �̹��ϰ� ��������,\r\n" +
                         " ����ġ ���� ��ǵ��� �������� ��Ÿ���� �����ϴµ���\r\n" 
                          );                       
                  number = 4;
                 explain.setEditable(false);                
             
             }
         });
         
         
         act5.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                   explain.setText("");
                   explain.append("<���� ������ ���ϴ�>" + "       "  + "\r\n\r\n" +
                         " ������ ���� �׳డ �ٽ� ���ƿԴ�.\r\n" + 
                         " ��� ����� ���� ä.\r\n" + 
                         " �� ���� �� �ٽ� ���ƿ��ڴٴ� \r\n" + 
                         " �ϱ� ���� ����� ����� ������ ���� �����ơ�.\r\n" + 
                         " �׷κ��� 1�� �� �帶�� ���۵Ǵ� ��� ���� ��,\r\n" + 
                         " ������ ������ ���� �ٸ����� ����� �����ơ��� ��Ÿ����.\r\n" + 
                         " ������ �����ơ��� ���������� �������������� ������� ���Ѵ�.\r\n\r\n" + 
                         " �ڽ��� ������� ���ص� \r\n" + 
                         " �׳డ �翡 �ִٴ� ��Ǹ����� �ູ�� ���� ����������\r\n" + 
                         " �ڽ��� ������� ���ϴ� �׿��� �̾߱Ⱑ �ñ��� �����ơ�.\r\n\r\n" + 
                         " ��ٷ� �ּ���\r\n" + 
                         " ���� ������ ���ϴ�\r\n" 
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
               new BigMy();
            } else if(number == 2) {
               new BigNote();
            } else if(number == 3) {
               new BigLala();
            } else if(number == 4) {
               new BigAbout();
            } else {
               new BigZigum();
            }
         }
            
         });
         
       JButton back = new JButton("�ڷΰ���");
      back.setBounds(80, 700, 100, 40);
      back.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            new MainFrame();
            frame4.dispose();
         }      
      });
      
      frame4.add(scr1);
      frame4.add(panel1);
      frame4.add(panel2);
      frame4.add(panel3);
      frame4.add(panel4);
      frame4.add(panel5);
      frame4.add(back);
      frame4.add(closer);
      frame4.add(this);
   }
   class BigMy extends JFrame {
      public BigMy() {
            setLayout(null);
      
          JPanel BigP1 = new JPanel();
          ImageIcon BigI1 = new ImageIcon("images/r_my.jpg");
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
          
         setTitle("���� �ҳ�ô�");
         setSize(410, 500);      
         setLocationRelativeTo(null);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      

      }
   }
   
   class BigNote extends JFrame {
      public BigNote() {
            setLayout(null);
      
          JPanel BigP2 = new JPanel();
          ImageIcon BigI2 = new ImageIcon("images/r_note.jpg");
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
          
         setTitle("��Ʈ��");
         setSize(410, 500);      
         setLocationRelativeTo(null);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      

      }
   }
   
   class BigLala extends JFrame {
      public BigLala() {
            setLayout(null);
      
          JPanel BigP3 = new JPanel();
          ImageIcon BigI3 = new ImageIcon("images/r_lala.jpg");
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
          
         setTitle("��󷣵�");
         setSize(410, 500);      
         setLocationRelativeTo(null);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      

      }
   }
   
   class BigAbout extends JFrame {
      public BigAbout() {
            setLayout(null);
      
          JPanel BigP4 = new JPanel();
          ImageIcon BigI4 = new ImageIcon("images/r_about.jpg");
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
          
         setTitle("��ٿ� Ÿ��");
         setSize(410, 500);      
         setLocationRelativeTo(null);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      

      }
   }
   
   class BigZigum extends JFrame {
      public BigZigum() {
            setLayout(null);
      
          JPanel BigP5 = new JPanel();
          ImageIcon BigI5 = new ImageIcon("images/r_zigum.jpg");
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
          
         setTitle("���� ������ ���ϴ�");
         setSize(410, 500);      
         setLocationRelativeTo(null);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      

      }
   }

}