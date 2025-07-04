import java.util.List;
import java.util.Scanner;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.InventoryDAO;
import com.dto.InventoryDTO;
import com.service.InventoryService;
import com.service.InventoryServiceImpl;

public class InventoryMain {

public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      InventoryService service = new InventoryServiceImpl();
      
      SqlSession sqlsession = null;
      service.setDao(new InventoryDAO());
      
      while (true){
         
         System.out.println("------------");
         System.out.println("1.재고 목록 조회");
         System.out.println("2.재고 목록 추가");
         System.out.println("3.재고 목록 수정");
         System.out.println("4.재고 목록 삭제");
         System.out.println("0. 종료");
         System.out.println("------------");
         String num = scan.next();
         
         if("1".equals(num)) {
            List<InventoryDTO> list = service.findAllInventory();
            for(InventoryDTO e : list) {
               System.out.println(e);
            }

            
         }else if("2".equals(num) ) {
            System.out.println("추가할 재고ID를 입력하세요.");
            String inventoryID = scan.next();
            System.out.println("추가할 상품ID를 입력하세요.");
            String productID = scan.next();
            System.out.println("추가할 재고 갯수를 입력하세요.");
            int quantity = scan.nextInt();
            InventoryDTO dto = new InventoryDTO(inventoryID, productID, quantity);
            sqlsession = MySqlSessionFactory.getSession();
            int result = service.insertInventory(sqlsession, dto);
             if (result > 0) {
                 System.out.println("재고가 성공적으로 추가되었습니다.");}
             
         }else if("3".equals(num)) {
             
             System.out.println("수정할 재고ID를 입력하세요.");
             String inventoryID = scan.next();
             System.out.println("수정할 상품ID를 입력하세요.");
             String productID = scan.next();
             System.out.println("수정할 재고 갯수를 입력하세요.");
             int quantity = scan.nextInt();
             InventoryDTO dto = new InventoryDTO(inventoryID, productID, quantity);
             sqlsession = MySqlSessionFactory.getSession();
             int result = service.updateInventory(sqlsession, dto);
             if (result > 0) {
                 System.out.println("재고가 성공적으로 수정되었습니다.");}
 
         }else if("4".equals(num)) {
            
            System.out.println("삭제할 재고ID를 입력하세요.");
            String inventoryID = scan.next();
            int n = service.removeByInventoryID(inventoryID);
            System.out.println(n+" 개가 삭제됨.");   
            
         }else if("0".equals(num)) {
             System.out.println("프로그램 종료됨.");
             System.exit(0);
         }
      }
   }

}