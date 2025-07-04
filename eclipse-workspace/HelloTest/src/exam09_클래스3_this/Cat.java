package exam09_클래스3_this;


public class Cat {
	
	String name; // 하늘색 -> 인스턴스 변수
	int age;
	String gender;
	
	// 오버로딩 생성자
	public Cat() {}
	public Cat(String name, int age, String gender) { // 남색 -> 로컬변수
		System.out.println(this);
		this.name = name; // 반드시 this 써야함
		this.age = age;	// 반드시 this 써야함
		this.gender = gender;	// 반드시 this 써야함
	}
	 
	public Cat(String n, int n2) {
		name = n;	// this 생략
		age = n2;	// this 생략
		
	}
	
	public Cat(String n) {
		name = n;	// this 생략
		
	}
	
}





