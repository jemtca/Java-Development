package ca.ciccc.java.model;

/**
 * 
 * @author Jesús
 *
 */
public class Date {

	/**
	 * private attribute for the day
	 */
	private int day;
	/**
	 * private attribute for the month
	 */
	private int month;
	/**
	 * private attribute for the year
	 */
	private int year;

	/**
	 * Constant to set the minimum year
	 */
	public static final int MIN_YEAR = 1600;
	/**
	 * Constant to set the maximum year
	 */
	public static final int MAX_YEAR = 2100;

	/**
	 * Constructor: Three parameters
	 * 
	 * @param day
	 *            (int day)
	 * @param month
	 *            (int month)
	 * @param year
	 *            (int year)
	 */
	public Date(int day, int month, int year) {

		if (isValidDate(day, month, year)) {

			setYear(year);
			setMonth(month);
			setDay(day, month);

		}

	}

	/**
	 * Day accessor
	 * 
	 * @return day value
	 */
	public final int getDay() {

		return this.day;

	}

	/**
	 * Day mutator
	 * 
	 * @param day
	 *            (int day)
	 * @param month
	 *            (int month)
	 */
	public final void setDay(int day, int month) { // ask to Rodrigo

		if (isValidDay(day, month)) {

			this.day = day;

		}

	}

	/**
	 * Month accessor
	 * 
	 * @return month value
	 */
	public final int getMonth() {

		return this.month;

	}

	/**
	 * Month mutator
	 * 
	 * @param month
	 *            (int month)
	 */
	public final void setMonth(int month) {

		if (isValidMonth(month)) {

			this.month = month;

		}

	}

	/**
	 * Year accessor
	 * 
	 * @return year value
	 */
	public final int getYear() {

		return this.year;

	}

	/**
	 * Year mutator
	 * 
	 * @param year
	 *            (int year)
	 */
	public final void setYear(int year) {

		if (isValidYear(year)) {

			this.year = year;

		}

	}

	/**
	 * Method that gets the day of the week
	 * 
	 * @return the day of the week as a string
	 */
	public String getDayOfTheWeek() {

		String result = "";
		int day = addThenModBySeven();

		switch (day) {

		case 0:
			result = "Saturday";
			break;
		case 1:
			result = "Sunday";
			break;
		case 2:
			result = "Monday";
			break;
		case 3:
			result = "Tuesday";
			break;
		case 4:
			result = "Wednesday";
			break;
		case 5:
			result = "Thursday";
			break;
		case 6:
			result = "Friday";
			break;

		}

		return result;

	}

	/**
	 * Private method that calculates leap years
	 * 
	 * @return false if it is not leap year, true otherwise
	 */
	private boolean isLeapYear() {

		boolean leapYear = false;
		int year = this.year;

		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
			leapYear = true;
		}

		return leapYear;

	}

	/**
	 * Private method that helps to get the day of the week
	 * 
	 * @return last two numbers of a year
	 */
	private int getLastTwoDigits() { // step 0

		return this.year % 100;

	}

	/**
	 * Private method that helps to get the day of the week
	 * 
	 * @return how many 12's
	 */
	private int howManyTwelves() { // step 1

		return getLastTwoDigits() / 12;

	}

	/**
	 * Private method that helps to get the day of the week
	 * 
	 * @return the remainder
	 */
	private int getRemainder() { // step 2

		return getLastTwoDigits() % 12;
		// return getLastTwoDigits() % howManyTwelves();

	}

	/**
	 * Private method that helps to get the day of the week
	 * 
	 * @return how many 4's
	 */
	private int howManyFours() { // step 3

		return getRemainder() / 4;

	}

	/**
	 * Private method that helps to get the day of the week
	 * 
	 * @return the code of the month
	 */
	private int getMonthCode() { // step 5

		int result = 0;

		switch (this.month) {

		case 1:
			result = 1;
			break;
		case 2:
			result = 4;
			break;
		case 3:
			result = 4;
			break;
		case 4:
			result = 0;
			break;
		case 5:
			result = 2;
			break;
		case 6:
			result = 5;
			break;
		case 7:
			result = 0;
			break;
		case 8:
			result = 3;
			break;
		case 9:
			result = 6;
			break;
		case 10:
			result = 1;
			break;
		case 11:
			result = 4;
			break;
		case 12:
			result = 6;
			break;

		}

		if (isLeapYear() && (this.month == 1 || this.month == 2)) {
			result = result - 1;
		}

		if (this.year >= 1600 && this.year < 1700) {
			result = result + 6;
		}

		if (this.year >= 1700 && this.year < 1800) {
			result = result + 4;
		}

		if (this.year >= 1800 && this.year < 1900) {
			result = result + 2;
		}

		if (this.year >= 2000 && this.year < 2100) {
			result = result + 6;
		}

		if (this.year >= 2100 && this.year < 2200) {
			result = result + 4;
		}

		return result;

	}

	/**
	 * Private method that helps to get the day of the week
	 * 
	 * @return the result of add several number, then applies module 7 to that sum
	 */
	private int addThenModBySeven() {

		int result = howManyTwelves() + getRemainder() + howManyFours() + this.day + getMonthCode();

		return result % 7;

	}

	/**
	 * 
	 * Private method that checks if a day is valid from a specific month
	 * 
	 * @param day
	 *            (int day)
	 * @param month
	 *            (int month)
	 * 
	 * @return false if the day is not valid, true otherwise
	 */
	private boolean isValidDay(int day, int month) {

		boolean result = false;

		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
			if (day >= 1 && day <= 31) {
				result = true;
			}
		} else if (month == 4 || month == 6 || month == 9 || month == 11) {
			if (day >= 1 && day <= 30) {
				result = true;
			}
		} else if (month == 2) {
			if (isLeapYear() && (day >= 1 && day <= 29)) {
				result = true;
			} else if (!isLeapYear() && (day >= 1 && day <= 28)) {
				result = true;
			}

		}

		return result;

	}

	/**
	 * 
	 * Private method that checks if a month is valid
	 * 
	 * @param month
	 *            (int month)
	 * 
	 * @return false if the month is not valid, true otherwise
	 */
	private boolean isValidMonth(int month) {

		boolean result = false;

		if (month >= 1 && month <= 12) {
			result = true;
		}

		return result;
	}

	/**
	 * Private method that checks if a year is between MIN_YEAR and MAX_YEAR
	 * 
	 * @param year
	 *            (int year)
	 * 
	 * @return false if the year is not valid, true otherwise
	 */
	private boolean isValidYear(int year) {

		boolean result = false;

		if (year >= MIN_YEAR && year <= MAX_YEAR) {
			result = true;
		}

		return result;

	}

	/**
	 * Private method that checks if a date (day, month, year) is valid
	 * 
	 * @param day
	 *            (int day)
	 * @param month
	 *            (int month)
	 * @param year
	 *            (int year)
	 * 
	 * @return false if the date is not valid, true otherwise
	 */
	private boolean isValidDate(int day, int month, int year) {

		boolean result = false;

		if (isValidDay(day, month) && isValidMonth(month) && isValidYear(year)) {
			result = true;
		}

		return result;

	}

	// @Override
	// public String toString() {
	// return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	// }

}
