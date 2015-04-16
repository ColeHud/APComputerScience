import java.io.*;
import java.util.Scanner;

/*
 * By Cole Hudson
 * Date: 3/1/2015
 * Purpose: Translate English to morse code
 * 
 * PMR in README.txt
 */
public class MorseCode 
{
	//static variables
	public static String[] morseAlphabet = new String[37];
	public static String alphabet = "abcdefghijklmnopqrstuvwxyz1234567890 ";
	public static String input = "";
	
	//read in new file
	public static void readFile(String fileName) throws FileNotFoundException
	{
		//find the file
		File file = new File(fileName);
		Scanner in = new Scanner(file);
		
		//read its contents into the morseAlphabet array
		for(int i = 0; i < morseAlphabet.length; i++)
		{
			if(in.hasNextLine())
			{
				morseAlphabet[i] = in.nextLine();
			}
		}
		//add in space character
		morseAlphabet[36] = " / ";
	}
	
	//read user input
	public static void getInput()
	{
		//prompt
		System.out.println("Please enter a phrase without any punctuatiion.");
		System.out.println();
		
		//scanner
		Scanner in = new Scanner(System.in);
		input = in.nextLine().toLowerCase();
	}
	
	//convert to morse code
	public static String convert()
	{
		String output = "";
		for(int i = 0; i < input.length(); i++)
		{
			//get the character from the input
			char charAtIndex = input.charAt(i);
			
			//find it in the alphabet
			int indexInAlphabet = alphabet.indexOf(charAtIndex);
			
			//translate it to morse code
			output += morseAlphabet[indexInAlphabet] + " ";
		}
		return output;
	}
	
}
