package exam12_상속후_2_super;

// 매니저 클래스
public class Manager extends Employee {

	String depart;	// 부서명
	
	public Manager(String name, int salary, String depart) {
		super(name, salary);	// 부모에서 선언되었기 때문에 부모 생성자에서 초기화
		this.depart = depart;
	}
	// getter, setter 작성 가정
	
	// 3가지 변수를 한 번에 리턴해주는 메서드 작성
	public String getManager() {
		return name + "\t" + salary + "\t" + depart;
	}
}
