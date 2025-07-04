package exam05_연산자;

public class Operator03_비교연산자 {

	public static void main(String[] args) {
		
		// 3. 비교 연산자 ( >, >=, <, <=, ==, != )
		// 실행 결과는 논리값 ( true / false ) 으로 반환
		
		int n = 10;
		int n2 = 3;
		
		System.out.println(n > n2); // n이 n2보다 큰가?
		System.out.println(n >= n2); // n이 n2보다 크거나 같은가?
		System.out.println(n < n2); // n이 n2보다 작은가?
		System.out.println(n <= n2); // n이 n2보다 작거나 같은가?
		System.out.println(n == n2); // n이 n2과 같은가?
		System.out.println(n != n2); // n이 n2과 같지 않은가?
		
		// 실행 결과값을 계속 사용하기 위해 변수에 저장할 수 있음
		boolean result = n > n2;
		System.out.println(result);
		
	}

}
