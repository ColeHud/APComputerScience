import java.io.FileNotFoundException;

/*
 * By Cole Hudson
 * Date: 3/1/2015
 * Purpose: encode or decode a message using a randomly generated cipher alphabet.
 * 
 * PMR in README.txt
 */
public class ColeHudsonCipherTester 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		//create the cipher object
		ColeHudsonCipher cipher = new ColeHudsonCipher();
		
		//print the random alphabet
		cipher.printRandomAlphabet();
		
		//prompt the user for a message and then encrypt it
		cipher.promptForMessage();
		cipher.encryptMessage();
		
		//print encrypted message to text file
		cipher.writeMessageToFile();
	}
}
