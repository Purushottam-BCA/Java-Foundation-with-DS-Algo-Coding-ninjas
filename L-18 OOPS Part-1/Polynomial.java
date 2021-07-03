package oopsPart1;
import java.lang.Math;

public class Polynomial {
		private int PolynomialArr[];
		
		public Polynomial() // Constructor
		{
			PolynomialArr = new int[5];
		}
		
		public void setCoefficient(int degree,int Coefficient)  // Setting Coefficient With Specific degree in the dynamic Array
		{
			if(degree<0 ) return;
			if(degree>PolynomialArr.length-1)
				IncreaseSize(degree);
			PolynomialArr[degree]=Coefficient;
		}	
		private void IncreaseSize(int degree)
		{
			int temp[] = PolynomialArr;  // Temporary Will point to old array
			PolynomialArr = new int[degree+1]; // Degree+1 because If we have to store degree 5 then array must have size 6 so Index 0-5
			for(int i=0;i<temp.length; i++)
			{
				PolynomialArr[i]=temp[i];
			}
		}
	
		public void print() // Displaying The Polynomial
		{
			for(int i=0; i<PolynomialArr.length;i++)
				if(PolynomialArr[i]!=0)
					System.out.print(PolynomialArr[i]+"x^"+i+" + ");
			System.out.println();
		}
		public Polynomial add(Polynomial p2) 
		{
			int BiggestDegree = Math.max(this.PolynomialArr.length,p2.PolynomialArr.length);
			Polynomial p3 = new Polynomial();
			p3.setCoefficient(BiggestDegree, 0);  // Created Only Once Not Every Time
			
			for(int first=0;first<this.PolynomialArr.length; first++)
				p3.setCoefficient(first, this.PolynomialArr[first]);
			
			for(int second=0;second<p2.PolynomialArr.length; second++)
			{	
				if(p3.PolynomialArr[second]==0) // Earlier No Element is there So Just Replace It.
					p3.setCoefficient(second, p2.PolynomialArr[second]);
				else  // In case there was element then in that case try to add there the two terms.
					p3.setCoefficient(second,p2.PolynomialArr[second]+p3.PolynomialArr[second]);
			}
			return p3;
		}
		
		public static Polynomial add(Polynomial p1, Polynomial p2)
		{
			int BiggestDegree = Math.max(p1.PolynomialArr.length,p2.PolynomialArr.length);
			Polynomial p3 = new Polynomial();
			p3.setCoefficient(BiggestDegree, 0);  // Created Only Once Not Every Time
			
			for(int first=0;first<p1.PolynomialArr.length; first++)
				p3.setCoefficient(first, p1.PolynomialArr[first]);
			
			for(int second=0;second<p2.PolynomialArr.length; second++)
			{	
				if(p3.PolynomialArr[second]==0) // Earlier No Element is there So Just Replace It.
					p3.setCoefficient(second, p2.PolynomialArr[second]);
				else  // In case there was element then in that case try to add there the two terms.
					p3.setCoefficient(second,p2.PolynomialArr[second]+p3.PolynomialArr[second]);
			}
			return p3;
		}
		public static Polynomial subtract(Polynomial p1, Polynomial p2)
		{
			int BiggestDegree = Math.max(p1.PolynomialArr.length,p2.PolynomialArr.length);
			Polynomial p3 = new Polynomial();
			p3.setCoefficient(BiggestDegree, 0);  // Created Only Once Not Every Time
			
			for(int first=0;first<p1.PolynomialArr.length; first++)
				p3.setCoefficient(first, p1.PolynomialArr[first]);
			
			for(int second=0;second<p2.PolynomialArr.length; second++)
			{	
				if(p3.PolynomialArr[second]==0) // Earlier No Element is there So Just Replace It.
					p3.setCoefficient(second, p2.PolynomialArr[second]);
				else  // In case there was element then in that case try to add there the two terms.
					p3.setCoefficient(second,p3.PolynomialArr[second]-p2.PolynomialArr[second]);
			}
			return p3;
		}
		public static Polynomial multiply(Polynomial p1, Polynomial p2)
		{
			int BiggestDegree = Math.max(p1.PolynomialArr.length,p2.PolynomialArr.length);
			Polynomial p3 = new Polynomial();
			p3.setCoefficient(BiggestDegree, 0);  // Created Only Once Not Every Time
			
			for(int first=0;first<p1.PolynomialArr.length; first++)
				p3.setCoefficient(first, p1.PolynomialArr[first]);
			
			for(int second=0;second<p2.PolynomialArr.length; second++)
			{	
				if(p3.PolynomialArr[second]==0) // Earlier No Element is there So Just Replace It.
					p3.setCoefficient(second, p2.PolynomialArr[second]);
				else  // In case there was element then in that case try to add there the two terms.
					p3.setCoefficient(second,p2.PolynomialArr[second]*p3.PolynomialArr[second]);
			}
			return p3;
		}
		
		public int evaluate(int x)
		{
			int value =0;
			for(int i=0; i<this.PolynomialArr.length;i++)
				if(this.PolynomialArr[i]!=0)
					value += this.PolynomialArr[i]*(int)Math.pow(x,i);
			return value;
		}
		
}