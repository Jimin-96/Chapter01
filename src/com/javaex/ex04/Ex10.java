package com.javaex.ex04;

public class Ex10 {
	public static void main(String[]args) {
		
		for(int i=1;i<=10;i++) {
			
			if(i%2==0&&i%3==0) {
				
				//break; //조건 완료시 종료
				continue; //조건 완료시 해당부분만 건너뛰기
			}
			System.out.println(i);
		}
		
		for(int i=1;i<=10;i++) {
			if(i%2==0&&i%3==0) {
			//조건 만족시 아무것도 안함 (코드 비어있음)	
			}else {
			System.out.println(i);
			}
		}
		
		for(int i=1;i<=10;i++) {
			
			if (!(i%2==0&&i%3==0)){
				System.out.println(i);
			}
		}
	}

}
