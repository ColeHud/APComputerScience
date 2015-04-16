import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * By Cole Hudson
 * Date: 3/1/2015
 * Purpose: encode or decode a message using a randomly generated cipher alphabet.
 * 
 * PMR in README.txt
 */
public class ColeHudsonDecipher 
{
	//variables
	public String encryptedMessage;

	//constructor
	ColeHudsonDecipher() throws FileNotFoundException
	{
		//read from file
		readMessageFromFile();
		
		//decrypt the message
		decryptMessage("abcdefghijklmnopqrstuvwxyz");
	}

	//other methods

	//read encrypted message from file
	public String readMessageFromFile() throws FileNotFoundException
	{
		//file stuff
		File message = new File("message.txt");
		Scanner reader = new Scanner(message);

		//read
		encryptedMessage = reader.nextLine();

		reader.close();	

		return encryptedMessage;
	}

	//decrypt the message
	public String decryptMessage(String alphabet)
	{
		//get the random alphabet from the user
		Scanner in = new Scanner(System.in);
		System.out.println("Please input the random alphabet generated from the encryption:");
		
		String randomAlphabet = in.nextLine();
		
		
		char[] arrayMessage = encryptedMessage.toCharArray();
		char[] returnArray = new char[arrayMessage.length];

		for(int i = 0; i < arrayMessage.length; i++)
		{
			//add the character
			try
			{
				returnArray[i] = alphabet.charAt(randomAlphabet.indexOf(arrayMessage[i]));
			}
			catch(java.lang.StringIndexOutOfBoundsException e)
			{
				//I appologize for using try/catch.
			}
		}
		String returnString = stringFromCharArray(returnArray);
		
		//print
		System.out.println("Decrypted message: ");
		System.out.println(returnString.toUpperCase());
		
		return returnString;
	}

	//string from char array
	private static String stringFromCharArray(char[] array)
	{
		String returnString = "";
		for(char character : array)
		{
			returnString += character;
		}
		return returnString;
	}


}
