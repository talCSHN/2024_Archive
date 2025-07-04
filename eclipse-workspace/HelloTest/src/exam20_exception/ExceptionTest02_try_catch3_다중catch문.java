package exam20_exception;

public class ExceptionTest02_try_catch3_다중catch문 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
     try {
    	
    	//1.  ArithmeticException 발생 가능한 코드
		int n = 2;
		int result = 10/n;
		System.out.println("결과값:" + result);
		
		//2. NullPointerException 발생 가능한 코드
		String name = null;
		System.out.println("이름 길이: " + name.length());
	
		//실행문1
		//실행무n
     }catch(ArithmeticException e) {  
    	System.out.println("0으로 나누어 예외 발생됨." + e.getMessage());
    	
     }catch(NullPointerException e) {  
     	System.out.println("name 값 초기화 안되어 있음." + e.getMessage());
     	
     }catch(Exception e) {  // 가장 마지막 catch문에 Exception을 지정하는 방법이 관례.
      	System.out.println("예외발생." + e.getMessage());
     }
		System.out.println("프로그램 종료");  //정상종료
	}
}
