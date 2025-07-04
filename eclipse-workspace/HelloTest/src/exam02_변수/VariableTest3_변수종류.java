package exam02_변수;

public class VariableTest3_변수종류 {

	// 메서드 밖
	int size = 20;	// 인스턴스 변수
	int n;	// 0으로 초기화됨
	static int age;	// 0으로 초기화됨
	static String name;	// null으로 초기화됨
	
	public static void main(String[] args) {
		
		// 메서드 안
		int num = 10;	// 로컬 변수
		
		int num2 = 0;		// 로컬 변수, 초기화
		System.out.println(num);
		System.out.println(num2);
		
		//인스턴스 변수 : new 이용했을 때 생성됨
		VariableTest3_변수종류 s = new VariableTest3_변수종류();
		System.out.println(s.size);
		
		//클래스 변수, static 변수 : 프로그램 실행 시 생성됨
		System.out.println(age);
		System.out.println(VariableTest3_변수종류.age); //클래스 변수 선언시 클래스 이름.변수명이 정확한 문법
		
	}	// main 메서드 영역

}	// class 영역
