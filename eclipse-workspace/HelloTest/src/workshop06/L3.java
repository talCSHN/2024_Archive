package workshop06;

public class L3 extends Car implements Temp {

	public L3() {
		// TODO Auto-generated constructor stub
	}

	public L3(String name, String engine, int oilTank, int oilSize, int distance) {
		super(name, engine, oilTank, oilSize, distance);
	}

	@Override
	public int getTempGage() {
		return 0;
	}

	@Override
	public void go(int distance) {

	}

	@Override
	public void setOil(int oilSize) {

	}

}
