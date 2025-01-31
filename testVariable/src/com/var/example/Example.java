package com.var.example;

import java.util.Scanner;

public class Example {


	public void example1() {
		Scanner sc = new Scanner(System.in);
	
		System.out.print("첫번째 정수 : " );
		int num1 = sc.nextInt();
		System.out.print("두번째 정수 : "  );
		int num2 = sc.nextInt();
		System.out.println("더하기 결과 : " + (num1 +num2)  );
		System.out.println("빼기 결과 : " + (num1 - num2)  );
		System.out.println("곱하기 결과 : " + (num1 * num2)  );
		System.out.println("나누기한 몫 : " + (num1 / num2)  );
		System.out.println("나누기한  나머지 : " + (num1 % num2)  );

		// 연습2번

}
	public void example2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로 : ");
		double width = sc.nextDouble();
		System.out.print("세로 : ");
		double height = sc.nextDouble();
		
		System.out.println("면적 : "+ (width*height));
		System.out.println("둘레 : "+((width+height)*2));
		
	}
	
	public void example3() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하시오 : ");
		String str = sc.next();
		//	char ch1 = str.charAt(0);
		//	char ch2 = str.charAt(1);
		//	char ch3 = str.charAt(2);
		System.out.println("첫번째문자 : " + str.charAt(0));
		System.out.println("두번째문자 : " + str.charAt(1));
		System.out.println("세번째문자 : " + str.charAt(2));
		
	//	System.out.println("첫번째문자 : " + ch1);
	//	System.out.println("두번째문자 : " + ch2);
	//	System.out.println("세번째문자 : " + ch3);
		
	}
	
	public void inputSungjuk() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("학년 : ");	
		int year = sc.nextInt();
		System.out.print("반 : ");		
		int cls = sc.nextInt();
		System.out.print("번호 : ");
		int num = sc.nextInt();
		System.out.print("성별(남/여) : ");
		char gender = sc.next().charAt(0);
		System.out.print("점수(소숫점아래첫째자리까지입력 : ");
		double score =sc.nextDouble();
		
		System.out.println(year+"학년 "+cls+ "반 "+num +"번 "+name+ " "+ gender+"학생의 "+ " 점수는" + score);
		
		
	}
	
}
