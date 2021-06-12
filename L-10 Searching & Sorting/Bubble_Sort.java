package searching_sorting;
import java.util.Scanner;

public class Bubble_Sort {

	public static int[] bubbleSort(int a[])
	{
		for(int row=0; row<a.length; row++)
		{
			boolean isChanged=false;
			for(int col=0; col<a.length-row-1; col++)
			{
				if(a[col]>a[col+1])
					{
					int temp = a[col];
					a[col] = a[col+1];
					a[col+1] = temp;
					isChanged = true;
					}
			}
			if(isChanged==false)
				return a;
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
			array = bubbleSort(array);
			System.out.println();
			for(int index=0; index<array.length; index++)
				System.out.print(array[index]+ " ");
		}
		sc.close();
	}
}
