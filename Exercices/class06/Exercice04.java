import java.util.Scanner;

public class Exercice04 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		boolean found = false;

		System.out.print("Type the value you want to search in the array: ");
		int element = scan.nextInt();

		for (int i = 0; i < array.length && !found; i++) {
			if (array[i] == element) {
				System.out.println("Element found, it is in the position " + (i+1) + ".");
				found = true;
			}
		}

		if (!found) {
			System.out.println("Element was not found.");
		}

		scan.close();

	}

}
