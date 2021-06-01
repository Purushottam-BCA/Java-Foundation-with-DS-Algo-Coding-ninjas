package loops;
import java.util.Scanner;
import java.lang.Math;

public class All_Prime_Numbers {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		for(int i=2;i<=N;i++)
		{
			boolean isPrime=true;
			for(int start = 2; start <=Math.sqrt(i);start++ )
			{
				if(i%start==0)
				{
					isPrime=false;
					break;
				}
			}
			if(isPrime)
				System.out.println(i);
		}
	}
}
