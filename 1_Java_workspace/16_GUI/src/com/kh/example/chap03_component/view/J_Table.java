package com.kh.example.chap03_component.view;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.table.DefaultTableModel;

public class J_Table {
	public J_Table() {
		JFrame frame = new JFrame();
		
		String[] header = {"이름", "자바", "디비", "화면"};
		Object[][] data = {
								{"강건강", 100, 95, 85},
								{"남나눔", 58, 95, 78}, 
								{"도대담", 42, 14, 100}, 
								{"류라라", 65, 72, 55} 
						   };
		// 1. 기본적인 테이블 만들기
//		JTable table = new JTable(data, header);
////		frame.add(table);
//		
//		//스크롤로 크기 지정해주기~
//		JScrollPane scroll = new JScrollPane(table);
//		scroll.setPreferredSize(new Dimension(200, 80));
//		frame.add(scroll);
		
		// 2. DefaultTableModel 사용
//		DefaultTableModel dtm = new DefaultTableModel(data, header);
		DefaultTableModel dtm = new DefaultTableModel(data, header) {
			@Override
			public boolean isCellEditable(int row, int column) {
				return false; //이렇게 해주면 선택만 가능 (수정X)
			}
		};
		JTable table = new JTable(dtm);
		JScrollPane scroll = new JScrollPane(table);
		frame.add(scroll, "North");
		
		// 데이터 (행) 추가
		Object[] addArr = {"문미미", 58, 75, 17};
		dtm.addRow(addArr);
		
		// 행과 열 개수 구하기
		System.out.println(dtm.getRowCount());
		System.out.println(dtm.getColumnCount());
		
		System.out.println(dtm.getColumnName(0)); //열에 대한 이름 가져오기
		
		dtm.removeRow(0); //강건강 없어짐
		
		System.out.println(dtm.getValueAt(1, 2));  //1행 2열의 값 가져오기
		
		dtm.setValueAt(5000, 2, 2);  //2행 2열의 값 5000으로 변경
		
//		table.setRowSelectionInterval(0, 1); //0행~ 1행 선택한 상태로 만들어줌
		
		table.getTableHeader().setReorderingAllowed(false); //열 위치 바뀌지 않도록 고정!
		table.getTableHeader().setResizingAllowed(false);		
//		table.setEnabled(false); 
		
		JPanel select = new JPanel();
		JTextArea ta = new JTextArea();
		select.add(ta);
		frame.add(select, "South");
		
		table.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {				
				int selectRow = table.getSelectedRow(); //몇번째 행 선택했는지 가져오기
				int colNum = table.getColumnCount(); //열의 갯수 알기
				Object[] objArr = new Object[colNum];			
				for(int i = 0; i < colNum; i++) {
					objArr[i] = dtm.getValueAt(selectRow, i);
					   //마지막 열이라면
					if(i == colNum - 1) {
						ta.append(objArr[i] + "\n");
					} else {
						ta.append(objArr[i] + " ");
					}
				}
			}
			@Override
			public void mousePressed(MouseEvent e) {				
				
			}
			@Override
			public void mouseReleased(MouseEvent e) {
						
			}
			@Override
			public void mouseEntered(MouseEvent e) {
								
			}
			@Override
			public void mouseExited(MouseEvent e) {
				
			}
		});
				
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
