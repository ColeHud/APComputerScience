import java.util.Scanner;

/**
 * 
 * @author Cole Hudson
 * @version 2/12/2015
 * Purpose: Write a recursive method to determine whether a given String is a palindrome.
 *
 * PMR in README.txt
 */

public class RecursivePalindrome 
{
	//variables
	private String originalInput;
	
	private String inputString;
	public String getInputString() 
	{
		return inputString;
	}
	
	public void setInputString(String input)
	{
		inputString = input;
		reverseString = reverse(inputString);
	}

	private String reverseString;
	public String getReverseString() 
	{
		return reverseString;
	}

	public boolean isPalindrome;
	
	//constructor
	RecursivePalindrome()
	{
		inputString = "";
		reverseString = "";
	}

	//alternate constructor
	RecursivePalindrome(String input)
	{
		//input
		originalInput = input;
		
		inputString = input;
		inputString = conformInput(inputString);
		
		//reverse
		reverseString = reverse(inputString);
		
		//is it a palindrome
		isPalindrome = inputString.equals(reverseString);
	}


	//recursively reverses a given string
	private String reverse(String inputString) 
	{
		if ( inputString.length() == 0 )
			return "";

		String firstChar = inputString.substring( 0, 1 );
		
		//helper function
		firstChar = helperFunction(firstChar);
		
		String reverseRest = reverse( inputString.substring( 1 ) );

		String result = reverseRest + firstChar;

		return result;
	}
	
	//helper function
	private String helperFunction(String character)
	{
		//switch to lowercase and get the character
		character = character.toLowerCase();
		char charFromString = character.charAt(0);
		
		//if this is a letter, return it, if not, return a blank character
		int value = (int) charFromString;
		boolean returnChar = (value >= 65 && value <= 90) || (value >= 97 && value <= 122);
		
		if(returnChar)
		{
			return charFromString + "";
		}
		
		//if it isn't a letter, return a blank string
		return "";
		
	}

	//conform the input
	private String conformInput(String input)
	{
		//used to conform the input by removing spaces and punctuation
		reverse(input);
		
		return reverse(input);	
	}

	//print out data
	public void fancyPrint()
	{
		System.out.printf("Input: %s%n", originalInput);
		System.out.printf("Reversed: %s%n", reverse(originalInput));
		System.out.printf("Is a palindrome: %b%n", isPalindrome);
		System.out.println("============================================================");
	}
	
	//get user input
	public String getInput()
	{
		Scanner in = new Scanner(System.in);
		System.out.printf("Please Enter a word or phrase: ");
		
		String returnString = in.nextLine();
		
		System.out.println("============================================================");
		
		return returnString;
	}
}
