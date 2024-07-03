package com.javaex.ex02;

//클래스 
public class Ex01 {

	// 매소드
	public static void main(String[] args) {

		System.out.println("안녕");
		System.out.println("하세요");

		System.out.print("안녕");
		System.out.println("하세요");

		System.out.println("---------------------------");

		int i = 2345;
		double d = 3.14;
		char c = '한'; // 실제값을 가지고 있다.
		String s = "한"; // 주소를 가지고 있다.
		String str = "굿모닝";
		String name = "박지민";
		

		System.out.println(str + name); // 문자열 나열 
		System.out.println(i+i); // 정수 + 정수 
		System.out.println(i+d); // 정수 + 실수 (자동형변환) 실수 + 실수
		System.out.println(str+i); // 문자열 숫자(정수,실수)-->문자열 나열
		
	    String str2 = str+i; // 문자열 숫자(정수,실수)-->문자열 나열
	    
	    System.out.println(str+"랑"+name);
	    System.out.println(str+" "+name);
	    
	    System.out.print("제 이름은 ");
	    System.out.println(name+"입니다.");
	    
	    System.out.println("제이름은 \""+name+"\"입니다.");
	    System.out.println("제이름은 \\"+name+"\\입니다.");
	    System.out.println("제이름은 /"+name+"/입니다.");
	    
	    
	    System.out.println("제이름은	"+name+"입니다.");
	    System.out.println("제이름은\t"+name+"입니다.");
	    
	    
	    System.out.println("제이름은");
	    System.out.println(name+"입니다.");
	    
	    System.out.println("제이름은\n"+name+"입니다.");
	    
	    
		

	}

}
