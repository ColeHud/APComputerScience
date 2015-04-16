/*
 * By Cole Hudson
 * 
 * 10/26/2014
 * 
 * Purpose: Write a program to calculate the probability that a family with two children will consist
 * of two boys, a boy and a girl, or two girls.
 * 
 * PMR in README.txt
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Family {
	public static void main(String[] args) throws IOException
	{
		//Create scanner for the file input
		File fileName = new File("MaleFemaleInFamily.txt");
	    Scanner inFile = new Scanner(fileName);
		
	    //create variables
	    int twoBoys = 0;
	    int twoGirls = 0;
	    int oneBoyAndOneGirl = 0;
	    
	    String token = "";
	    int sampleSize = 0;
	    
	    //loop
	    while(inFile.hasNextLine()){
	    	token = inFile.nextLine();
	    	sampleSize++;
	    	
	    	//two boys
	    	if(token.substring(0,1).equalsIgnoreCase("B") && token.substring(1,2).equalsIgnoreCase("B"))
	    	{
	    		twoBoys++;
	    	}
	    	
	    	//two girls
	    	if(token.substring(0,1).equalsIgnoreCase("G") && token.substring(1,2).equalsIgnoreCase("G"))
	    	{
	    		twoGirls++;
	    	}
	    	
	    	//one boy and one girl
	    	if((token.substring(0,1).equalsIgnoreCase("G") && token.substring(1,2).equalsIgnoreCase("B")) || (token.substring(0,1).equalsIgnoreCase("B") && token.substring(1,2).equalsIgnoreCase("G")))
	    	{
	    		oneBoyAndOneGirl++;
	    	}
	    	
	    }//end of loop
	    
	    //calculate percentages
	    int onePercentOfTotal = sampleSize / 100;
	    
	    Double twoBoysPercentage = (double) twoBoys / (double) onePercentOfTotal;
	    Double twoGirlsPercentage = (double) twoGirls / (double) onePercentOfTotal;
	    Double oneBoyAndOneGirlPercentage = (double) oneBoyAndOneGirl / (double)onePercentOfTotal;
	    
	    
	    
	    //print out results
	    System.out.println("Sample Size : " + sampleSize + " families");
	    System.out.println("Two Boys: " + twoBoys);
	    System.out.println("One boy and one girl : " + oneBoyAndOneGirl);
	    System.out.println("Two Girls: " + twoGirls);
	    System.out.println();
	    //percentages
	    System.out.println("Two Boys percentage: " + twoBoysPercentage);
	    System.out.println("One boy and one girl percentage: " + oneBoyAndOneGirlPercentage);
	    System.out.println("Two Girls percentage: " + twoGirlsPercentage);
	    
	   
	    //close the file
		inFile.close();
	}
}	
