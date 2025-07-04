package exam18_lambda;

@FunctionalInterface // 추상메서드 갯수를 1개로 제한
interface Flyer {
	// 파라미터 없고 리턴값 없는 추상메서드
	public abstract void fly();
	// public abstract void fly2(); 추상메서드 2개 쓰면 오류남
}


public class TestMain1_파라미터없고리턴값없는경우 {

	public static void main(String[] args) {
		
		// 1. 익명클래스
		Flyer f = new Flyer() {
			@Override
			public void fly() {
				System.out.println("1. 익명클래스.fly() 호출");
			}
		};
		f.fly();
		
		// 2. 람다표현식: 	자바 : ->, 자바스크립트 : =>
		Flyer f2 = ()->{System.out.println("2. 람다표현식.fly() 호출");};
		f2.fly();
		
		// 실행문이 1개인 경우 {} 생략 가능
		Flyer f3 = ()-> System.out.println("2. 람다표현식.fly() 호출");
		f3.fly();
		
	} // end main

} // end class
