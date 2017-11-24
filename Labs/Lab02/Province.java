package ca.ciccc.java.model;

/**
 * 
 * @author Jesús
 *
 */
public class Province {

	/**
	 * Name of the province
	 */
	private String name;
	/**
	 * Name of the capital
	 */
	private String capital;
	/**
	 * Population in million of each province
	 */
	private int populationInMillions;

	/**
	 * Minimum population (millions)
	 */
	public final static int MIN_POPULATION_IN_MILLIONS = 0;
	/**
	 * Maximum population (millions)
	 */
	public final static int MAX_POPULATION_IN_MILLIONS = 38;

	/**
	 * Default province (British Columbia)
	 */
	public final static String DEFAULT_PROVINCE = "British Columbia";
	/**
	 * Default capital (Victoria)
	 */
	public final static String DEFAULT_CAPITAL = "Victoria";
	/**
	 * Default Population (4 millions)
	 */
	public final static int DEFAULT_POPULATION_IN_MILLIONS = 4;

	/**
	 * Constructor: no parameters
	 */
	public Province() {

		this.name = DEFAULT_PROVINCE;
		this.capital = DEFAULT_CAPITAL;
		this.populationInMillions = DEFAULT_POPULATION_IN_MILLIONS;

	}

	/**
	 * Constructor: three parameters
	 * 
	 * @param name (String name)
	 * @param capital (String capital)
	 * @param populationInMillions (int populationInMillions)
	 */
	public Province(String name, String capital, int populationInMillions) {

		if (isValidProvince(name) && isValidCapital(capital) && isValidPopulation(populationInMillions)) {
			setName(name);
			setCapital(capital);
			setPopulationInMillions(populationInMillions);
		} else {
			this.name = DEFAULT_PROVINCE;
			this.capital = DEFAULT_CAPITAL;
			this.populationInMillions = DEFAULT_POPULATION_IN_MILLIONS;
		}

	}

	/**
	 * Name of the province accessor
	 * 
	 * @return name
	 */
	public String getName() {

		return this.name;

	}

	/**
	 * Name of the province mutator
	 * 
	 * @param name (String name)
	 */
	public final void setName(String name) {

		if (name != null) {
			this.name = name;
		}

	}

	/**
	 * Name of the capital accessor
	 * 
	 * @return capital
	 */
	public String getCapital() {

		return this.capital;

	}

	/**
	 * Name of the capital mutator
	 * 
	 * @param capital (String capital)
	 */
	public final void setCapital(String capital) {

		if (capital != null) {
			this.capital = capital;
		}

	}

	/**
	 * Population in millions accessor
	 * 
	 * @return populationInMillions
	 */
	public int getPopulationInMillions() {

		return this.populationInMillions;

	}

	/**
	 * Population in millions mutator
	 * 
	 * @param populationInMillions (int populationInMillions)
	 */
	public final void setPopulationInMillions(int populationInMillions) {

		this.populationInMillions = populationInMillions;

	}

	/**
	 * Validation method for provinces (true if it is a valid province from Canada, false otherwise)
	 * 
	 * @param province (String province)
	 * @return found
	 */
	private boolean isValidProvince(String province) {

		String[] provinces = { "Alberta", "British Columbia", "Manitoba", "New Brunswick", "Newfoundland and Labrador",
				"Nova Scotia", "Ontario", "Prince Edward Island", "Quebec", "Saskatchewan" };
		// "Nunavut", "Northwest Territories", "Yukon"

		boolean found = false;
		int i = 0;

		while (i < provinces.length && !found) {
			if (province.equals(provinces[i])) {
				found = true;
			}
			i++;
		}

		return found;

	}

	/**
	 * Validation method for capitals (true if it is a valid capital from the provinces of Canada, false otherwise)
	 * 
	 * @param capital (String capital)
	 * @return found
	 */
	private boolean isValidCapital(String capital) {

		String[] capitals = { "Charlottetown", "Edmonton", "Fredericton", "Halifax", "Quebec City", "Regina",
				"St. John's", "Toronto", "Victoria", "Winnipeg" };
		// "Iqaluit", "Yellowknife", "Whitehorse"

		boolean found = false;

		for (int i = 0; i < capitals.length && !found; i++) {
			if (capital.equals(capitals[i])) {
				found = true;
			}
		}

		return found;

	}

	/**
	 * Validation method to check provinces between a minimum and maximum population (millions)
	 * 
	 * @param population (int population)
	 * @return rightVslue
	 */
	private boolean isValidPopulation(int population) {

		boolean rightValue = false;

		if (populationInMillions >= MIN_POPULATION_IN_MILLIONS && populationInMillions <= MAX_POPULATION_IN_MILLIONS) {
			rightValue = true;
		}

		return rightValue;

	}

	/**
	 * Method that prints the information of a province instance
	 * 
	 * @return string
	 */
	public String getDetails() {

		return "The capital of " + this.name + " (pop. " + this.populationInMillions + " million) is " + this.capital
				+ ".";

	}

	// @Override
	// public String toString() {
	// return "Province [name= " + name + ", capital= " + capital + ",
	// populationInMillions= " + populationInMillions
	// + "]";
	// }

}
