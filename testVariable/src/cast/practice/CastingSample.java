package cast.practice;

import java.util.Scanner;

public class CastingSample {
	public void printUniCode() {
		Scanner sc = new Scanner(System.in);

		System.out.print("문자 입력 : ");
		char ch = sc.nextLine().charAt(0);
		// 공백 입력 받고 싶음 nextLine으로 바꾼다
		System.out.print(ch + " is unicode : " + (int) ch);

	}
	public void calculatorScore() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 : " );
		double lang = sc.nextDouble();
		System.out.print("영어 : ");
		double eng = sc.nextDouble();
		System.out.print("수학 : ");
		double math = sc.nextDouble();
		
		int total = (int)(lang + eng + math);
		int avg = (int)((lang + eng + math)/3);
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg );
	
	}
	
	public void printBitCount(){
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int value = sc.nextInt();

				// static 붙은 애들은 class 이름.으로 쓴다.  :  Integer.bitCount(value)
		System.out.println( value 
				+ "의 2진수에 포함된 1의 갯수 : " 
				+ Integer.bitCount(value) + "개");
		
		// 프로그래밍에서는 한 문장은 한 line에 기록하는것이 원칙임
		// 자바는 한 문장을 여러 줄로 끊어서 작성해도 됨	
		
	}
	
	// 자동 형편봔 확인횽
	public void autoCasting() {
		// 계산원칙1 :  자료형이 같은 것끼리만 대입 가능
		int num =125;
		double dnum = 3.3;
		// 원칙이 지켜지지 않을 때 형변환 필요함
		// 자동형변환 되는 경우 1 : 큰 자료형 변수방에 작은 자료형 값이ㅣ 대입될 때 
		double pay = 4570000;  // 8바이트 double 변수방에 4바이트 정수가 대입되는 경우
		// int 4570000 --- >double 4570000.0 으로 변환됨  -- >  대입됨 (원칙1 지킴)
		
		// 계산원칙 2 :  같은 자료형끼리만 계산 가능
		System.out.println("계산 결과 : " + (num+dnum)); // int + double (원칙 위배됨)
		// 자동형변환 되는 경우 2 : 메모리할당 큰 자료형 값으로 자동 형변환됨
		// int + double --- >  double 로 바뀜 + double --- > double 결과가 나옴
		//125+3.3 ---> 125.0 +3.3 ---> 158.3
		
		System.out.println("pay : " + pay);
	
	}
	
	// 강제(명시적) 형변환 확인용
	public void testCasting() {
		int a = Integer.MAX_VALUE;  //2147483647
		int b = Integer.MAX_VALUE;  //2147483647
		
		//계산원칙 3 : 계산의 결과도 같은 자료형이어야 함
		int result = a + b; // 정수 오버플로우 적용됨 : -2가 됨
		//long result2 = a_+b; // long 변수 <= 계산결과 int가 대입됨
		long result2 = (long)a+b;   // 자료형이 다르면 큰걸로 바뀌므로, b도 자동으로 따라 long형으로 바뀌므로 한개만 바꾸기
		// long결과 = long + long 이어야 함
		System.out.println("result: " + result);		
		System.out.println("result: " + result2);
	}
	
	// byte, short 자료형 값 계산 결과는 자바가 무조건 int가 되게 하였음
	public void testCasting2() {
		byte b1 = 12;
		byte b2 = 20;
	//	byte result = b1 + b2;
		// 왜 에러가 날까??  type 이 mismatch 라는데 왜??
		// 해결방법은 byte형으로 casting해라.  아니면 result를 int로 바꿔라.
		byte result =(byte)( b1 + b2);  // byte + byte => 결과는 int임 (자바가 정한 규칙임)
		int result2 = b1+b2;
		
		short s1 = 123;
		short s2 = 234;
		short result3 =(short)( s1+s2); // s1+s2 은똑같이 에러남. short연산결과가 int가 되는거지. 
		int result4 = s1 + s2;
		
		System.out.println("result2 : " + result2);
		System.out.println("result4 : " + result4);		
	
	}
	
	// char <=> int 서로 형변환 가능함
	// 문자가 바이트나 쇼트 형변환 못함!!!!!!
	// 자바는 유니코드(unicode) 문자셋 사용함 : 글자 1개가 2바이트임.  2바이트 = 16비트 
	//근데 얘가 정수하고 달라요.  정수 16비트랑. 범위가 달라요.  
	//근데 유니코드 정수 범위 : 0 ~ 65535   : 문자의 정수는 음수를 취급하지 않습니다. 
				// 음수를 양수로 변환했기 때문에 이렇게 나온것. : unsigned (자바는 사용하지 않아요)
	// 정수(음수, 0, 양수) 2바이트의 값의 범위 : -32768 ~ 0 ~32767
	public void testUnicode() {
		Scanner sc = new Scanner(System.in);
		System.out.print("유니코드 정수 입력(0~65535) :    ");
		int code = sc.nextInt();
		System.out.println("unicode " + code + " --> 문자 :  "  + (char)code);
	}
}
