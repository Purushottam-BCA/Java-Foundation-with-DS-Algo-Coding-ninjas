package twoDarray;

import java.util.Scanner;

public class RowWiseSum {

	public static int [][] takeInput()
	{
		Scanner sc = new Scanner(System.in);
	//	System.out.println("ENTER ROWS : ");
		int row = sc.nextInt();
	//	System.out.println("ENTER COLOUMNS : ");
		int col = sc.nextInt();
		
		int Matrix[][] = new int[row][col];
		for(int i=0; i<row; i++)
			for(int j=0;j<col;j++)
				Matrix[i][j] =sc.nextInt();
		sc.close();
		return Matrix;
	}
	
//	public static void showOutput(int a[][])
//	{
//		int row = a.length;
//		int col =a[0].length;
//		// Printing The Matrix
//		for(int i=0; i<row; i++)
//		{
//			for(int j=0;j<col;j++)
//				System.out.print(a[i][j]+" ");
//			System.out.println();
//		}
//	}
	
	public static void rowSum(int [][] ar)
	{
		int row = ar.length,sum;
		int col =ar[0].length;
		for(int i=0; i<row; i++)
		{
			sum =0;
			for(int j=0;j<col;j++)
				{
				sum += ar[i][j];
				System.out.print(ar[i][j]+" ");
				}
			System.out.printf(" => ROW %d : %d \n",i+1,sum);
		}
	}
	
	public static void main(String[] args) 
	{
		int myArray[][] = takeInput();
		System.out.println();
		rowSum(myArray);	
	}
}
