package exam16_인터페이스3_looselyCoupling;

public class OracleDAO implements DBDAO {

	@Override
	public void connect() {
		System.out.println("OracleDAO connect 호출");

	}

}
