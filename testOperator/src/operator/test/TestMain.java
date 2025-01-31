package operator.test;

import operator.sample.BinaryOperator;
import operator.sample.UniaryOperator;

public class TestMain {

	public static void main(String[] args) {
		//연산자 (Operator) 테스트용
		// 클래스가 가진 메소드 사용 :  클래스형 레퍼런스 변수  = new 생성자함수(); 레퍼런스변수.메소드명();
		// 1회 사용인 경우에는 주소저장 필요없어 new 생성자().메소드();
		//new 최우선연산자().test();
		
		UniaryOperator uniary = new UniaryOperator();
		//uniary.testBooleanNot();
		//uniary.testSign();
		//uniary.testSign2();
		//uniary.testIncDecOperator();
		BinaryOperator binary = new BinaryOperator();
		//binary.testArithmetic();
		//binary.testMod();
		//binary.testMod2();
		//binary.testComparison();
	}

}
