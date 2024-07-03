package com.javaex.ex04;

public class Ex04 {

	public static void main(String[] args) {
		
		//바깥쪽 한싸이클
		for(int dan = 2;dan<=9;dan++) {
			//안쪽 먼저 한싸이클 돌고
			for(int i = 1;i<=9;i++) {
				System.out.println(dan+"*"+i+"="+dan*i);
				
			}
		}
		

	}

}
