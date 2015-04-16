
/**
 * Rectangle2 demo
 * 
 * ©FLVS 2007
 * @author R. Enger 
 * @version 5/6/2007
 */
public class Rectangle3
{
	// instance variables 
	private int length;
	private int width;

	/**
	 * Constructor for objects of class rectangle
	 */
	public Rectangle3(int l, int w)
	{
		// initialise instance variables
		length = l;
		width = w;
	}

	// return the height
	public int getLength()
	{
		return length;
	}
	public int getWidth()
	{
	    return width;
	}
	
	public String toString()
	{
		String name = this.getClass().getName();
		name = name.substring(0, name.length() - 1);
		
	    return  name + " - " + length + " X " + width;
	}
	
	public boolean equals(Rectangle3 rectangle)
	{
		if((length == rectangle.length) && (width == rectangle.width))
		{
			System.out.println(this + " is the same size as " + rectangle);
			return true;
		}
		System.out.println(this + " is not the same size as " + rectangle);
		return false;
	}
}