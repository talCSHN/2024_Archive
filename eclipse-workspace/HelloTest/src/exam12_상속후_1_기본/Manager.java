package exam12_상속후_1_기본;

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
	public String getManager() {
		return name + "\t" + salary + "\t" + depart;
	}
}
