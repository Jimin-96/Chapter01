package com.javaex.ex01;

public class Ex10 {
	public static void main(String[] args) {

		// 대입연산자
		int a = 7;
		int b = 2;
		System.out.println(a);
		System.out.println(b);
		System.out.println("--------------------");

		// 산술연산자
		int sum = a + b;
		System.out.println(sum);
		System.out.println(a + b);// +
		System.out.println(a - b);// -
		System.out.println(a * b);// *
		System.out.println(a / b);// /->몫(정수/정수여서 몫이 정수로 표기되었음. 자료형에 맞춰 몫은 다르게 나올 수 있음.)
		System.out.println(a % b);// %->나머지

		// 산술연산자->자세히
		System.out.println(7 / 2); // 3
		System.out.println(7.0 / 2); // 3.5
		System.out.println(7.0 / 2.0); // 3.5

		System.out.println("--------------------");

		// 부호연산자
		int var = -3;
		int pVar = +var; // +(-3) --> 3
		int mVar = -var; // -(-3) --> 3
		System.out.println(var);
		System.out.println(pVar);
		System.out.println(mVar);

		System.out.println("--------------------");

		// 증감연산자
		System.out.println(a); // 7
		System.out.println(++a); // 7 --> 8 1올림
		System.out.println(a); // 8 값을 출력

		System.out.println(b); // 2
		System.out.println(--b); // 2 --> 1 1내림
		System.out.println(b); // 1 값을 출력

		System.out.println(a);
		System.out.println(a++);
		System.out.println(a);
		
		
		
		int c = 5;
		System.out.println(++c*2); //12
		System.out.println(c); //6
		
		int d = 5;
		System.out.println(d++*2); //10
		System.out.println(d); //6

	}

}
