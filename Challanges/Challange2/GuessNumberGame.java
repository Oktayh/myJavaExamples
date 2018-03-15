import java.util.Random;
import java.util.Scanner;

public class GuessNumberGame {

	public static final int MIN = 0;
	public static final int MAX = 100;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		Random rand = new Random();

		char feedback = 'o';
		int max = MAX;
		int min = MIN;

		System.out.println("Please choose a number (0 and 100)");
		int guess = rand.nextInt(max) + min;		
		while (feedback != 'c') {

			System.out.println("Is your number " + guess + "?");
			feedback = input.next().charAt(0);

			while (feedback != 'l' && feedback != 's' && feedback != 'c') {
				System.out.println("Please input 'l' or 's' or 'c' Try again ");
				feedback = input.next().charAt(0);
			}

			if (feedback == 'l') {
				min = guess;
			} else if (feedback == 's') {
				max = guess;
			}

			guess = rand.nextInt(max-min+1) + min;
			
		}

		System.out.println("GOOD BYE :)");

	}

}
