import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
/*
 * By Cole Hudson
 * Date: 3/8/2015
 * Purpose: Perform a frequency analysis of the letters in a message and use the results to decipher a secret message.
 * 
 * PMR in README.txt
 */

public class ConvertTester 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		//new conversion object from a specified text file
		Convert convert = new Convert("ciphertext.txt");
		
		//print out the converted text and write it to a file
		System.out.println(convert.converted);
		PrintWriter writer = new PrintWriter("Decrypted.txt");
		writer.println(convert.converted);
		
		//close the printer
		writer.close();
	}
}
