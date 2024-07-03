package com.javaex.ex01;

public class Ex08 {
	
	
	public static void main(String[]args) {
		
		int no01 = 3;
		float no02 = 2.2f;
		// 3(int) --> 3.0(float) 변경 3.0 + 2.2 자동형변환
		System.out.println(no01+no02);
		
		
		float result01 = no01 + no02;
		System.out.println(result01);
	
		
		char c = 'a';
		int i = 12;
		System.out.println(c+i);
		
		
		//강제형변환
		// 실수 --> 정수 (소수점 없어짐)
		double var01 = 13.212;
		int var02 = (int)var01;
		System.out.println(var02);
		
		// 정수 --> 실수 
		int var03 = 123;
		double var04 = (double)var03;
		System.out.println(var04);
		
		
		
		
	}

}
