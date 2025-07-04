import java.util.List;
import java.util.Scanner;

import com.dao.inventoryDAO;
import com.dao.productDAO;
import com.dao.salesDAO;
import com.dao.userDAO;
import com.dto.inventoryDTO;
import com.dto.productDTO;
import com.dto.salesDTO;
import com.dto.userDTO;
import com.service.inventoryService;
import com.service.inventoryServiceImpl;
import com.service.productService;
import com.service.productServiceImpl;
import com.service.salesService;
import com.service.salesServiceImpl;
import com.service.userService;
import com.service.userServiceImpl;

public class newMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		userService service = new userServiceImpl();
		productService service2 = new productServiceImpl();
		inventoryService service3 = new inventoryServiceImpl();
		salesService service4 = new salesServiceImpl();
		
		service.setDao(new userDAO());
		service2.setDao(new productDAO());
		service3.setDao(new inventoryDAO());
		service4.setDao(new salesDAO());
		
		while(true) {
			System.out.println("1. user");
			System.out.println("2. product");
			System.out.println("3. inventory");
			System.out.println("4. sales");
			System.out.println("5. sales y");
			System.out.println("6. sales m");
			System.out.println("7. sales d");
			System.out.println("0. exit");
			System.out.println("---------------");
			String num = scan.next();
			if("1".equals(num)) {
				List<userDTO> list = service.findAll();
				for(userDTO p : list)
				System.out.println(p);
			}else if("2".equals(num)) {
				List<productDTO> list = service2.findAll();
				for(productDTO i : list)
				System.out.println(i);
			}else if("3".equals(num)) {
				List<inventoryDTO> list = service3.findAll();
				for(inventoryDTO i : list)
				System.out.println(i);
			}else if("4".equals(num)) {
				List<salesDTO> list = service4.findAll();
				for(salesDTO i : list)
				System.out.println(i);
			}else if("5".equals(num)) {
				List<salesDTO> list = service4.findTy();
				for(salesDTO i : list)
				System.out.println(i);
			}else if("6".equals(num)) {
				List<salesDTO> list = service4.findTm();
				for(salesDTO i : list)
				System.out.println(i);
			}else if("7".equals(num)) {
				List<salesDTO> list = service4.findTd();
				for(salesDTO i : list)
				System.out.println(i);
			}else if("0".equals(num)) {
				System.out.println("종료");
				System.exit(0);
			}
		}

	}

}
