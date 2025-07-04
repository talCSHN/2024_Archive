package exam07_제어문;

import java.util.Scanner;

public class Statement02_if_else문 {

	public static void main(String[] args) {
		
		// if~else문 : 조건에 따라서 실행하는 문장이 달라짐
		// 조건이 true면 문장2 실행, false인 경우 문장3 실행
		
		System.out.println("문장1");
		
		if ( true ) {
			System.out.println("문장2");
		} else {
			System.out.println("문장3-1");
			System.out.println("문장3-2");
		}
		
		System.out.println("end");
		
	}

}
