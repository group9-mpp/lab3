package prob4;

public abstract class Property {
	private Address address;
	
	
	
	public Property(Address address) {
		super();
		this.address = address;
	}

	public abstract double computeRent();


	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	
	

}
