
/**
 * This program demonstrates overloading methods.
 * All source code is contained in one class and one file.
 * 
 * ©FLVS 2007
 * @author B. Jordan 
 * @version 05/30/07
 */
public class OverloadedMethodsTesterV1
{   
    //default constructor
    OverloadedMethodsTesterV1()
    {
    }
    
    //first rectangle area method takes two ints
    public int calcRectArea(int s1, int s2)
    {
        return s1 * s2;
    }
    
    //second rectangle area method takes two doubles
    public double calcRectArea(double s3, double s4)
    {
        return s3 * s4;
    }
    
    //third rectangle area method takes one int
    public int calcRectArea(int s1)
    {
        return (int)Math.pow(s1,2);
    }
    
    public static void main(String[] args)
    {
        //invoke the constructor
        OverloadedMethodsTesterV1 overload = new OverloadedMethodsTesterV1();
        
        //print results, notice the difference in the parameter lists of the overloaded methods.
        System.out.println("Two doubles passed: " + overload.calcRectArea(4.75, 15.5));
        System.out.println("One int passed: " + overload.calcRectArea(9));
        System.out.println("Two ints passed: " + overload.calcRectArea(4, 15));
    }
}