package exam03_형변환;

public class CastTest1_명시적 {

	public static void main(String[] args) {
		
		// 강제 형변환
		int n = 10;
		short n2 = (short)n;
		
		short s = 10;
		short s2 = 20;
		short s3 = (short)(s + s2); // s+s2 전체를 형변환 해야하기 때문에 괄호 필요
		
		
	}

}
