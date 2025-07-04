package exam02_변수;

public class VariableTest4_변수특징 {

	int num = 200; // 저장되는 영역이 달라서 오류 안 뜸
	
	public static void main(String[] args) {
		
		// 변수 특징
		
		// 1. 동일 이름 사용 불가
		
		int num = 10;
		//String num = "100";
		
		System.out.println(num);
		
		// 2. 로컬 변수는 사용 전에 반드시 초기화
		
		// 3. 변수를 인식하는 범위 ( 블럭 scope 라고 부름 )
		// javascript는 기본적으로 블럭 scope 아니고 함수 scope를 따름
		
		if(true){
			int k = 2;
			System.out.println(k);
		}
		// System.out.println(k); 블럭 밖에서는 안됨
	}

}
