package exam16_인터페이스3_looselyCoupling;

public class Testmain {

	public static void main(String[] args) {
		
		DBService service = new DBService();
		
		// oracle
		service.setDAO(new OracleDAO());
		service.connect();
		
		// mysql
		service.setDAO(new MySQLDAO());
		service.connect();


	}

}
