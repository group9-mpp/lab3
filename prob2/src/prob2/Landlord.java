package prob2;

import java.util.ArrayList;
import java.util.List;

public class Landlord {
	private List<Building> buildings;
	private String name;

	public Landlord(String name) {
		this.buildings = new ArrayList<Building>();
		this.name = name;
	}

	public void addBuilding(Building building) {
		buildings.add(building);
	}

	public List<Building> getBuildings() {
		return buildings;
	}

	public String getName() {
		return name;
	}

	public double getProfit() {

		double profit = 0;

		for (Building building : buildings) {
			profit += building.getProfit();
		}

		return profit;

	}

}
