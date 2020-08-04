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
			// 0) ������ IP�ּҿ� ������ ���� ��Ʈ��ȣ �˾ƾ���!
			int port = 8600;
			String serverIP = InetAddress.getLocalHost().getHostAddress();
			
			// 1) ������ IP�ּҿ� ��Ʈ��ȣ�� �Ű������� �Ͽ� Ŭ���̾�Ʈ�� ���� ��ü�� ����
			Socket socket = new Socket(serverIP, port);
			
			if(socket != null) { //���� �����ߴٸ�
				// 2) �������� ����� ��Ʈ�� ����
				InputStream input = socket.getInputStream();
				OutputStream output = socket.getOutputStream();
				
				// 3) ������Ʈ���� ���� ���� ����
				br = new BufferedReader(new InputStreamReader(input));
				pw = new PrintWriter(output);
				
				Scanner sc = new Scanner(System.in);
				
				do {
					System.out.print("��ȭ �Է� : ");
					String message = sc.nextLine();
					
					// 4) ��Ʈ���� ���� �а� ����
					pw.println(message);
					pw.flush();
					
					if(message.equals("exit")) {
						break;
					}
					
					String serverMsg = br.readLine();
					System.out.println(serverMsg);
				} while(true);
			}	
			// 5) ��� ����
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
