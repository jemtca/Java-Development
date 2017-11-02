import java.util.Scanner;

public class Exercice05 {

	final static float TOLERANCE = (float) 0.001;

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		float number1, number2;

		System.out.print("Input number one: ");
		number1 = scan.nextFloat();
		System.out.print("Input number two: ");
		number2 = scan.nextFloat();

		if (Math.abs(number1) - Math.abs(number2) < TOLERANCE) {
			System.out.println("They are the same up to three decinaml places.");
		} else {
			System.out.println("They are not the same up to three decimal places.");
		}

		scan.close();

	}

}
