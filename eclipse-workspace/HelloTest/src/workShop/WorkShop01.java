package workShop;

public class WorkShop01 {

	public static void main(String[] args) {
		
		// [문제 1]
		String name = "홍길동";
		int age = 20;
		String address = "서울";
		
		System.out.println("이름은 " + name);
		System.out.println("나이는 " + age + " 주소는 " + address);
		System.out.println();
		
		System.out.print("이름은 " + name);
		System.out.print("\n나이는 " + age + " 주소는 " + address);
		System.out.println();
		System.out.println();
		
		System.out.printf("이름은 %s \n나이는 %d 주소는 %s", name, age, address);
		System.out.println();
		System.out.println();
		
		// [문제 2]
		long num = 9511261165227L;
		System.out.println("나의 주민번호: " + num);
		System.out.println();
		
		// [문제 3]
		int n = 10;
		int n2 = 20;
		
		n = 20;
		n2 = 10;
		
		System.out.println("n 값은 " + n);
		System.out.println("n2 값은 " + n2);
		
	}

}
