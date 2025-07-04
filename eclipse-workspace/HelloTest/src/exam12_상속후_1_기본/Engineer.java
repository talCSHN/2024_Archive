package exam12_상속후_1_기본;

// 엔지니어 클래스

// Engineer is a Employee
public class Engineer extends Employee {

	String skill;	// 기술
	
	public Engineer(String name, int salary, String skill) {
		this.name = name;
		this.salary = salary;
		this.skill = skill;
	}
	// getter, setter 작성 가정
	
	// 3가지 변수를 한 번에 리턴해주는 메서드 작성
	public String getEngineer() {
				
		return name + "\t" + salary + "\t" + skill;
	}
	
}
