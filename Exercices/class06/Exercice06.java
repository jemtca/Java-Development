import java.util.Scanner;

public class Exercice06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int element;
		boolean found = false;

		System.out.println("[ Original array ]");
		for (int i : array) {
			System.out.print(i);
		}
		System.out.println("\n");

		System.out.print("Type the element you would like delete: ");
		element = scan.nextInt();

		for (int i = 0; i < array.length && !found; i++) {
			if (array[i] == element) {
				found = true;
				array[i] = -1;
			}
		}

		if (!found) {
			System.out.println("The element typed doesn´t exist in the array.");
		} else {
			System.out.println("\n[ Array modified ]");
			for (int i : array) {
				if (i != -1) {
					System.out.print(i);
				}
			}
		}

		scan.close();

	}

}
