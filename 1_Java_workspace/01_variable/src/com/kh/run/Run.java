package com.kh.run;

import com.kh.practice1.func.VariablePractice1;
import com.kh.practice1.func.VariablePractice2;
import com.kh.practice1.func.VariablePractice3;
import com.kh.practice1.func.VariablePractice4;

import com.kh.variable.A_Variable;
//import com.kh.variable.B_Constant;
import com.kh.variable.C_Cast;
//import com.kh.variable.D_Print;

public class Run {  //���� Ŭ����
	public static void main(String[] args) {
		//��� Ŭ����(A_Variable) �˸��� �����
		//com.kh.variable.A_Variable av = new com.kh.variable.A_Variable();
		//�̷��� ��Ű�� ��� ����� ��� �ִ� A_Variable ���� �� �� ����!
		
		A_Variable av = new A_Variable();
		av.declareVariable();
		//av.initVariable();
		
//		B_Constant bc = new B_Constant();
//		bc.finalConstant();
		
		//C_Cast cc = new C_Cast(); 
		//cc.rule1();
		
		//D_Print dp = new D_Print();
		//dp.printlnExample();
		//dp.printExample();
		//dp.printfExample();
		
//		E_KeyboardInput eki = new E_KeyboardInput();
//		eki.input2();
		
		VariablePractice1 vp = new VariablePractice1();
		//vp.print();
		
		VariablePractice2 vp2 = new VariablePractice2();
		//vp2.calculate();
		
		VariablePractice3 vp3 = new VariablePractice3();
		//vp3.method();
		
		VariablePractice4 vp4 = new VariablePractice4();
		//vp4.munja();
	}
}
