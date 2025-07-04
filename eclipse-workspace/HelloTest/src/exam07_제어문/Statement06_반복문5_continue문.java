package exam07_제어문;

public class Statement06_반복문5_continue문 {

	public static void main(String[] args) {
		
		for ( int n = 1; n <= 5 ; n++) {
			if ( n == 3 ) continue;
				System.out.println("Hello" + n);
		}
		// 1~10까지 반복하는데 짝수 값만 출력하시오.
		for ( int i = 1; i <=10; i++) {
			if ( i % 2 != 0) continue;
				System.out.println(i);
		}
		
		
		//System.out.println(n);
		System.out.println("END");
		
		
	}

}
