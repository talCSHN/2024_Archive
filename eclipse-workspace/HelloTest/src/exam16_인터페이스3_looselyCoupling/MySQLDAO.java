package exam16_인터페이스3_looselyCoupling;

public class MySQLDAO implements DBDAO {

	@Override
	public void connect() {
		System.out.println("MySQL connect 호출");

	}

}
