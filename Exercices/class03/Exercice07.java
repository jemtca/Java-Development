import java.util.Scanner;

public class Exercice07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String s;
		char c;

		System.out.print("Input an alphabet: ");
		s = scan.next().toLowerCase();
		c = s.charAt(0);

		if (s.length() == 1 && (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
			System.out.println("Input letter is a vowel.");
		} else if (s.length() == 1 && (c == 'b' || c == 'c' || c == 'd' || c == 'f' || c == 'g' || c == 'h' || c == 'j'
				|| c == 'k' || c == 'l' || c == 'm' || c == 'n' || c == 'p' || c == 'q' || c == 'r' || c == 's'
				|| c == 't' || c == 'v' || c == 'w' || c == 'x' || c == 'y' || c == 'z')) {
			System.out.println("Input letter is a consonant.");
		} else {
			System.out.println("Invalid input.");
		}

		scan.close();

	}

}
