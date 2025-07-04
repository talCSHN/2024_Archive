package com.jdbc4_DML3_트랜잭션;

import java.util.List;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {

		Scanner scan  = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("1. 전체목록");
			System.out.println("2. UserID저장");
			System.out.println("3. UserID삭제");
			System.out.println("4. 트랜잭션");
			System.out.println("0. 종료");
			System.out.println("-------------------");
			String num = scan.next();
			if("0".equals(num)) {
				System.out.println("프로그램 종료됨.");
				System.exit(0);
			}else if("1".equals(num)) {
				// DeptService 연동
				UserService service = new UserServiceImpl();
			    List<UserDTO> list =service.select();
			    for (UserDTO dto : list) {
					System.out.println(dto);
				}
			}else if("2".equals(num)) {
				System.out.println("UserID를 입력하세요.");
				String UserID = scan.next();
				System.out.println("UserName을 입력하세요.");
				String Username = scan.next();
				System.out.println("Email을 입력하세요.");
				String Email = scan.next();
				System.out.println("PhoneNumber를 입력하세요.");
				String PhoneNumber = scan.next();
				System.out.println("UserSSN을 입력하세요.");
				String UserSSN = scan.next();
				
				//DTO 저장해서 DAO로 전달
				UserDTO dto = new UserDTO(UserID, Username, Email, PhoneNumber, UserSSN);
						
				// DeptService 연동
				UserService service = new UserServiceImpl();						
				int n=0;
				try {
					n = service.insert(dto);
					System.out.println(n+" 개가 저장됨.");
				} catch (DuplicatedUserException e) {
					System.out.println(e.getMessage());
				}

				}else if("3".equals(num)) {
				System.out.println("삭제할 UserID를 입력하세요.");
				String UserID = scan.next();
				// DeptService 연동
				UserService service = new UserServiceImpl();						
				int n = service.delete(UserID);
				System.out.println(n+" 개가 삭제됨.");			

				}else if("4".equals(num)) {
				
				//저장할 데이터- 정상데이터( deptno 중복되지 않은 경우 )
				UserDTO dto = new UserDTO("E032", "이재명", "jaemyong@gmail.com", "010-7489-4524", "651223-1157475");
				String UserID = "E032";
				
				UserService service = new UserServiceImpl();
				try {
					service.insertDelete(dto, UserID);
				} catch (DuplicatedUserException e) {
					e.printStackTrace();
				}
				
			
				}else {
				System.out.println("번호를 잘못 입력했습니다.");
				}
			
			
			}//end while
		
		}// end main
	}//end class


