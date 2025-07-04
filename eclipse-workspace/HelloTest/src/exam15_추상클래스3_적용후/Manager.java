package exam15_추상클래스3_적용후;

// 매니저 클래스
public class Manager extends Employee {

	String depart;	// 부서명
	
	public Manager(String name, int salary, String depart) {
		this.name = name;
		this.salary = salary;
		this.depart = depart;
	}
	// getter, setter 작성 가정
	
	// 3가지 변수를 한 번에 리턴해주는 메서드 작성
	@Override
	public String getEmployee() {
		return name + "\t" + salary + "\t" + depart;
	}
}
