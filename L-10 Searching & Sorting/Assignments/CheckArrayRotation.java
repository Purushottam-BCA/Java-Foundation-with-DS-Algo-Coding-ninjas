package assignments;

import java.util.Scanner;

public class CheckArrayRotation {

	public static int NumberOfRotation(int a[])
	{
		int low=0, high=a.length-1;
		while(low<=high)
		{
			int mid = low + (high-low)/2;
			int prev = (mid+a.length-1)%a.length; // In case we are at 0th Index then it go to last
			int next = (mid+1)%a.length;  // In Case it is at last index then it goes to start
			if(a[mid]<a[prev] && a[mid]<a[next])
				return mid;
			else if(a[mid]>a[0])
				low = mid+1;
			else if(a[mid]<a[a.length-1])
				high = mid-1;
		}
		return 0;		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- >0)
		{
			int arraySize = sc.nextInt();
			int [] Array = new int[arraySize];
			for(int index=0; index < arraySize; index++)
				Array[index]= sc.nextInt();
			
			System.out.println(NumberOfRotation(Array));
		}
		sc.close();

	}

}
