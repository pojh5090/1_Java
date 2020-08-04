package com.kh.example.chap02_layout.view;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class D_CardLayout extends JFrame{
	public D_CardLayout() {
		super("D_CardLayout");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(300, 200, 500, 500);
		
		// CardLayout
		// : Panel�� �̿��ؼ� ī�� ���� ���ĳ���(�̺�Ʈ�� �ٸ� ���� ���̰� �����ؾ� ��)
		CardLayout card = new CardLayout();
		setLayout(card);
		
		// �г� �����
		// JPanel�� �����̳��� ������ ����(�ٸ� ������Ʈ���� ���� �� �ֱ� ����)
		JPanel card1 = new JPanel();
		JPanel card2 = new JPanel();
		JPanel card3 = new JPanel();
		
		// �гο� ���� ����
		card1.setBackground(Color.yellow);
		card2.setBackground(Color.green);
//		card3.setBackground(new Color(50, 100, 100)); //�̷��� RGB�����ε� ����
		card3.setBackground(Color.pink);
		
		// �гο� ��(���̺�) �߰�
		card1.add(new JLabel("Card1"));
		card2.add(new JLabel("Card2"));
		card3.add(new JLabel("Card3"));
		
		add(card1);
		add(card2);
		add(card3);
		
		// �гο� �̺�Ʈ �߰�
		card1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton() == 1) { //��Ŭ��
					card.next(card1.getParent());
				} else if(e.getButton() == 3) { //��Ŭ��
					card.previous(card1.getParent());
				}
				super.mouseClicked(e);
			}
		});
		
		card2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton() == 1) { //��Ŭ��
					card.next(card2.getParent());
				} else if(e.getButton() == 3) { //��Ŭ��
					card.previous(card2.getParent());
				}
				super.mouseClicked(e);
			}
		});
		
		card3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton() == 1) { //��Ŭ��
					card.next(card3.getParent());
				} else if(e.getButton() == 3) { //��Ŭ��
					card.previous(card3.getParent());
				}
				super.mouseClicked(e);
			}
		});
		
		setVisible(true);
	}
}
