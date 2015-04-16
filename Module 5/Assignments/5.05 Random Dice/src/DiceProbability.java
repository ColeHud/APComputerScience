/*
 * By Cole Hudson
 * Version: 10/30/2014
 * V1
 * Purpose: Write a program to simulate tossing a pair of 11-sided dice and determine the percentage of times each possible combination of the dice is rolled.
 * 
 * PMR in README.txt
 */
import java.util.Scanner;
import java.util.Random;

//rolls eleven sided dice and calculates the probability of the sum of the rolls.
public class DiceProbability {
	public static void main(String[] args)
	{
		//scanner for user input
		Scanner in = new Scanner(System.in);
		
		//collect user input
		System.out.print("Number of Rolls: ");
		int numberOfRolls = in.nextInt();
		
		//create random number list
		Random randNumList = new Random();
		
		//create variables used for dice rolls
		int dieOne = 0;
		int dieTwo = 0;
		
		int sumOfDice = 0;
		
		//create sum variables ( a lot of these! )
		int twos = 0;
		int threes = 0;
		int fours = 0;
		int fives = 0;
		int sixes = 0;
		int sevens = 0;
		int eights = 0;
		int nines = 0;
		int tens = 0;
		int elevens = 0;
		int twelves = 0;
		int thirteens = 0;
		int fourteens = 0;
		int fifteens = 0;
		int sixteens = 0;
		int seventeens = 0;
		int eighteens = 0;
		int nineteens = 0;
		int twenties = 0;
		int twentyOnes = 0;
		int twentyTwos = 0;
		
		
		//for loop that rolls the dice as many times as the user said
		for(int i = 1; i <= numberOfRolls; i++)
		{
			//random dice roll
			dieOne = randNumList.nextInt(11) + 1;
			dieTwo = randNumList.nextInt(11) + 1;
			
			//add numbers
			sumOfDice = dieOne + dieTwo;
			
			//a gazillion if statements
			if(sumOfDice == 2)
			{
				twos++;
			}
			else if(sumOfDice == 3)
			{
				threes++;
			}
			else if(sumOfDice == 4)
			{
				fours++;
			}
			else if(sumOfDice == 5)
			{
				fives++;
			}
			else if(sumOfDice == 6)
			{
				sixes++;
			}
			else if(sumOfDice == 7)
			{
				sevens++;
			}
			else if(sumOfDice == 8)
			{
				eights++;
			}
			else if(sumOfDice == 9)
			{
				nines++;
			}
			else if(sumOfDice == 10)
			{
				tens++;
			}
			else if(sumOfDice == 11)
			{
				elevens++;
			}
			else if(sumOfDice == 12)
			{
				twelves++;
			}
			else if(sumOfDice == 13)
			{
				thirteens++;
			}
			else if(sumOfDice == 14)
			{
				fourteens++;
			}
			else if(sumOfDice == 15)
			{
				fifteens++;
			}
			else if(sumOfDice == 16)
			{
				sixteens++;
			}
			else if(sumOfDice == 17)
			{
				seventeens++;
			}
			else if(sumOfDice == 18)
			{
				eighteens++;
			}
			else if(sumOfDice == 19)
			{
				nineteens++;
			}
			else if(sumOfDice == 20)
			{
				twenties++;
			}
			else if(sumOfDice == 21)
			{
				twentyOnes++;
			}
			else if(sumOfDice == 22)
			{
				twentyTwos++;
			}
			
		}
		
		//print out results
		System.out.println("Sum of Dice        Probability");
		System.out.println("  2s                    " + ((double)twos / numberOfRolls) * 100);
		System.out.println("  3s                    " + ((double)threes / numberOfRolls) * 100);
		System.out.println("  4s                    " + ((double)fours / numberOfRolls) * 100);
		System.out.println("  5s                    " + ((double)fives / numberOfRolls) * 100);
		System.out.println("  6s                    " + ((double)sixes / numberOfRolls) * 100);
		System.out.println("  7s                    " + ((double)sevens / numberOfRolls) * 100);
		System.out.println("  8s                    " + ((double)eights / numberOfRolls) * 100);
		System.out.println("  9s                    " + ((double)nines / numberOfRolls) * 100);
		System.out.println("  10s                   " + ((double)tens / numberOfRolls) * 100);
		System.out.println("  11s                   " + ((double)elevens / numberOfRolls) * 100);
		System.out.println("  12s                   " + ((double)twelves / numberOfRolls) * 100);
		System.out.println("  13s                   " + ((double)thirteens / numberOfRolls) * 100);
		System.out.println("  14s                   " + ((double)fourteens / numberOfRolls) * 100);
		System.out.println("  15s                   " + ((double)fifteens / numberOfRolls) * 100);
		System.out.println("  16s                   " + ((double)sixteens / numberOfRolls) * 100);
		System.out.println("  17s                   " + ((double)seventeens / numberOfRolls) * 100);
		System.out.println("  18s                   " + ((double)eighteens / numberOfRolls) * 100);
		System.out.println("  19s                   " + ((double)nineteens / numberOfRolls) * 100);
		System.out.println("  20s                   " + ((double)twenties / numberOfRolls) * 100);
		System.out.println("  21s                   " + ((double)twentyOnes / numberOfRolls) * 100);
		System.out.println("  22s                   " + ((double)twentyTwos / numberOfRolls) * 100);
		
	}
}
