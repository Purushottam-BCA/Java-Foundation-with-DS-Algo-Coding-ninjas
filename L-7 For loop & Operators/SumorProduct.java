package loops;
import java.util.Scanner;

public class SumorProduct {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt();
		int C = sc.nextInt();
		sc.close();
		if(C==1)
		{
			int sum = 0;
			for(int start=1;start<=N;start++)
				sum += start; 
			System.out.println(sum);
		}
		else if(C==2)
		{ 
			int product = 1;
			for(int start =2; start<=N;start++)
				product *=start;
			System.out.println(product);
		}
		else
			System.out.println(-1);
	}
}
