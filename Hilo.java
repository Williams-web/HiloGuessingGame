package code;

import java.util.Scanner;

public class Hilo {

	public static void main(String[] args) {
		Scanner Input = new Scanner(System.in);
		String playAgain = "";
		do {
			// create a random variable for the user to guess
			int theNumber = (int) (Math.random() * 100 + 1);
			// System.out.println(theNumber);
			int numberOfTries = 0;
			int guess = 0;
			while (guess != theNumber) {
				System.out.println("Guess a number from 1 to 100");
				guess = Input.nextInt();
				numberOfTries++;

				if (guess < theNumber)
					System.out.println(guess + " is too low, try again");
				else if (guess > theNumber)
					System.out.println(guess + " is too high, try again");
				else {
					System.out.println(guess + " is correct. You win!");
					System.out.println("Nice work! you only used " + numberOfTries + " number of attempts");
				}
			} // End of while loop for guessing
			System.out.println("Would you like to play again? (y/n)");
			playAgain = Input.next();
		} while (playAgain.equalsIgnoreCase("y"));
	}

}
