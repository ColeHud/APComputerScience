
public class RandomNumberScript 
{
	
	public static void main(String[] args)
	{
		//generate random numbers between 44 and 181
		
		double[] numbers = new double[10];
		
		double randomNumber = 44.78 + (Math.random() * 136.1);
		
		for(int i = 0; i < numbers.length; i++)
		{
			randomNumber = 44.78 + (Math.random() * 136);
			numbers[i] = randomNumber;
			System.out.println(randomNumber);
		}
		
		System.out.println();
		
		System.out.println("Kilowatt Hours");
		for(double number: numbers)
		{
			System.out.println(number / 14.9);
		}
		
		
		
	}
}
