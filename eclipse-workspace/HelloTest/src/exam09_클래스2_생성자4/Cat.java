package exam09_클래스2_생성자4;


public class Cat {
	
	String name;
	int age;
	String gender;
	
	// 오버로딩 생성자
	public Cat() {}
	public Cat(String n, int n2, String n3) {
		System.out.println(this);
		this.name = n;
		this.age = n2;
		this.gender = n3;
		
	}
	 
	public Cat(String n, int n2) {
		name = n;	// this 생략
		age = n2;	// this 생략
		
	}
	
	public Cat(String n) {
		name = n;	// this 생략
		
	}
	
}





