package operator.sample;
/*
 * 최우선 연산자 (highest-priority operator)
 * 연산자 우선순위가 1순위인 연산자임
 * () 괄호 연산자 :  가장 먼저 계산할 부분을 () 묶을 때 사용
 * [] 배열 연산자 :  메모리에 배결공간 할당시에 사용
 * . 직접 참조(접근) 연산자 : 레퍼런스변수.메소드명() 또는 크래스명.필드명으로 사용, 
 * 										클래스에 속한 멤버에 접근할 때
 * -> 간접 접근 연산자 : 클래스의 속한 멤버에 접근할 때 사용
 */
public class 최우선연산자 {
	
	// () 괄호연산자
	public void test() {
		System.out.println(2+3*5);  // 2+15 => 17
		System.out.println((2+3)*5); // 5*5 = >25
	}
}
