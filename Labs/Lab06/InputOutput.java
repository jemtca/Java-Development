package ca.ciccc.java.view;

import ca.ciccc.java.model.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * 
 * @author Jesús
 *
 */
public class InputOutput {

	/**
	 * Constructor: No parameters
	 */
	public InputOutput() {

	}

	/**
	 * Method that creates an instance from Date
	 * 
	 * @param date
	 *            (String Date)
	 * 
	 * @return a Date instance
	 */
	public Date splitDate(String date) {

		String[] s;
		Date d;

		s = date.split("-");

		d = new Date(Integer.valueOf(s[2]), Integer.valueOf(s[1]), Integer.valueOf(s[0]));

		return d;

	}

	/**
	 * Method that validates a date
	 * 
	 * @param date
	 *            (String date)
	 * 
	 * @return false if the date is not valid, true otherwise
	 */
	@SuppressWarnings("unused")
	public boolean dateValidation(String date) {

		boolean result = false;

		if (date.length() == 10) {

			try {

				int year = Integer.parseInt(date.substring(0, 4));
				int month = Integer.parseInt(date.substring(5, 7));
				int day = Integer.parseInt(date.substring(8));

				char c1 = date.charAt(4);
				char c2 = date.charAt(7);

				if (c1 == '-' && c2 == '-') {

					result = true;

				} else {

					wrongDateMessage(date);

				}

			} catch (NumberFormatException nfe) {

				wrongDateMessage(date);

			}

		} else {

			if (date.compareToIgnoreCase("quit") != 0) {

				wrongDateMessage(date);

			}

		}

		return result;

	}

	/**
	 * Method that prints a message when a date is not valid
	 * 
	 * @param date
	 *            (String date)
	 */
	private void wrongDateMessage(String date) {

		System.out.println("[DATE THAT YOU JUST TYPED IS WRONG. TRY IT AGAIN]");

	}

	/**
	 * Method that prints the information of a date instance
	 * 
	 * @param d
	 *            (Date d)
	 */
	public void printDayOfTheWeek(Date d) {

		String date = d.getYear() + "-" + d.getMonth() + "-" + d.getDay();
		LocalDate localDate = LocalDate.now();
		String month = "";

		switch (d.getMonth()) {

		case 1:
			month = "January";
			break;
		case 2:
			month = "February";
			break;
		case 3:
			month = "March";
			break;
		case 4:
			month = "April";
			break;
		case 5:
			month = "May";
			break;
		case 6:
			month = "June";
			break;
		case 7:
			month = "July";
			break;
		case 8:
			month = "August";
			break;
		case 9:
			month = "September";
			break;
		case 10:
			month = "October";
			break;
		case 11:
			month = "November";
			break;
		case 12:
			month = "December";
			break;

		}

		if (d.getDay() == 0 && d.getMonth() == 0 && d.getYear() == 0) {

			wrongDateMessage(date);

		} else if (date.compareTo(DateTimeFormatter.ofPattern("yyyy-MM-dd").format(localDate)) < 0) {

			System.out.println(month + " " + d.getDay() + ", " + d.getYear() + " was on " + d.getDayOfTheWeek() + ".");

		} else if (date.compareTo(DateTimeFormatter.ofPattern("yyyy-MM-dd").format(localDate)) > 0) {

			System.out.println(
					month + " " + d.getDay() + ", " + d.getYear() + " will be on " + d.getDayOfTheWeek() + ".");

		} else {

			System.out.println(month + " " + d.getDay() + ", " + d.getYear() + " is " + d.getDayOfTheWeek() + ".");

		}

	}

}
