package prob4;

import java.util.ArrayList;

public class Driver {

	public static void main(String[] args) {

		ArrayList<Property> properties = new ArrayList<Property>();
		// add houses
		properties.add(new House(new Address("2nd street", "fairfiled", "IOWA","523353" ), 12000));
		properties.add(new House(new Address("3rd street", "fairfiled", "IOWA","523353" ), 10000));
		properties.add(new House( new Address("4nd street", "fairfiled", "IOWA","523353" ), 8000));
		
		// add condos
		properties.add(new Condo( new Address("34nd street", "fairfiled", "IOWA","523353" ), 3));
		properties.add(new Condo( new Address("25nd street", "fairfiled", "IOWA","523353" ), 5));
		properties.add(new Condo( new Address("23nd street", "fairfiled", "IOWA","523353" ), 4));
		
		// add trailers
		properties.add(new Trailer( new Address("14th street", "fairfiled", "IOWA","523353" ), "Utopia Park"));
		properties.add(new Trailer( new Address("14th street", "fairfiled", "IOWA","523353" ), "Utopia Park"));
		properties.add(new Trailer( new Address("15th street", "fairfiled", "IOWA","523353" ), "Utopia Park"));
	
		double totalRent = Admin.computeTotalRent(properties);
		System.out.println(totalRent);
	}
}
