package pattern;
import java.util.Scanner;

public class Basic_pattern4 
{	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		sc.close();
		int currRow=1;
		while(currRow<=N)
		{
			int currCol=N;
			while(currCol>=1) 
			{
				System.out.print(N+" ");
				currCol--;
			}
			System.out.println();
			currRow++;
		}
	}	
}
