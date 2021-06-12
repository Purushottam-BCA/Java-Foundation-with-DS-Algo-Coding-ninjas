package assignments;
import java.util.Scanner;

public class Second_Largest {

	public static int SecondMax(int a[])
	{
		if(a.length<2)
			return -2147483648;
		int max=a[0], max2=-2147483648;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max) // When found the largest the old became 2nd largest
			{
				max2 = max;
				max=a[i];
			}
			if(a[i]>max2 && a[i]<max)
				max2=a[i];
		}
		if(max==max2 || max2==-2147483648)
			return -2147483648;
		else
			return max2;
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
			System.out.println(SecondMax(Array));
		}
		sc.close();
	}
}


/*
Approach 1: ​The simplest solution of doing this problem is to sort the array in descending order and return the second element, 
or sort in ascending order and return the 2nd element from last.But, this won’t work in case of duplicate elements.
Time Complexity:​ Time complexity of this approach is O(nlogn) for sorting an array

Approach 2:​In this approach, you can​​find the largest element present in the array. So, to find the largest element 
let us say largest is minus infinity initially, now scan the whole array once, if a particular element is greater than 
the largest then update the largest element to that element.Then make a second scan to find an element just smaller than 
the largest element.Time complexity:​ Time complexity of this approach is O(n) for scanning n elements of an array.
But instead of doing 2 scans, we can find the second largest element in just one scan only. To find the element in a 
single scan we will move to the next approach


*/