
public class Exercice03 {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int sum = 0;

		for (int i : array) {
			sum = sum + i;
		}

		System.out.println("The average of the elements of the array is: " + (double) sum / array.length + ".");

	}

}
