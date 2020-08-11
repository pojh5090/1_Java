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
import javax.xml.soap.Text;

public class HorrorPanel extends JPanel{
   private JFrame frame;
   private static Icon resizeIcon(Icon actIcon1, int resizedWidth, int resizedHeight) {
      Image img = ((ImageIcon) actIcon1).getImage();
       Image resizedImage = img.getScaledInstance(resizedWidth,  resizedHeight, java.awt.Image.SCALE_SMOOTH);
       return new ImageIcon(resizedImage);
   }   
   public HorrorPanel(JFrame frame5) {
      
      this.frame = frame5;
      
      frame5.setTitle("���� ��ȭ");
      setSize(900, 900);     
      setBackground(Color.black);      

      JButton act1, act2, act3, act4, act5;
      JPanel panel1, panel2, panel3, panel4, panel5;

      JTextArea explain = new JTextArea();
      Font font1 = new Font("NanumGothic",Font.BOLD,13);
      explain.setBackground(new Color(197,192,189));
      JScrollPane scr1 = new JScrollPane(explain,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
       scr1.setBounds(200,650,500,150);
       explain.setEditable(false);
       explain.setFont(font1);
      
       panel1 = new JPanel();
       ImageIcon actIcon1 = new ImageIcon("images/s_anna.jpg");
       act1 = new JButton();
       act1.setBackground(Color.black);
       act1.setSize(200,200);
       panel1.add(act1);
       panel1.setBounds(100, 150, 200, 200);      
       int offset1 = act1.getInsets().left;
       act1.setIcon(resizeIcon(actIcon1, act1.getWidth() - offset1, act1.getHeight() - offset1));
       
       
       panel2 = new JPanel();
       ImageIcon actIcon2 = new ImageIcon("images/s_con.jpg");
       act2 = new JButton();
       act2.setBackground(Color.black);
       act2.setSize(200,200);
       panel2.add(act2);
       panel2.setBounds(370, 150, 200, 200);      
       int offset2 = act2.getInsets().left;
       act2.setIcon(resizeIcon(actIcon2, act2.getWidth() - offset2, act2.getHeight() - offset2));
       
      
       panel3 = new JPanel();
       ImageIcon actIcon3 = new ImageIcon("images/s_creep.jpg");
       act3 = new JButton();
       act3.setBackground(Color.black);
       act3.setSize(200,200);
       panel3.add(act3);
       panel3.setBounds(650, 150, 200, 200);   
       int offset3 = act3.getInsets().left;
       act3.setIcon(resizeIcon(actIcon3, act3.getWidth() - offset3, act3.getHeight() - offset3));

       
       panel4 = new JPanel();
       ImageIcon actIcon4 = new ImageIcon("images/s_gon.jpg");
       act4 = new JButton();
       act4.setBackground(Color.black);
       act4.setSize(200,200);
       panel4.add(act4);
       panel4.setBounds(200, 400, 200, 200);   
       int offset4 = act4.getInsets().left;
       act4.setIcon(resizeIcon(actIcon4, act4.getWidth() - offset4, act4.getHeight() - offset4));
       
      
       panel5 = new JPanel();
       ImageIcon actIcon5 = new ImageIcon("images/s_others.jpg");
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
        
                 explain.setEditable(false);                
             
             }
         });
         
         
         act5.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                   explain.setText("");
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
             }
        });

       
       JButton back = new JButton("�ڷΰ���");
      back.setBounds(10, 800, 100, 40);
      back.addActionListener(new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent e) {
            new MainFrame();
            frame5.dispose();
         }      
      });
      
      frame5.add(scr1);
      frame5.add(panel1);
      frame5.add(panel2);
      frame5.add(panel3);
      frame5.add(panel4);
      frame5.add(panel5);
      frame5.add(back);
      frame5.add(this);
   }

}
