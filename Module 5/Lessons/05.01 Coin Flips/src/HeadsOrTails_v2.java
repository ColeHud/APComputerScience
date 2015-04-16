
/**
 * This program models flipping an unbiased coin and counting the
 * number of times heads or tails occurs.
 * 
 * @author B. Jordan 
 * @version 04/01/08
 */
import java.util.Scanner;
public class HeadsOrTails_v2
{

	public static void main(String[] args)
	{
		
	    int heads = 0;
	    int tails = 0;
	    int counter = 1;
	    double randNum = 0.0;
	    Scanner in = new Scanner(System.in);
	    
	    boolean goAgain = true;
	    
	    System.out.println("How many times will the coin be flipped? ");
	    int flips = in.nextInt();
	    
	    //while loop ______________________
	    double startTime = System.nanoTime();
	    
	    
	    	
	    heads = 0;
	    tails = 0;
	    counter = 1;
	    randNum = 0.0;
	    
	    
	    
	    while(counter <= flips)
	    {
	        randNum = Math.random();
	        System.out.print(counter + "\t" + randNum);
	        
	        if(randNum < .3)
	        {
	            heads++;
	            System.out.println("\t heads");
	        }
	        else
	        {
	            tails++;
	            System.out.println("\t tails");
	           }
	        counter++;      
	    }
	    System.out.println();
	    System.out.println("Number of Heads = " + heads);
	    System.out.println("Number of Tails = " + tails);
	    
	    
	    
	    double endTime = System.nanoTime();
	    System.out.println("_________________________________");
	    System.out.println("It took: " + ((endTime - startTime) / 1000000000) + " seconds to calculate " + flips + " flips");
	}
}