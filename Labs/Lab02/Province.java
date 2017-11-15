package ca.ciccc.java.model;

public class Province {

	private String name;
	private String capital;
	private int populationInMillions;

	public final static int MIN_POPULATION_IN_MILLIONS = 0;
	public final static int MAX_POPULATION_IN_MILLIONS = 38;

	public final static String DEFAULT_PROVINCE = "British Columbia";
	public final static String DEFAULT_CAPITAL = "Victoria";
	public final static int DEFAULT_POPULATION_IN_MILLIONS = 4;

	public Province() {

		this.name = DEFAULT_PROVINCE;
		this.capital = DEFAULT_CAPITAL;
		this.populationInMillions = DEFAULT_POPULATION_IN_MILLIONS;

	}

	public Province(String name, String capital, int populationInMillions) {

		if (isValidProvince(name) && isValidCapital(capital) && isValidPopulation(populationInMillions)) {
			setName(name);
			setCapital(capital);
			setPopulationInMillions(populationInMillions);
		} else {
			this.name = DEFAULT_CAPITAL;
			this.capital = DEFAULT_PROVINCE;
			this.populationInMillions = DEFAULT_POPULATION_IN_MILLIONS;
		}

	}

	public String getName() {

		return this.name;

	}

	public final void setName(String name) {

		if (name != null) {
			this.name = name;
		}

	}

	public String getCapital() {

		return this.capital;

	}

	public final void setCapital(String capital) {

		if (capital != null) {
			this.capital = capital;
		}

	}

	public int getPopulationInMillions() {

		return this.populationInMillions;

	}

	public final void setPopulationInMillions(int populationInMillions) {

		this.populationInMillions = populationInMillions;

	}

	private boolean isValidProvince(String province) {

		String[] provinces = { "Alberta", "British Columbia", "Manitoba", "New Brunswick", "Newfoundland and Labrador",
				"Nova Scotia", "Ontario", "Prince Edward Island", "Quebec", "Saskatchewan" };
		// "Nunavut", "Northwest Territories", "Yukon"

		boolean found = false;
		int i = 0;

		while (i < provinces.length && !found) {
			if (provinces[i].equals(province)) {
				found = true;
			}
			i++;
		}

		return found;

	}

	private boolean isValidCapital(String capital) {

		String[] capitals = { "Charlottetown", "Edmonton", "Fredericton", "Halifax", "Quebec City", "Regina",
				"St. John's", "Toronto", "Victoria", "Winnipeg" };
		// "Iqaluit", "Yellowknife", "Whitehorse"

		boolean found = false;

		for (int i = 0; i < capitals.length && !found; i++) {
			if (capitals[i].equals(capital)) {
				found = true;
			}
		}

		return found;

	}

	private boolean isValidPopulation(int population) {

		boolean rightValue = false;

		if (populationInMillions >= MIN_POPULATION_IN_MILLIONS && populationInMillions <= MAX_POPULATION_IN_MILLIONS) {
			rightValue = true;
		}

		return rightValue;

	}

	public String getDetails() {

		return "The capital of " + this.name + " (pop. " + this.populationInMillions + " million) is " + this.capital
				+ ".";

	}

	// @Override
	// public String toString() {
	// return "Province [name=" + name + ", capital=" + capital + ",
	// populationInMillions=" + populationInMillions
	// + "]";
	// }

}
