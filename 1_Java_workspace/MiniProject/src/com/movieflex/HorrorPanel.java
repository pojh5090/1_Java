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
   //��ư �׵θ�
   private LineBorder line = new LineBorder(Color.black,2,false);
   //���콺 �̺�Ʈ
   private MouseEv me = new MouseEv();
   
   public int number = 0;
   //��Ʈ
   Font font1 = new Font("NanumGothic", Font.BOLD, 13);
   //���� Ȯ�� ��ҵ�
   JLabel age;
   JTextField inputAge;  
   private JFrame ageCheck;
   String birth = "";
   int Ibirth = 0;
   JTextArea explain;
   
   public HorrorPanel(JFrame frame5) {
      
      this.frame = frame5;
      
      frame5.setTitle("���� ��ȭ");
      setSize(900, 900);     
      setBackground(Color.black);      

      JButton act1, act2, act3, act4, act5;
      JPanel panel1, panel2, panel3, panel4, panel5;
      JLabel age;
      
      //���� ���� ��
      Font font2 = new Font("���� ���", Font.BOLD, 13);
      
      age = new JLabel("19�� �̸� �����Ұ�");
      age.setFont(font2);
      age.setForeground(Color.red);

      explain = new JTextArea();
      Font font1 = new Font("NanumGothic",Font.BOLD,13);
      explain.setBackground(new Color(197,192,189));
      JScrollPane scr1 = new JScrollPane(explain,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
      scr1.setBounds(200,650,500,150);
      explain.setEditable(false);
      explain.setFont(font1);
      
      //�ڼ��� ���� ��ư
      JButton closer = new JButton("�ڼ��� ����");
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
       
       //�̺�Ʈ ó��-��ȭ ����
         act1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               explain.setText("");
                explain.append(
                       "<�ֳ���>" + "       "  + "\r\n\r\n" +
                       "���������� 1�� ��, ���ֳ������� �־���...\r\n" + 
                       "-1971�� ���� �κ�, \r\n"
                       + "�ε� ���Ϸ��忡 �����ϴ� ��� �������� �Ͼ ���ڿ��� ��� �ذ�\r\n" + 
                       " -1968�� ���� �κ�, ���ֳ����� ��� �ذ�\r\n" + 
                       " -1967�� Ķ�����Ͼ��� ��ȥ�κ�, ���ֳ����� ����\r\n" + 
                       " \r\n" + 
                       " ..������������ 1�� ��!\r\n" + 
                       "���� �ӽ� ���� �Ƴ� �̾ƿ��� ����� �巹���� ���� ��Ƽ�� ������ �����Ѵ�. \r\n"
                       + "�׳� ��, ���� �κΰ� ħ���� ���� �̾Ƹ� �����Ѵ�. \r\n"
                       + "������ ���� ���� �߰ߵ� �� ������ ���� ���� ���� �׾��ִ� ����. \r\n"
                       + "���ο��Լ� �귯���� �ǰ� ������ �󱼷� ������µ��� �� �޿� �� ��,\r\n"
                       + "�źδ��� �⵵�� �� ���� �Ƿ��� �ٽ����ٴ� ���ֳ������� �׷��� �¾��...");
                 number = 1;
                explain.setEditable(false);
            }
         });
         
         act2.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                explain.setText("");
                 explain.append("<������>" + "       "  + "\r\n\r\n" +
                        "���� �� ���������� �̰��� ��ȭ��!\r\n" + 
                        "1971�� �ε� ���Ϸ���, �ظ�����.\r\n"
                        + "��� ������ �޿� �׸��� �� ������ �̻縦 ����.\r\n" + 
                        "���� 1863�⿡ �� ������ �Ͼ ������ ���� ����� ���� ������.\r\n" + 
                        "���� �� ���Ŀ� �Ͼ ���� ������ ��ǿ� ���ؼ��� ���� ���ߴ�.\r\n" + 
                        "\r\n"
                        + " ���ݱ����¡�");
                 number = 2;   
                 explain.setEditable(false);
                
             }
         });
         
         act3.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                explain.setText("");
                 explain.append("<�Ҹ�>" + "       "  + "\r\n\r\n" +
                        "�� �ϳ��� ����� ���۵ȴ�. 504ȣ, �ʴ���� ���� �װ� �´�.\r\n" + 
                        "�� �渱 ���� ����Ʈ�� �̻����� �����Ѵ�.\r\n"
                        + "�̱� ����Ʈ 504ȣ�� ���� ������ û���� �̸��� ����(���� ��).\r\n"
                        + "�״� 30�� �� 504ȣ���� ������ ������ ����� �𸥴�.\r\n"
                        + "\r\n"
                        + "���� ���ڿ� ���� ���� �系�� ������ ���̰� ���� ���̸� ������ ä\r\n"
                        + "�����ƴٴ� ���Ż縦 ���� �˰� �ִ� ����� ���� �ʴ�.\r\n"
                        + "�Դٰ� 504ȣ���� �� �� �Ҽ��� ���°� ȭ��� ����� �Ҿ���.\r\n" + 
                        "������ ������ ��Ÿ���ϴ� ���� ����(������ ��)�� �˰� �ȴ�.\r\n"
                        + "510ȣ�� ��� ���������� �Ƹ�����Ʈ�� �ϴ� �׳�\r\n"
                        + "������ �ڽ��� ������ �� �������� �����Ѵ�.\r\n"
                        + "\r\n"
                        + "�׷��� ��� �� ������ �ýÿ����� ��ġ�� ���ƿ� ����,\r\n"
                        + "������ �Ӹ��� �Ǹ� �긮�� ������ ���� ��ü�� �����ش�.\r\n"
                        + "������ ������ ���� ��ü�� ���� ���� �� ���������.\r\n"
                        + "\r\n"
                        + "�׷��� 504ȣ�� ��� ���ִ� ���⼭ ������ �ʴ´�.\r\n"
                        + "\r\n"
                        + "505ȣ�� ��� �Ҽ����� �������� ���Ѵ�.\r\n"
                        + "30�� �� �װ����� ���� ������ ��ü�� ���� �߰ߵ��� �ʾҴٰ�.\r\n"
                        + "�����ι����� �׵鵵 �ǽ����� ���� ���� ���ݾ� ���⿡ �۽��δ�. \r\n");
                 number = 3; 
                 explain.setEditable(false);
             }
         });
         
         act4.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {  
                 explain.setText("");
                  explain.append("<������>" + "       "  + "\r\n\r\n" +
                          "���� ü���� ���� �������� ���ź�����\r\n" + 
                          "1979�� ȯ�� 42���� ���� �ڻ�� �������� ���� ����,\r\n" + 
                          " ������ �������� �ѷ����� ������ ���ź�������\r\n" + 
                          " ����ü���� ���� 7���� �����\r\n" + 
                          " \r\n" + 
                          " �����, ���� ġ���, �����, ������ �ʴ� 402ȣ��\r\n" + 
                          " ������ ��ü�� ��Ƴ��� ����\r\n" + 
                          " ���� ���θ� �Կ��ϱ� �����ϴ� ����鿡��\r\n" + 
                          " ��� ���� �����ϰ� ���������� �ϵ���\r\n" + 
                          " ������ �������� ���� �ϴµ���\r\n" + 
                          " \r\n" + 
                          " ���� ����� ������ �ݵ�� ������ �ִ�.\r\n" + 
                          " �Ҹ� ��ġ�� �������� ���ź����� �� ��ü�� ü���϶�!");                       
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
         
         //�ڼ��� ���� �̺�Ʈ ó��
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
      
      JButton back = new JButton("�ڷΰ���");
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
          
         setTitle("�ֳ���");
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
          
         setTitle("�Ҹ�");
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
          
         setTitle("��ƴ���");
         setSize(410, 500);      
         setLocationRelativeTo(null);
         setVisible(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);      

      }
   }  
   class AgeFrame extends JFrame {
      public AgeFrame() {
            setLayout(null);
            
            age = new JLabel("�������");
            add(age);
         
            inputAge = new JTextField();
            add(inputAge);
         
            JButton btn1 = new JButton("Ȯ��");
            add(btn1);
            
            JLabel example = new JLabel("�� ) 19940312");
            example.setForeground(Color.red);
            add(example);

            age.setBounds(20, 10, 70, 40);
            inputAge.setBounds(95, 10, 120, 30);
            btn1.setBounds(230, 10, 70, 30);
            example.setBounds(95, 40, 100, 30);
         
            setTitle("���� Ȯ�� â");
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
 	                  JOptionPane.showMessageDialog(null, "��ȭ ������ �����մϴ�!", "MovieFlex", JOptionPane.DEFAULT_OPTION);
 	                  setVisible(false);    
 	                  explain.append("<��ƴ���>" + "       "  + "\r\n\r\n" +
 	                                "���� ���� ���ϴ� ��ͺ��� �δ� �� ���̿�\r\n" + 
 	                                " �׷� ���̵��� Ȧ�� ��Ű�� ��� �ӿ����� ��ư��� ����.\r\n" + 
 	                                " ��� �� 3���� ���ο� ������ �׳��� ���� ã�ƿԴ�.\r\n" + 
 	                                " \r\n" + 
 	                                " ���� ��� ��� ���� �Ⱬ�� �ӻ���.\r\n" + 
 	                                " �ƹ��� ���� �濡�� �귯������ �ǾƳ� �Ҹ�.\r\n" + 
 	                                " �� ������ ������� ���̵��� �߼Ҹ���\r\n" + 
 	                                " \r\n" + 
 	                                " �׵��� �� ���� ���� ��,\r\n" + 
 	                                " ������ �ϵ��� �Ͼ�� �����ߴ�!");   
 	                        explain.setEditable(false);
 	                        return;
 	               } else if(Ibirth >= 20030101) {
 	                  JOptionPane.showMessageDialog(null, "��ȭ ������ �Ұ����� �����Դϴ�.", "MovieFlex", JOptionPane.ERROR_MESSAGE);
 	                  setVisible(false);
 	                  explain.setText("���� �Ұ�");   
 	                  explain.setEditable(false);
 	                  return;
 	               }  else {           
// 	            	   JOptionPane.showMessageDialog(null, "��������� �Է����ּ���!", "MovieFlex", JOptionPane.WARNING_MESSAGE);
// 		               setVisible(false); 
 	               }
            	} catch (NumberFormatException e1) {
            		JOptionPane.showMessageDialog(null, "��������� �Է����ּ���!", "MovieFlex", JOptionPane.WARNING_MESSAGE); 
            	}
	          }            
         });
      }
   }
}