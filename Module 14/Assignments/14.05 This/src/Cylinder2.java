
/**
 * Cylinder class that extends circle
 * 
 * ©FLVS 2007
 * @author R. Enger 
 * @version 5/5/2007
 */
public class Cylinder2 extends Circle2
{
	// instance variables 
	private int height;

	/**
	 * Constructor for objects of class cylinder
	 */
	public Cylinder2(int x, int y, int radius, int height)
	{
		super(x, y, radius);
	    // initialise instance variables
		this.height = height;
	}

	public int getHeight()
	{
		
		return height;
	}
}