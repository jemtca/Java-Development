package ca.ciccc.java.model;

public class Date {

	private int day;
	private int month;
	private int year;

	public static final int MIN_YEAR = 1600;
	public static final int MAX_YEAR = 2100;

	public Date(int day, int month, int year) {

		//if (isValidDate()) {

			setYear(year);
			setMonth(month);
			setDay(day);

		//}

	}

	public final int getDay() {

		return this.day;

	}

	public final void setDay(int day) {

		if (isValidDay(day)) {

			this.day = day;

		}

	}

	public final int getMonth() {

		return this.month;

	}

	public final void setMonth(int month) {

		if (isValidMonth(month)) {

			this.month = month;

		}

	}

	public final int getYear() {

		return this.year;

	}

	public final void setYear(int year) {

		if (isValidYear(year)) {

			this.year = year;

		}

	}

	public String getDayOfTheWeek() { // return the day of the week as a string

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

	private boolean isLeapYear() {

		boolean leapYear = false;
		int year = this.year;

		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
			leapYear = true;
		}

		return leapYear;

	}

	private int getLastTwoDigits() { // step 0 (get the last two numbers of a year)

		return this.year % 100;

	}

	private int howManyTwelves() { // step 1 (how many 12's)

		return getLastTwoDigits() / 12;

	}

	private int getRemainder() { // step 2 (get the remainder)

		return getLastTwoDigits() % howManyTwelves();

	}

	private int howManyFours() { // step 3 (how many 4's)

		return getRemainder() / 4;

	}

	private int getMonthCode() { // step 5 (get the code of the month)

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
		} else if (this.year >= 1600 && this.year < 1700) {
			result = result + 6;
		} else if (this.year >= 1700 && this.year < 1800) {
			result = result + 4;
		} else if (this.year >= 1800 && this.year < 1900) {
			result = result + 2;
		} else if (this.year >= 2000 && this.year < 2100) {
			result = result + 6;
		} else if (this.year >= 2100 && this.year < 2200) {
			result = result + 4;
		}

		return result;

	}

	private int addThenModBySeven() {

		int result = getLastTwoDigits() + howManyTwelves() + getRemainder() + howManyFours() + this.month
				+ getMonthCode();

		return result % 7;

	}

	private boolean isValidDay(int day) {

		boolean result = false;

		if (this.month == 1 || this.month == 3 || this.month == 5 || this.month == 7 || this.month == 8
				|| this.month == 10 || this.month == 12) {
			if (day >= 1 && day <= 31) {
				result = true;
			}
		} else if (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) {
			if (day >= 1 && day <= 30) {
				result = true;
			}
		} else if (this.month == 2) {
			if (isLeapYear() && (day >= 1 && day <= 29)) {
				result = true;
			} else if (!isLeapYear() && (day >= 1 && day <= 28)) {
				result = true;
			}

		}

		return result;

	}

	private boolean isValidMonth(int month) {

		boolean result = false;

		if (month >= 1 && month <= 12) {
			result = true;
		}

		return result;
	}

	private boolean isValidYear(int year) {

		boolean result = false;

		if (year >= MIN_YEAR && year <= MAX_YEAR) {
			result = true;
		}

		return result;

	}

//	private boolean isValidDate() {
//
//		boolean result = false;
//
//		if (isValidDay() && isValidMonth() && isValidYear()) {
//			result = true;
//		} else if (isValidDay() && isValidMonth() && !isValidYear()) {
//			System.out.println("Invalid year provided.");
//		} else if (isValidDay() && !isValidMonth() && isValidYear()) {
//			System.out.println("Invalid month provided.");
//		} else if (!isValidDay() && isValidMonth() && isValidYear()) {
//			System.out.println("Invalid day provided.");
//		} else if (isValidDay() && !isValidMonth() && !isValidYear()) {
//			System.out.println("Invalid month and invalid year provided.");
//		} else if (!isValidDay() && isValidMonth() && !isValidYear()) {
//			System.out.println("Invalid day and invalid year provided.");
//		} else if (!isValidDay() && !isValidMonth() && isValidYear()) {
//			System.out.println("Invalid day and invalid month provided.");
//		} else if (!isValidDay() && !isValidMonth() && !isValidYear()) {
//			System.out.println("Invalid day, invalid month and invalid year provided.");
//		}
//
//		return result;
//
//	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	

}
