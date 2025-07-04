package exam08_배열;

public class ArrayTest01_1차원배열 {

	public static void main(String[] args) {
		
		// 정수값 3개 저장. 10 20 30
		
		// 1. 배열 선언
		
		int [] num;	// 이때 num 변수는 참조형 변수, int 배열타입의 변수, 로컬변수(main 메서드 안에서 선언됐기 때문) => stack 메모리에 저장
		
		// 2. 배열 생성 ( new 이용, new 하면 무조건 heap 메모리에 생성 )
		num = new int[3];	// 3개의 요소로 구성된 배열이 heap 메모리에 생성됨
		
		// 한 번에
		int [] num2 = new int[3];
		
		// 3. 배열 요소 접근
		System.out.println(num.length);
		System.out.println(num [0]);
		System.out.println(num [1]);
		System.out.println(num [2]);
		
		// 3. 배열 초기화
		num[0] = 10;
		num[1] = 20;
		num[2] = 30;

		System.out.println(num [0]);
		System.out.println(num [1]);
		System.out.println(num [2]);
		// System.out.println(num [3]); 	// 없는 요소 접근 시 예외 발생  java.lang.ArrayIndexOutOfBoundsException
		
		
	} // end main
 
} // end class
