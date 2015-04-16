
public class CountingWithWhileLoops {
	public static void main(String[] args)
	{
		double counter = 1000; 
		double theTerminator = 0;
		
		while(counter >= theTerminator)
		{
			System.out.println("counter = " + counter);
			counter -= .1;
					;
		}
	}
}
