package ca.ciccc.java.model;

public class Country {

	/**
	 * Name of the country
	 */
	private String name;
	/**
	 * Array of provinces
	 */
	private Province[] provinces = new Province[12];

	/**
	 * Constructor: no parameters
	 */
	public Country() {

		name = "Canada";

		provinces[0] = new Province(); // default constructor
		provinces[1] = new Province("Alberta", "Edmonton", 4);
		provinces[2] = new Province("British Columbia", "Vancouver", 1); // wrong
		provinces[3] = new Province("Manitoba", "Winnipeg", 1);
		provinces[4] = new Province("New Brunswick", "Fredericton", 1);
		provinces[5] = new Province("Newfoundland and Labrador", "St. John's", 1);
		provinces[6] = new Province("Nova Scotia", "Halifax", 1);
		provinces[7] = new Province("Ontario", "Toronto", 13);
		provinces[8] = new Province("Prince Edward Island", "Charlottetown", 1);
		provinces[9] = new Province("Quebec", "Quebec City", 8);
		provinces[10] = new Province("Saskatchewan", "Regina", 1);
		provinces[11] = new Province("California", "Sacramento", 3); // wrong

	}

	/**
	 * Method that prints the information of each province in the array
	 */
	public void displayAllProvinces() {

		for (Province p : provinces) {
			if (p != null) {
				System.out.println(p.getDetails());
			}
		}

	}

	/**
	 * Method that counts how many provinces are between a minimum and a maximum population (millions)
	 * 
	 * @param min (int min)
	 * @param max (int max)
	 * @return count
	 */
	public int howManyHaveThisPopulation(int min, int max) {

		int count = 0;

		for (Province p : provinces) {
			if (p != null && p.getPopulationInMillions() >= min && p.getPopulationInMillions() <= max) {
				count++;
			}
		}

		return count;

	}

	/**
	 * Method that prints extra information of the country
	 * 
	 * @param min (int min)
	 * @param max (int max)
	 */
	public void displayExtraInfo(int min, int max) {

		System.out.println("\nThere are " + howManyHaveThisPopulation(min, max) + " provinces in " + this.name
				+ " with population between " + min + " and " + max + " millions.");

	}

}
