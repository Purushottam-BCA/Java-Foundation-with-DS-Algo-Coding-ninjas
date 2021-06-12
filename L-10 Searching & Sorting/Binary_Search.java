package searching_sorting;
import java.util.Scanner;

public class Binary_Search 
{
	public static int binarySearch(int []a, int item)
	{
		int start = 0, end=a.length-1;
		while(start<=end)
		{
			int mid = start + (end-start)/2;
			if(a[mid]==item)
				return mid;
			else if(a[mid]>item)
				end  = mid-1;
			else
				start = mid+1;
		}
		return -1;
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
			int item = sc.nextInt();
			System.out.println(binarySearch(array,item));
		}
		sc.close();
	}
}
