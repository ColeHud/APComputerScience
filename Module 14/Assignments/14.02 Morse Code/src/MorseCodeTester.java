import java.io.FileNotFoundException;

/*
 * By Cole Hudson
 * Date: 3/1/2015
 * Purpose: Translate English to morse code
 * 
 * PMR in README.txt
 */
public class MorseCodeTester 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		//get alphabet
		String fileName = "morseAlphabet.txt";
		MorseCode.readFile(fileName);
		
		//get user input
		MorseCode.getInput();
		
		//get output
		String output = MorseCode.convert();
		
		//print output
		System.out.println("Output:");
		System.out.println(output);
	}
}
