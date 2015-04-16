import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.util.Random;
import java.util.Scanner;
public class BottleCapPrize
{
  public static void main (String [ ] args) throws IOException
  {
     //making file bottles.txt
     PrintWriter outFile = new PrintWriter(new File("bottles.txt"));
     
     //new scanner and random
     Scanner in = new Scanner(System.in);
     Random randNum = new Random();
     
     //initializing variables
     int cap = 1;
     int i;
     
     //user input
     System.out.println("How many trials would you like to run?");
     int trials = in.nextInt();
      
     //for loop
     for(i = 1; i <= trials; i++)
     {
          int randCap = randNum.nextInt(5) +1;  //random number generator
          int counter = 1;                      //counts how many bottles have been drank
          while(cap != randCap)                 //while the random number != the winning bottle number
          {
              counter++;
              randCap = randNum.nextInt(5) + 1;
          
          }
      outFile.println(counter);
     }
     outFile.close();  //end of file
     
     //reads file bottles.txt
     File fileName = new File("bottles.txt");
     Scanner inFile = new Scanner(fileName);
     
     //initializes variables
     int token;
     int counter = 0;
     int total = 0;
     
     //while loop
     while(inFile.hasNext()) 
     {
         token = inFile.nextInt();
         counter++;
         total += token;
     }
     
     //output
     int average = total / counter;  //calculate the average amount of bottles drank before winning
     System.out.println("The average amount of e-Boost one would have to drink to win: " + average);
     inFile.close();                 //finish reading file
  }
}