/*
 * By Cole Hudson
 * 11/2/2014
 * Version 1
 * Purpose: Write a program to generate random passwords.
 * 
 * PMR in README.txt
 */
import java.util.Scanner;
import java.util.Random;
public class Password {
	public static void main(String[] args)
	{
		//User input scanner
		Scanner in = new Scanner(System.in);
		
		//print out menu
		System.out.println("               Password Generation Menu");
		System.out.println("**********************************************************");
		System.out.println("*   [1] Lowercase Letters                                *");
		System.out.println("*   [2] Lowercase & Uppercase Letters                    *");
		System.out.println("*   [3] Lowercase, Uppercase, and Numbers                *");
		System.out.println("*   [4] Lowercase, Uppercase, Numbers, and Punctuation   *");
		System.out.println("*   [5] Quit                                             *");
		System.out.println("**********************************************************");
		System.out.println();
		
		//user input for selection and length
		System.out.print("Enter Selection (1-5): ");
		int selection = in.nextInt();
		
		//handle exit selection
		if(selection == 5)
		{
			System.out.println("Goodbye!");
		}
		
		//handle exit selection
		int passwordLength = 0;
		if(selection > 0 & selection < 5){
			System.out.print("\nPassword Length: ");
			passwordLength = in.nextInt();
			System.out.println();
		}
		//create variables for password and random numbers
		String password = "";
		char character = ' ';
		Random randomNumberSet = new Random();
		int randomNumber = randomNumberSet.nextInt();
		
		//handle lowercase letter selection
		if(selection == 1)
		{
			for(int i = 0; i < passwordLength; i++)
			{
				randomNumber = randomNumberSet.nextInt(26) + 97;
				character = (char)randomNumber;
				password += character;
			}
			System.out.println(password);
		}
		
		//handle lowercase and uppercase letter selection
		double lowercaseOrUppercase = Math.random();
		
		if(selection == 2)
		{
			for(int i = 0; i < passwordLength; i++)
			{
				lowercaseOrUppercase = Math.random();
				//choose between uppercase and lowercase
				if(lowercaseOrUppercase < .5)
				{
					//lowercase
					randomNumber = randomNumberSet.nextInt(26) + 97;
					character = (char)randomNumber;
					password += character;	
				}
				else if(lowercaseOrUppercase >= .5)
				{
					//uppercase
					randomNumber = randomNumberSet.nextInt(26) + 65;
					character = (char)randomNumber;
					password += character;	
				}
			}
			System.out.println(password);
		}
		
		//handle lowercase, uppercase, and numbers
		double lowercaseUppercaseNumbers = Math.random();
		
		if(selection == 3)
		{
			for(int i = 0; i < passwordLength; i++)
			{
				lowercaseUppercaseNumbers = Math.random();
				//choose between lowercase, uppercase, and numbers
				if(lowercaseUppercaseNumbers < 1.0/3.0)
				{
					//lowercase letters
					randomNumber = randomNumberSet.nextInt(26) + 97;
					character = (char)randomNumber;
					password += character;
				}
				else if(lowercaseUppercaseNumbers >= 1.0/3.0 && lowercaseUppercaseNumbers < 2.0/3.0)
				{
					//uppercase
					randomNumber = randomNumberSet.nextInt(26) + 65;
					character = (char)randomNumber;
					password += character;
				}
				else if(lowercaseUppercaseNumbers >= 2.0/3.0)
				{
					//numbers
					randomNumber = randomNumberSet.nextInt(10) + 48;
					character = (char)randomNumber;
					password += character;
				}
				
			}
			System.out.println(password);
		}
		
		//handle lowercase, uppercase, numbers, and symbols/punctuation
		if(selection == 4)
		{
			for(int i = 0; i < passwordLength; i++)
			{
				//everything!
				randomNumber = randomNumberSet.nextInt(95) + 33;
				character = (char)randomNumber;
				password += character; 	
			}
			System.out.println(password);
		}
		

		//handle incorrect selection
		if(selection != 5 && selection != 4 && selection != 3 && selection != 2 && selection != 1)
		{
			System.out.println("Sorry, that wasn't a valid selection. Please restart the program and try again.");
		}
		
	}
}
