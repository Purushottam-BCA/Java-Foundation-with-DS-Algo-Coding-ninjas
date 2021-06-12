package searching_sorting;

import java.util.Scanner;

public class MergeTwoSortedArray {

	public static int[] mergeSort(int a[],int b[])
	{
		int [] finalArray = new int[a.length + b.length];
		int indx1=0, indx2=0, indx3=0;
		while(indx1<a.length && indx2<b.length)
		{
			if(a[indx1]>=b[indx2])
				finalArray[indx3++]= b[indx2++];
			else
				finalArray[indx3++] = a[indx1++];
		}
				
		while(indx1<a.length)
		{
			finalArray[indx3++] = a[indx1++];
		}
		
		while(indx2<b.length)
		{
			finalArray[indx3++] = b[indx2++];
		}
		return finalArray;
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
			
			int arraySize2 = sc.nextInt();
			int [] array2 = new int[arraySize2];
			for(int index=0; index<arraySize2; index++)
				array2[index]= sc.nextInt();
			
			int [] finalArray = new int[array.length + array2.length];
			finalArray = mergeSort(array, array2);
			
			System.out.println();
			for(int index=0; index<finalArray.length; index++)
				System.out.print(finalArray[index]+ " ");
		}
		sc.close();
	}

}
