package exam03_형변환;

public class CastTest1_묵시적 {

	public static void main(String[] args) {
		
		// 1. byte(1byte) -> short(2byte) -> int -> long -> float -> double
		// 큰 타입 = 작은 타입;
		byte b = 10;
		short b2 = b;	// byte타입의 b가 short타입으로 자동 변경
		int b3 = b2;
		long b4 = b3;
		float b5 = b4;
		double b6 = b5;
		
		// 역은 불가능 ( 작은 타입 = 큰 타입 불가능 )
		//int x = b6;
		
		// 2. char(문자형) -> int(정수형)
		char c = 'A';
		int c2 = 'A';
		int c3 = 'a';
		System.out.println(c2);	// 대문자 A의 정수값(아스키코드값) : 65
		System.out.println(c3);	// 대문자 A의 정수값(아스키코드값) : 97
		
		int c4 = 'A' + 1;	// char는 산술연산이 가능
		System.out.println(c4);
		
		// 3. 정수형 중에서 int보다 작은 타입의 연산결과는 기본값인 int로 반환
		short s = 10;
		short s2 = 20;
		//short s3 = s + s2; // s+s2의 결과는 30인데 30의 데이터는 정수형의 기본인 int다.
		int s3 = s + s2; //오류가 안남 
		
		// 4.작은 데이터형과 큰 데이터형의 연산결과는 큰 데이터형으로 반환
		System.out.println(4 + 5.0);	// 9.0
		int k = 4;
		float k2 = 5.0F;
		double k3 = k + k2;
		System.out.println(k3);
		
		// 5. 문자열 + 비문자열( or 문자열) ===> 지정된 값이 연결되어 문자열로 반환
		System.out.println(10 + "" + 20);
		
		String name = "홍길동";
		int age = 20;
		System.out.println("이름:" + name);	// 이름:홍길동
		System.out.println("이름:" + name + " 나이:" + age);	// 이름:홍길동 나이:20

	}

}
