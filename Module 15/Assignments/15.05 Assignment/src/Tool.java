
public class Tool implements Comparable<Tool>, Product 
{
	//variables
	public String name;
	public double cost;
	
	Tool(String name, double cost)
	{
		this.name = name;
		this.cost = cost;
	}
	
	
	public String getName() 
	{
		return name;
	}

	public double getCost() 
	{
		return cost;
	}

	public int compareTo(Tool tool) 
	{
		if(this.cost < tool.cost)
		{
			return -1;
		}
		else if(this.cost == tool.cost)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}

}
