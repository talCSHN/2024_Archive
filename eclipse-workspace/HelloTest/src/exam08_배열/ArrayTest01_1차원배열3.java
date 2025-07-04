package exam08_배열;

public class ArrayTest01_1차원배열3 {

	public static void main(String[] args) {
		
		// 1. new 이용
		int [] num = new int[3];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		
		// 2. 리터럴 이용
		int [] num2 = {10, 20, 30, 40};
		
		System.out.println(num2.length);
		for (int i : num2) {
			System.out.println(i);
		}
		
		// 3. new + 리터럴
		int [] num3 = new int[] {10, 20, 30, 40, 50};
		for (int i : num3) {
			System.out.println(i);
		}
	} // end main
 
} // end class
