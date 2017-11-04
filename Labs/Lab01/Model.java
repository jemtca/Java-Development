package model;

public class Model {

	private String firstName;
	private String lastName;
	private int height;
	private double weight;
	private boolean canTravel;
	private boolean smokes;
	private static String occupation = "modeling";

	public static final int STRING_MIN = 3;
	public static final int STRING_MAX = 20;

	public static final int HEIGHT_MIN = 24;
	public static final int HEIGHT_MAX = 84;

	public static final double WEIGHT_MIN = 80;
	public static final double WEIGHT_MAX = 280;

	public static final double ONE_POUND_TO_KG = 0.453592;
	public static final double ONE_KG_TO_POUND = 2.20462;
	public static final int ONE_FEET_TO_INCHES = 12;

	Model() {

	}

	Model(String firstName, String lastname, int height, int weight, boolean canTravel, boolean smokes) {

		setFirstName(firstName);
		setLastName(lastname);
		setHeight(height);
		setWeight(weight);
		setCanTravel(canTravel);
		setSmokes(smokes);

	}

	Model(String firstName, String lastName, int weightInches, int heigthPounds) {

		setFirstName(firstName);
		setLastName(lastName);
		setWeight(weightInches);
		setHeight(heigthPounds);
		setCanTravel(true);
		setSmokes(false);

	}

	public String getFirstName() {

		return this.firstName;

	}

	public final void setFirstName(String firstName) {

		if (firstName != null && firstName.length() >= STRING_MIN && firstName.length() <= STRING_MAX) {
			this.firstName = firstName;
		}

	}

	public String getLastName() {

		return this.lastName;

	}

	public final void setLastName(String lastName) {

		if (lastName != null && lastName.length() >= STRING_MIN && lastName.length() <= STRING_MAX) {
			this.lastName = lastName;
		}

	}

	public int getHeight() {

		return this.height;

	}

	public final void setHeight(int height) {

		if (height >= HEIGHT_MIN && height <= HEIGHT_MAX) {
			this.height = height;
		}

	}

	public double getWeight() {

		return this.weight;

	}

	public final void setWeight(double weight) {

		if (weight >= WEIGHT_MIN && weight <= WEIGHT_MAX) {
			this.weight = weight;
		}

	}

	public boolean getCanTravel() {

		return this.canTravel;

	}

	public final void setCanTravel(boolean canTravel) {

		this.canTravel = canTravel;

	}

	public boolean getSmokes() {

		return this.smokes;

	}

	public final void setSmokes(boolean smokes) {

		this.smokes = smokes;

	}

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

	public final void setHeight(int feet, int inches) {

		int heightToInches = (feet * ONE_FEET_TO_INCHES) + inches;

		setHeight(heightToInches);

	}

	public long getWeightKg() {

		return (long) (getWeight() * ONE_POUND_TO_KG);

	}

	public final void setWeight(long kilograms) {

		double weightToPounds = kilograms * ONE_KG_TO_POUND;

		setWeight(weightToPounds);

	}

	public static String getOcupation() {

		return occupation;

	}

}
