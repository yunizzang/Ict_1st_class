package test.var.run;

import test.keyboard.input.ScannerExample;
import test.var.sample.VariableSample;

public class TestVariable {

	public static void main(String[] args) {
		// 변수(variable) 테스트 
		//클래스가 가진 메소드 실행을 하려면
		//클래스를 생성해야한다
		// 사용할 클래스명쓰고 레퍼런스변수 = new 생성자();  인데 생성자는 클래스 이름과 같다
		 VariableSample samp = new VariableSample();
		//Ctrl + Shit +O 누르면 자동 import됨 
		 
		//레퍼런스변수.실행할 메소드명();
		//객체지향언어는 이렇게 동작을 시킨다.
		//samp.useVariable();
		
		//samp.initVariable();
		//samp.testWrapper();
		 
		// samp.testFinal();
		 samp.testLiteral();
		 
		ScannerExample test = new ScannerExample();
				// 빈괄호가 생성자라는것.  이게 있어서 사용될수있음. 생성자가 없음 자동추가 되는것
				// 만약 자동추가가 없었다면 에러가 날것임
				//객체 공간만들고 테스트 주소를 저장해라. 
		//test.testScanner();
		
		//test.testScanner2();
	    //test.testInputChar();
		//  test.testNext();
		//test.testNextLine();
  	//	test.testNextLine2();
	//	test.inputPractice();
		
		
	}

	

}
