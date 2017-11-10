package model;

/**
 * Model class 
 * 
 * @author Jesús
 *
 */
public class Model {
	
	/**
	 * First name
	 */
	private String firstName;
	
	/**
	 * Last name
	 */
	private String lastName;
	
	/**
	 * Height (inches)
	 */
	private int height;
	
	/**
	 * Weight (pounds)
	 */
	private double weight;
	
	/**
	 * Travels: true, does not travel: false
	 */
	private boolean canTravel;
	
	/**
	 * Smokes: true, does not smoke: false
	 */
	private boolean smokes;
	
	/**
	 * Default value for occupation
	 */
	private static String occupation = "modeling";

	/**
	 * Minimum length for a string
	 */
	public static final int STRING_MIN = 3;
	
	/**
	 * Maximum length for a string
	 */
	public static final int STRING_MAX = 20;

	/**
	 * Minimum height (inches)
	 */
	public static final int HEIGHT_MIN = 24;
	
	/**
	 * Maximum height (inches)
	 */
	public static final int HEIGHT_MAX = 84;

	/**
	 * Minimum weight (pounds)
	 */
	public static final double WEIGHT_MIN = 80;
	
	/**
	 * Maximum height (pounds)
	 */
	public static final double WEIGHT_MAX = 280;

	/**
	 * How many kilograms are in one pound
	 */
	public static final double ONE_POUND_TO_KG = 0.453592;
	
	/**
	 * How many pounds are in one kilogram
	 */
	public static final double ONE_KG_TO_POUND = 2.20462;
	
	/**
	 * How many inches are in one foot
	 */
	public static final int ONE_FOOT_TO_INCHES = 12;
	
	/**
	 * How many centimeters are in one inch
	 */
	public static final double ONE_INCH_TO_CM = 2.54;

	// public static final int INCHES_PER_FOOT = 12;
	
	/**
	 * Minimum rate per hour
	 */
	public static final int BASE_RATE_DOLLARS_PER_HOUR = 60;
	
	/**
	 * Minimum inches to get an hourly bonus
	 */
	public static final int TALL_INCHES = 67;
	
	/**
	 * Maximum pounds to get an hourly bonus
	 */
	public static final double THIN_POUNDS = 140.0;
	
	/**
	 * Hourly bonus (height and weight)
	 */
	public static final int TALL_THIN_BONUS_DOLLARS_PER_HOUR = 5;
	
	/**
	 * Hourly bonus (if can travel)
	 */
	public static final int TRAVEL_BONUS_DOLLARS_PER_HOUR = 4;
	
	/**
	 * Penalty (if it smokes)
	 */
	public static final int SMOKER_DEDUCTION_DOLLARS_PER_HOUR = 10;

	
	/**
	* Constructor: no parameters
	*/
	public Model() {

	}

	/**
	 * Constructor: six parameters
	 * 
	 * @param firstName (String firstName)
	 * @param lastname (String lastName)
	 * @param height (int height (inches))
	 * @param weight (double weight (pounds))
	 * @param canTravel (boolean canTravel)
	 * @param smokes (boolean Smokes)
	 */
	public Model(String firstName, String lastname, int height, double weight, boolean canTravel, boolean smokes) {

		setFirstName(firstName);
		setLastName(lastname);
		setHeight(height);
		setWeight(weight);
		setCanTravel(canTravel);
		setSmokes(smokes);

	}

	/**
	 * Constructor: four parameters
	 * 
	 * @param firstName (String firstName)
	 * @param lastName (String lastName)
	 * @param height (int height (inches))
	 * @param weight (double weight (pounds))
	 */
	public Model(String firstName, String lastName, int height, double weight) {

		setFirstName(firstName);
		setLastName(lastName);
		setHeight(height);
		setWeight(weight);
		setCanTravel(true);
		setSmokes(false);

	}

	/**
	 * First name accessor
	 * 
	 * @return first name
	 */
	public String getFirstName() {

		return this.firstName;

	}

	/**
	 * First name mutator (string between 3 and 20 characters)
	 * 
	 * @param firstName (String firstName)
	 */
	public final void setFirstName(String firstName) {

		if (firstName != null && firstName.length() >= STRING_MIN && firstName.length() <= STRING_MAX) {
			this.firstName = firstName;
		}

	}

	/**
	 * Last name accessor
	 * 
	 * @return last name
	 */
	public String getLastName() {

		return this.lastName;

	}

	/**
	 * Last name mutator (string between 3 and 20 characters)
	 * 
	 * @param lastName (String lastName)
	 */
	public final void setLastName(String lastName) {

		if (lastName != null && lastName.length() >= STRING_MIN && lastName.length() <= STRING_MAX) {
			this.lastName = lastName;
		}

	}

	/**
	 * Height accessor
	 * 
	 * @return height (inches)
	 */
	public int getHeight() {

		return this.height;

	}

	/**
	 * Height mutator (integer between 24 and 84 inches)
	 * 
	 * @param height (int height)
	 */
	public final void setHeight(int height) {

		if (height >= HEIGHT_MIN && height <= HEIGHT_MAX) {
			this.height = height;
		}

	}

	/**
	 * Weight accessor
	 * 
	 * @return weight (pounds)
	 */
	public double getWeight() {

		return this.weight;

	}

	/**
	 * Weight mutator (double between 80 and 280 pounds)
	 * 
	 * @param weight (double weight) 
	 */
	public final void setWeight(double weight) {

		if (weight >= WEIGHT_MIN && weight <= WEIGHT_MAX) {
			this.weight = weight;
		}

	}

	/**
	 * CanTravel accessor
	 * 
	 * @return true if it travels, false otherwise
	 */
	public boolean getCanTravel() {

		return this.canTravel;

	}

	/**
	 * Travel mutator
	 * 
	 * @param canTravel (boolean canTravel)
	 */
	public final void setCanTravel(boolean canTravel) {

		this.canTravel = canTravel;

	}

	/**
	 * Smokes accessor
	 * 
	 * @return true if it smokes, false otherwise
	 */
	public boolean getSmokes() {

		return this.smokes;

	}

	/**
	 * Smokes mutator
	 * 
	 * @param smokes (boolean smokes)
	 */
	public final void setSmokes(boolean smokes) {

		this.smokes = smokes;

	}

	/**
	 * Method that converts inches to feet and inches
	 * 
	 * @return result (string with the height in feet and inches)
	 */
	public String getHeightInFeetAndInches() {

		int inches = getHeight();

		String result = "";

		int feet = inches / 12;
		int leftover = inches % 12;

		if (leftover == 0) {
			result = feet + " feet.";
		} else if (leftover == 1) {
			result = feet + " feet " + leftover + " inch.";
		} else {
			result = feet + " feet " + leftover + " inches.";
		}

		return result;

	}

	/**
	 * Method that converts feet and inches to inches
	 * 
	 * @param feet (int feet)
	 * @param inches (int inches)
	 */
	public final void setHeight(int feet, int inches) {

		int heightToInches = (feet * ONE_FOOT_TO_INCHES) + inches;

		setHeight(heightToInches);

	}

	/**
	 * Method that converts pounds to kilograms
	 * 
	 * @return the weight in kilograms
	 */
	public long getWeightKg() {

		return Math.round(getWeight() * ONE_POUND_TO_KG);

	}

	/**
	 * Method that convert kilograms to pounds
	 * 
	 * @param kilograms (long kilograms)
	 */
	public final void setWeight(long kilograms) {

		double weightToPounds = kilograms * ONE_KG_TO_POUND;

		setWeight(weightToPounds);

	}

	/**
	 * Occupation accessor
	 * 
	 * @return the occupation
	 */
	public static String getOcupation() {

		return occupation;

	}

	/**
	 * Method that calculates the rate per hour
	 * 
	 * @return amount (hourly rate in $)
	 */
	public int calculatePayDollarsPerHour() {

		int amount = BASE_RATE_DOLLARS_PER_HOUR;

		if (getHeight() >= TALL_INCHES && getWeight() <= THIN_POUNDS) {
			amount = amount + TALL_THIN_BONUS_DOLLARS_PER_HOUR;
		}

		if (getCanTravel()) {
			amount = amount + TRAVEL_BONUS_DOLLARS_PER_HOUR;
		}

		if (getSmokes()) {
			amount = amount - SMOKER_DEDUCTION_DOLLARS_PER_HOUR;
		}

		return amount;

	}

	/**
	 * Method that prints the information of a model instance
	 */
	public void printDetails() {

		System.out.println("Name: " + getFirstName() + " " + getLastName() + ".");
		System.out.println("Height: " + getHeight() + " inches.");
		System.out.println("Weight: " + Math.round(getWeight()) + " pounds.");

		if (getCanTravel()) {
			System.out.println("Does Travel.");
		} else {
			System.out.println("Does not travel.");
		}

		if (getSmokes()) {
			System.out.println("Does smoke.");
		} else {
			System.out.println("Does not travel.");
		}

		System.out.println();

	}

	/**
	 * Method that prints the information of a model instance, including the hourly rate
	 */
	public void displayModelDetails() {

		System.out.println("Name: " + getFirstName() + " " + getLastName() + ".");
		System.out.println("Height: " + getHeightInFeetAndInches());
		System.out.println("Weight: " + Math.round(getWeight()) + " pounds.");

		if (getCanTravel()) {
			System.out.println("Travels: yep.");
		} else {
			System.out.println("Travels: nope.");
		}

		if (getSmokes()) {
			System.out.println("Somkes: yep.");
		} else {
			System.out.println("Smokes: nope.");
		}

		System.out.println("Hourly rate: $" + calculatePayDollarsPerHour() + ".");

		System.out.println();

	}

	/**
	 * Method that print the information of a model instance, including the hourly rate
	 * 
	 * true: metric units
	 * false: imperial units
	 * 
	 * @param metricUnits (boolean metricUnits)
	 */
	public void displayModelDetails(boolean metricUnits) {

		if (metricUnits) {

			System.out.println("Name: " + getFirstName() + " " + getLastName() + ".");
			System.out.println("Height: " + Math.round(getHeight() * ONE_INCH_TO_CM) + " cm.");
			System.out.println("Weight: " + getWeightKg() + " kg.");

			if (getCanTravel()) {
				System.out.println("Travels: yep.");
			} else {
				System.out.println("Travels: nope.");
			}

			if (getSmokes()) {
				System.out.println("Somkes: yep.");
			} else {
				System.out.println("Smokes: nope.");
			}

			System.out.println("Hourly rate: $" + calculatePayDollarsPerHour() + ".");

		} else {

			System.out.println("Name: " + getFirstName() + " " + getLastName() + ".");
			System.out.println("Height: " + getHeight() + " inches.");
			System.out.println("Weight: " + Math.round(getWeight()) + " pounds.");

			if (getCanTravel()) {
				System.out.println("Travels: yep.");
			} else {
				System.out.println("Travels: nope.");
			}

			if (getSmokes()) {
				System.out.println("Smokes: yep.");
			} else {
				System.out.println("Smokes: nope.");
			}

			System.out.println("Hourly rate: $" + calculatePayDollarsPerHour() + ".");

		}

		System.out.println();

	}

	// @Override
	// public String toString() {
	// return "Model [firstName=" + firstName + ", lastName=" + lastName + ",
	// height=" + height + ", weight=" + weight
	// + ", canTravel=" + canTravel + ", smokes=" + smokes + "]";
	// }

}
