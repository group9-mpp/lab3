package prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {

	private double maintenace;

	private List<Apartment> apartments;

	public Building(double maintenace) {
		this.apartments = new ArrayList<Apartment>();
		this.maintenace = maintenace;
	}

	public void addApartment(Apartment apartment) {
		apartments.add(apartment);
	}

	public List<Apartment> getApartments() {
		return apartments;
	}

	public double getProfit() {

		double totalRent = 0;

		for (Apartment apartment : apartments) {
			totalRent += apartment.getRent();
		}

		return totalRent - maintenace;

	}

}
