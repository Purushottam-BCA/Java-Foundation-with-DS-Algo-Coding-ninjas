package oopsPart1;

public class Introduction 
{
	String name;
	private int roll;
	final Double PI=3.14 ;
	
	public Introduction() // Default Constructor 
	{
		this.roll=0;
		System.out.println("Default Constructor");
	}
	
	public Introduction(int roll) // Parameterized Constructor 
	{
		System.out.println("Parameterized Constructor - I");
		this.roll = roll;
	}
	
	public Introduction(int roll, String name) // Parameterized Constructor 
	{
		System.out.println("Parameterized Constructor - II");
		this.roll = roll;
		this.name = name;
	}
	
	public int getRoll()  // getters  
	{
		return this.roll;
	}
	public void setRoll(int value) // Setters
	{
		if(value<1) return;
		System.out.println("This Address : "+ this);
		this.roll = value;
	}
	public String getName() // Getters
	{
		return this.name;
	}	
	
	public void setName(String name) // Setters
	{
		this.name = name;
	}

}
