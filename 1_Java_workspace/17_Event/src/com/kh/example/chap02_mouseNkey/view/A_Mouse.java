package com.kh.example.chap02_mouseNkey.view;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class A_Mouse extends JFrame implements MouseListener, MouseMotionListener {
	
	public A_Mouse() {
		setSize(300, 200);
		
		JPanel panel = new JPanel();
//		panel.addMouseListener(this);  //이벤트 연결
		panel.addMouseMotionListener(this);
		
		add(panel);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public void display(String s, MouseEvent e) {
		System.out.println(s + " x = " + e.getX() + ", y = " + e.getY());
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		display("Mouse clicked (# of clicks : " + e.getClickCount() + ")", e);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		display("Mouse pressed (# of clicks : " + e.getClickCount() + ")", e);		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		display("Mouse released (# of clicks : " + e.getClickCount() + ")", e);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		display("Mouse enter", e);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		display("Mouse exited", e);
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		display("Mouse dragged", e);
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		display("Mouse moved", e);
	}
}
