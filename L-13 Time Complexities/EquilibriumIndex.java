package time_Complexities;
import java.util.Scanner;

public class EquilibriumIndex
{
	public static int findEquilibrium(int ar[]) // O(n^2)
	{
		int index=-1;
		int start;
		int sumStart=0, sumEnd=0;
		for(start=1;start<ar.length; start++)  // O(n)
		{
			sumStart +=ar[start-1];
			sumEnd=0;
			for(int k=start+1;k<ar.length; k++)  // O(n)
				sumEnd += ar[k];
			if(sumStart==sumEnd)
			{
				index=start;
				break;
			};
		}
		return index;
	}

	public static int findEquilibrium2(int ar[]) // O(n)
	{
		int index=-1,start;
		int sumStart=0, sumEnd=0;
		
		for(start=1;start<ar.length; start++)  // O(n)
			sumEnd +=ar[start];
		
		for(start=1;start<ar.length; start++)  // O(n)
		{
			sumStart += ar[start-1];
			sumEnd   -= ar[start];
			if(sumStart==sumEnd)
			{
				index=start;
				break;
			};
		}
		return index;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-- >0)
		{
			int N = sc.nextInt();
			int []arr = new int[N];
			for(int i=0;i<N;i++)
				arr[i] = sc.nextInt();
			System.out.println(findEquilibrium2(arr));
		}
		sc.close();
	}
}
