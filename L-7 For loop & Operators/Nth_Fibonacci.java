package loops;
import java.util.Scanner;

public class Nth_Fibonacci 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int a=1,b=1,c=1;
		for(int i=1;i<=N-2;i++)
		{
			c=a+b;
			a=b;
			b=c;
		}
		System.out.println(c);
	}

}
