package ca.ciccc.java.model;

public class Country {

	String name = "Canada";
	Province[] provinces;

	public Country() {

		provinces = new Province[10];

	}

	public void displayAllProvinces() {

		for (Province p : provinces) {
			p.getDetails();
		}

	}

	public int howManyHaveThisPopulation(int min, int max) {

		int count = 0;

		for (Province p : provinces) {
			if (p.getPopulationInMillions() >= min && p.getPopulationInMillions() <= max) {
				count++;
			}
		}

		return count;

	}

}
