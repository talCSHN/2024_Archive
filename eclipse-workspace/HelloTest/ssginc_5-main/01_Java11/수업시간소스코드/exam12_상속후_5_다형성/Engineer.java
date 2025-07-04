package exam12_상속후_5_다형성;

public class Engineer extends Employee {

	String skill; // Engineer 에서만 추가된 속성

	public Engineer() {
		super();
	}
	public Engineer(String name, int salary) {
		super(name, salary);
	}
	public Engineer(String name, int salary, String skill) {
		super(name, salary);
		this.skill = skill;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	@Override
	public String getEmployee() {
		return super.getEmployee()+"\t"+skill;
//		return name+"\t"+salary+"\t"+skill;
	}
	
	
}
