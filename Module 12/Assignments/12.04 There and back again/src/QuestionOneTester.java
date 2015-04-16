import java.util.Scanner;

/*
 * Name: Cole Hudson
 * Date: 2/8/2015
 * Purpose: Translate Piecewise functions into recursive methods.
 * 
 * PMR in README.txt
 */
public class QuestionOneTester 
{
	public static void main(String[] args)
	{
		//prompt
		System.out.print("Enter a number to be input to the piecewise function: ");
		
		//create object
		QuestionOneTester problem = new QuestionOneTester();
		
		//get user input
		Scanner in = new Scanner(System.in);
		double number = in.nextDouble();
		
		//print out the evaluation
		System.out.println(problem.piecewise(number));
	}
	
	//piecewise function
	public double piecewise(double x)
	{
		//base case
		if(x <= 10)
		{
			return -7;
		}
		else
		{
			return piecewise(x - 4) + 2;
		}
	}
}
