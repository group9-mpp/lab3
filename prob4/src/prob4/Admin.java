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
	public static ArrayList<Property> listAllProperties(String city,ArrayList<Property> properties){
		ArrayList<Property> filteredList = new ArrayList<Property>();
		
		for (Property property : filteredList) {
			if(property.getAddress().getCity().equalsIgnoreCase(city)) {
				filteredList.add(property);
			}
		}
		return filteredList;
	}
}
