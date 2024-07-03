package com.javaex.ex05;

public class Ex03 {

	public static void main(String[] args) {

		int[] intArr = new int[6];
		intArr[0] = (int) (Math.random() * 45) + 1;
		intArr[1] = (int) (Math.random() * 45) + 1;
		intArr[2] = (int) (Math.random() * 45) + 1;
		intArr[3] = (int) (Math.random() * 45) + 1;
		intArr[4] = (int) (Math.random() * 45) + 1;
		intArr[5] = (int) (Math.random() * 45) + 1;

		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + "   ");
		}
		System.out.println("");
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(intArr[i] + "   ");
		}

	}

}
