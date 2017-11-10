
public class Exercice07 {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int[] array2 = new int[10];

		System.out.println("[ Original array (1) ]");
		for (int i : array) {
			System.out.print(i);
			if (array[i - 1] != array.length) {
				System.out.print(",");
			}
		}

		int j = 0;
		System.out.println("\n\n[ Array modified (2) ]");
		for (int i = array.length - 1; i >= 0; i--) {
			array2[j] = array[i];
			j++;
		}

		for (int i : array2) {
			System.out.print(i);
			if (array2[i - 1] != array2.length) {
				System.out.print(",");
			}
		}

	}

}
