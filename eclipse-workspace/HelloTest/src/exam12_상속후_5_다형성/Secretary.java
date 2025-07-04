package exam12_상속후_5_다형성;

public class Secretary extends Employee {

	// 추가되는 속성 없음
	// 따라서 getter/setter 메서드 없음
	// 오버라이딩 메서드도 필요 없음. 부모 메서드와 동일하기 때문
	
	public Secretary() {
		super();
	}

	public Secretary(String name, int salary) {
		super(name, salary);
	}
	
	

}
