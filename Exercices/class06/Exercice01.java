
public class Exercice01 {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		int total = 0;

		for (int i : array) {
			total = total + i;
		}

		System.out.println("The sum of all the elements of the array is: " + total + ".");

	}

}
