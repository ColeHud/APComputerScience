/*
 * By Cole Hudson
 * Date: 2/22/2015
 * 
 * PMR in README.txt
 */
public class TestNew 
{
	public static void main(String[] args)
	{
		//create objects
		Rectangle3 rectangle = new Rectangle3(5, 20);
		Box3 box1 = new Box3(4, 4, 4);
		Box3 box2 = new Box3(4, 10, 5);
		Cube3 cube = new Cube3(4);
		
		//print
		showEffectBoth(rectangle);
		showEffectBoth(box1);
		showEffectBoth(box2);
		showEffectBoth(cube);
		
		//print comparisons
		box1.equals(cube);
		box2.equals(cube);
		
	}
	
	public static void showEffectBoth(Rectangle3 r)
	{
		System.out.println(r);
	}
}	
