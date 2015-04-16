
public class NumericArrayDemo1 {
	public static void main(String[] args)
	{
		int[] myArray = new int[1];
		myArray[0] = 1;
		
		for(int i = 0; i < myArray.length; i++)
		{
			System.out.println(myArray[i] + " @ " + i);
		}
	}
}
