/*
 * By Cole Hudson
 * 11/2/2014
 * 
 * Purpose: Simulate the number of bottles of e-boost someone would have to drink to win a prize using the Monte Carlo Method.
 */
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;
public class BottleCapPrizeV2 {
	public static void main(String[] args) throws IOException
	{
		//create scanner for user input
		Scanner in = new Scanner(System.in);
		
		//create the file to print the results to
		File results = new File("results.txt");
		PrintWriter resultsFile = new PrintWriter(results);
		Scanner resultsScanner = new Scanner(results);
		
		//create random number list
		Random randNumList = new Random();
		int randomNumber = 0;
		
		//total number of tries for each person to get the prize
		int totalTimesToGetPrize = 0;
		
		boolean doesNotHavePrize = true;
		
		//the number of trials for each individual to get the prize
		int individualNumberOfTrials = 0;
		
		//get the number of trials
		System.out.print("How many trials would you like to conduct?: ");
		int trials = in.nextInt();
		
		//total trials
		for(int i = 0; i < trials; i++)
		{
			//reset individual values
			individualNumberOfTrials = 0;
			doesNotHavePrize = true;
			
			//individual trials
			while(doesNotHavePrize)
			{
				individualNumberOfTrials++;
				//random number
				randomNumber = randNumList.nextInt(5)+1;
				
				//if the user got the prize
				if(randomNumber == 1)
				{
					doesNotHavePrize = false;
					//totalTimesToGetPrize += individualNumberOfTrials;
					//print the individual number of trials to a new line of the text file
					resultsFile.println(individualNumberOfTrials);
				}
			}
		}
		
		String token = "";
	   
	    while (resultsScanner.hasNextLine())
	    {	
	        token = resultsScanner.nextLine();
	        totalTimesToGetPrize += Integer.parseInt(token);
	        System.out.println(token);
	        
	    }
	    resultsScanner.close();
		
		//calculate the average number of times that it takes someone to win the prize
		double average = (double)totalTimesToGetPrize / trials;
		
		//print out the results
		System.out.println("On average it took each person " + average + " tries to win a prize");
		
		resultsFile.close();
	}
}
