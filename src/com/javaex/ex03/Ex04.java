package com.javaex.ex03;

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		System.out.print("근무시간:");
//		int time = sc.nextInt();
//        
//		if (time <= 8) {
//			System.out.println("임금은 " + (time * 10000) + "원 입니다.");
//		} else {
//			System.out.println("임금은 " + ((time * 10000) + ((time - 8) * 2000)) + "원 입니다.");
//		}
	    
		System.out.println("근무시간:");
		int time = sc.nextInt();
		
		int pay;
		pay = time*10000;
		
		if (time <= 8) {
			System.out.println();
		}

		sc.close();

	}
}