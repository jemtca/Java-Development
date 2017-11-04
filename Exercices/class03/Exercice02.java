import java.util.Scanner;

public class Exercice02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int number1, number2, number3;

		System.out.print("Input the 1st number: ");
		number1 = scan.nextInt();
		System.out.print("Input the 2nd number: ");
		number2 = scan.nextInt();
		System.out.print("Input the 3rd number: ");
		number3 = scan.nextInt();

		if (number1 > number2 && number1 > number3) {
			System.out.println("The greatest is: " + number1);
		} else if (number2 > number1 && number2 > number3) {
			System.out.println("The greatest is: " + number2);
		} else {
			System.out.println("The greatest is: " + number3);
		}

		scan.close();

	}

}
