package com.javaex.ex01;

public class Ex07 {

	public static void main(String[]args) {
		
		
		double pi = 3.14;
		double result01 = pi*5*5;
		System.out.println(result01);
		
		//pi값 변
		pi = 3.1415925;
		double result02 = pi*5*5;
		System.out.println(result02);
		
		//상수final사용 PI값 변경X
		final double PI = 3.14;
		double result03 = PI*5*5;
		System.out.println(result03);
		
		
	}
}
