package ncs.test7;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class ScoreFrame {
	JTextField javaScore, sqlScore, total, average;
	JButton calcBtn;
	public ScoreFrame() {
		
		JFrame frame = new JFrame();
		frame.setSize(400, 350);
		frame.setLayout(null);
		frame.setTitle("                               문제7");	
		LineBorder line = new LineBorder(Color.blue);

		//큰 글씨
		Font font1 = new Font("", Font.BOLD, 40);
		JLabel BigTitle = new JLabel("점수를 입력하세요");
		BigTitle.setFont(font1);
		BigTitle.setBounds(20, 0, 400, 100);
		frame.add(BigTitle);
		
		//자바, SQL 점수입력
		JLabel java = new JLabel("자바:");
		java.setBounds(20, 110, 30, 20 );
		frame.add(java);
		javaScore = new JTextField();
		javaScore.setBounds(60, 110, 100, 20 );
		frame.add(javaScore);
		
		JLabel sql = new JLabel("SQL:");
		sql.setBounds(210, 110, 30, 20 );
		frame.add(sql);
		sqlScore = new JTextField();
		sqlScore.setBounds(250, 110, 100, 20 );
		frame.add(sqlScore);
		
		//계산하기 버튼
		calcBtn = new JButton("계산하기");
		calcBtn.setBounds(150, 180, 100, 30);
		frame.add(calcBtn);
		
		//총점, 평균 출력
		JLabel ltotal = new JLabel("총점:");
		ltotal.setBounds(20, 260, 30, 20);
		frame.add(ltotal);
		total = new JTextField();
		total.setBounds(60, 260, 100, 20);
		frame.add(total);
		
		JLabel aver = new JLabel("평균:");
		aver.setBounds(210, 260, 30, 20);
		frame.add(aver);
		average = new JTextField();
		average.setBounds(250, 260, 100, 20);
		frame.add(average);
		
		calcBtn.addActionListener(new ScoreFrame$ActionHandler());
		
		frame.setForeground(Color.blue);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}	
	
	class ScoreFrame$ActionHandler implements ActionListener{
		@Override
		public void actionPerformed(ActionEvent e) {
			String getJava = javaScore.getText();
			String getSql = sqlScore.getText();
			
			int Ijava = Integer.parseInt(getJava);
			int Isql = Integer.parseInt(getSql);
			
			int totall = Ijava + Isql;
			int aver = (int)((Ijava + Isql) / 2 );
			
			total.setText(Integer.toString(totall));
			average.setText(Integer.toString(aver));
		}
		
	}
}
