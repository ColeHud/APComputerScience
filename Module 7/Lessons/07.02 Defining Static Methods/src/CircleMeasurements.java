/**
 * This program uses methods to calculate the volume of a cylinder.
 * Also illustrates use of Math class methods.
 * 
 * ©FLVS 2007
 * @author B. Jordan 
 * @version 05/12/07
 */
public class CircleMeasurements
{   

    //calculate the area of a circle
    public static double calcArea(double r)
    {
        return Math.PI * Math.pow(r, 2);
    }
    
    //calc the diameter of a circle
    //method header to calculate diameter goes here
    public static double calcDiameter(double r)
    {
        //remove comments in front of the statement below after you write the method header
        return 2 * r;
    }
    
    //calculate the circumference of a circle
    //method header to calculate circumference goes here
    public static double calcCircumference(double r)
    {
        //return statement to calculate circumference goes here  
    	return Math.PI * ( 2 * r);
    }
 
    //NOTE TO STUDENT: Start at the main method
    //main method
    public static void main(String[] args)
    {
        double radius = 1;
        double area = calcArea(radius);
        double diameter = calcDiameter(radius);
        double circumference = calcCircumference(radius);
        
        System.out.printf("Area of Circle = %5.1f%n", area);
        System.out.printf("Diameter of Circle = %5.1f%n", diameter);
        System.out.printf("Circumference of Circle =  %5.1f%n", circumference);     
     }
}