/*
You have been given an integer array/list(ARR) of size N that contains only integers, 0 and 1. 
Write a function to sort this array/list. Think of a solution which scans the array/list only once and 
don't require use of an extra array/list.

SOLUTIONS:: 
1. Keep two pointers ‘zeroPos’ for the next location of a 0, and ‘current’ for the current element that we’re iterating through. 
   Both of them will be initialised to 0
2. Start iterating through the array. If we encounter a 1, we’ll do nothing. Just increase ‘current’ by 1. 
3. If we counter a 0, we need to push this zero to the front of the array. More specifically, we need to send this zero 
   to zeroPos and bring zeroPos’ element to the current location. So basically we do swap(arr[zeroPos], arr[current]). 
   And then we increase ‘current’ by 1 and increase ‘zeroPos’ by 1 too.

*/
package assignment;
import java.util.Scanner;

public class Sort_0_1 { //  0 0 1 0 0 1 1 1 0

	public static void Sort_Zero_One(int a[]) // Two Pointer method
	{
		int ZeroPos=0, current=0;
		while(current<a.length)
		{
			if(a[current]==1) // If 1 found do nothing just move ahead
			{
				current++;
			}
			else 
			{
				a[current++]=1;
				a[ZeroPos++]=0;
			}
		}
		for(int index=0; index<a.length;index++)
			System.out.print(a[index]+" ");
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
			Sort_Zero_One(array);
			System.out.println();
		}
		sc.close();
	}
}
