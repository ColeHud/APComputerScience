import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;

public class PrintWriterDemo_v1 {
	public static void main(String[] args) throws IOException
	{
		PrintWriter outFile = new PrintWriter (new File("/users/school_cole/Desktop/APCS Course Files/Module 5/Lessons/5.06 File Output/src/random.txt"));
		
		double randomNumberDouble = Math.random();
		int randomNumber = (int)(randomNumberDouble * 1000);
		for(int loop = 1; loop <= 10; loop++)
		{
			randomNumberDouble = Math.random();
			randomNumber = (int)(randomNumberDouble * 1000);
			outFile.println(randomNumber);
		}
			
		outFile.close ( );
	}
}
