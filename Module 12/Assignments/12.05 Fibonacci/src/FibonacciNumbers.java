import java.util.Scanner;

/*
 * Name: Cole Hudson
 * Date: 2/8/2015
 * Purpose: Calculate the nth Fibonacci number
 * 
 * PMR in README.txt
 */
public class FibonacciNumbers 
{
	public static void main(String[] args)
	{
		//information for the user
		System.out.println("Calculate the nth Fibonacci number");
		System.out.println("Please enter a non-negative integer (counting number)");
		System.out.println("If you whish to quit, enter \"q\"");
		
		//loop
		while(true)
		{
			//user input
			System.out.print("Number: ");
			Scanner in = new Scanner(System.in);
			
			int number = -1;
			
			//try to assign the number to input
			String input = in.next();
			
			//allow the user to quit
			if(input.equalsIgnoreCase("q"))
			{
				System.out.println("Come back soon!");
				break;
			}
			
			try
			{
				number = Integer.parseInt(input);
				
				//make sure the number is a positive integer
				if(number < 0)
				{
					System.out.println("    ->Please enter a number greater than or equal to 0");
				}
			}
			catch(NumberFormatException e)
			{
				System.out.println("    ->Please enter a valid integer");	
			}
			
			//if number has been assigned, then calculate the fibonacci
			if(number >= 0)
			{
				System.out.println("Fibonacci index " + number + " = " + fibonacci(number));
			}
			
			
		}
	}
	
	public static int fibonacci(int x)
	{
		if(x == 0)
		{
			return 0;
		}
		else if(x == 1)
		{
			return 1;
		}
		else 
		{
			return fibonacci(x - 1) + fibonacci(x - 2);
		}
	}
}
