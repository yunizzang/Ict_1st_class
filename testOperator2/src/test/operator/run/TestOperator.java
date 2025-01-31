package test.operator.run;

import test.operator.sample.AssignmentOperator;
import test.operator.sample.BitOperator;
import test.operator.sample.OperatorSample;
import test.operator.sample.TernaryOperator;

public class TestOperator {

	public static void main(String[] args) {
		// 연산자 실행 테스트용
		// 클래스가 제공하는 기능 (메소드: 멤버함수) 을 실행(작동)시키려면 
		// 클래스에 대한 객체생성 => 생성된 객체의 주소를 가지고 메소드를 구동시킴
		// 클래스 객체생성 구문 :  클래스명 레퍼런스변수 = new 클래스생성자();
		OperatorSample samp = new OperatorSample();
		//클래스가 가진 기능(메소드) 를 작동(호출, call) 시키는 문장
		//레퍼런스변수.메소드명(...); 또는 자료형 변수 =  레퍼런스변수. 메소드명(.....); 
		//System.out.println("samp 가 가진 주소 : "+ samp.hashCode() );
		//System.out.println(samp.toString() );
		//samp.testComma();
		//samp.testLogical();
		samp.testRandom();
		
		TernaryOperator ternaryOperator = new TernaryOperator();  // 앞은 클래스. 뒤는 변수임 (ternary가 소문자라서) 이런형태로 많이 만듦
				// Ctrl + Shift + O   --- import 할것
		//ternaryOperator.testAbs();
		//ternaryOperator.testAlphabettic();
		//ternaryOperator.testIntegral();
		//ternaryOperator.testExample();
		//ternaryOperator.testPractice1();
		//ternaryOperator.testQuestion();
		
		//System.out.println("main() 종료됨");
		AssignmentOperator test = new AssignmentOperator();
		//test.testAssignment();
		
		BitOperator bitTest = new BitOperator();
		//bitTest.testBit();
		System.out.println("main() 종료됨");
	}

}
