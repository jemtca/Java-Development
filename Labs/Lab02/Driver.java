package ca.ciccc.java.controller;

import ca.ciccc.java.model.Country;

public class Driver {

	public final static int MIN_POPULATION = 8;
	public final static int MAX_POPULATION = 13;

	public static void main(String[] args) {

		Country c = new Country();

		c.displayAllProvinces();
		c.displayExtraInfo(MIN_POPULATION, MAX_POPULATION);

	}

}
