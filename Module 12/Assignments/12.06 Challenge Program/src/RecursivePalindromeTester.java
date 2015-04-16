/**
 * 
 * @author Cole Hudson
 * @version 2/12/2015
 * Purpose: Write a recursive method to determine whether a given String is a palindrome.
 *
 * PMR in README.txt
 */

public class RecursivePalindromeTester 
{
	public static void main(String[] args)
	{
		//header
		System.out.printf("%31s%n", "Palindrome Tester");
		System.out.printf("%31s%n", "(is the phrase the same forwards and backwards?)");
		System.out.printf("%10s%n", "Enter a word or phrase to start. Enter \'q\' to quit");
		System.out.println("--------------------------------------------------");
		System.out.println();
		
		//loop
		while(true)
		{
			//create palindrome object
			RecursivePalindrome palindrome = new RecursivePalindrome();
			
			//get the user input
			String input = palindrome.getInput();
			
			//allow the user to exit
			if(input.equalsIgnoreCase("q"))
			{
				System.out.println();
				System.out.println("Come back soon!");
				System.out.println();
				break;
			}
			
			palindrome = new RecursivePalindrome(input);
			
			//print
			palindrome.fancyPrint();
		}
		
	}
}
