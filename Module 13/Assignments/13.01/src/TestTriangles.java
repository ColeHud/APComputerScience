/*
 * By Cole Hudson
 * Date: 2/19/2015
 * Purpose: Test all of the triangle classes
 */
public class TestTriangles 
{
	public static void main(String[] args)
	{
		//create objects
		Triangle triangle = new Triangle(4, 5, 6);
		Equilateral equilateral = new Equilateral(5);
		IsoscelesRight isoscelesRight = new IsoscelesRight(1.5);
		
		//print 
		System.out.println("Triangle has sides A = " + triangle.getSideA() + ", B = " + triangle.getSideB() + ", C = " + triangle.getSideC());
		System.out.println("Equilateral Triangle has sides A = " + equilateral.getSideA() + ", B = " + equilateral.getSideB() + ", C = " + equilateral.getSideC());
		System.out.println("Isosceles Right Triangle has sides A = " + isoscelesRight.getSideA() + ", B = " + isoscelesRight.getSideB() + ", C = " + isoscelesRight.getSideC());
	}
}
