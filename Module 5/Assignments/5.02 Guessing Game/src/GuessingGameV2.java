/*
 * By Cole Hudson
 * 10/22/2014
 * Purpose: extend the first program by allowing the user to choose the range for the random number
 * 
 * PMR in README.txt
 */
import java.util.Scanner;
public class GuessingGameV2 {
	public static void main(String[] args)
	{
		//create user input scanner
		Scanner in = new Scanner(System.in);
		//create random number in between 2 numbers
		double doubleRandomNumber = Math.random();
		
		//get user input
		System.out.println("Choose the range from which you want the random number to be generated.");
		System.out.print("Low number: ");
		int lowNumber = in.nextInt();
		System.out.println();
		
		System.out.print("High Number: ");
		int highNumber = in.nextInt();
		System.out.println();
		
		//map the random number output to the range in between the given bounds
		int change = highNumber - lowNumber;
		
		doubleRandomNumber *= change;
		doubleRandomNumber += lowNumber;
		
		//convert to int
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
