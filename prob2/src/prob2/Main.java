package prob2;

public class Main {

	public static void main(String[] args) {

		Landlord landLord = new Landlord("Mr. John Doe");

		for (int i = 0; i < 10; i++) {

			Building building = new Building(20 * getRandomNumber());

			for (int j = 0; j < 5; ++j) {
				Apartment apartment = new Apartment(100 * getRandomNumber());
				building.addApartment(apartment);
			}

			landLord.addBuilding(building);
		}

		System.out.printf("\n %s profit is : $ %,.2f", landLord.getName(), landLord.getProfit());

	}

	public static double getRandomNumber() {
		return Math.random();
	}

}
