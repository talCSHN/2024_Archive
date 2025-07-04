import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import com.dao.UserProductDAO;
import com.dto.UserProductDTO;
import com.service.UserProductServiceImpl;

public class Main {

public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      UserProductServiceImpl service = new UserProductServiceImpl();
      
      SqlSession sqlsession = null;
      service.setDao(new UserProductDAO());
      
      while (true){
         
         System.out.println("번호를 입력하세요");
         System.out.println("1.전체 상품 조회");
         System.out.println("2.상품 검색");
         System.out.println("0. 종료");
         System.out.println("------------");
         String num = scan.next();
         
         //조회기능
         if("1".equals(num)) {
            List<UserProductDTO> list = service.findAllProduct();
            	for(UserProductDTO e : list) {
            		System.out.println(e);
            	}
         
         //검색기능
         }else if("2".equals(num)) {
        	System.out.println("찾고 싶은 상품 이름을 입력하세요.");
            String productName = scan.next();
        	List<UserProductDTO> list = service.findByProductName(productName);
         	for(UserProductDTO e : list) {
         		System.out.println(e);
         	} 
         }else if("0".equals(num)) {
             System.out.println("프로그램 종료됨.");
             System.exit(0);
         }
      }
   }

}