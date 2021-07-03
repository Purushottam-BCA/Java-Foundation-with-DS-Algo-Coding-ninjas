package oopsPart1;

public class Fraction {
	
	private int numarator, denominator;
	
	public Fraction(int n, int d)  // Constructor
	{
		if(d==0)
			return;
		this.numarator = n;
		this.denominator = d;
		simplify();
	}
	
	private void simplify()// Storing in simplified Form.
	{
		int value = findGCD(numarator, denominator);
		this.numarator /= value;
		this.denominator /= value;
	}
	
	private int findGCD(int a,int b)// Finding GCD of numbers
	{
		if(b==0)
			return a;
		return findGCD(b, a%b);
	}
	
	public void setNumerator(int numerator)  // Setters
	{
		this.numarator=numerator;
		simplify();
	}
	
	public int getNumerator()  // Getters
	{
		return this.numarator;
	}

	public int getDenominator()  // Getters
	{
		return this.denominator;
	}
	
	public void setDenominator(int denominator)  // Setters
	{
		if(denominator==0)
		{
			System.out.println("Zero Not Allowed");
			return;
		}
		this.denominator=denominator;
		simplify();
	}
	
	public void increment() // Increment function
	{
		this.numarator += this.denominator;
		simplify();
	}

	public void print() // Print
	{
		System.out.println(numarator+"/"+denominator);
	}
	
	public Fraction add( Fraction f2)  // Sum of Fraction
	{
		int n1 = this.numarator;
		int d1 = this.denominator;
		
		int n2 = f2.numarator;
		int d2 = f2.denominator;
		
		int LCM = findLCM(d1,d2);
		int n3 = (LCM/d1)*n1;
		int n4 = (LCM/d2)*n2;
		Fraction f3 = new Fraction(n3+n4, LCM);
		simplify();
		return f3;
	}
	
	public static Fraction add( Fraction f1, Fraction f2)  // Sum of Fraction
	{
		int n1 = f1.numarator;
		int d1 = f1.denominator;
		
		int n2 = f2.numarator;
		int d2 = f2.denominator;
		
		int LCM = findLCM(d1,d2);
		int n3 = (LCM/d1)*n1;
		int n4 = (LCM/d2)*n2;
		Fraction f3 = new Fraction(n3+n4, LCM);
		return f3;
	}
	
	public static Fraction subtract( Fraction f1, Fraction f2)  // Sum of Fraction
	{
		int n1 = f1.numarator;
		int d1 = f1.denominator;
		
		int n2 = f2.numarator;
		int d2 = f2.denominator;
		
		int LCM = findLCM(d1,d2);
		int n3 = (LCM/d1)*n1;
		int n4 = (LCM/d2)*n2;
		Fraction f3 = new Fraction(n3-n4, LCM);
		return f3;
	}
	
	public static Fraction multiply( Fraction f1, Fraction f2)  // Sum of Fraction
	{
		int n1 = f1.numarator;
		int d1 = f1.denominator;
		
		int n2 = f2.numarator;
		int d2 = f2.denominator;
		
		Fraction f3 = new Fraction(n1*n2, d1*d2);
		return f3;
	}
	
	private static int findLCM(int d1, int d2) {
		int Big = Math.max(d1,d2);
		while(Big<=d1*d2)
		{
			if(Big%d1 == 0 && Big % d2==0)
				return Big;
			Big++;
		}
	  return d2;
	}

	public static void main(String[] args) 
	{
		Fraction f1 = new Fraction(5,7);
		Fraction f2 = new Fraction(2,3);
		f1.print();
		f2.print();
//		f1.setNumerator(20);
//		f1.setDenominator(50);
//		f1.increment();
//		f1.print();
//		Fraction f5 = f1.add(f2);
//		f5.print();
//		Fraction f4 = add(f1,f2);
//		f4.print();
		Fraction f4 = Fraction.multiply(f1,f2);
		f4.print();
	}
}
