import java.util.Scanner;

/*
 * By Cole Hudson
 * Date: 3/1/2015
 * Purpose: Encrypt and decrypt messages using a Caesar shift cipher
 * 
 * PMR in README.txt
 */
public class CaesarShiftTester 
{	
	//alphabet
	public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

	//main method
	public static void main(String[] args)
	{
		boolean quit = false;

		while(!quit)
		{
			//prompt the user with a menu
			System.out.println("-------------------------------------------------------");
			System.out.println("Encrypt or Decrypt messages using a Caesar shift cipher");
			System.out.println("Enter \'E\' to encrypt, \'D\' to decrypt, or \'Q\' to quit");
			System.out.println("-------------------------------------------------------");

			//create scanner for user input
			Scanner in = new Scanner(System.in);
			String choice = in.next().toLowerCase();

			if(choice.equals("e"))
			{
				System.out.println("You chose encryption");

				//create encryption object that prompts the user for input
				CaesarShiftEncryption encrypt = new CaesarShiftEncryption(in);
				
				encrypt.setShiftAlphabet(CaesarShiftEncryption.generateAlphabet(ALPHABET, encrypt.getShiftKey()));
				
				//encrypt message
				CaesarShiftEncryption.encryptMessage(ALPHABET, encrypt.getShiftAlphabet(), encrypt.getMessage());


			}
			else if(choice.equals("d"))
			{
				System.out.println("You chose decryption");
				
				CaesarShiftDecryption decrypt = new CaesarShiftDecryption(in);
				
				//two shifted alphabets
				String originalShiftedAlphabet = decrypt.generateAlphabet(ALPHABET, decrypt.getShiftKey());
				String reverseShiftedAlphabet = decrypt.reverseShiftAlphabet(ALPHABET, decrypt.getShiftKey());
				int shiftKey = decrypt.getShiftKey();
				String message = decrypt.getEncryptedMessage();
				
				//decrypt
				CaesarShiftDecryption.decryptMessage(originalShiftedAlphabet, reverseShiftedAlphabet, message, shiftKey);
				
			}
			else if(choice.equals("q"))
			{
				//quit
				System.out.println("Thank's for using this program!");
				break;
			}
			else
			{
				System.out.println("You didn't choose one of the given options. Please pick again.");

				//recursion is so great
				CaesarShiftTester.main(args);
			}
		}

	}
}
