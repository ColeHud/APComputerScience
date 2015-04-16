
public class CipherCracker 
{
	public static void main(String[] args)
	{
		String word = "IBQQJOFTTJTBQSPHSBNXJUIPVUFSSPST";
		int shift = 2;
		
		
		
		String output = shift(shift, word);
		
		System.out.println(output);
	}
	
	public static String alphabet = "abcdefghijklmnopqrstuvwxyz";
	
	public static String shift(int n, String s)
	{
		String returnString = "";
		//for each character in the string
		for(int i = 0; i < (s.length() - 1); i++)
		{
			String character = s.charAt(i) + "";
			
			int indexInAlphabet = alphabet.indexOf(character);
			int newIndex = indexInAlphabet + n;
			String returnCharacter = alphabet.charAt(newIndex) + "";
			
			returnString += returnCharacter;
		}
		
		return returnString;
	}
}
