package ca.ciccc.java.driver;

//import ca.ciccc.java.model.Date;
import ca.ciccc.java.helper.InputReader;
import ca.ciccc.java.view.InputOutput;

/**
 * 
 * @author Jesús
 *
 */
public class Main {

	public static void main(String[] args) {

		// Date d = new Date(-1,-1,-1);

		InputReader ir = new InputReader();
		InputOutput io = new InputOutput();

		String input;

		do {

			System.out.print("Type a date (yyyy-mm-dd) or \"quit\" to exit: ");
			input = ir.getStringInput();

			if (io.dateValidation(input)) {

				// d = io.splitDate(input);
				// io.printDayOfTheWeek(d);

				io.printDayOfTheWeek(io.splitDate(input));

			}

		} while (input.compareToIgnoreCase("quit") != 0);

	}

}
