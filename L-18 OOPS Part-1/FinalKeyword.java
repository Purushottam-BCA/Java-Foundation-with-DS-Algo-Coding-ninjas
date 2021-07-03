package oopsPart1;

public class FinalKeyword {
	String name;
	private final int roll;
	final Double PI=3.14 ;
	
	public FinalKeyword(int roll, String name) // Constructor will be called only Once so 
	{									// Only One time initialization of final variable is possible.
		this.roll = roll;
		this.name = name;
	}
	
	public void show()
	{
		System.out.println("ROLL : "+this.roll + " NAME : "+this.name);
	}
	public static void main(String args[])
	{
		FinalKeyword F1 = new FinalKeyword(10,"Purushottam");
		F1.show();
		System.out.println(F1.PI);
	}
}
