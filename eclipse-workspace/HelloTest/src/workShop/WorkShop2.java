package workShop;

public class WorkShop2 {

	public static void main(String[] args) {
		
		// [문제 1]
		String s1 = "1";
		String s2 = "2";
		boolean bnx = false;
		int c1 = 'A';
		int c2 = 'B';
		int c3 = '1';
		int c4 = '2';
		int inx = 2;
		System.out.println(s1 + s2 );
		System.out.println(!bnx );
		System.out.println(c1 + c2);
		System.out.println(c3 + inx);
		System.out.println(c4 + c3 );
		
		// [문제 2]
		int num = 456; 
		int result = (num % 100 == 0)? num:(num / 100)*100;
		System.out.println(result);
		
		// [문제 3]
		int n = 10;
		int n2 = 20;
		
		n = 20;
		n2 = 10;
		
		System.out.println("n 값은 " + n);
		System.out.println("n2 값은 " + n2);
		
	}

}
