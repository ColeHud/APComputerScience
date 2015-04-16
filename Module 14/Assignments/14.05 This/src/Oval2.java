
/**
 * Oval class extends circle.
 * 
 * ©FLVS 2007
 * @author R. Enger 
 * @version 5/5/2007
 */
public class Oval2 extends Circle2
{
	// instance variables 
	private int radius2;

	/**
	 * Constructor for objects of class oval
	 */
	public Oval2(int x, int y, int radius, int radius2)
	{
		super(x, y, radius);
	    // initialise instance variables
		this.radius2 = radius2;
	}


	public int getRadius2()
	{
		
		return radius2;
	}
}