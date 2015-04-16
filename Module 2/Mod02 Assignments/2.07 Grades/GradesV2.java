/**
*This program will calculate the average grade each time a new score 
*is added to the total.
*
* @author C. Hudson
* @version 09/18/14
* @verstionNum V2
* PMR in README.txt
*/
public class GradesV2
{
    public static void main(String[] args)
    {
        //local variables
        int totalPoints = 0; //total points for all tests
        int numTests = 0; //counts number of tests
        int testGrade = 0; //individual test grade
        double average = 0.0; // average test grade

        /*
        Example of a new test
        numTests ++;
        testGrade = 76;
        totalPoints += testGrade;
        average = totalPoints / numTests;
        System.out.print("n = " + numTests);
        System.out.print("   New Test Grade:  " + testGrade);
        System.out.print("   Total Points:  " + totalPoints);
        System.out.println("   Average Score:  " + average);
        
        */

        //test run 1
        numTests ++;
        testGrade = 97;
        totalPoints += testGrade;
        average = (double)totalPoints / (double)numTests;
        System.out.print("n = " + numTests);
        System.out.print("   New Test Grade:  " + testGrade);
        System.out.print("   Total Points:  " + totalPoints);
        System.out.println("   Average Score:  " + average);

        //test run 2
        numTests ++;
        testGrade = 79;
        totalPoints += testGrade;
        average = (double)totalPoints / numTests;
        System.out.print("n = " + numTests);
        System.out.print("   New Test Grade:  " + testGrade);
        System.out.print("   Total Points:  " + totalPoints);
        System.out.println("   Average Score:  " + average);

        //test run 3
        numTests ++;
        testGrade = 83;
        totalPoints += testGrade;
        average = (double)totalPoints / numTests;
        System.out.print("n = " + numTests);
        System.out.print("   New Test Grade:  " + testGrade);
        System.out.print("   Total Points:  " + totalPoints);
        System.out.println("   Average Score:  " + average);

        //test run 4
        numTests ++;
        testGrade = 88;
        totalPoints += testGrade;
        average = (double)totalPoints / numTests;
        System.out.print("n = " + numTests);
        System.out.print("   New Test Grade:  " + testGrade);
        System.out.print("   Total Points:  " + totalPoints);
        System.out.println("   Average Score:  " + average);

        //test run 5
        numTests ++;
        testGrade = 100;
        totalPoints += testGrade;
        average = (double)totalPoints / numTests;
        System.out.print("n = " + numTests);
        System.out.print("   New Test Grade:  " + testGrade);
        System.out.print("   Total Points:  " + totalPoints);
        System.out.println("   Average Score:  " + average);

        //test run 6
        numTests ++;
        testGrade = 75;
        totalPoints += testGrade;
        average = (double)totalPoints / numTests;
        System.out.print("n = " + numTests);
        System.out.print("   New Test Grade:  " + testGrade);
        System.out.print("   Total Points:  " + totalPoints);
        System.out.println("   Average Score:  " + average);

        

    }

}