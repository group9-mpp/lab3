package prob4;

public class Condo extends Property {
	public Condo( Address address, int numOfFloors) {
		super(address);
		this.numOfFloors = numOfFloors;
		// TODO Auto-generated constructor stub
	}

	private int numOfFloors;

	

	public int getNumOfFloors() {
		return numOfFloors;
	}

	public void setNumOfFloors(int numOfFloors) {
		this.numOfFloors = numOfFloors;
	}

	@Override
	public double computeRent() {
		// TODO Auto-generated method stub
		return 400 * numOfFloors;
	}
	

}
