package searching_sorting;

import java.util.Scanner;

public class Selection_Sort {

	public static int[] selectionSort(int a[])
	{
		for(int row=0; row<a.length-1; row++)
		{
			for(int col=row+1; col<a.length; col++)
			{
				if(a[row]>a[col])
					{
					int temp = a[row];
					a[row] = a[col];
					a[col] = temp;
					}
			}
			System.out.println();
			for(int index=0; index<a.length; index++)
				System.out.print(a[index]+ " ");
		}
		return a;
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
			for(int index=0; index<arraySize; index++)
				System.out.print(array[index]+ " ");
			System.out.println();
			System.out.println();
			array = selectionSort(array);
//			System.out.println();
//			System.out.println();
//			for(int index=0; index<arraySize; index++)
//				System.out.print(array[index]+ " ");
		}
		sc.close();
	}
}
