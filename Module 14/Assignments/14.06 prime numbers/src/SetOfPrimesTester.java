import java.util.Scanner;

/*
 * By Cole Hudson
 * Date: 3/8/2015
 * Purpose: Calculate all prime numbers between 0 and a user-defined upper-limit
 * 
 * PMR in README.txt
 */
public class SetOfPrimesTester 
{
	public static void main(String[] args)
	{
		//create user input scanner
		Scanner in = new Scanner(System.in);
		
		//print out a header/instructions
		System.out.println("This program calculates prime numbers");
		System.out.println("Please enter a maximum size for prime numbers to be calculated. Example: 50. (calculates all primes from 1-50)");
		System.out.println("==============================================================================================================");
		System.out.print("Maximum: ");
		
		//create a SetOfPrimes and get the user's input
		SetOfPrimes primes = new SetOfPrimes();
		primes.setMaximum(in.nextInt());
		System.out.println();
		
		//calculate primes and report results
		primes.findPrimes();
		System.out.println("Number of primes: " + primes.getNumberOfPrimes());
		System.out.println("------------primes------------");
		primes.printPrimes();
	}
}
