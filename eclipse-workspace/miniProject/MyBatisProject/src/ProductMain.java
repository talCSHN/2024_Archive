import java.util.List;
import java.util.Scanner;

import com.dao.ProductDAO;
import com.dto.ProductDTO;
import com.service.ProService;
import com.service.ProServiceImpl;

public class ProductMain {

   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      ProService service = new ProServiceImpl();
      service.setDao(new ProductDAO());
      while (true){
         
         System.out.println("------------");
         System.out.println("1.상품 목록 출력");
         System.out.println("0. 종료");
         System.out.println("------------");
         String num = scan.next();
         
         if("1".equals(num)) {
            List<ProductDTO> list = service.findProduct();
            for(ProductDTO e : list) {
               System.out.println(e);
            }
            
         }else if("0".equals(num)) {
               System.out.println("프로그램 종료됨.");
               System.exit(0);
         }
      }
   }

}