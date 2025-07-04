package exam09_클래스3_this2;


public class Cat {
	
	String name; // 하늘색 -> 인스턴스 변수
	int age;
	String gender;
	
	// 오버로딩 생성자
	public Cat() {}
	public Cat(String name, int age, String gender) { // 남색 -> 로컬변수
		System.out.println("생성자");
		this.name = name; // 반드시 this 써야함
		this.age = age;	// 반드시 this 써야함
		this.gender = gender;	// 반드시 this 써야함
	}
	 
	public Cat(String name, int age) {
		//	System.out.println(); -> 오류
		this(name, age, "암컷");	// 반드시 첫 라인
		
	}
	
	
	
}





