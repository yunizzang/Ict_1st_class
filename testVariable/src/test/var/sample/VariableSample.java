package test.var.sample;

//   /** 개 쓰고 엔터하면 닫힘
/**
 * 변수 연습을 위한 샘플 클래스이다
 * 변수 선언과 값 대입 및 변수 사용에 대한 예제를 제공한다.
 * 변수 초기화와 기본(primitive) 자료형(type) 에 대해 확인한다.
 */
public class VariableSample {
	/**
	 *기본 생성자이다.
	 */
	public void useVariable() {
		// 메소드 블럭 {} 안에서 만들어진 변수 : 지역변수 (Local Variable)
		// 지역변수는 메모리 (RAM)의 Stack에 할당됨
		// 메모리는 (고)정적 ||  (유)동적
		// 정적메모리는 사이즈는 구동되면 고정된 공간.
		// 동적메모리가 늘었다 줄었다. (임의대로) 공간의 크기가 임의대로 변함
		// 프로그래밍중 정적메모리에 저장하고 싶다면 지칭하는게 필요함 >> static 이라 붙임
		// 동적메모리는 다시 2구역으로 나뉘어짐  -  stack || heap
		//  메모리는 3으로 나뉨 :   static || stack || heap
		
		//1. 변수 선언 : 값 기록할 방 만들기 
		//자료형 변수명
		int first;
		int second;
		//4byte방2개 만들어라 이건데
		
		//2.변수방에  값 기록하기 : 대입연산자(=) 사용함
		//변수명= 기록할 값;
		// 기록할 값 주의점: 방의 자료형과 맞게 
		first = 120;
		second = 230;
		
		//3. 변수사용 : 변수 공간에 기록된 값의 사용을 의미함
		
		System.out.println("첫번째 값 : " + first);
		System.out.println("두번째 값 : " + second);
		System.out.println("더하기 결과 : " + (first+second));
		//괄호는 최우선 연산자라고해서 먼저처리할 것 묶어줌. 
	
	}
	/**
	 * 변수 선언, 값 기록, 변수 사용에 대한 예재 메소드이다.
	 */

	
	// 변수 초기화 테스트용 메소드
		public void initVariable() {
			// 변수 선언과 동시에 초기값 기록하는 것 :  변수초기화
			// 초기값 : 변수방에 첫번째 기록되는 값
			// 자료형 변수명 = 초기값 ;
			boolean yn = true;
			byte bnum = 100;
			short snum = 24;
			int age = 28;
			long pay = 350000000L;
			//long형 리터럴은 L을붙여서 구분합니다.
			float tax = 0.5f;
			// 0.5일때는 .5 로 표시해도 됩니다 .5f == 0.5f
			double weight = 124.5; // 124.5 ==124.5d
			char level = 'A';
			
			System.out.println("yn : "+yn);
			System.out.println("bnum: "+bnum);
			System.out.println("snum : "+snum);
			System.out.println("age : "+age + "세");
			System.out.println("급여 : "+pay + "원");
			System.out.println("세금 : "+(tax*100) +"%" );
			System.out.println("무게 : "+weight + "kg");
			System.out.println("등급 : "+level);
		}
		
		// 기본 자료형 (Primitive Type)에 대한 클래스가 제공됨 : java. lang 패키지
		// 래퍼(wrapper) 클래스라고함.
		// 래퍼클래스들이 기본 자료형의 메모리 할당크기(BYTES), 기록되는 비트갯수 (SIZE), 최대값(MAX_VALUE), 최소값 (MIN_VALUE)
		// 기본 자료형과 관련된 메소드들도 제공됨.
		/**Java 는 primited data type 8개를 제공한다
		 * boolean ==> Boolean
		 * byte  ==>Byte
		 * short  ==>Short
		 * 			// C언어 처리하는 자료는.. 카메라. 센서 자료정보. 같은 int도 사이즈가 다르다.
		 * 			//  C는 2바이트. Java는 4 바이트. 그래서 Short가 준비됨
		 * int  ==> Integer
		 * long  ==> Long
		 * float  ==> Float
		 * double  ==>Double
		 * char  ==> Character 클래스로
		 * 
		 * 8개 다 외울것
		 * C는 메모리 할당 확인할 수 있어요. java는 안되니까
		 */
		
		public void testWrapper() {
		 // 클래스가 가진 멤버 사용하려면 new해야한다고 했는뎅
			// 클래스에 소속된 멤버 사용방법 1 : 클래스명 레퍼런스변수 = new생성자(); 레퍼런스변수.메소드();  레퍼런스.필드명
			//클래스에  소속된 멤버 사용방법 2 : 멤버 선언 구문에 public static이 표시되어 있으면 바로 클래스명.메소드(); 클래스명.필드명

			System.out.println("int 메모리 할당 크기 : " + Integer.BYTES + "바이트");
			System.out.println("int 기록 비트수 :  : " + Integer.SIZE + "비트");
			System.out.println("int 최대값 : " + Integer.MAX_VALUE);
			System.out.println("int 최대값 : " + Integer.MIN_VALUE);
			
			System.out.println("long 메모리 할당 크기 : " + Long.BYTES + "바이트");
			System.out.println("long 기록 비트수 :  : " + Long.SIZE + "비트");
			System.out.println("long 최대값 : " + Long.MAX_VALUE);
			System.out.println("long 최대값 : " + Long.MIN_VALUE);
			
			System.out.println("double 메모리 할당 크기 : " + Double.BYTES + "바이트");
			System.out.println("double 기록 비트수 :  : " + Double.SIZE + "비트");
			System.out.println("double 최대값 : " + Double.MAX_VALUE);
			System.out.println("double 최대값 : " + Double.MIN_VALUE);
			
			System.out.println("float 메모리 할당 크기 : " + Float.BYTES + "바이트");
			System.out.println("float 기록 비트수 :  : " + Float.SIZE + "비트");
			System.out.println("float 최대값 : " + Float.MAX_VALUE);
			System.out.println("float 최대값 : " + Float.MIN_VALUE);
			
			System.out.println("char 메모리 할당 크기 : " + Character.BYTES + "바이트");
			System.out.println("char 기록 비트수 :  : " + Character.SIZE + "비트");
			System.out.println("char 최대값 : " + (int)Character.MAX_VALUE);
			System.out.println("char 최대값 : " + (int)Character.MIN_VALUE);
		 }
		// final 예약어 사용 테스
		// final은 클래스에 사용가능 : public final class 클래스명 {} ==> 상속에 사용 못한다
		// final은 멤버변수(Field)에 사용 가능 : public final 자료형 변수명 = 초기값;   == > 값 변경 못함
		// final은 멤버함수(Method)에 사용 가능 : public final 반환자료형 메소드명(자료형 매개변수, ...){소스코드}  ==> 오버라이딩 못함
					// 상속관계있을때 부모 method 를 후손이 다시 만들게 하는것 (근데 부모쪽에서 final 붙이면 다시만들기 못한다)
		// final은 지역변수에도 사용할 수 있어요.(Local Variable)에 사용 가능: final 자료형 변수명 = 초기값;
		          // 메소드 안에서 선언하는 변수를 지역변수라고 했는데, 
		public void testFinal() {
			// 지역변수(Local Variable) : 메소드 안에서 선언한 (만든) 변수
			int num = 12;
			final int value = 100;    //  값 변경 불가임
			System.out.println("num : " + num);
			System.out.println("value : " + value);
			
			num = 24;
		//	value = 200; //final이라 값변경 못한다고 error발생함
			System.out.println("num : " + num);
			System.out.println("value : " + value);
			
		}
		
		// 리터럴(Literal) : 소스 코드에서 사용되는 실제 값
		public void testLiteral() {
			String name = "홍길동";     // 홍길동이 사용된 실제 값이니 리터럴이 되는것임
			int age = 27; 	                //이것도 실제 사용됐으므로 리터럴이라고함
			double pay = 389.50; 	//이것도 실제 사용됐으므로 리터럴이라고함  (문자 리터럴. 정수 리터럴. 실수 리터럴이라고함)
			char gender = '남';
			
			System.out.println(name + ", " + age + ", " + pay + ", " + gender);
			// 정수값은 10진수, 8진수, 16진수 표기를 할 수 있음
			int decimalNum = 12; //10진수 12 : 
			int octalNum = 023;  //  숫자앞에 0 으로 시작하면 8진수다. 8진수 23이란얘기임
			int hexaNum =0xf7;  //0x 붙이면 16진수  (f가 나머지 15를 뜻함)
			// 메모리에 기록은 2진수로 다 바뀝니다.
			
			System.out.println("decimalNum : " + decimalNum);
			System.out.println("octalNum : " + octalNum);
			System.out.println("hexaNum : "+ hexaNum);
			
			int number = 345;
			// 가변 매개변수 
			System.out.printf("number : %d, %o, %x,  \n", number, number, number);
			// 출력때도
			// printf (printf format)  : format을 사용하는 print 메소드임
			
			double dnum = 1.234; //floating (부동소수점형 표기) ==  비과학용 표기식이라고도 함
			double dnum2 =1.2345e3;  //scientific (과학용 표기식) == 지수형 표기라고도 함
			
			System.out.printf("dnum :  %.2f, %g, %e, %a \n", dnum, dnum, dnum,dnum );
					 
			
		}
}
