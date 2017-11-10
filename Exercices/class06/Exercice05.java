import java.util.Scanner;

public class Exercice05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int element = 0;
		int index = 0;
		boolean found = false;

		System.out.print("Type the element you would like to know the position (index): ");
		element = scan.nextInt();

		for (int i = 0; i < array.length && !found; i++) {
			if (array[i] == element) {
				found = true;
				index = i;
			}
		}

		if (!found) {
			System.out.println("The element typed doesn't exist in the array.");
		} else {
			System.out.println("The index of the element typed is: " + index + ".");
		}

		scan.close();

	}

}
