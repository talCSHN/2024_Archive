package exam16_인터페이스3_looselyCoupling;

public class DBService {
	
	//다형성
	DBDAO dao;
	
	public void setDAO(DBDAO dao) {
		this.dao = dao;
	}
	
	public void connect() {
		dao.connect();
	}

}
