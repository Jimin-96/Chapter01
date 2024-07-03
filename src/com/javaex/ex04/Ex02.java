package com.javaex.ex04;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
//		
//		int dan;
//		int i = 1;
//		
//		System.out.println("단을 입력해주세요.");
//		System.out.print("단");
//		dan = sc.nextInt();
//		
//		while (i<10) {
//			System.out.println(dan+" * "+i+" = "+dan*i);
//			i++;
//		}
		
		int time = 1;
		int dan = sc.nextInt();
		
		//초기화 증감식 조건식
		for(int i=0;i<9;i++) {
			System.out.println(dan+" * "+time+" = "+dan*time);
			time++;
		}
		
		sc.close();
	
	}

}
