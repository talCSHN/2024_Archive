package exam02_변수;

public class VariableTest1 {

	public static void main(String[] args) {
		// 변수 사용 문법
		// 1. 변수선언 ==> 메모리에 영역확보 + 접근하기 위한 이름 지정
		// 문법 : 데이터타입 변수명;
		// 변수명 권장 방법 : 의미 있는 명사형, 소문자
		
		// 저장 데이터? 홍길동 20 서울 182.45 67.22 false
		
		String name;	// 4byte , name은 참조형 변수
		int age;		// 4byte , age는 기본형 변수
		String address; // 4byte , address는 참조형 변수
		double height;  // 8byte , height는 기본형 변수
		float weight;   // 4byte , weight는 기본형 변수
		boolean isMarried; // 1byte , isMarried는 기본형 변수
		
		// 2. 변수 초기화 => 생성된 변수에 처음 값을 저장하는 작업
		// 문법 : 변수명 = 값;
		
		name = "홍길동";
		age = 20;
		address = "서울";
		height = 182.45;
		weight = 67.22F; //만약 F빼면 -> float(4byte) = 67.22(8byte)라서 오류, 반대는 가능
		isMarried = false;
		
		// 3. 변수 사용
		System.out.println(name);
		System.out.println(age);
		System.out.println(address);
		System.out.println(height);
		System.out.println(weight);
		System.out.println(isMarried);
		
		// 4. 변수값 변경
		age = 30;
		System.out.println(age);
		
		
	}

}
