import java.util.Scanner;

public class Exercice08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int year;

		System.out.print("Input the year: ");
		year = scan.nextInt();

		boolean b = ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0));

		if (b) {
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is not a leap year.");
		}

		scan.close();

	}

}
