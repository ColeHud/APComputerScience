import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/*
 * By Cole Hudson
 * Date: 3/8/2015
 * Purpose: Perform a frequency analysis of the letters in a message and use the results to decipher a secret message.
 * 
 * PMR in README.txt
 */
public class Convert 
{
	//variables
	private HashMap<Character, Character> key = new HashMap();
	private String input;
	public String converted;

	//initialize the cipher key
	public void initializeKey()
	{
		key.put('z', 'e');
		key.put('i', 't');
		key.put('q', 'h');
		key.put('k', 'a');
		key.put('a', 'i');
		key.put('o', 'f');
		key.put('w', 'n');
		key.put('s', 'l');
		key.put('r', 'y');
		key.put('m', 'b');
		key.put('y', 'o');
		key.put('f', 's');
		key.put('n', 'm');
		key.put('j', 'w');
		key.put('x', 'r');
		key.put('v', 'd');
		key.put('g', 'c');
		key.put('p', 'v');
		key.put('h', 'u');
		key.put('t', 'g');
		key.put('b', 'p');
		key.put('e', 'k');
		key.put('l', 'x');
		key.put('d', 'q');
		key.put('u', 'z');
		key.put('c', 'j');
	}

	//getters

	//constructor
	Convert(String fileName) throws FileNotFoundException
	{
		initializeKey();
		readFromFile(fileName);
		converted = convert();
	}

	//other methods

	//read from text file
	public String readFromFile(String fileName) throws FileNotFoundException
	{
		String returnString = "";

		//file input
		File input = new File(fileName);
		Scanner fileReader = new Scanner(input);

		while(fileReader.hasNextLine())
		{
			returnString += fileReader.nextLine().toLowerCase();
		}

		this.input = returnString;
		return returnString;
	}
	
	//convert the text using the cipher
	public String convert()
	{
		String myInput = input;
		String returnString = "";
		
		for(char c : input.toCharArray())
		{
			if(c == ' ')
			{
				returnString += " ";
			}
			else if(key.containsKey(c))
			{
				returnString += key.get(c);
			}
			else
			{
				returnString += c;
			}
		}
		
		
		return returnString;
	}
	
}
