import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class TextFileReader
{
   public static void main(String[] args) throws IOException
   {
      String token = "";
      File fileName = new File("text.js");
      Scanner inFile = new Scanner(fileName);
   
      while (inFile.hasNextLine())
      {
         token = inFile.nextLine();
         System.out.println(token);
         
      }
      inFile.close();
      
    }//end of main method
}//end of class 

