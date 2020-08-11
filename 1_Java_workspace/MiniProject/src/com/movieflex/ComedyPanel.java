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
      
      frame3.setTitle("�ڹ̵� ��ȭ");
      setSize(900, 900);      
      setBackground(Color.black);      

      JButton act1, act2, act3, act4, act5;
      JPanel panel1, panel2, panel3, panel4, panel5;

    //��Ʈ
      Font font1 = new Font("NanumGothic", Font.BOLD, 13);
      
    //TextArea
      JTextArea explain = new JTextArea();
      JScrollPane scr1 = new JScrollPane(explain,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
       scr1.setBounds(200,650,500,150);
       explain.setEditable(false);
       explain.setFont(font1); 
       explain.setBackground(new Color(197,192,189));
     
       //�׵�
       panel1 = new JPanel();
       ImageIcon actIcon1 = new ImageIcon("images/c_ted2.jpg");
       act1 = new JButton();
       act1.setBackground(Color.black);
       act1.setSize(200,200);
       panel1.add(act1);
       panel1.setBounds(100, 150, 200, 200);      
       int offset1 = act1.getInsets().left;
       act1.setIcon(resizeIcon(actIcon1, act1.getWidth() - offset1, act1.getHeight() - offset1));
       
       //�̽�����
       panel2 = new JPanel();
       ImageIcon actIcon2 = new ImageIcon("images/c_mr.jpg");
       act2 = new JButton();
       act2.setBackground(Color.black);
       act2.setSize(200,200);
       panel2.add(act2);
       panel2.setBounds(370, 150, 200, 200);      
       int offset2 = act2.getInsets().left;
       act2.setIcon(resizeIcon(actIcon2, act2.getWidth() - offset2, act2.getHeight() - offset2));
       
       //�õ�
       panel3 = new JPanel();
       ImageIcon actIcon3 = new ImageIcon("images/c_sidong.jpg");
       act3 = new JButton();
       act3.setBackground(Color.black);
       act3.setSize(200,200);
       panel3.add(act3);
       panel3.setBounds(650, 150, 200, 200);   
       int offset3 = act3.getInsets().left;
       act3.setIcon(resizeIcon(actIcon3, act3.getWidth() - offset3, act3.getHeight() - offset3));

       //������
       panel4 = new JPanel();
       ImageIcon actIcon4 = new ImageIcon("images/c_yes.jpg");
       act4 = new JButton();
       act4.setBackground(Color.black);
       act4.setSize(200,200);
       panel4.add(act4);
       panel4.setBounds(200, 400, 200, 200);   
       int offset4 = act4.getInsets().left;
       act4.setIcon(resizeIcon(actIcon4, act4.getWidth() - offset4, act4.getHeight() - offset4));
       
       //û�����
       panel5 = new JPanel();
       ImageIcon actIcon5 = new ImageIcon("images/c_kyung.jpg");
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
                       "<19���׵�2>" + "       "  + "\r\n\r\n" +
                        " �յ����Ե� �յ� ���ϴ� 8�� ��, \r\n" + 
                        " ���� ũ�������� �ҿ����� ��� �����̰� �� �׵�! \r\n" + 
                        " ������ ��� ����� 30�� ���� \r\n" + 
                        " ö���� ������ ������ �̾�� ����\r\n" + 
                        " �׵尡 �ΰ��� �ƴ϶� ����(?)�̶�� ������ �ǰ�� ��ؿ� ������.\r\n" + 
                        " ��ģ �׵�� ���� �Բ� �ڽ��� �α�(?)�� �����ϱ� ����\r\n" + 
                        " �·� 99.8% ��ȣ�� �縸�ٸ� ã�ư��µ�...\r\n" 
                      );
                  
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
                   
                   explain.setEditable(false);
             }
        });

       
       JButton back = new JButton("�ڷΰ���");
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
