/*
 * By Cole Hudson
 * Date: 4/19/2015
 * Purpose: Use search algorithms on an array of contacts
 * 
 * PMR in README.txt
 */

public class Contact 
{
	//instance variables
	private String name;
	private String relation;
	private String bday;
	private String phone;
	private String email;
	
	//getter
	public String getName() 
	{
		return name;
	}
	public String getRelation() 
	{
		return relation;
	}
	public String getBday() 
	{
		return bday;
	}
	public String getPhone() 
	{
		return phone;
	}
	public String getEmail() 
	{
		return email;
	}
	
	//setters
	public void setName(String name) 
	{
		this.name = name;
	}
	public void setRelation(String relation) 
	{
		this.relation = relation;
	}
	public void setBday(String bday) 
	{
		this.bday = bday;
	}
	public void setPhone(String phone) 
	{
		this.phone = phone;
	}
	public void setEmail(String email) 
	{
		this.email = email;
	}

	//constructor
	Contact(String name, String relation, String bday, String phone, String email)
	{
		this.name = name;
		this.relation = relation;
		this.bday = bday;
		this.phone = phone;
		this.email = email;
	}
	
	//alternate constructor
	Contact(){}
	
	//other methods
	
	//to string
	public String toString()
	{
		String returnString = String.format("%-16s %-16s %-16s %-16s %-16s", name, relation, bday, phone, email);
		return returnString;
	}
}
