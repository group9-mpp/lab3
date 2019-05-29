package prob2;

import java.util.ArrayList;
import java.util.List;

public class Landlord {
	private List<Building> buildings;
	private String name;

	Landlord(String name) {
		this.buildings = new ArrayList<Building>();
		this.name = name;
	}

	void addBuilding(Building building) {
		buildings.add(building);
	}

	List<Building> getBuildings() {
		return buildings;
	}

	String getName() {
		return name;
	}

	double getProfit() {

		double profit = 0;

		for (Building building : buildings) {
			profit += building.getProfit();
		}

		return profit;

	}

}
