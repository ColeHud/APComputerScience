/*
 * By Cole Hudson
 * 10/22/2014
 * Purpose: Create a program that randomly generates a number and allows a user to attempt to guess it
 *
 *PMR in README.txt 
 */
import java.util.Scanner;
public class GuessingGameV1 {
	public static void main(String[] args)
	{
		//scanner to take user input
		Scanner in = new Scanner(System.in);
		
		//generate a random number and convert it to be between 0 and 100
		double doubleRandomNumber = Math.random();
		doubleRandomNumber *= 100;
		int randomNumber = (int)doubleRandomNumber;
		
		//create variables
		boolean userHasNotGuessedNumber = true;
		int userGuess;
		int numberOfGuesses = 0;
		
		//loop to guess number
		while(userHasNotGuessedNumber)
		{
			//user input and increment guesses
			System.out.print("Enter your guess: ");
			userGuess = in.nextInt();
			numberOfGuesses++;
			
			//conditionals checking if the user has guessed the number
			if(userGuess > randomNumber)
			{
				System.out.println("Too high");
			}
			else if(userGuess < randomNumber)
			{
				System.out.println("Too low");
			}
			else
			{
				userHasNotGuessedNumber = false;
			}
			
		}
		//Output final statements
		System.out.println("Congratulations");
		System.out.println("The random number was " + randomNumber);
		System.out.println("Number of guesses: " + numberOfGuesses);
		
		
		
	}
}
