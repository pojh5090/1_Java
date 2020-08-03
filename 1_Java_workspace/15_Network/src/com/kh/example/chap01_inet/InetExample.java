package com.kh.example.chap01_inet;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetExample {

	public static void main(String[] args) {
		try {
			InetAddress localIP = InetAddress.getLocalHost(); //static �޼ҵ� (Ŭ�����̸�.�޼ҵ�)
			//���� ȣ��Ʈ�� Host��� IP�ּ� ��ȯ
			
			System.out.println("�� PC�� : " + localIP.getHostName());
			System.out.println("�� IP : " + localIP.getHostAddress());
			
			InetAddress ieiIP = InetAddress.getByName("www.iei.or.kr"); //������ ���� ���� IP�ּ� ����
			System.out.println("iei ���� �� : " + ieiIP.getHostName());
			System.out.println("iei ���� IP : " + ieiIP.getHostAddress());
			
			InetAddress[] googleIPs = InetAddress.getAllByName("www.google.com");
			System.out.println("���� IP ���� : " + googleIPs.length);
			for(InetAddress ip : googleIPs) {
				System.out.println(ip.getHostAddress());
			}
			
			InetAddress[] naverIPs = InetAddress.getAllByName("www.naver.com");
			System.out.println("���̹� IP ���� : " + naverIPs.length);
			for(InetAddress ip : naverIPs) {
				System.out.println(ip.getHostAddress());
			}
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}
}
