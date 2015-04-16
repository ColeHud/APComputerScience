
/**
 * The purpose of this program is to demonstrate the use of a constructor
 * that takes parameters.  Notice that there is no problem with two constructors
 * with the same name as long as their parameter lists are different.  This is
 * referred to as overloading a constructor,
 * 
 * ©FLVS 2007
 * @author B. Jordan 
 * @version 05/28/07
 */

public class ShapesV5
{
    //private instance variables
    private int mySide1, mySide2;
    
    //default constructor
    ShapesV5()
    {
    }
    
    //constructor with two parameters
    ShapesV5 (int s1, int s2)
    {
        mySide1 = s1;
        mySide2 = s2;
    }
    
    //calculate area of a triangle
    public double calcTriArea()
    {
        return mySide1 * mySide2 * .5;
    }
    
    //calculate the hypoteneuse of a right triangle
    public double calcHypoteneuse()
    {
        return Math.sqrt(Math.pow(mySide1, 2) + Math.pow(mySide2, 2));
    }

    //main method
    public static void main(String[] args)
    {
        //declaration of variables
        int side1, side2, radius;
        double triArea, circArea, hypoteneuse, circumference;
        
        //initialization of variables
        side1 = 10; side2 = 5; 
        triArea = 0; hypoteneuse = 0;
        
        ShapesV5 shapes = new ShapesV5(side1, side2);
        
        //call methods
        triArea = shapes.calcTriArea();
        hypoteneuse = shapes.calcHypoteneuse();
        
        //print results
        System.out.printf(" Triangle Area = %8.2f%n", triArea);
        System.out.printf("   Hypoteneuse = %8.2f%n", hypoteneuse); 
    }
}