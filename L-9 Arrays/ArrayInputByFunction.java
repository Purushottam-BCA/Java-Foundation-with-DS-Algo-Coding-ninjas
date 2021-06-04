package array;
import java.util.Scanner;

public class ArrayInputByFunction {

	public static int[] getInput() // It will return array
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int []arr = new int[N];
		for(int i=0;i<N;i++)
			arr[i] = sc.nextInt();
		sc.close();
		return arr;
	}
	
	public static void printArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
	
	public static void main(String[] args) 
	{
		int []arr = getInput();
		printArray(arr);
	}
	
}
