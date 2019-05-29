package prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {

	private double maintenace;

	private List<Apartment> apartments;

	Building(double maintenace) {
		this.apartments = new ArrayList<Apartment>();
		this.maintenace = maintenace;
	}

	void addApartment(Apartment apartment) {
		apartments.add(apartment);
	}

	List<Apartment> getApartments() {
		return apartments;
	}

	public double getProfit() {

		double profit = 0 - maintenace;

		for (Apartment apartment : apartments) {
			profit += apartment.rent;
		}

		return profit;

	}

}
