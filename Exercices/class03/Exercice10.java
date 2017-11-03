import java.util.Scanner;

public class Exercice10 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int number;
		int sum = 0;
		int cont = 0;

		System.out.print("Input the number: ");
		number = scan.nextInt();

		System.out.println("Input number: " + number);
		System.out.println("The first n numbers are: ");

		for (int i = 0; i < number; i++) {
			System.out.println(i + 1);
			sum = sum + (i + 1);
			cont++;
		}

		System.out.println("The sum of natural numbers up to " + cont + " terms: " + sum + ".");

		scan.close();

	}

}
