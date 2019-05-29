package prob4;

import java.util.ArrayList;

public class Admin {
	public static double computeTotalRent(ArrayList<Property> properties) {
		double totalRent = 0;
		if (properties != null && !properties.isEmpty()) {
			for (Property property : properties) {
				totalRent += property.computeRent();
			}
		}

		return totalRent;
	}
}
