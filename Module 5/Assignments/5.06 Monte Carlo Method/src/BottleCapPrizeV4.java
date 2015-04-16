import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Random;
import java.util.Scanner;

/*
 * By Cole Hudson
 * Purpose: Write a program that uses the Monte Carlo sampling method to estimate the average 
 * number of bottles of e-Boost someone would have to drink to win a prize.
 * 
 * Date: 11/4/2014
 * Version 4
 * PMR in README.txt
 */

public class BottleCapPrizeV4
{
	public static void main(String[] args) throws IOException
	{
		//file printwriter
		PrintWriter filePrinter = new PrintWriter(new File("results.txt"));
		
		//random number list
		Random randomNumberList = new Random();
		int randomNumber = randomNumberList.nextInt();
		
		//user input for number of trials
		Scanner in = new Scanner(System.in);
		System.out.print("How many trials would you like?: ");
		int trials = in.nextInt();
		
		//number variables
		boolean userHasNotGuessedNumber = true;
		//total combined tries from every individual trial
		int totalNumberOfTries = 0;
		//a variable to contain the number of times it took in an individual trial
		int individualNumberOfTries = 0;
		
		//loop through the trials
		for(int i = 0; i < trials; i++)
		{
			//set the individual trial values to zero
			userHasNotGuessedNumber = true;
			individualNumberOfTries = 0;
			while(userHasNotGuessedNumber)
			{
				//add to the number of individual trials and select a random number
				individualNumberOfTries++;
				randomNumber = randomNumberList.nextInt(5) + 1;
				
				//check if the trial was successful
				if(randomNumber == 1)
				{
					userHasNotGuessedNumber = false;
					filePrinter.println(individualNumberOfTries);
				}
				
			}
		}
		filePrinter.close();
		
		//reads file bottles.txt
	     File fileName = new File("results.txt");
	     Scanner inFile = new Scanner(fileName);
	     
	     //while loop
	     while(inFile.hasNextInt()) 
	     {
	         totalNumberOfTries += inFile.nextInt();
	     }
	     
	     //calculate the average
	     double average = totalNumberOfTries / (double)trials;
	     
	     //print out results
	     System.out.println("The average amount of e-Boost one would have to drink to win: " + average);
	     
	     //close inFile
	     inFile.close();
	}
}