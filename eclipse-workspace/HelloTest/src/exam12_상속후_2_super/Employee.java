package exam12_상속후_2_super;

// Engineer, Secretary, Manager 클래스에 있는
// 공통적인 속성과 메서드를 뽑아서
// 더 큰 개념의 클래스 만들기
public class Employee {

	String name;	// private String name;이렇게 되어있으면 상속안됨(private와 생성자는 상속 안 됨)
	int salary;	
	
	// getter, setter 있다고 가정
	public Employee() {
		super(); // 자동삽입됨 ==> Object 호출 // 명시적으로 지정할때는 반드시 첫 라인
		System.out.println("Employee 생성자");	// 부모 먼저 실행해서 출력
	}
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getEmployee() {
		return name + "\t" + salary;
	}
}
