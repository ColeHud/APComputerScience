
/**
 * This program illustrates the use of logical operators to calculate GPA.
 *
 * ©FLVS 2007
 * @author  B. Jordan
 * @version 03/24/2007
 */
import java.util.Scanner;
public class GradesV2
{
    public static void main(String[] args)
    {
        String letterGrade = "";
        Scanner in = new Scanner(System.in);
        
        System.out.println("GPA Calculator");
        System.out.println();
        System.out.println("Please enter 5 grades separated by a space (e.g. 98 85 79 100 89)): ");
        int grade1 = in.nextInt();
        int grade2 = in.nextInt();
        int grade3 = in.nextInt();
        int grade4 = in.nextInt();
        int grade5 = in.nextInt();
        
        int average = (grade1 + grade2 + grade3 + grade4 + grade5)/5;
        
        if(average >= 90)
            letterGrade = "A";
        else if((average >= 80) && (average < 90))
            letterGrade = "B";
        else if((average >= 70) && (average < 80))
            letterGrade = "C";
        else if((average >= 60) && (average < 70))
            letterGrade = "D";
        else
            letterGrade = "F";
            
        System.out.println("GPA: " + average);
        System.out.println("Grade: " + letterGrade);
        
    }
}