package day2.test;
import test.practice.*;
public class TestExample1 {

	public void example(){
		System.out.println("이름: 장윤정");
		System.out.println("나이 : 24세");
		System.out.println("키 : 100");
		System.out.println("몸무게: 11.1");
		System.out.println("성별: F");
		System.out.println("전화번호: 010-1111-2222");
		System.out.println("이메일: abcd@naver.com");
	}

	public void exampleVariable(){
		//자바가 기본적으로 string class를 써라 제공.  
		String name = "홍길동";  //만들어진 변수방에 방만들고 기록을 따로해도 되지만.
		//샘플처럼 방만들때 바로 값을 기록해 넣어도됨.  boolean flag = false;  >>> 이런식으로.
		//변수초기화라고함
		//문자나열값은 반드시 "(double quotation) 으로 묶어야 함
		//String name = '홍길동';
		//String name = 홍길동; // 문자나열값에 따옴표 묶지 않으면 변수로 해석함
		//int age = 24;
		short age = 28; 
		// short는 2 바이트임. short가 취급하는 값의 범위라 에러가 안나는것임
		//short sage = age; 
		/* 뭣때문에 에러난다? 방크기 생각할것. 
		age변수 방크기는 얼마? int 선언했으므로 4고 short로 선언하면 2. */
		//자료형 일치 하지 않으면 버려야 한다. 정수끼리 호환은 되지만, 사이즈 안맞음 사이즈 맞춰야함
		//버리는 방법: 앞에다가 short size로 바꿔라 
		//short sage = (short)age; 
		// 로 쓰면 해결됨
		//4 바이트 크기의 값이 2 바이트 크기의 방에 기록될 수 없음. 형변환 필요함.
		double height = 100.1;
		//float hh = 180.3; 
		// 에러나는 이유는 실수형 자체는 기본 무슨자격으로 판단한다? 기본이 더블형. 
		//더블은 8바이트인데 float는 4바이트.
		//큰게 작은데 못들어감 (그래서 뒤에 f붙이기)
		//float hha = 180.3f; // 이 자료형은 double (8바이트) 가 됨. >> float (4byte)
		
		// double은 기본임. 실수형일때만 f붙여
		double weight = 15.5;
		//글자 한개는 자료형. char타입
		char gender = 'F';
		
		//char gg = "M"; //문자 하나 타입인 char(character)는 값에 반드시 ''(single quotation)사용해야 함
		//char gg = M; // 따옴표 없으면 변수로 해석
		//전화번호는 대쉬(-)때문에 문자가 되어버림.  
		String phone = "010-9021-4231";
		String email = "asbd@naver.com";
		
		System.out.println("이름:     " + name);
		// 연결연산자 + 
		System.out.println("나      이 : "+ age + " 세");
		System.out.println("키         : "+ height);
		System.out.println("몸 무 게: " + weight);
		System.out.println("성     별: " + gender);
		System.out.println("전화번호: " +phone);
		System.out.println("이메일: " +email);
	}
		
	public static void main(String[] args) {
		//클래스가 가진 메소드 실행: 클래스명 레퍼런스변수 = new생성자();
		//레퍼런스변수.메소드();

		TestExample1 test = new TestExample1();
		test.example();
		
		// new 생성자().메소드()
		//new TestExample1().example();
		
		System.out.println();   //빈줄 추가
		
		test.exampleVariable();
		/*새로운 할당 없게 해라.  new 는 메모리방에 클래스방 만들어라. 만든걸로 써먹겠다이건데., 
		이걸로 하면 계속 새로 클래스 만들어서 작동.  
		새로하면 또 할당해라
		한번 만들면 계속쓰는 이 방식이 낫습니다. */
		}
	}


