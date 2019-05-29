package prob4;

public class House extends Property {
	public House( Address address, double lotSize) {
		super( address);
		this.lotSize = lotSize;
		// TODO Auto-generated constructor stub
	}

	private double lotSize;
	

	public double getLotSize() {
		return lotSize;
	}


	public void setLotSize(double lotSize) {
		this.lotSize = lotSize;
	}


	@Override
	public double computeRent() {
		// TODO Auto-generated method stub
		return 0.1* lotSize;
	}

}
