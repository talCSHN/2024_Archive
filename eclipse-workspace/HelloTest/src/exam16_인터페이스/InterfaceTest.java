package exam16_인터페이스;

// 인터페이스
interface A {
	// 상수
	public static final int NUM = 10;	// 권장 코드
	int size = 20;	// 가능하지만 권장 안 함. public static final이 자동으로 지정됨
	// default 메서드
	public default void a() {}
	// static 메서드
	public static void b() {}
	// 추상 메서드
	public abstract void c();
	void d();	// 가능하지만 권장 안 함. public abstract 자동으로 생성됨. 따라서 abstract 키워드 생략 가능
	
}
interface A2 {
	// void e();
}

interface F extends A, A2{	// 인터페이스 간에는 다중상속 가능
}

class B implements A, A2{	// 다중 구현

	@Override
	public void c() {}

	@Override
	public void d() {}
	
}

public class InterfaceTest {

	public static void main(String[] args) {
		
		// A a = new A(); // 객체 생성 불가
		B b = new B();	// 하위클래스를 통해 인터페이스의 요소를 인스턴스화
		System.out.println(A.NUM);	// 상수 호출
		System.out.println(A.size);	// 상수 호출
		b.a();	// default 메서드 호출
		A.b();	// static 메서드 호출
		
		b.c();	// 재정의된 메서드 호출
		b.d();	// 재정의된 메서드 호출

		// 다형성 적용
		A b2 = new B();
		
		
	}

}
