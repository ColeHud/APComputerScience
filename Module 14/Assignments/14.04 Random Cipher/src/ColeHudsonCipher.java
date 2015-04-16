import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
/*
 * By Cole Hudson
 * Date: 3/1/2015
 * Purpose: encode or decode a message using a randomly generated cipher alphabet.
 * 
 * PMR in README.txt
 */
public class ColeHudsonCipher 
{
	//variables
	public ArrayList<String> randomAlphabet = new ArrayList();
	public ArrayList<String> alphabet = new ArrayList();
	public String alphabetString = "abcdefghijklmnopqrstuvwxyz";
	public String randomAlphabetString;
	public String messageToBeEncoded;
	public String encryptedMessage;

	//constructor
	ColeHudsonCipher()
	{
		//convert string alphabet to arraylist
		addAlphabetToArray(alphabetString);

		//create the random alphabet and convert it to a string
		generateAlphabet();
		randomAlphabetString = arrayListToString(randomAlphabet);
	}

	//other methods

	//generate a random alphabet
	public void generateAlphabet()
	{
		Random random = new Random();
		while(alphabet.size() > 0)
		{
			int randomNumber = random.nextInt(alphabet.size());

			//add to new alphabet, take from old
			randomAlphabet.add(alphabet.get(randomNumber));
			alphabet.remove(randomNumber);
		}
	}

	//add in each letter to alphabet arraylist
	public void addAlphabetToArray(String alphabetstring)
	{
		for(char character: alphabetstring.toCharArray())
		{
			alphabet.add(character + "");
		}
	}

	//convert the random alphabet to a string
	public String arrayListToString(ArrayList<String> a)
	{
		String returnString = "";

		for(String str : a)
		{
			returnString += str;
		}
		return returnString;
	}

	//prompt the user for plaintext message
	public void promptForMessage()
	{
		//scanner for input
		Scanner in = new Scanner(System.in);

		//prompt
		System.out.println("Please enter a message to be encoded (no punctuation)");

		messageToBeEncoded = in.nextLine();
	}

	//encrypt message
	public String encryptMessage()
	{
		//create message to return
		char[] messageArray = messageToBeEncoded.toCharArray();
		char[] returnArray = new char[messageArray.length];

		//go through and get the corresponding values from the shifted alphabet
		for(int i = 0; i < returnArray.length; i++)
		{
			//add the character
			try
			{
				returnArray[i] = randomAlphabetString.charAt(alphabetString.indexOf(messageArray[i]));
			}
			catch(java.lang.StringIndexOutOfBoundsException e)
			{
				//I appologize for using try/catch.
			}

		}	
		//create the string to be returned
		String returnString = stringFromCharArray(returnArray);

		//print out
		System.out.println("Encrypted message:");
		System.out.println(returnString.toUpperCase());

		encryptedMessage = returnString;
		
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

	//print random alphabet
	public void printRandomAlphabet()
	{
		System.out.println("Random alphabet: ");
		System.out.println(randomAlphabetString);
		System.out.println();
	}

	//write to text file
	public void writeMessageToFile() throws FileNotFoundException
	{
		PrintWriter writer = new PrintWriter(new File("message.txt"));
		writer.println(encryptedMessage);
		writer.close();
	}
	
	
}
