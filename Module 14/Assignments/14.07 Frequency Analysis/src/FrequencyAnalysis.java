/*
 * By Cole Hudson
 * Date: 3/8/2015
 * Purpose: Perform a frequency analysis of the letters in a message and use the results to decipher a secret message.
 * 
 * PMR in README.txt
 */
import java.io.*;
import java.util.HashMap;
import java.util.Scanner;
public class FrequencyAnalysis 
{
	//variables
	private final char[] normalAlphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
	private HashMap<Character, Integer> frequency = new HashMap();
	private int[] frequencies = new int[normalAlphabet.length];
	private String input;
	private int numberOfCharacters;
	private String inputFileName;
	
	//getters
	public int[] getFrequencies()
	{
		return frequencies;
	}
	
	//constructor
	FrequencyAnalysis(String inputFileName)
	{
		this.numberOfCharacters = 0;
		this.inputFileName = inputFileName;
	}
	
	//other methods
	
	//read from text file
	public String readFromFile(String fileName) throws FileNotFoundException
	{
		String returnString = "";
		
		//file input
		File input = new File(fileName);
		Scanner fileReader = new Scanner(input);
		
		while(fileReader.hasNext())
		{
			returnString += fileReader.next().toLowerCase();
		}
		
		this.input = returnString;
		return returnString;
	}
	
	//find the frequency of each letter
	public void findFrequency()
	{
		//check if the input has been read from the files
		if(this.input != null)
		{
			int totalCharacters = 0;
			
			//loop over every character in the hashmap
			for(int i = 0; i < input.length(); i++)
			{
				char character = input.charAt(i);
				
				//if the character is in the alphabet
				if((int)character >= 97 && (int)character <= 122)
				{
					//add one to the total characters
					totalCharacters++;
					
					//if this character is in the hashMap
					if(frequency.containsKey(character))
					{
						//add one to the current key
						frequency.put(character, frequency.get(character) + 1);
					}
					else
					{
						frequency.put(character, 1);
					}
				}
			}
			numberOfCharacters = totalCharacters;
		}
	}
	
	//print frequency map
	public void printFreqMap()
	{
		System.out.println(frequency);
	}
	
	//write results to a text file
	public void writeToFile(String filename) throws FileNotFoundException
	{
		//create a printwriter to write to a text file
		PrintWriter write = new PrintWriter(filename);
		write.println(inputFileName);
		System.out.println(inputFileName);
		
		//for each letter in the alphabet, print its occurrence and frequency
		for(int i = 0; i < normalAlphabet.length; i++)
		{
			//alphabet letter, occurrence of that letter, and percentage of total occurrence
			char letter = normalAlphabet[i];
			
			int occurences = 0;
			if(frequency.containsKey(letter))
			{
				occurences = frequency.get(letter);
			}
			
			double percentage = ((double)occurences / (double)numberOfCharacters) * 100;
			
			//write line to file
			write.printf("%c, x%-6d, %% %-10.3f  %n", letter, occurences, percentage);
			System.out.printf("%c, x%-6d, %% %-10.3f  %n", letter, occurences, percentage);
		}
		write.close();
	}
	
	
}
