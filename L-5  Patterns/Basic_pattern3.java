package pattern;
import java.util.Scanner;

public class Basic_pattern3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		sc.close();
		int i=1;
		while(i<=N)
		{
			int j=N;
			while(j>=1) 
			{
				System.out.print(j+" ");
				j--;
			}
		System.out.println();
		i++;
		}

	}

}
