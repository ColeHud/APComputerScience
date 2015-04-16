import java.util.Arrays;

/*
 * By Cole Hudson
 * Date: 2/15/2015
 * 
 * Purpose: Crack a "Password" using brute force recursive power
 */
public class PasswordCracker 
{
	//variables
	private int length;
	private int[] password;
	private int[] crackedPass;
	private boolean foundPassword = false;
	
	//constructor
	PasswordCracker(int[] passwordArray)
	{
		password = passwordArray;
		length = password.length;
		crackedPass = new int[length];
		
		System.out.println("Starting to crack password...");
		System.out.println();
		
		long start_time = System.currentTimeMillis();
		
		crackPassword(0);
		long end_time = System.currentTimeMillis();
		
		long totalMillis = end_time - start_time;
		long seconds = totalMillis / 1000;
		long minutes = seconds / 60;
		
		System.out.println();
		System.out.println("Milliseconds: " + totalMillis);
		System.out.println("Seconds: " +  seconds);
		System.out.println("Minutes: " + minutes);
		System.out.println();
		System.out.println("Length of password: " + length);
		
	}
	
	
	//recursive password cracker
	public void crackPassword(int index)
	{
		//if the array has been fully iterated through
		if(index >= length)
		{
			//if the password is correct
			if(Arrays.equals(password, crackedPass))
			{
				System.out.println("We cracked it!");
				
				//print the password
				for(int digit: crackedPass)
				{
					System.out.print(digit);
				}
				return;
			}
		}
		else
		{
			//go through each possible number
			for(int i = 0; i <= 9; i++)
			{
				//simplify each digit down into it's own problem, then solve
				crackedPass[index] = i;
				crackPassword(index + 1);
			}
		}
		
		
	}	
}
