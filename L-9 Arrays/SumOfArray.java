package array;
import java.util.Scanner;

public class SumOfArray {
	
	public static int sumArray(int []ar)
	{
		int sum=0;
		for(int i=0;i<ar.length;i++)
			sum+=ar[i];
		return sum;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-- >0)
		{
			int N = sc.nextInt();
			int []arr = new int[N];
			for(int i=0;i<N;i++)
				arr[i] = sc.nextInt();
			System.out.println();
			System.out.print(sumArray(arr));
		}
		sc.close();
	}

}
