package com.javaex.ex02;

import java.util.Scanner;

//클래스 
public class Ex04 {

	// 매소드
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("이름을 입력해주세요.");
		System.out.print("이름:");
		String name = sc.nextLine();
		
		System.out.println("나이를 입력해주세요");
		System.out.print("나이:");
		int age = sc.nextInt();
		
		sc.hasNextLine(); // 오류를 방지하기 위한 개행
		
		System.out.println("키를 입력해주세요");
		System.out.print("키:");
		int tol = sc.nextInt();
		
		System.out.println("당신의 이름은 "+name+" 나이는 "+age+" 키는 "+tol+" 입니다. ");

		sc.close();

	}

}
