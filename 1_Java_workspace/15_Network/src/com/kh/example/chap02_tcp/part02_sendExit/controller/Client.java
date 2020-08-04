package com.kh.example.chap02_tcp.part02_sendExit.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client {
	public void startClient() {
		
		try {
			
			BufferedReader br = null;
			PrintWriter pw = null;
			// 0) 서버의 IP주소와 서버가 정한 포트번호 알아야함!
			int port = 8600;
			String serverIP = InetAddress.getLocalHost().getHostAddress();
			
			// 1) 서버의 IP주소와 포트번호를 매개변수로 하여 클라이언트용 소켓 객체를 생성
			Socket socket = new Socket(serverIP, port);
			
			if(socket != null) { //연결 성공했다면
				// 2) 서버와의 입출력 스트림 생성
				InputStream input = socket.getInputStream();
				OutputStream output = socket.getOutputStream();
				
				// 3) 보조스트림을 통해 성능 개선
				br = new BufferedReader(new InputStreamReader(input));
				pw = new PrintWriter(output);
				
				Scanner sc = new Scanner(System.in);
				
				do {
					System.out.print("대화 입력 : ");
					String message = sc.nextLine();
					
					// 4) 스트림을 통해 읽고 쓰기
					pw.println(message);
					pw.flush();
					
					if(message.equals("exit")) {
						break;
					}
					
					String serverMsg = br.readLine();
					System.out.println(serverMsg);
				} while(true);
			}	
			// 5) 통신 종료
			br.close();
			pw.close();
			socket.close();
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
