package twoDarray;

import java.util.Scanner;

public class FunctionWithArray {
	
	public static int [][] takeInput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER ROWS : ");
		int row = sc.nextInt();
		System.out.println("ENTER COLOUMNS : ");
		int col = sc.nextInt();
		
		int Matrix[][] = new int[row][col];
		for(int i=0; i<row; i++)
			for(int j=0;j<col;j++)
				Matrix[i][j] =sc.nextInt();
		sc.close();
		return Matrix;
	}
	
	public static void showOutput(int a[][])
	{
		int row = a.length;
		int col =a[0].length;
		// Printing The Matrix
		for(int i=0; i<row; i++)
		{
			for(int j=0;j<col;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}
	
	public static void main(String[] args) 
	{
		int myArray[][] = takeInput();
		showOutput(myArray);
	}

}
