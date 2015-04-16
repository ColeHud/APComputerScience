/*
 * By Cole Hudson
 * Purpose: Write a program to determine if a user has correctly chosen a randomly selected three digit number. 
 * Date: 10/28/2014
 * 
 * PMR in README.txt
 */
import java.util.Scanner;
public class Lottery {
	public static void main(String[] args)
	{
		//create scanner for input
		Scanner in = new Scanner(System.in);
		
		//create variables for making the random numbers
		String number = "";
		double randomNumber;
		int randomNumberInt;
		
		//create variables for each digit 
		String number1 = "";
		String number2 = "";
		String number3 = "";
		
		//create variables for user input
		String userInputFirstCharacter = "";
		String userInputSecondCharacter = "";
		String userInputThirdCharacter = "";
		String userInput = "";
		
		while(true)
		{
			//set number to 0 and loop over random numbers to create a new random number
			number = "";
			
			for(int i =0; i<3; i++)
			{
				randomNumber = Math.random();
				//get rid of decimals and convert to proper range
				randomNumberInt = (int)(randomNumber * 10);
				number = number + randomNumberInt;
			}

			
			number1 = number.substring(0,1);
			number2 = number.substring(1,2);
			number3 = number.substring(2,3);
			
			
		
			//prompt the user
			System.out.print("Please enter your three numbers (e.g. 123): ");
			
			//collect input and only keep the first 3 numbers
			userInput = in.nextLine();
			userInput = userInput.substring(0,3);
			
			//separate the individual characters
			userInputFirstCharacter = userInput.substring(0,1);
			userInputSecondCharacter = userInput.substring(1,2);
			userInputThirdCharacter = userInput.substring(2,3);
			
			//print out winning number
			System.out.println("\tWinner: " + number);
			
			//if statements checking if the user guessed correctly
			if(userInput.equals(number))
			{
				System.out.println("\tCongratulations, both pairs matched!");
			}
			else if(userInputSecondCharacter.equals(number2) && userInputThirdCharacter.equals(number3))
			{
				System.out.println("\tCongratulations, the end pair matched!");
			}
			else if(userInputFirstCharacter.equals(number1) && userInputSecondCharacter.equals(number2))
			{
				System.out.println("\tCongratulations, the front pair matched!");
			}
			else
			{
				System.out.println("\t\tSorry, no matches. You only had one chance out of 100 anyway.");
			}
			
			System.out.println();
			System.out.println();
		}
		
	}
}
