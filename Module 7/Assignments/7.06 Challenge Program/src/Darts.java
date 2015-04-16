/*
 * By Cole Hudson
 * Date: 11/30/2014
 * Purpose: Calculate the value of pi by simulating throwing darts.
 * PMR in README.txt
 */
import java.util.Scanner;
public class Darts 
{
	//collect input for number of trials and darts per trial
	public static int numberOfTrials = 0;
	public static int dartsPerTrial = 0;
	public static void userInput()
	{
		//create scanner
		Scanner in = new Scanner(System.in);
		
		//collect input and save
		System.out.print("Number of trials: ");
		numberOfTrials = in.nextInt();
		
		System.out.print("Number of darts per trial: ");
		dartsPerTrial = in.nextInt();
	}
	
	
	//creates random values and calculates hits
	public static double hitOrMissForIndividualTrial()
	{
		//reset for this trial
		int hits = 0;
		int tries = 0;
		
		//loop over number of darts per trial
		for(int j = 0; j < dartsPerTrial; j++)
		{
			//throw darts
			double x = Math.random();
			double y = Math.random();
			
			
			tries++;
			
			if(((x * x) + (y * y)) <= 1.0)
			{
				hits++;
			}
		}
		return hits;
	}
	//Calculate the values (throw the darts). Returns the values of pi for each trial
	public static double[] calculateValues()
	{
		//create array to store the data
		double[] pies = new double[numberOfTrials];
		
		//loop over the number of trials
		for(int i = 0; i < numberOfTrials; i++)
		{
			pies[i] = 4.0 * (hitOrMissForIndividualTrial() / (double)dartsPerTrial);	
		}
		return pies;
	}
	
	//calculate the average pi / estimate
	public static double averagePiEstimate(double[] pies)
	{
		double estimate = 0.0;
		for(int i = 0; i < pies.length; i++)
		{
			estimate += pies[i];
		}
		estimate /= pies.length;
		return estimate;
	}
	
	//print out the data (pies)
	public static void printPies(double[] pies)
	{
		for(int i = 0; i < pies.length; i ++)
		{
			//print trial number and the value of pi for that trial.
			System.out.printf("Trial [ %d]: pi = %8.6f %n", i, pies[i]);
		}
		//estimate
		System.out.printf("Estimate of pi = %8.6f", averagePiEstimate(pies));
	}
	
	public static void main(String[] args)
	{
		userInput();
		printPies(calculateValues());
	}
}
