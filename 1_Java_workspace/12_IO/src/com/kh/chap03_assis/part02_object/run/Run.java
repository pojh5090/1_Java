package com.kh.chap03_assis.part02_object.run;

import com.kh.chap03_assis.part02_object.model.dao.ObjectDAO;

public class Run {

	public static void main(String[] args) {
		ObjectDAO od = new ObjectDAO();
		//od.fileSave();
		od.fileOpen();
	}

}
