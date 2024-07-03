package com.javaex.ex05;

public class Ex01 {

	public static void main(String[] args) {
		
		int[] uos = new int[6];
		uos[0] = 3;
		uos[1] = 6;
		uos[2] = 9;
		uos[3] = 12;
		uos[4] = 15;
		uos[5] = 18;
		                     //끝까지 
		for(int a = 0; a<uos.length; a++) {
			System.out.print(uos[a]+"   ");
		}System.out.println("");
		
		int[] nos = new int[6];
		nos[0] = 3;
		nos[1] = 6;
		nos[2] = 9;
		nos[3] = 12;
		nos[4] = 15;
		nos[5] = 18;
		
		for(int i = 0; i<=5; i++) {
			System.out.print(nos[i]+"   ");
		
		}System.out.println("");
		char[] c = new char[5];
		c[0] = 's';
		c[1] = 'i';
		c[2] = 'b';
		c[3] = 'a';
		c[4] = 'l';
		
		
		for(int i = 0; i<=4; i++) {
			System.out.print(c[i]);
		
		}

	}

}
