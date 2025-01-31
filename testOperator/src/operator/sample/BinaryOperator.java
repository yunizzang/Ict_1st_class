package operator.sample;

import java.util.Scanner;

/*
 * 이항 연산자 (Binary Operator) : operand가 2개 필요한 연산자
 * operand는 계산할 대상
 *
 * A항목 연산자 B항목
 * 
 * 산술연산자 (3순위) : *, /(몫), %(나머지, mod)
 * 산술연산자 (4순위) : +,- 
 * 쉬프트연산자 (5순위) : << , >>   , >>>
 * 비교(관계)연산자 (6순위) :  >, <. >=, <=
 * 비교연산자 (7순위) : ==,  !=
 * 비트논리연산자 : &( and, 8순위),  ^(xor, 9순위),  | (or, 10순위)
 * 일반논리연산자 : &&(11순위), ||(12순위)
 *
 */

public class BinaryOperator {
    // 산술연산자 (arithmetic operator) : 합, 차, 곱, 몫, 나머지 구할 때 사용
	public void testArithmetic () {
		int num =  123;
		int div = 7;
		System.out.println("123 / 7 몫 : " + (num/div));
		System.out.println("123 % 7 나머지 : " + (num % div));
	}
	// mod 연산자 테스트
	public void testMod() {
		System.out.println("정수 하나 입력 : ");
		int num = new Scanner(System.in).nextInt();
		
		// 입력된 정수가 짝수인지 홀수인지 판별한다면
		System.out.println(num + ": " + (num % 2 == 0? "짝수다. " :  " 홀수다."));
	}
	// mod 연산자 테스트2
	public void testMod2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 하나 입력 : ");
		int num = sc.nextInt();
		System.out.print("확인할 배수 : ");
		int check = sc.nextInt();
		
		// 입력된 정수가 확인할 배수에 해당되는지 확인한다면
		System.out.println(num + "은 "+ check + "의" + (num % check == 0? "의 배수다. " :  " 배수가 아니다."));
	}
	
	//비교연산자 (Comparison Operator)
	// 두 값의 대소 차이를 비교해서, 맞으면 true, 틀리면 false의 결과를 내는 연산자 = >  결과 값이 논리값임
	// true false가 나오는걸 조건 계산식이라고 합니다.
	// 변수값 비교연산자 비교값 
	// 6순위 :   > (크냐, 초과)  ,  <  (작으냐, 미만), >= ( > or ==, 크거나 같으냐, 이상), <= (< or ==, 작거나 같으냐, 이하)
	// 7순위 : == (같으냐), != (같지 않느냐) 
	
	public void testComparison() {
		int num = 100;
		System.out.println("num : " + num);
		System.out.println("num 변수의 값이 양수냐 ? " + (num > 0));   // true
		System.out.println("num 변수의 값이 음수냐 ? " + (num < 0));   // false
		System.out.println("num 변수의 값이 0이냐 ? " + (num == 0));   // false
		System.out.println("num 변수의 값이 0이 아니냐 ? " + (num !=0 ));   // true
		System.out.println("num 변수의 값이 홀수냐?" + (num %2 == 0));  // true
		System.out.println("num 변수의 값이 홀수냐?" + (num %2 == 1));  // false, num % 2 !=0과 같음
		
	}
	
	
	
	
	
	
	
}
