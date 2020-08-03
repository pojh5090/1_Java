package com.kh.example.chap02_tcp.part01_sendMsg.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
//	TCP(Transmission Control Protocol)
//		������ Ŭ���̾�Ʈ ���� 1:1 ���� ���(���� ������ ��������)
//		������ ���� �� ���� ����, Ŭ���̾�Ʈ�� ���� �Ǿ��־�� ��
//		    ==> ������ ���� ����Ǿ� Ŭ���̾�Ʈ�� ��û�� ��ٸ�
//		    ==> ����, Ŭ���̾�Ʈ�� ���α׷��� ���� ����
//		    
//		������ ���� ������ ����ǰ� ���� ���θ� �Ǵ��Ͽ� �ս� �� ������
//		��Ŷ�� ������ �ʿ䰡 ���� UDP���� �ӵ��� ����
//		
//		
//	ServerSocket
//		��Ʈ�� ����Ǿ� �ܺ� ��û�� ��ٸ��� ��û�� ������ Socket�����Ͽ�
//		���ϰ� ���ϰ��� ����� �̷�������� ��
//		�� ��Ʈ�� �� ServerSocket�� ���� ����
//		
//	Socket
//		���μ��� �� ��� ���
//		InputStream/OutputStream ����
//			�� ��Ʈ���� ���� ���μ��� ���� ���(�����)�� �̷����
	
	public void serverStart() {
//		������ TCP���α׷��� ����
//		1) ���� ��Ʈ��ȣ ����
//		2) ������ ���� ��ü ���� �� ��Ʈ�� ����
//		3) Ŭ���̾�Ʈ �ʿ��� ���� ��û�� ���� ��ٸ�
//		4) ���� ��û�� ���� ���� �� �ش� Ŭ���̾�Ʈ�� ���� ���� ��ü ����
//		5) ����� Ŭ���̾�Ʈ�� ����� ��Ʈ�� ����
//		6) ������Ʈ���� ���� ���� ����
//		7) ��Ʈ���� ���� �а� ����
//		8) ��� ����
		
		
//		1) ���� ��Ʈ��ȣ ����		
		int port = 8500;
		// 0 ~ 65535 ���� ���� ���� 2000���� ���ĺ��� ��� ����
		
//		2) ������ ���� ��ü ���� �� ��Ʈ�� ����
		try {
			ServerSocket server = new ServerSocket();
			
//			3) Ŭ���̾�Ʈ �ʿ��� ���� ��û�� ���� ��ٸ�
			System.out.println("Ŭ���̾�Ʈ�� ��û�� ��ٸ��� �ֽ��ϴ�.");
			
//			4) ���� ��û�� ���� ���� �� �ش� Ŭ���̾�Ʈ�� ���� ���� ��ü ����
			Socket client = server.accept();   //Client Socket(in ����)
			
			String clientIP = client.getInetAddress().getHostAddress();
			System.out.println(clientIP + "�� ������ ��û��...");
			
//			5) ����� Ŭ���̾�Ʈ�� ����� ��Ʈ�� ����
			InputStream input = client.getInputStream();
			OutputStream output = client.getOutputStream();
			
//			6) ������Ʈ���� ���� ���� ����
			InputStreamReader isr = new InputStreamReader(input);
			BufferedReader br = new BufferedReader(isr);
//			BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
			PrintWriter pw = new PrintWriter(output);
			
//			7) ��Ʈ���� ���� �а� ����
			//Ŭ���̾�Ʈ -> ������ ������ �޽��� �о��
			String message = br.readLine();  
			System.out.println(clientIP + "�� ���� �޽��� : " + message);
			
			//���� -> Ŭ���̾�Ʈ�� �޽��� ����
			pw.println("������ �ݰ����ϴ�.");
			pw.flush();  //->�����鼭 ������ ��Ƶ� ������ ������			
			
//			8) ��� ����
			pw.close();
			br.close();
			output.close();
			input.close();	
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}
