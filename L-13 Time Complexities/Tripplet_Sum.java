package time_Complexities;

import java.util.Arrays;
import java.util.Scanner;

public class Tripplet_Sum {

	public static int tripplet_sum(int ar[],int sum)
	{
		int counter=0;
		for(int i=0;i<ar.length;i++)		//  O(n^3)
		{
			for(int j=i+1;j<ar.length;j++)
				for(int k=j+1;k<ar.length;k++)
					if(ar[i]+ar[j]+ar[k]==sum)
						counter++;
		}
		return counter;
	}
// 2 -5 8 -6 0 5 10 11 -3   
// -6 -5 -3 0 2 5 8 10 11	
// 10	
  public static int tripplet_sum2(int ar[],int sum)   // Time-O(n^2)   Space-O(1)
	{
		int counter=0;
		Arrays.sort(ar);
		int start,mid,end=ar.length-1;
		for(start=0;start<ar.length-1;start++)
		{
			mid = start+1;
			while(mid<end)
			{
				int val = ar[start]+ar[mid]+ar[end];
				if(val==sum)
				{
					System.out.println(ar[start]+" "+ar[mid]+" "+ar[end]);
					counter++;
					mid++;
					end--;
				}
				else if(val<sum)
					mid++;
				else
					end--;
			}
		}
	  return counter;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- >0)
		{
			int arraySize = sc.nextInt();
			int [] array = new int[arraySize];
			for(int index=0; index<arraySize; index++)
				array[index]= sc.nextInt();
			int sum = sc.nextInt();	
			System.out.println(tripplet_sum2(array,sum));
		}
		sc.close();
	}

}

/*      

Sort the array and for every element arr[i] search for the other two elements arr[l], arr[r] 
such that arr[i]+arr[l]+arr[r]=Target sum.

Searching for the other two elements can be done efficiently using Two-pointer technique as the array is sorted.

Run an outer loop taking contol variable as i and for every iteration initialize a value l which is the first pointer 
with i+1 and r with last index.

Now enter into a while loop which will run till the value of l<r.

If arr[i]+arr[l]+arr[r]>Target sum then decrement r by 1 as the required sum is less than the current sum 
	and decreasing the value of will do the needful.

If arr[i]+arr[l]+arr[r]<Target sum then increment l by 1 as the required sum is less than the current sum 
	and increasing the value of will do the needful.

If arr[i]+arr[l]+arr[r]==Target sum print the values.

Increment i Goto Step 3.

*/