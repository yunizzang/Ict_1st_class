package operator.sample;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/*
 * 단항연산자 (uniary operator)
 * 연산자 우선순위는 2순위임
 * 계산할 대상(항목, operand)이 한 개가 필요한 연산자
 * ! (boolean not, 논리부정연산자) : 논리값(true, false)를 반대로 바꾸는 연산자
 * +,- (sign, 부호연산자) : 양수를 음수로, 음수를 양수로 바꿀때 사용
 * ++, -- (증감연산자) : ++(1증가), --(1감소) 시킬때 사용
 * ~ (field, 비트반전연산자) : 메모리에 기록된 2진수 비트1을 비트0으로, 비트0을 비트1로 바꾸는 연산자
 * (바꾸고자하는 자료형) : 형변환(cast) 연산자, 값의 자료형을 바꿀 때 사용
 */
public class UniaryOperator {
	//! (boolean not) : 논리 부정 연산자
	// 논리값(true, false)을 반대로 바꿀 때 사용
	public void testBooleanNot() {
		boolean bool = false ;
		
		System.out.println("bool : " + bool);
		System.out.println(!bool);  // bool 변수방의 논리값을 반대로 바꿔라! 
		// 연산자 다음 열심히 해야하는게 제어문. 문제 해결능력을 키우는것임
		//제어문의 논리식을 어떻게 만들어 내냐에 따라서 구동의 방법이 달라지게됨.
		  // print 문에서 계산식은 괄호를 넣어야~~
		System.out.println("3 < 5 : "  + (3 < 5));  // true 
		// 비교연산자의 결과는 맞다 틀리다기 때문에 true, false 가 결론으로 나옴. 
		System.out.println("!(3 < 5) : "  + !(3 < 5));  // 3은 5보다 작지 않느냐! 라고 물을수도. // false
	}
	
	// +, - (sign)  : 부호 연산자
	// + 부호 : +1*  대상값 (대상값의 변화가 없음, + 부호를 생략함)
	// - 부호 : -1 * 대상값 (대상값을 양수는 음수로, 음수는 양수로 바꿈)
	public void testSign() {
		int num = -7;
		System.out.println("num : " + num);   //  - 7
		System.out.println("num :  "+  (+num)); //  - 7
		System.out.println("num :  " +  (-num));  // -1 * -7  => +7 
	}
	
	// 부호연산자 연습
	// 항상 양수여야 되는 경우 : 태어난 년도를 입력받아 현재년도와 계산해서 나이 출력( 나이는 항상 양수여야함)
	
	public void testSign2() {
		System.out.print("태어난 년도를 4자리로 입력(1984) :  ");
		int year  = new Scanner(System.in).nextInt();
		
		GregorianCalendar today = new GregorianCalendar();

		// today라는 레퍼런스가. . today란 변수에 날짜가 저장되어 있을까요 없을까요?
		// class로 만든 변수는 레퍼런스변수임. (주소저장하는애임) 그럼 기본자료형. primitive type과 뭐가다르다?
		//값이 기록되지만 class로 만든변수는 주소가 기록된다.  
		//new가 힙메모리에 만들어라. 객체공간을. 그 주소를 today가 갖는다.
		// 생성된 객체공간을 instance라고한다.
		System.out.println("tody : " + today.toString());
		System.out.println("YEAR : " + today.get(Calendar.YEAR));
		int age = today.get(Calendar.YEAR) - year;  // 오늘 년도 - 입력받은 생년
		// 나이를 무조건 양수로 처리해야한다면 
		System.out.println("나이 : " + Math.abs(age));;
	
		// - 하다가 음수가 될수도 있다  math Class abs쓰려고 하는데 다 static붙음. 그래서 생성자 제공안됨. 다 static 메모리에 써라. 동적메모리에 만들어라
		//할필요없음.  math.abs라고 쓰면됨.
		
		// 양수처리를 직접 로직으로 작성한다면 : 삼항연산자 사용하기
		// (조건식)? 참일 때 선택할 값 : 거짓일 때 선택할 값
		System.out.println("나이 : " + (age > 0 ? age : - age));
	}
	 	// ++, --  : 증감연산자(Increment - Decrement Operator), 메모리의 변수에 직접 연산함 (연산처리속도가 빠름)
		// ++ 변수명 : 변수 안의 값을 1 증가시킬 때 사용 (변수 = 변수 +1 : 과 결과는 같음)
		// -- 변수명 :  변수 안의 값을 1 감소시킬 때 사용 (변수 = 변수 -1 ; 과  결과는 같음)
 		public void testIncDecOperator() {
 			int num = 12; 
 			System.out.println("num :  " + num);   // 12가 출력될것임
 			num++;
 			System.out.println("num :  " + num);   // 13이 출력되어야함
 			++num;
 			System.out.println("num :  " + num);   // 14이 출력되어야함
 			// 증감연산자는 앞에 붙여도 뒤에붙여도 증감
 			
 			num--;
 			System.out.println("num :  " + num);   // 13이 출력되어야함
 			--num;
 			System.out.println("num :  " + num);   // 12이 출력되어야함
 			// 증감연산자가 변수와 함께 단독 구문으로 사용시에는, 변수의 앞 또는 뒤 위치 구분 안한다.
 			
 			// 증감연산자와 변수가 다른 식나 구문에 부분적으로 사용 될 때는 
 			// 변수의 앞또는 뒤 사용 위치 구분해야 함
 			// 변수 앞의 증감연산자 사용 : 먼저 증감처리하고 계산에 사용하라는 의미임 (선증감 후처리)
 			// 변수 뒤의 증감연산자 사용 : 변수값을 먼저 계산에 사용하고 나서 , 맨 마지막 증감처리하라는 의미임 (선처리 후증감)
 			System.out.println("num : " + num++);  // 출력 :  12, 출력 후 증가 (눈에 안보이지만) num의 값은 13
 			System.out.println("num : " + num);  // 13
 			System.out.println("num : " + ++num);  // 14 로 증가하고 나서 출력
 			
 			int result = 100 * num++;   // 100 * 14 = result : 140, num : 15
 			System.out.println("result : " + result);   //1400
 			System.out.println("num : " + num);  // 15
 			
 		}
	
	
}
