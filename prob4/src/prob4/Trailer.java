package prob4;

public class Trailer extends Property {
	private String trailerPark;

	public Trailer( Address address,String trailerPark) {
		super(address);
		this.trailerPark = trailerPark;
		// TODO Auto-generated constructor stub
	}
	

	public String getTrailerPark() {
		return trailerPark;
	}


	public void setTrailerPark(String trailerPark) {
		this.trailerPark = trailerPark;
	}


	@Override
	public double computeRent() {
		// TODO Auto-generated method stub
		return 500;
	}

}
