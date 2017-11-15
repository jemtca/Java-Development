package ca.ciccc.java.controller;

import ca.ciccc.java.model.Country;
import ca.ciccc.java.model.Province;

public class Driver {

	public static void main(String[] args) {

		Country c = new Country();

		Province p1 = new Province();
		Province p2 = new Province("Alberta", "Calgary", 4);
		Province p3 = new Province("Saskachewan", "Saskatoon", 1);
		Province p4 = new Province("California", "Los Angeles", 3);

		// c.displayAllProvinces();

	}

}
