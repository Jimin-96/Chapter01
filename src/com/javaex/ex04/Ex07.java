package com.javaex.ex04;

public class Ex07 {

	public static void main(String[] args) {
		
		
		//가상의 y축
		for(int y=1; y<=6;y++) {
			
			//x축 별찍는 횟수
			for(int x=1; x<=y; x++) {
				System.out.print("*");
			}
			System.out.println(""); //줄바꿈
		}

	}

}
