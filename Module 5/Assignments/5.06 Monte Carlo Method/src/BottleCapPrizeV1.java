/*
 * By Cole Hudson
 * 11/2/2014
 * 
 * Purpose: Simulate the number of bottles of e-boost someone would have to drink to win a prize.
 */
import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;
public class BottleCapPrizeV1 {
	public static void main(String[] args)
	{
		
		/*
		 * TEST PROGRAM!                                    
		 */
		
		Random randNumList = new Random();
		
		int numberCorrect = 0;
		int numberWrong = 0;
		int trials = 0;
		
		int roll = 0;
		for(int i = 0; i < 20; i++)
		{
			roll = randNumList.nextInt(5) + 1;
			if(roll == 1)
			{
				System.out.println("you got it!");
				numberCorrect++;
				
			}
			else
			{
				System.out.println("You didn't get it");
				numberWrong++;
			}
			trials++;
		}
		System.out.println();
		System.out.println("You would have to drink " + trials / numberCorrect + " Bottles of boost to get a prize");
	}
}
