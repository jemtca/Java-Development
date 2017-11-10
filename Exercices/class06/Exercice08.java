import java.util.Scanner;

public class Exercice08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int[] array = new int[10];

		array[0] = 0;
		array[1] = 1;
		array[2] = 2;
		array[3] = 3;
		array[4] = 4;
		array[5] = 5;
		array[6] = 6;
		array[7] = 7;
		array[8] = 8;

		System.out.println("[ Original array ]");
		for (int i : array) {
			System.out.print(i);
		}

		System.out.print("\n\nType the element you would like to insert in the array: ");
		int element = scan.nextInt();
		System.out.print("Type the position where you would like to save the element: ");
		int index = scan.nextInt();

		if (index < array.length) {
			for (int i = array.length - 1; i > index; i--) {
				array[i] = array[i - 1];
			}

			array[index] = element;

			System.out.println("\n[ Array modified ]");
			for (int i : array) {
				System.out.print(i);
			}

		} else {
			System.out.println("The index doesn´t exist.");
		}

		scan.close();

	}

}
