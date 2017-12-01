package ca.ciccc.java.model;

/**
 * 
 * @author Jesús
 *
 */
public class GasStationAttendant extends Employee implements Comparable<GasStationAttendant> {

	/**
	 * Private attribute for the number of dollars stolen per day
	 */
	private double numberOfDollarsStolenPerDay;

	/**
	 * Constant: Overtime pay rate for gas station attendants
	 */
	public final double OVERTIME_PAY_RATE_FOR_GASSTATIONATTENDANT = 1.5;

	/**
	 * Constructor: two parameters
	 * 
	 * @param name (String name)
	 * @param numberOfDollarsStolenPerDay (double numberOfDollarsStolenPerDay)
	 */
	public GasStationAttendant(String name, double numberOfDollarsStolenPerDay) {

		super(name);
		setNumberOfDollarsStolenPerDay(numberOfDollarsStolenPerDay);

	}

	/**
	 * NumberOfDollarsStolenPerDay accessor
	 * 
	 * @return numberOfDollarsStolenPerDay
	 */
	public double getNumberOfDollarsStolenPerDay() {

		return this.numberOfDollarsStolenPerDay;

	}

	/**
	 * NumberOfDollarsStolenPerDay mutator
	 * 
	 * @param numberOfDollarsStolenPerDay (double numberOfDollarsStolenPerDay)
	 */
	public final void setNumberOfDollarsStolenPerDay(double numberOfDollarsStolenPerDay) {

		this.numberOfDollarsStolenPerDay = numberOfDollarsStolenPerDay;

	}

	@Override
	public DressCode getDressCode() {

		return DressCode.UNIFORM;

	}

	@Override
	public boolean isPaidSalary() {

		return false;

	}

	@Override
	public boolean postSecondaryEducationRequired() {

		return false;

	}

	@Override
	public String getWorkVerb() {

		return "pump";

	}

	@Override
	public double getOverTimePayRate() {

		return OVERTIME_PAY_RATE_FOR_GASSTATIONATTENDANT;

	}

	@Override
	public String toString() {

		return "GasStationAttendant: [" + getName() + ", steals " + numberOfDollarsStolenPerDay + "  dollar(s) a day]";

	}

	@Override
	public int hashCode() {

		final int prime = 31;
		int result = 1;
		long temp;

		temp = Double.doubleToLongBits(numberOfDollarsStolenPerDay);
		result = prime * result + (int) (temp ^ (temp >>> 32));

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
		if (!(obj instanceof GasStationAttendant)) {

			return false;

		}
		GasStationAttendant other = (GasStationAttendant) obj;

		if (Double.doubleToLongBits(numberOfDollarsStolenPerDay) != Double
				.doubleToLongBits(other.numberOfDollarsStolenPerDay)) {

			return false;

		}

		return true;
	}

	@Override
	public int compareTo(GasStationAttendant g) {

		int result;

		if (this.numberOfDollarsStolenPerDay > g.numberOfDollarsStolenPerDay) {

			result = -1;

		} else if (this.numberOfDollarsStolenPerDay < g.numberOfDollarsStolenPerDay) {

			result = 1;

		} else {

			result = 0;

		}

		return result;

	}

}
