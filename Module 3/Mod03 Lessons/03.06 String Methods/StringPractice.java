
/**
 * The purpose of this program is to demonstrate the use of several 
 * methods of the String class.
 * 
 * ©FLVS 2007
 * @author B. Jordan 
 * @version 03/08/07
 */
public class StringPractice
{
	public static void main(String[ ] args)
	{
		String phoneNumber = "407-317-3326";
		phoneNumber = phoneNumber.replace("407","(407)");
		System.out.println(phoneNumber);

		String noDashPhone = "4073173326";
		noDashPhone = noDashPhone.replace("407","407.");
		noDashPhone = noDashPhone.replace("317","317.");
		noDashPhone = noDashPhone.replace("3326","3326.");
		System.out.println(noDashPhone);

		String date = "03/07/2007";
		date = date.replaceAll("/","-");
		System.out.println(date);

		String place = "Tallahassee, Florida";
		place = place.replaceAll("a", "A");
		System.out.println(place);

	    String name = "Anna Wright";
	    int space = name.indexOf(" ");
	    String firstName = name.substring(0, space);
	    String lastName = name.substring(space, name.length());
	    name = (lastName + ", " + firstName);
	    System.out.println(name);



	}//end of main method
}//end of class