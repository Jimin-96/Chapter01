package com.javaex.ex01;

public class Ex09 {
	public static void main(String[]args) {
		
		// 이꼬르 뒤부터 계산 후 앞에 데이터 종류로 적용 
		double v01 = 5/4;
		System.out.println(v01);
		
		// 형변형 후 계산 후 앞에 데이터 종류로 적용 
		double v02 = (double)5/4;
		System.out.println(v02);
		
		double v03 = 5/(double)4;
		System.out.println(v03);
		
		double v04 = (double)5/(double)4;
		System.out.println(v04);
		
		// 정수(int)로 변경 1+1 = 2
		int v05 = (int)1.3+(int)1.8;
		System.out.println(v05);
		
		// 괄호안부터 계산후 3.1을 정수로 바꿈 
		int v06 = (int)(1.3+1.8);
		System.out.println(v06);
		
	}

}
