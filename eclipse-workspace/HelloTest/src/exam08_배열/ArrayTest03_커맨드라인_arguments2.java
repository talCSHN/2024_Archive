package exam08_배열;

public class ArrayTest03_커맨드라인_arguments2 {

	public static void main(String[] args) {
		
		// c:\> java Hello 10 + 20
		// 문자열 "10" ---> 정수형 10으로 변환
		// int n = Integer.parseInt("10"); 외우기
		
		int v1 = Integer.parseInt(args[0]);	// "10" --> 10
		String op = args[1];
		int v2 = Integer.parseInt(args[2]);	// "20" --> 20
		
		int result = 0;	// 로컬변수는 반드시 초기화 필요
		switch(op) { // switch는 내부적으로 실제값 비교하게 구현이 되어 있음
		
			case "+" : result = v1 + v2; break;
			case "-" : result = v1 - v2; break;
		}
		
		// 문자열은 ==으로 비교 안함
		// if(op == "+") 안씀	
		// if(op.equals("+")) 권장
		
		
		System.out.println("결과값:" + result);
		System.out.println("END");
		
	} // end main
 
} // end class
