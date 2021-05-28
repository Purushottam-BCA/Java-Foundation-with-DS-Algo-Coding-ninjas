package pattern;
import java.util.Scanner;

public class Basic_pattern1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		sc.close();
		int i=1;
		while(i<=N)
		{
			int j=1;
			while(j<=N) 
			{
				System.out.print("* ");
				j++;
			}
		System.out.println();
		i++;
		}
	}
}
