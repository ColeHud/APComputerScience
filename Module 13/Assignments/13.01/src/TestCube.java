
public class TestCube 
{
	public static void main(String[] args)
	{
		//create objects
		Cube cube = new Cube(4);
		Rectangle one = new Rectangle(2, 4);
		
		//print rectangle then cube
		System.out.printf("%s%d%s%d%n%n", "One's dimensions are ", one.getLength(), " x ", one.getWidth());
		System.out.printf("%s%d%s%d%s%d", "Cube's dimensions are ", cube.getLength(), " x ", cube.getWidth(), " x ", cube.getHeight());
		
	}
}
