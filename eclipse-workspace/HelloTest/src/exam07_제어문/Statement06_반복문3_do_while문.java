package exam07_제어문;

public class Statement06_반복문3_do_while문 {

	public static void main(String[] args) {
		
		for ( int n = 1; n < 6 ; ++n) {
			System.out.println("Hello" + n);
		}
		
		// while문 : 1번도 실행 안 될 수 있음
		int n = 1;
		while(n <= 5) {
			System.out.println("World" + n);
			++n;
		}
		
		// do ~ while문 : 반드시 1번은 실행됨
		int n2 = 10;
		do {
			System.out.println("Happy" + n2);
			n2--;
		} while(n2 > 5);
		
		//System.out.println(n);
		System.out.println("END");
		
		
	}

}
