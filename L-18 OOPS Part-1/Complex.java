package oopsPart1;

public class Complex {
	
	private int real, imag;
	
	public Complex(int real, int imag)  // Constructor
	{
		this.real = real;
		this.imag = imag;
	}
		
	public void setReal(int real)  // Setters
	{
		this.real = real;
	}
	public int getReal()  // Getters
	{
		return this.real;
	}

	public void setImaginary(int imag)  // Setters
	{
		this.imag=imag;
	}
	public int getImaginary()  // Getters
	{
		return this.imag;
	}
	
	public void print() // Print
	{
		String sign = (this.imag<0?" - ":" + ");
		System.out.println(this.real+sign+this.imag+"i");
	}
	
	public Complex add( Complex c1)  // Sum of Complex
	{
		int real1 = this.real;
		int imag1 = this.imag;
		
		int real2 = c1.real;
		int imag2 = c1.imag;
		
		Complex c3 = new Complex(real1+real2, imag1+imag2);
		return c3;
	}
	public static Complex add( Complex c1, Complex c2)  // Sum of Complex
	{
		int real1 = c1.real;
		int imag1 = c1.imag;
		
		int real2 = c2.real;
		int imag2 = c2.imag;
		
		Complex c3 = new Complex(real1+real2, imag1+imag2);
		return c3;
	}
	public Complex multiply(Complex c2)  // Product of Complex
	{
		int real1 = this.real;
		int imag1 = this.imag;
		
		int real2 = c2.real;
		int imag2 = c2.imag;
		
		int lastReal = (real1*real2) - (imag1*imag2);
		int lastImag = (imag1*real2) + (imag2*real1);
		Complex c3 = new Complex(lastReal, lastImag);
		return c3;
	}


	public static void main(String[] args) 
	{
		Complex c1 = new Complex(8,5);
		Complex c2 = new Complex(3,2);
		c1.print();
		c2.print();
		c1.setReal(20);
		c1.setImaginary(50);
		c1.print();
		Complex c5 = c1.add(c2);
		c5.print();
//		Complex c3 = Complex.add(c1,c2);
//		c3.print();
//		Complex c4 = c1.multiply(c2);
//		c4.print();
	}
}
