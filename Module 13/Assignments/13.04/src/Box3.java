/**
 * Box2 demo.
 * 
 * ©FLVS 2007
 * @author R. Enger 
 * @version 5/5/2007
 */
public class Box3 extends Rectangle3
{
	// instance variables 
	private int height;

	/**
	 * Constructor for objects of class box
	 */
	public Box3(int l, int w, int h)
	{
		// call superclass
		super(l, w);
	    // initialise instance variables
		height = h;
	}

	// return the height
	public int getHeight()
	{
		return height;
	}
	
	public String toString()
	{
		String name = this.getClass().getName();
		name = name.substring(0, name.length() - 1);
		
	    return  name + " - " + super.getLength() + " X " + super.getWidth() + " X " + height;
	}
	
	//is equal to other boxes?
	public boolean equals(Box3 box)
	{
		if((super.getLength() == box.getLength()) && (super.getWidth() == box.getWidth()) && (height == box.getHeight()))
		{
			System.out.println(this + " is the same size as " + box);
			return true;
		}
		System.out.println(this + " is not the same size as " + box);
		return false;
	}

}