package assignments;

import java.util.Scanner;

public class Rotate_Array {

	public static void RotateArray(int a[],int D)
	{
		int index,temp;
		D = D % a.length;  // In case of large rotation
		while(D-->0) // O(n^2)
		{
			temp = a[0];
			for(index=0;index<a.length-1 ; index++)
				a[index] = a[index+1];
			a[a.length-1]=temp;
		}
	}
	
	// ---------------- Approach 2 --------------------
	
	public static void swap(int a[],int low, int high )
	{
		int temp = a[low];
		a[low] = a[high];
		a[high] = temp;
	}
	
	public static void reverse(int []a, int low,  int high)
	{
		while(low<high)
		{
			swap(a,low,high);
			low++;
			high--;
		}
	}
	
	public static void RotateArray2(int a[],int D)
	{
		if(a.length==0 || D==0)
			return;
		if(D>=a.length && a.length > 0)
			D = D % a.length;  // In case of large rotation
		reverse(a,0,a.length-1);
		reverse(a,0,a.length-1-D);
		reverse(a, a.length-D, a.length-1 );
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
			int Digit = sc.nextInt();
			RotateArray2(Array,Digit);
			System.out.println();
			for(int index=0; index<Array.length; index++)
				System.out.print(Array[index]+ " ");
		}
		sc.close();
	}
}
