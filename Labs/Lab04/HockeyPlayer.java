package ca.ciccc.java.model;

/**
 * 
 * @author Jesús
 *
 */
public class HockeyPlayer extends Employee implements Comparable<HockeyPlayer> {

	/**
	 * Private attribute for the number of goals
	 */
	private int numberOfGoals;

	/**
	 * Constant: Overtime rate for hockey players
	 */
	public final double OVER_TIME_RATE_FOR_HOCKEYPLAYER = 0.0;

	/**
	 * Constructor: two parameters
	 * 
	 * @param name (String name)
	 * @param numberOfGoals (int numberOfGoals)
	 */
	public HockeyPlayer(String name, int numberOfGoals) {

		super(name);
		setNumberOfGoals(numberOfGoals);

	}

	/**
	 * NumberOfGoals accessor
	 * 
	 * @return numberOfGoals
	 */
	public double getNumberOfGoals() {

		return this.numberOfGoals;

	}

	/**
	 * NumberOfGoals mutator
	 * 
	 * @param numberOfGoals (int numberOfGoals)
	 */
	public final void setNumberOfGoals(int numberOfGoals) {

		this.numberOfGoals = numberOfGoals;

	}

	@Override
	public DressCode getDressCode() {

		return DressCode.JERSEY;

	}

	@Override
	public boolean isPaidSalary() {

		return true;

	}

	@Override
	public boolean postSecondaryEducationRequired() {

		return false;

	}

	@Override
	public String getWorkVerb() {

		return "play";

	}

	@Override
	public double getOverTimePayRate() {

		return OVER_TIME_RATE_FOR_HOCKEYPLAYER;

	}

	@Override
	public String toString() {

		return "HockeyPlayer: [" + getName() + ", scored " + numberOfGoals + " goal(s)]";

	}

	@Override
	public int hashCode() {

		final int prime = 31;
		int result = 1;
		long temp;

		temp = Double.doubleToLongBits(OVER_TIME_RATE_FOR_HOCKEYPLAYER);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + numberOfGoals;

		return result;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj) {

			return true;

		}
		if (obj == null) {

			return false;

		}
		if (!(obj instanceof HockeyPlayer)) {

			return false;

		}
		HockeyPlayer other = (HockeyPlayer) obj;

		if (Double.doubleToLongBits(OVER_TIME_RATE_FOR_HOCKEYPLAYER) != Double
				.doubleToLongBits(other.OVER_TIME_RATE_FOR_HOCKEYPLAYER)) {

			return false;

		}
		if (numberOfGoals != other.numberOfGoals) {

			return false;

		}

		return true;
	}

	@Override
	public int compareTo(HockeyPlayer h) {

		int result;

		if (this.numberOfGoals > h.numberOfGoals) {

			result = -1;

		} else if (this.numberOfGoals < h.numberOfGoals) {

			result = 1;

		} else {

			result = 0;

		}

		return result;

	}

}
