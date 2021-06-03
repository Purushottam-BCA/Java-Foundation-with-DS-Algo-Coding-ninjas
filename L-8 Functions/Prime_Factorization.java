package functions;
import java.util.Scanner;
import java.lang.Math;

public class Prime_Factorization {

	public static boolean isPrime(int num)
	{
		for(int i=2;i<=(int)Math.sqrt(num);i++)
		{
			if(num%i==0)
				return false;
		}
		return true;
	}
	
	public static int nextPrime(int Num)
	{
		Num++;
		while(Num>1)
		{
			if(isPrime(Num))
				return Num;
			else
				Num++;
		}
		return Num;
	}
	
	// method-1
	public static void primeFactorization(int N)
	{
		int start=2;
		while(N>0)
		{
			if(N%start==0)
			{
				System.out.print(start+" ");
				N/=start;
			}
			else // Find next prime Number 
				start = nextPrime(start);
		}
	}
	
	// Method-2
	public static void primeFactorization2(int N)
	{
		for(int start= 2; start <=N;start++)
		{
			if(isPrime(start))
			{
				int x = start;
				while(N%x==0)
				{
					System.out.print(start + " ");
					x *= start;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int Num = sc.nextInt();
		sc.close();
		primeFactorization(Num);
	}

}
