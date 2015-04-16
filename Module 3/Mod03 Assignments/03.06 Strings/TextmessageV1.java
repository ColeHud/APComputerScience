/*
Project title: Text Message Coder
Purpose: Replace commonly abbreviated expressions in a message with their abbreviation

by Cole Hudson
09/28/14
V1
PMR in README.txt
*/
public class TextmessageV1
{
	public static void main(String[] args)
	{
		//text message to be abbreviated
		String message = "Because i got to Go, i will be right Back, talk to you Later, laughing out loud, idk";

		//phrases to be abbreviated

		String cuz = "because";
		String cuzAbbr = "cuz";

		String lol = "laughing out loud";
		String lolAbbr = "lol";

		String idk = "i don't know";
		String idkAbbr = "idk";

		String brb = "be right back";
		String brbAbbr = "brb";

		String ttyl = "talk to you later";
		String ttylAbbr = "ttyl";

		String gtg = "got to go";
		String gtgAbbr = "gtg";

		//print out original message and length
		System.out.println("Original Message:");
		System.out.println("  " + message);
		System.out.println("  message length: " + message.length() + " characters");

		//print out changed message and length
		System.out.println("New Message:");
		//abbreviate message
		message = message.toLowerCase();//simple statement that allows for uppercase letters
		message = message.replaceAll(cuz, cuzAbbr);
		message = message.replaceAll(lol, lolAbbr);
		message = message.replaceAll(idk, idkAbbr);
		message = message.replaceAll(brb, brbAbbr);
		message = message.replaceAll(ttyl, ttylAbbr);
		message = message.replaceAll(gtg, gtgAbbr);

		//print out message and length
		System.out.println("  " + message);
		System.out.println("  message length: " + message.length() + " characters");




	}

}