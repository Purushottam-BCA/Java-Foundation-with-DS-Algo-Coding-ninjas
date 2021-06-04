package array;

import java.util.Scanner;

public class SwapAlternate {

		public static void SwapAlter(int ar[])
		{
			for(int i=0;i<ar.length-1;i+=2)
				{
					int temp = ar[i];
					ar[i]=ar[i+1];
					ar[i+1]=temp;
				}
		}
		
		public static void printArray(int[] arr)
		{
			for(int i=0;i<arr.length;i++)
				System.out.print(arr[i]+" ");
		}
		
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int T = sc.nextInt();
			while(T-- >0)
			{
				int n = sc.nextInt();
				int []arr = new int[n];
				for(int i=0;i<n;i++)
					arr[i] = sc.nextInt();
				SwapAlter(arr);	
				printArray(arr);
			}
			sc.close();
		}
}

