import java.util.ArrayList;
/*
 * By Cole Hudson
 * Date: 3/8/2015
 * Purpose: Calculate all prime numbers between 0 and a user-defined upper-limit
 * 
 * PMR in README.txt
 */
public class SetOfPrimes 
{
	//variables
	private ArrayList<Integer> primes;
	private int maximum;
	private final int minimum = 2;
	
	//getters
	public ArrayList getPrimes()
	{
		return primes;
	}
	
	//get the number of primes
	public int getNumberOfPrimes()
	{
		return primes.size();
	}
	
	//setters
	public void setMaximum(int maximum)
	{
		this.maximum = maximum;
	}
	
	//constructor
	SetOfPrimes(int maximum)
	{
		this.primes = new ArrayList();
		this.maximum = maximum;
	}
	
	//alternate constructor with no given maximum
	SetOfPrimes()
	{
		this.primes = new ArrayList();
	}
	
	//other methods
	
	//is the number prime
	public static boolean isPrime(int number)
	{
		int factor = number;
		
		//check all numbers less than that number
		for(int i = 2; i < number; i++)
		{
			factor--;
			
			//if the number is evenly divisible by the factor
			if(number % factor == 0)
			{
				//it's not a prime number
				return false;
			}
		}
		return true;
	}
	
	//find all prime numbers
	public void findPrimes()
	{
		for(int i = minimum; i < this.maximum; i++)
		{
			if(isPrime(i))
			{
				primes.add(i);
			}
		}
	}

	//print primes
	public void printPrimes()
	{
		for(int i : primes)
		{
			System.out.println(i);
		}
	}


}
