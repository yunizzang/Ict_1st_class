package test.operator.sample;

import java.util.Scanner;
//import java.lang.*; // 생략할 수 있음. 생략하면 컴파일시에 자동 추가됨
/**
 * 삼항연산자 ( Ternary operator) 연습용 클래스
 * 항목기 3개로 표현되는 연산자
 * 첫번째항목 뒤에 ? 두번째항목 : (콜론) 세번째항목
 * 조건표현식 : 조건의결과가 참일때 선택할 값 : 조건의 결과가 거짓일때 선택할 값
 * (결과값저장할) 자료형 변수명 = (조건표현식)? 값 1 :  값2 ;
 * 다른 문장의 부분 사용 가능함 : 선택된 값을 사용하는구문에 적용함
 * 
 * 계산에 사용된 기호문자가 연산자임.
 * 첫번째 항목은 조건표현식 
 * 
 * () 는 최우선 연산자로 묶어줘도
 * 
 * 조건표현식은 반드시 결과가 true | false 가 나오게끔 작성해야 함
 * 일반산술계산식 (true | false 의 결과가 아닌 식) 등은 사용할 수 없음 (에러임)
 * 
 */
public class TernaryOperator { 
	/**
	 * 채울수 있는게 4개인데. 안을 채울수 있는게 field
	 * 
	 */
	
	// Field (필드 : 멤버변수) 
	// Constructor (생성자함수) => 클래스 안에 생성자가 하나도 없으면, 컴파일시에 자동 기본생성자 추가함
	//public TernaryOperator () {}
		//원시 소스코드라고하는데 CPU가 읽을 코드에는 들어있다라는거.  우리가 안만들어도 얘는 기본으로 있다. 안만들어도 사용할수있다.
		// 한개라도 있음 자동추가 안함. 
	// Method (메소드: 멤버함수) 3가지 (선택) 멤버로 클래스 내부를 채움
	// 메소드 작성 규칙 : 
	// 접근제한자 [ 예약어 ] 반환자료형 메소드명([자료형 변수명, .....])  {   소스 코드 구문 } 
	/**
	 *  변수 함수 구분은 이름뒤에 괄호가 있고 없고임
	 *  메소드안에 소스 코드 작성은 흐름상으로 보면 
	 *  접근제한자는 캡슐화에 영향을 준다 . 근데 메소드는 퍼블릭이 기본이다 
	 *  (클래스 공개시키겠다) > 퍼블릭클래스만 다른패키지에서 import사용가능
		// 객체지향 3대요소:
	 */
	// 반환자료형: 반환(return)되는 값의 자료형을 표기함. return 10;  --->  int가 반환자료형
	// void : 반환되는 값 없다임, return;  

	 // void는 리턴이 없다라는 뜻	 */
	
	/**
	 * 정수 한 개를 키보드로 입력받아, 그 수의 절대값을 출력
	 * 정수 : 음수, 0, 양수 
	 * 정수는 1씩 차이나는 수, 소숫점 아래값 취급 안 함
	 * 절대값 (absolute) : 모든 정수의 양수화 (음수 -- >  양수로 바꿈, 0과 양수는 그대로 처리)
	 */
	public void testAbs() {
		System.out.print("정수 하나 입력 : ");
		int num = new Scanner(System.in).nextInt();
		
		System.out.println( num + "의 절대값: " + ((num<0)? -num: num));
		return;    // 생략할 수 있음, 생략하면 컴파일시에 JVM에 의해서 자동추가됨
		// 반환값 없는 부분은 이렇게 쓰는데 생략할 수 있다.
		// 모든 메소드 맨 마지막에는 return 문이 존재해야 함
		//System.out.println(); // return 문 다음에는 코드가 존재할 수 없음
		// void - return 이 한 세트
	}
	/**
	 * 문자 하나를 키보드로 입력받아서 , 영어소문자면 "Lower"출력
	 * 영어 대문자이면 "Upper"출력, 숫자문자이면 "Numeric" 출력
	 * 그 외 문자는 "Etc" 출력
	 * 삼항연산자 중첩 사용 가능함 : 
	 * (조건1)? 조건1이 true일때 선택값 : false 인 자리에 다른 조건의 삼항연산자를 또 사용할 수 있음 (횟수 제한없음)  
	 * 		((조건2)? 조건1이 false이고 조건2가 true일때 선택값 :  
	 * 			((조건3)? 조건1과 2가 false 이고 조건3이 true일때 선택값 :  모든 조건이 false 일때 선택값))
	 */
	public void testAlphabettic() {
		System.out.print(" 문자 하나 입력 : ");
		char ch = new Scanner(System.in).next().charAt(0);
		
		String result = ( ch >= 'a' && ch<='z')? "Lower" :
									((ch >'A' && ch <='Z')? "Upper" : 
										((ch >= '0' && ch <= '9')? "Nemeric" : "Etc"));
		
		System.out.println(ch + " is " + result);
		return;
		/**
		 * 값의 범위가 어디냐고 물어볼때. ch a~z사이인지 물어봐서 하는데.  
		 * a=< ch =<z 
		 * 이런식은 컴퓨터가 이해하지 못한다.  그래서, 값의 범위를 물을때는 2항이므로 2개씩 따로 물어봐야함 (a=< ch)(ch =<z)
		 * && 
		 */
	}
	/**
	 *  삼항연산자 중첩 사용 테스트2
	 *  정수 하나를 입력 받아서, 양수이면 "Positive"
	 *  음수이면 "Negative", 0이면 "Zero" 출력 처리
	 */
		public void  testIntegral() { 
			//메소드 안 코딩 작성 순서 : 
			// 1. 변수 선언과 값 대입(기록) 처리
			System.out.print(" 정수 하나 입력 : " );
			int num = new Scanner(System.in).nextInt();
			
			//2. 준비된 변수안의 값에 대한 계산 처리 : 연산자와 제어문 사용
			String result = (num > 0)? "Positive" :
									((num<0)? "Negative" : "Zero");
			//3. 계산 결과 처리 : 출력 확인 또는 리턴
			System.out.println(num + " is " + result);
			return;
		}			
		
		/**
		 * 학생정보 입력받아서, 성적에 대한  등급 처리하고 출력
		 * 국어점수(kor:int) , 영어점수(eng: int), 수학점수(mat:int) 키보드로 입력받아서
		 *   	국어점수 (kor:int)   
		 * 총점(tot: int), 평균 (avg: double)을 구하고 
		 * 평균을 가지고 등급(grade: char) 을 구하고
		 * 출력 : 국어점수, 영어점수, 수학점수, 총점, 평균(소숫점아래 첫째자리까지만 출력), 등급
		 * 
		 * 평균에 대한 등급 기준 : 
		 * 	평균이 90점 이상이면 'A'
		 * 				80 이상 90 미만이면 'B'
		 * 				70 이상 80 미만 'C'
		 * 				60 이상 70 미만 'D'
		 * 				60 미만은 'F'
		 * 
		 */
		/*
		 * public void testExample() { System.out.print("국어점수 : " ); int kor = new
		 * Scanner(System.in).nextInt(); System.out.print("영어점수 : "); int eng = new
		 * Scanner(System.in).nextInt(); System.out.print("수학점수 : "); int mat = new
		 * Scanner(System.in).nextInt();
		 * 
		 * int tot = kor + eng + mat; double avg = (kor + eng +mat)/3;
		 * System.out.println("총점: " + tot ); System.out.println("평균 " + avg );
		 * 
		 * 
		 * String result = (avg >= 90)? "A" : ((avg >= 80 )? "B": ((avg >= 70)? "C":
		 * ((avg >= 60)? "D": "F"))); System.out.println("My grade is" + result );
		 * return;
		 * 
		 * 
		 * }
		 */
		
		public void testExample() {
			
			Scanner sc = new Scanner(System.in);
			//필요하면 한번만 써주기
			
			System.out.print( "국어 : ");
			int kor = sc.nextInt();
			System.out.print( "영어 : ");
			int eng = sc.nextInt();
			System.out.print( "수학 : ");
			int mat = sc.nextInt();
			
			//2. 기록된 변수값 사용해서 계산
			int  tot = kor + eng + mat;
			double avg = tot / 3.0;
			
			// 평균에 대한 등급처리
			char  grade = (avg >=90)? 'A': ((avg >= 80)? 'B':((avg >=70? 'C' : (avg >=60)? 'D' : 'F')));
			// char grade = (avg >=90)? ' A' : ((avg >=80 && avg <90)? 'B':
			
			//3. 결과 출력 또는 결과 반환
			System.out.println(kor + " , " + eng + " , "+ mat + " , "+ tot + " , "+ (int)(avg * 10 /10.0) + " , " + grade);
			System.out.printf("%d, %d, %d, %d, %.1f, %c \n", kor, eng, mat, tot, avg, grade);
			return;
		}
		/**
		 * 삼항연산자 연습2
		 * 수험생 이름과 점수를 입력받아서 
		 * 점수가 60이상이면 "합격입니다. 축하합니다" 
		 * 60점 이상이 아니면 "불합격입니다. 다음기회에 분발합시다" 문자열 변수에 저장하고 나서 출력
		 * 출력예 : 홍길동님, 합격입니다, 축하합니다
		 *     			홍길동님, 불합격입니다, 다음기회에 분발합시다.
		 */
		public void testPractice1() {
			
		Scanner sc = new Scanner(System.in);
		System.out.print(" 수험생 이름 : ");
		String name = sc.next();
		System.out.print(" 점수 : ");
		int score = sc.nextInt();
		
		String result = (score >= 60)? "합격입니다. 축하합니다." : "불합격입니다. 다음기회에 분발합시다.";
		System.out.println(name + "님 " + result);
		return;
			
		}
		
		/**
		 * 삼항연산자 연습3
		 * 문자하나를 입력받아 출력 처리
		 * "프로그램을 종료하시겠습니까? (종료: y, 취소: n):"
		 * 댓문자 상관없이 'y' 이면 프로그램을 종료처리
		 * 'y'가 아니면 종료 취소처리  ==> "프로그램 계속 진행중입니다. "  출력되게 함
		 * 프로그램 종료 처리 방법1 : java.lang.System 클래스에 exit() static 메소드 사용
		 * 프로그램 종료 처리 방법2 : main() 까지 리턴 처리 
		 */
		
		public void testQuestion() {
			System.out.println("프로그램을 종료하시겠습니까? (종료: y, 취소: n)");
			//Scanner sc = new Scanner(System.in).next().charAt(0);
			
			//char answer =  new Scanner(System.in).next().charAt(0);
			//(answer == 'y' || answer=='Y')? System.exit(0): System.out.println("프로그램이 계속 진행중입니다");
			// OR연산자  || 
			
			// 삼항연산자는 계산한 결과값을 선택하는 연산자임
			// 삼항연산자에서 참과 거짓일 때 선택할 값 부분에 실행할 구문을 작성하면 에러남
			// 해결 : if 문을 사용함
		
			char answer =  new Scanner(System.in).next().toUpperCase().charAt(0);
			
			if (answer == 'Y') {
				//위 조건의 결과가 true 일 때 실행할 구문 작성
				//System.exit(0);
				// exit보다는 return의 흐름을 갖는다.
				
			}else {
				// 위 조건의 결과가 false 일 때 실행할 구문 작성
				System.out.println("프로그램 계속 진행.....");
				return;
			}
			

			

			
			
		}
		
		
		
		
		
}
