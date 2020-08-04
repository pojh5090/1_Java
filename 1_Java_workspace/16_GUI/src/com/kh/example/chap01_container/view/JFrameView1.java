package com.kh.example.chap01_container.view;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
								//상속 받아서 해보자
public class JFrameView1 extends JFrame{
	public JFrameView1() {
//		super("이런 방법도 있습니다.");   //->프레임 이름 지정
		this.setSize(800, 500);
		setVisible(true);  //여기 굳이 this 안붙여도 된다!
		setDefaultCloseOperation(EXIT_ON_CLOSE); //닫기 버튼 누르면 정상적으로 끝내는거
		// 위 두개는 꼭 필수!
		
		//프레임 어디로 나타날까
//		setLocation(300, 200);
		
		//사이즈랑 좌표 한번에
		setBounds(300, 200, 800, 500);
		
		//이름 지정해주기
		setTitle("My First Frame");
		
		//아이콘 바꿔주기
		try {
			setIconImage(ImageIO.read(new File("image/icon.png")));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//크기 변경안하겠다
		setResizable(false);
		
	}
}
