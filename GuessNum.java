
import java.util.Random;
import java.util.Scanner;

public class GuessNum {

	// Function that implements the number guessing game
	public static void guessNum()
	{
		try (Scanner sc = new Scanner(System.in)) {
			// Generate the numbers
			
			   Random random = new Random();
            int number= random.nextInt(100);

			// Given K trials
			int K = 5;
			int i, guess;

			System.out.println(
				"A number is chosen between 1 to 100.Guess the number within 5 trials.");

		
			for (i = 0; i < K; i++) {

				System.out.println(	"Guess the number:");

				// Take input from user
				guess = sc.nextInt();

				// If the number is guessed
				if (number == guess) {
					System.out.println(
						"Congratulations! You guessed the number.");
					break;
				}
				else if (number > guess) {
					System.out.println(
						"The number is greater than " + guess);
				}
				else if (number < guess) {
					System.out.println(
						"The number is less than " + guess);
				}
			}

			if (i == K) {
				System.out.println ("You have exhausted K trials.");

				System.out.println("The number was " + number);
			}
		}
	}

	public static void main(String arg[])
	{
       guessNum();
	}
}
