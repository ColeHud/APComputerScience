/*
 * Purpose: Calculate your weight on each planet of the solar system.
 * Author: Cole Hudson
 * Date: 11/23/2014
 * PMR in README.txt
 */

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.File;

public class WeightOnPlanetsV1 {
	
	//read in the values and map to proper scale
	public static double[] readFromTextFile(int numberOfPlanets) throws IOException
	{
		File inFile = new File("gravity1.txt");
		Scanner inScanner = new Scanner(inFile);
		
		double[] data = new double[numberOfPlanets];
		
		for(int i = 0; i < numberOfPlanets && inScanner.hasNextDouble(); i++)
		{
			data[i] = inScanner.nextDouble() / 10.0;
		}
		
		inScanner.close();
		
		//round earth to 1.0
		data[2] = 1.0;
		return data;
	}
	
	//calculate the weight
	public static double[] calculateWeight(double[] gravity, double yourWeight)
	{
		double[] yourWeightOnPlanets = new double[gravity.length];
		double yourWeightInGrams = yourWeight * 433.59237;
		
		//calculate weight
		for(int i = 0; i < gravity.length; i++)
		{
			yourWeightOnPlanets[i] = (yourWeightInGrams * gravity[i]) / 433.59237;
		}
		
		return yourWeightOnPlanets;
	}
	
	//print it out
	public static void printOutData(String[] names, double[] gravity, double[] weight)
	{
		//print out header
		System.out.printf("%32s%n", "My Weight on the Planets");
		System.out.printf("%9s", "Planet");
		System.out.printf("%14s", "Gravity");
		System.out.printf("%15s%n", "Weight(lbs)");
		System.out.println("______________________________________");
		
		//print out data
		for(int i = 0; i < names.length; i++)
		{
			System.out.printf("   %-16s", names[i]);
			System.out.printf("%1.2f", gravity[i]);
			System.out.printf("%14.2f%n", weight[i]);
		}
	}
	
	//write it out to a text file
	public static void printToTextFile(String[] names, double[] gravity, double[] weight) throws FileNotFoundException 
	{
		//create file
		File outputFile = new File("WeightOnPlanetsOutput.txt");
		PrintWriter printOut = new PrintWriter(outputFile);
		
		//print out
		//print out header
		printOut.printf("%32s%n", "My Weight on the Planets");
		printOut.printf("%9s", "Planet");
		printOut.printf("%14s", "Gravity");
		printOut.printf("%15s%n", "Weight(lbs)");
		printOut.println("______________________________________");
		
		//print out data
		for(int i = 0; i < names.length; i++)
		{
			printOut.printf("   %-16s", names[i]);
			printOut.printf("%1.2f", gravity[i]);
			printOut.printf("%14.2f%n", weight[i]);
		}
		
		printOut.close();
		
	}
	
	//main method
	public static void main(String[] args) throws IOException
	{
		//array of planets
		String[] names = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};
		
		//get gravity
		double[] gravity = readFromTextFile(names.length);
		
		//get weight
		double yourWeight = 105.0;
		double[] weights = calculateWeight(gravity, yourWeight);
		
		//print out
		printOutData(names, gravity, weights);
		
		//print to text file
		printToTextFile(names, gravity, weights);
		
		
		
		
		
	    
		
	}
}
