package com.kh.example.chap01_container.view;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
								//��� �޾Ƽ� �غ���
public class JFrameView1 extends JFrame{
	public JFrameView1() {
//		super("�̷� ����� �ֽ��ϴ�.");   //->������ �̸� ����
		this.setSize(800, 500);
		setVisible(true);  //���� ���� this �Ⱥٿ��� �ȴ�!
		setDefaultCloseOperation(EXIT_ON_CLOSE); //�ݱ� ��ư ������ ���������� �����°�
		// �� �ΰ��� �� �ʼ�!
		
		//������ ���� ��Ÿ����
//		setLocation(300, 200);
		
		//������� ��ǥ �ѹ���
		setBounds(300, 200, 800, 500);
		
		//�̸� �������ֱ�
		setTitle("My First Frame");
		
		//������ �ٲ��ֱ�
		try {
			setIconImage(ImageIO.read(new File("image/icon.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//ũ�� ������ϰڴ�
		setResizable(false);
		
	}
}
