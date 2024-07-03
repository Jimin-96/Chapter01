package com.javaex.ex01;

//클래스 
public class Ex12 {
	
	//매소드  
	public static void main(String[]args) {
		
		int a = 5;
		int b = 7;
		
		// and(&&) 하나라도 false가 있으면 false
		System.out.println("&&연산자------------------------");
		System.out.println(true && true); // T && T --> T
		System.out.println(true && false); // T && F --> F
		System.out.println(false && true); // F && T --> F
		System.out.println(false && false); // F && F --> F
		
		
		// or(||) 하나라도 true가 있으면 true
		System.out.println("||연산자------------------------");
		System.out.println(true || true); // T || T --> T
		System.out.println(true || false); // T || F --> T
		System.out.println(false || true); // F || T --> T
		System.out.println(false || false); // F|| F --> F
		
		
		// not(!) !는 부정의 의미 (1 아니다 , != 같지 않다 )
		System.out.println("!연산자-------------------------");
		System.out.println(!true); // !T --> F
		System.out.println(!false); // !F --> T
		
		System.out.println("응용---------------------------");
		boolean result = a<b && a>b; // 5<7(t) && 5>7(f) (T&&F --> F)
		System.out.println(result);
		
	
		System.out.println(true && false || true); // T&&F -> F, F||T = T
		
		
	}
}
