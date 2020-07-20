package com.kh.example.chap06_method.run;

import com.kh.example.chap05_constructor.model.vo.User;
import com.kh.example.chap06_method.controller.MethodController;
import com.kh.example.chap06_method.model.vo.Trainee;

public class Run {

	public static void main(String[] args) {
		MethodController mc = new MethodController();
		//mc.method1();
		
//		System.out.println(mc.method2());
//		int result = mc.method2();
//		System.out.println(result);
		
		//mc.method3(3, 4);		
//		System.out.println(mc.method4(10, 5));
//		
//		int[] resultArr = mc.method5();
//		System.out.println("Run resultArr : " + resultArr);
//		for(int i = 0; i < resultArr.length; i++) {
//			System.out.print(resultArr[i] + " ");
//		}
//		System.out.println();
		
		User resultUser = mc.method6();  //얕은 복사
		System.out.println("Run reusltUser : " + resultUser);
		
		Trainee tt = new Trainee();
		System.out.println(tt.inform());
		tt.setName("강진희");
		tt.setTime("오후");
		tt.setClassRoom('G');
		Trainee.setScore(80.0);  //이렇게 써주기~
		System.out.println(tt.inform());
	}	
}
