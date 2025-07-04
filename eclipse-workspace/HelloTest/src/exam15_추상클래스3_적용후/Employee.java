package exam15_추상클래스3_적용후;

// Engineer, Secretary, Manager 클래스에 있는
// 공통적인 속성과 메서드를 뽑아서
// 더 큰 개념의 클래스 만들기
public abstract class Employee { //public 안쓰면 (default)기 때문에 자식에게는 protected, public 가능

	String name;	// private String name;이렇게 되어있으면 상속안됨(private와 생성자는 상속 안 됨)
	int salary;	
	
	// getter, setter 있다고 가정
	
	public abstract String getEmployee();
}
