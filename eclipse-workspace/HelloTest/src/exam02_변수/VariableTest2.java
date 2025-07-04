package exam02_변수;

public class VariableTest2 {

	public static void main(String[] args) {
		// 변수 사용 문법
		// 1. 변수선언 ==> 메모리에 영역확보 + 접근하기 위한 이름 지정
		// 문법 : 데이터타입 변수명;
		// 변수명 권장 방법 : 의미 있는 명사형, 소문자
		
		// 저장 데이터? 홍길동 20 서울 182.45 67.22 false
		
		// 1. 변수 선언과 초기화 한번에
		
		int age = 20;	// 4byte , age는 기본형 변수
		String name = "홍길동";	// 4byte , name은 참조형 변수
		
		// 2. 변수 사용
		System.out.println(age);
		System.out.println(name);
	
		
	}

}
