import java.util.Scanner;

public class Exercice01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int data;

		System.out.println("Introduce a number: ");
		data = scan.nextInt();

		if (data < 0) {
			System.out.println("The number is negative.");
		} else if (data > 0) {
			System.out.println("The number is positive.");
		} else {
			System.out.println("The number is 0.");
		}

		scan.close();

	}

}
