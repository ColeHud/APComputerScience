
/**
 * Circle demo
 * 
 * ©FLVS 2007
 * @author R. Enger 
 * @version 5/5/2007
 */
public class Circle2
{
	// instance variables 
	private int x;
	private int y;
	private int radius;

	/**
	 * Constructor for objects of class circle
	 */
	public Circle2(int x, int y, int radius)
	{
		// initialise instance variables
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	public int getRadius()
	{
		
		return radius;
	}
	public String center()
	{
	     return "center is at (" + x + "," + y + ")";
	}
}