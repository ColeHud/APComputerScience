/*
 * By Cole Hudson
 * Version: 10/30/2014
 * V2
 * Purpose: Write a program to simulate tossing a pair of 11-sided dice and determine the percentage of times each possible combination of the dice is rolled.
 * 
 * PMR in README.txt
 * 
 * 
 * ______________________________________________________________________
 * 
 *     WARNING, THIS IS NOT MY REAL VERSION! THIS VERSION IS BROKEN!!!!
 *     
 * ______________________________________________________________________
 */
 
import java.util.Random;
import java.util.Scanner;
public class DiceProbabilityV2
{
    public static void main(String[] args)
    {
    	//Declare and initialize variables and objects
        Scanner in = new Scanner(System.in);
        Random randNum = new Random();
        
        int match = 0; //Number of times sum of dice matches the current sum
        int die1, die2; //Random generated numbers
        


        //Input: ask user for number of rolls and number of sides on a die
        System.out.print("Number of Rolls: ");
        int numberOfRolls = in.nextInt();
        System.out.print("Sides on the Die: ");
        int sidesOfDie = in.nextInt();
        
        
        //Print heading for output table
        System.out.println("Sum of Dice    Probability");
        
        
        //***************************************************************************************
        //Using nested loops, cycle through the possible sums of the dice.
        //Roll the dice the given number of times for each sum.
        //Count how many times the sum of the dice match the current sum being looked for.
        //***************************************************************************************
        
        for(int sum = 2; sum < sidesOfDie * 2; sum++)
        {
        	match = 0;
        	for(int i = 1; i <= numberOfRolls; i++)
        	{
        		//roll the dice
        		die1 = randNum.nextInt(sidesOfDie) + 1;
        		die2 = randNum.nextInt(sidesOfDie) + 1;
        		
        		if((die1 + die2) == sum)
        		{
        			match++;
        		}
        	}
        	System.out.println(sum + "s:         " + ((double)match / (double)numberOfRolls) * 100);
        }
        
        
        
            
        	//Loop to throw dice given number of times
        	
        	
        	
        	
        		//Randomly generate values for two dice
            
            
            
            	
            	//Check if the sum of dice is equal to the given sum
            	
            	
            
            
            
            //After all throws, calculate percentage of throws that resulted in the given sum
            //Print results	
            
            
            
            
    } //end main
}//end class DiceProbability