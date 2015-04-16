import java.io.FileNotFoundException;

/*
 * By Cole Hudson
 * Date: 3/8/2015
 * Purpose: Perform a frequency analysis of the letters in a message and use the results to decipher a secret message.
 * 
 * PMR in README.txt
 */
public class FrequencyAnalysisTester 
{
	public static void main(String[] args) throws FileNotFoundException
	{
		//plaintext
		String plainTextFile = "plaintext.txt";
		FrequencyAnalysis plainText = new FrequencyAnalysis(plainTextFile);
		plainText.readFromFile(plainTextFile);
		plainText.findFrequency();
		plainText.writeToFile("plaintextfreq.txt");
		
		System.out.println("==================================");
		
		//ciphertext
		String cipherTextFile = "cipherText.txt";
		FrequencyAnalysis cipherText = new FrequencyAnalysis(cipherTextFile);
		cipherText.readFromFile(cipherTextFile);
		cipherText.findFrequency();
		cipherText.writeToFile("ciphertextfreq.txt");
		
	}
}
