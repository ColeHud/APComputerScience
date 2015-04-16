/*
 * By Cole Hudson
 * Date: 2/15/2015
 * 
 * Purpose: Crack a "Password" using brute force recursive power
 */
public class PasswordCrackerTester 
{
	public static void main(String[] args)
	{
		//password: make it anything you choose
		int[] password = {1, 1, 1, 1, 1, 1, 1, 1, 1};
		int[] password2 = {9, 9, 9, 9, 9, 9, 9, 9, 9};
		
		//create PasswordCracker object and crack the password
		PasswordCracker passwordCracker = new PasswordCracker(password2);
	}
}
