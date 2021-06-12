package searching_sorting;
import java.util.Scanner;

public class Insertion_Sort {

	public static void insertionSort(int a[])
	{
		int key;
		for(int row=1; row<a.length; row++)
		{
			key = a[row];
			int col = row-1;
			while(col>=0 && a[col]>key )
			{
				a[col+1] = a[col];
				col--;
			}
			a[col+1] = key;
		}
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
			insertionSort(array);
			System.out.println();
			for(int index=0; index<array.length; index++)
				System.out.print(array[index]+ " ");
		}
		sc.close();
	}
}
