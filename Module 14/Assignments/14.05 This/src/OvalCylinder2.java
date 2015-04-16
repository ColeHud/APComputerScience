
/**
 * OvalCylinder class extends Oval.
 * 
 * ©FLVS 2007
 * @author R. Enger 
 * @version 5/5/2007
 */
public class OvalCylinder2 extends Oval2
{
	// instance variables 
	private int height;

	/**
	 * Constructor for objects of class ovalCylinder
	 */
	public OvalCylinder2(int x, int y, int radius, int radius2, int height)
	{
		super(x, y, radius, radius2);
	    // initialise instance variables
		this.height = height;
	}

	
	public int getHeight()
	{
		
		return height;
	}
}