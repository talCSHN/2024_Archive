package exam05_연산자;

public class Operator06_3항연산자 {

	public static void main(String[] args) {
		
		// 3. 3항 연산자
		// 문법 : (조건식)?참문장:거짓문장;
		
		int n = 100;
		
		// 문제1 : n 값이 5보다 크면 100을 반환하고 아니면 200을 반환하는 코드 작성
		System.out.println(( n > 5 )? 100 : 200);
		
		int result = ( n > 5 )? 100 : 200;
		System.out.println(result);
		
		// 문제2 : n 값이 5보다 크고 200보다 작으면 "AAA"를 반환하고 아니면 "BBB"를 반환하는 코드 작성
		System.out.println(((n > 5) && (n < 200))? "AAA" : "BBB" );
		
		String result2 = ((n > 5) && (n < 200))? "AAA" : "BBB" ;
		System.out.println(result2);
		
		// 3항 연산자 중첩
		
		// 문법 : (조건식)?참문장:거짓문장;
		// 참문장 또는 거짓문장이 새로운 3항연산자가 될 수 있음
		
		int result3 = (100>200)? (100>50)? 100 : 200 : (100 < 150)? 300 : 400;
		System.out.println(result3);	// 300
		
	}

}
