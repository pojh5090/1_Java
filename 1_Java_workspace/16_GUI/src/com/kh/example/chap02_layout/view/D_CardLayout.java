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
		// : Panel을 이용해서 카드 판을 겹쳐놓음(이벤트로 다른 판이 보이게 설정해야 함)
		CardLayout card = new CardLayout();
		setLayout(card);
		
		// 패널 만들기
		// JPanel은 컨테이너의 성향을 지님(다른 컴포넌트들을 담을 수 있기 때문)
		JPanel card1 = new JPanel();
		JPanel card2 = new JPanel();
		JPanel card3 = new JPanel();
		
		// 패널에 배경색 지정
		card1.setBackground(Color.yellow);
		card2.setBackground(Color.green);
//		card3.setBackground(new Color(50, 100, 100)); //이렇게 RGB값으로도 가능
		card3.setBackground(Color.pink);
		
		// 패널에 라벨(레이블) 추가
		card1.add(new JLabel("Card1"));
		card2.add(new JLabel("Card2"));
		card3.add(new JLabel("Card3"));
		
		add(card1);
		add(card2);
		add(card3);
		
		// 패널에 이벤트 추가
		card1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton() == 1) { //좌클릭
					card.next(card1.getParent());
				} else if(e.getButton() == 3) { //우클릭
					card.previous(card1.getParent());
				}
				super.mouseClicked(e);
			}
		});
		
		card2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton() == 1) { //좌클릭
					card.next(card2.getParent());
				} else if(e.getButton() == 3) { //우클릭
					card.previous(card2.getParent());
				}
				super.mouseClicked(e);
			}
		});
		
		card3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getButton() == 1) { //좌클릭
					card.next(card3.getParent());
				} else if(e.getButton() == 3) { //우클릭
					card.previous(card3.getParent());
				}
				super.mouseClicked(e);
			}
		});
		
		setVisible(true);
	}
}
