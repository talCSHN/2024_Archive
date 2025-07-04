package exam07_제어문;

public class Statement06_반복문_for문2 {

	public static void main(String[] args) {
		
		// 다양한 형태
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Hello" + i);
		}
		
		for (int i = 10; i > 5; i--) {
			System.out.println("World" + i);
		}
		
		for (int i = 1; i < 11; i+=2) {
			System.out.println("Happy" + i);
		}
		
		for (int i = 1, j=1; i < 11 && j < 5; i+=2, j++) {
			System.out.println("Smart" + i);
		}
		
		// 변수
		// int n=1,m=2; ==> 변수 여러 개 선언할 수도 있음. 권장하지는 않음
		
		
		
		System.out.println("END");
		
		
	}

}
