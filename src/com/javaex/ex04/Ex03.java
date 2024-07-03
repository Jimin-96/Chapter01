package com.javaex.ex04;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		
		for(int i = 1;i<=10;i++) {
			
			//같은이름을 품을 수 있다
			sum = sum+i;
			System.out.println(i+" 까지의 합은"+sum);
			
			
		}
		
			
		sc.close();
	}

}
