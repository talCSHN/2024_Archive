package exam07_제어문;

public class Statement06_반복문2_while문 {

	public static void main(String[] args) {
		
		for ( int n = 1; n < 6 ; ++n) {
			System.out.println("Hello" + n);
		}
		
		// while문
		int n = 1;
		while(n <= 5) {
			System.out.println("World" + n);
			++n;
		}
		
		
		//System.out.println(n);
		System.out.println("END");
		
		
	}

}
