package assignment;

import java.util.Scanner;

public class PrintWave {

	public static int [][] takeInput()
	{
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
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

	// Approach -1 : O(n^2)
	public static void ShowWave(int [][]a)
	{
		int row = a.length, col =a[0].length;
		int currRow=0,CurrCol=0;
		boolean goUp=false;
		
		while(CurrCol<col)
		{
			if(currRow == -1 && goUp==true)  // If First Row & Go from Bottom then Print It and Change Column
			{
				//System.out.print(a[currRow][CurrCol]+" ");
				CurrCol++; currRow=0;
				goUp = false;
			}
			else if(currRow == row && goUp==false) // if it is at last position then Move in UP Direction
			{
			//	System.out.print(a[currRow][CurrCol]+" ");
				CurrCol++;
				currRow=row-1;
				goUp=true;
			}
			else 
			{
				System.out.print(a[currRow][CurrCol]+" ");
				if(goUp==false)
					currRow++;
				else
					currRow--;
			}
		}
	}

	// Approach -2 : O(n^2)
	public static void ShowWave2(int [][]a)
	{
		int row =a.length;	
		if(row==0) 
			return;
		int col = a[0].length;
		for(int nCols = 0; nCols<col ; nCols++)
		{
			if(nCols%2==0) // Even Number of Lines Top to Bottom Because INdex Start from 0
				for(int nRows=0; nRows<row; nRows++)
					System.out.print(a[nRows][nCols]+ " ");
			else  // Odd No. Of Lines From Bottom To Top
				for(int nRows=row-1; nRows>=0; nRows--)
					System.out.print(a[nRows][nCols]+ " ");
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- >0)
		{
			int myArray[][] = takeInput();
			System.out.println();	
			showOutput(myArray);
			System.out.println();
			ShowWave2(myArray);
			System.out.println();
		}
		sc.close();
	}
}
