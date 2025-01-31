package test.keyboard.input;

import java.util.Scanner;

public class ScannerExample {

	// 멤버변수(Field)
	//생성자 함수(Constructor): 클래스 안에 생성자가 없으면, 자동으로 기본 생성자가 컴파일되면서 추가됨
	//멤버함수(Method)
	
	public void testScanner() {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수값 하나를 이력하세요 :  ");
		int num = sc.nextInt();
		
		System.out.println("num: " + num);
	}
	
	public void testScanner2() {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("나이: ");
		int age = sc.nextInt();
		System.out.print("키(소숫점 아래 첫째자리까지 입력) : ");
		double height = sc.nextDouble();
		System.out.println(name + " , " + age + "세, " + height + "cm");
	}
	
	// Scanner 가 제공하는 메소드에는 문자하나(char) 입력받는 기능이 없음
	// String 으로 입력받아서 문자하나를 추출하는 방식으로 해결함 String클래스의 charAt(순번): char 메소드 이용
	public void testInputChar() {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("문자 하나 입력 : ");
	//	String str = sc.next();
		//문자 변수방에는 2바이트 방이 생겼음. 대문자 A입력되면 비트값으로 기록이 된다.  그런데 string은 글자 한개 들어오면 글자한개 기록. 
		//뒤에 null이라는 빈칸이 (문자 끝났다라고하는) null문자가 하나 추가가됩니다. 문자 나열이 여기서 끝났다는 끝표시형 null문자임
		//CPU가 읽기를 멈추게 하기위해서 null문자가 들어가도록함.(빈칸이라 생각할것)
		
	//	char ch = str.charAt(0)
		char ch = sc.next().charAt(0);
		//위의 두개를 한줄로 생략하게함.  리턴값이 있는 경우
		System.out.println("입력문자 확인: " + ch);
	
		
	}

	//java.util.Scanner의 next() 메소드 사용테스트
	public void testNext() {
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열 입력: ");
		String str = sc.next();
		// 입력되는 문자열 사이에 공백 사용 못함
		//공백 문자 앞 글자들만 읽어들임
		System.out.println("str: "+str);
		
		
	}
	
	 //java.util.Scanner의 nextLine()메소드 사용 테스트
	public void testNextLine() {
	
			Scanner sc = new Scanner(System.in);
			System.out.print("문자열 입력: ");
			String str = sc.nextLine();
   //공백이 포함된 문자열을 읽어들임
			System.out.println("str: "+str);
			
	
	}
	//nextLine() 사용시 주의사항
	public void testNextLine2() {
	Scanner sc = new Scanner(System.in);
	//연속으로 여러 종류의 값들을 입력 받을 때 주의해야 함
	
	System.out.println("글제목 입력 : ");
	String title = sc.nextLine();
	
	System.out.println("작성자 이름(공백없이 입력) : ");
	String writer = sc.next();
	System.out.println();
	String te = sc.nextLine();
	
	System.out.println("작성할 내용을 입력하세요 :  ");
	sc.nextLine();  // 입력 버퍼에서 남겨진 엔터키를 읽어내서 버림
	String content = sc.nextLine();
	// 내용이 연속적으로 받아들여질때가 있음
	// 그러나 이전 값 입력시 남겨진 엔터키를 값으로 읽어들임  >> 자동입력완료됨
	// (Enter) key는 null문자로 입력됨
	// 해결 : 입력 버퍼에 남겨진 엔터키를 제거해야 됨 >> 버퍼에서 빼 냄
	// = 빼고 sc.nextLine(); 넣는다
	
	System.out.println("title: "+ title );
	System.out.println("writer: "+ writer );
	System.out.println("content: "+ content );
	}
	
	
	// 연습 : 고객이름, 나이, 성별(남/여) , 전화번호, 누적포인트 점수, 주소를 입력받아 출력
	public void inputPractice() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("고객이름 : ");
		String name = sc.next();
		System.out.print("나이 :   ");
		int age = sc.nextInt();
		System.out.print("성별(남/여) : " );
		char gender = sc.next().charAt(0);
		System.out.print("전화번호 : ");
		String phone = sc.next();
		System.out.print("누적포인트점수 : ");
		double score = sc.nextDouble();
		System.out.print("주소 : ");
		sc.nextLine(); // 입력 버퍼에 남은 엔터키 제거처리
		String address = sc.nextLine();
		System.out.println();
		System.out.println("고객이름 : " + name);
		System.out.println("나이 : " + age + "세");
		System.out.println("성별 : "+ gender);
		System.out.println("전화번호 : " + phone);
		System.out.println("점수 : " + score);
		System.out.println("주소: " +address);
	}
}
