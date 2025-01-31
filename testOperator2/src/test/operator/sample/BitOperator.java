package test.operator.sample;

/**
 * 비트연산자 : 메모리 변수 공간에 기록된 비트값 (2진수: 2로 나눈 나머지로 표현되는 수, 0, 1)을 다루는 연산자임
 * 단, 자바는 메모리를 직접 손 댈 수 없음 => 비트연산자 큰 의미 없음
 * 비트 연산자는 정수에만 사용 할 수 있음
 * ~(틸드, tield) : 비트 반전 연산자, 단항연산자임 (2순위) , bit 1 = > bit 0, bit 0 => bit 1 로 바꾸는 연산자임
 * 					정수의 1의 보수를 구할 수 있음
 *  <<. >>, >>> (자바에서만 제공) : 쉬프트 연산자, 이항연산자임( 5순위) 
 *  				정수 << 자리이동값, 정수>>자리이동값,  정수 >>> 자리이동값
 *  				기록된 정수의 비트값을 왼쪽또는 오른쪽으로 자리이동시킴
 *  				왼쪽으로 이동시 오른쪽의 빈칸은 양수/음수 상관없이  bit 0 을 채움
 *  				오른쪽으로 이동시 왼쪽 빈칸은 >>  는 부호비트를 채움(0:양수, 1: 음수)
 *  				오른쪽으로 이동시 왼쪽 빈칸은 >>> 는 무조건 0 채움
 *  &(and, 8순위), ^(xor, 9순위),  |(or, 10순위)  : 비트 논리 연산자 (이항연산자임)
 *  정수 & 정수 :  두 정수의 각 자리의 비트값들이 연산됨. 둘다 1이면 1. 나머지는 모두 0임
 *  정수 ^ 정수 :  두 비트가 같으면 0, 다르면 1임
 *  정수 | 정수 : 둘 중 하나만 1이면 1임, 둘 다 0이면 0임
 */
public class BitOperator {
	// 메모리의 비트 (0,1)을 정수 0 또는 1로 만들어서 출력
	
	public void testBit () {
		int a = 12;
		int b = 20;
		
		//같은 클래스 안의 멤버들끼리는 그냥 이름으로 호출(실행)함 
		printBit(a);   // 밑에는 메소드 만든것. 위에는 메소드 만든것 사용임.
		// 메소드 사용(호출, call)시 괄호 안에 변수 사용은, 해당 메소드로 변수의 값을 전달한다는 의미임
		// a 전달인자라고함.  
		printBit(~a);  // 해당 정수의 1의 보수를 구함
		// 정수의 0의 보수를 구할 때는 
		printBit(~a + 1); 
		
		printBit(b);
		printBit(b >> 2);   //  메모리에 기록된 비트 전체를 오른쪽으로 2칸 자리이동시킴
		// 오른쪽으로 2칸자리이동시켜라
		printBit(b<< 3); // 메모리에 기록된 비트 전체를 왼쪽으로 3칸 자리이동시킴  ( *8일것임)
		// 자바는 쉬프트 연산자를 산술연산으로 사용하고 있음
		
		// >>> 자바에서 추가된 연산자임, 비트 오른쪽으로 자리이동은 동일함
		//       비어지는 왼쪽에 양수/음수 상관없이 무조건 0 채움
		int c = -20;
		printBit(c);
		printBit(c >>3);
		printBit(c >>>3);
		
		printBit(a);
		printBit(b);
		System.out.println("--------------------------------------------------------------");
		printBit (a&b);  // 두 정수의 최소공배수 구함
		printBit(a^b);
		printBit(a |b);
		
		return;   // 반환값 없는 return문은 생략할 수 있음, 컴파일시 자동추가됨
	}
	
	
	// print Bit는 public 아니고 private로. 클래스 안에서만 쓸것이므로
	// private(비공개) : 작성된 클래스 안에서 사용할 수 있음, 클래스 밖에서는 사용 불가능임
	private void printBit(int num) {
		// 메소드 괄호안에서 만든 변수는 프린트 하는쪽에서 전달 받겠다는 이야기임
		// 정수를 받아서 받은 num방에 있는걸 비트1은 정수1로. 비트 0은 정수 0으로 만들어 출력시킨다임
		System.out.print(num + " : "); 
		
		for(int i = 31; i >= 0; i--) {
			System.out.print(num >> i & 1);  // bit 1을 정수 1로, bit 0 을 정수 0으로 바꿈
		}
		System.out.println();
		return; // 반환되는 값 없음, void표기함
	}	

}
