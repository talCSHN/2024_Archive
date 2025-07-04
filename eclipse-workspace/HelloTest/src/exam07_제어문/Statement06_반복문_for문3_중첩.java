package exam07_제어문;

public class Statement06_반복문_for문3_중첩 {

	public static void main(String[] args) {
		
		// 중첩 : 모든 제어문(조건문/반복문)은 중첩이 가능
		// 실습 : 구구단 출력하시오
		/*
		 	2 * 1 = 2
		 	2 * 2 = 4
		 	.
		 	.
		 	.
		 	9 * 9 = 81
		 */
		
		for ( int i = 2; i <= 9; i++) {
			for ( int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
		}
		System.out.println("***************");
		System.out.println("***************");
		
		// 문제 : 구구단 출력시 3단과 6단만 출력하시오.
		for ( int i = 3; i <= 6; i+=3) {
			for ( int j = 1; j <= 9; j++) {
				System.out.println(i +"*" + j + "=" + (i*j));
			}
		}
		// 이렇게도 할 수 있음
		for ( int i = 2; i <= 9; i++) {
			for ( int j = 1; j <= 9; j++) {
				if ( i == 3 || i == 6) {
					System.out.println(i + "*" + j + "=" + (i*j));
				}
			}
		}
		
		
		System.out.println("END");
	}

}
