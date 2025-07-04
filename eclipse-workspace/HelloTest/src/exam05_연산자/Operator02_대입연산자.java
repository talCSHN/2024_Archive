package exam05_연산자;

public class Operator02_대입연산자 {

	public static void main(String[] args) {
		
		// 2. 대입 연산자 ( =, +=, -=, *=, /=, %= )
		
		int n = 10;
		int n2 = 3;
		
		// n += n2; ==> n과 n2를 더해서 n에 저장
		n += n2; // n = n + n2;과 동일
		System.out.println(n + " " + n2);	// 13 3
		
		// n -= n2; ==> n과 n2를 빼서 n에 저장
		n -= n2; // n = n - n2;과 동일
		System.out.println(n + " " + n2);	// 10 3
		
		// n *= n2; ==> n과 n2를 곱해서 n에 저장
		n *= n2; // n = n * n2;과 동일
		System.out.println(n + " " + n2);	// 30 3
		
		// n += n2; ==> n과 n2를 나눠서 n에 저장
		n /= n2; // n = n / n2;과 동일
		System.out.println(n + " " + n2);	// 10 3
		
		// n += n2; ==> n과 n2를 나눠서 나머지를 n에 저장
		n %= n2; // n = n % n2;과 동일
		System.out.println(n + " " + n2);	// 1 3
		
	}

}
