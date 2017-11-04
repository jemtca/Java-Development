import java.util.Scanner;

public class Exercice03 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		float number;

		System.out.print("Input a  number: ");
		number = scan.nextFloat();

		if (number == 0) {
			System.out.println("Zero.");
		} else if (number < 0) {
			System.out.print("Negative.");
			if (Math.abs(number) < 1) {
				System.out.println(" (small)");
			} else if (Math.abs(number) > 1000000) {
				System.out.println(" (large)");
			}
		} else {
			System.out.print("Positive.");
			if (Math.abs(number) < 1) {
				System.out.println(" (small)");
			} else if (Math.abs(number) > 1000000) {
				System.out.println(" (large)");
			}
		}

		scan.close();

	}

}
