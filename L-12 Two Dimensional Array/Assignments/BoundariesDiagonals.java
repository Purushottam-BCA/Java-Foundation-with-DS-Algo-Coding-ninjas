package assignment;
import java.util.Scanner;

public class BoundariesDiagonals {

	public static int [][] takeInput()
	{
		Scanner sc = new Scanner(System.in);
	//	System.out.println("ENTER ROWS : ");
		int size = sc.nextInt();
		int Matrix[][] = new int[size][size];
		for(int i=0; i<size; i++)
			for(int j=0;j<size;j++)
				Matrix[i][j] =sc.nextInt();
		sc.close();
		return Matrix;
	}
	
	public static void showOutput(int a[][])
	{
		int size = a.length;
		// Printing The Matrix
		for(int i=0; i<size; i++)
		{
			for(int j=0;j<size;j++)
				System.out.print(a[i][j]+" ");
			System.out.println();
		}
	}

// -------------------------- BRUTE FORCE APPROACH O(n^2) --------------------------------------//
	
	public static int sumBoundry(int a[][])
	{
		int sum=0;
		for(int i=0;i<a.length; i++)
		{
			for(int j=0;j<a.length; j++)
			{
				if(i==0 || i==a.length-1)
					sum += a[i][j];
				else if(j==0 ||j==a.length-1)
					sum += a[i][j];
				else if(i==j || (i+j)==a.length-1)
					sum+= a[i][j];
			}
		}
	return sum;
	}
	
// -------------------------- BETTER APPROACH O(n) --------------------------------------//
	
	// Calculating Top & Bottom Boundaries
	public static int TopBottom(int a[][])
	{
		int sum = 0, row= a.length, col= row-1;
		while(col>=0)
		{
			sum += a[0][col];
			if(row!=1) // In Case it is only Row Avaialable 
				sum += a[row-1][col];
			col--;
		}
		return sum;
	}
	
	// Calculating Left & Right Boundaries (2nd Row to N-1 Row )
	public static int leftRight(int a[][]) // No Need to check extra because we already checked in Top Bottom.
	{
		int sum = 0, row= a.length, CurrRow = 1;
		while(CurrRow < row-1)
		{
			sum += a[CurrRow][0] + a[CurrRow][row-1];
			CurrRow++;
		}
		return sum;
	}
	
	// Calculating Both Diagonals Sum
	public static int diagonal(int a[][]) // No Need to check extra because we already checked in Top Bottom.
	{
		int sum = 0, row= a.length, Row1 = 1, CurrCol=1, Row2=row-2;
		while(Row1 < row-1)
		{
			sum += a[Row1][CurrCol];
			// Middle Value Has Calculated Twice In case of Odd number of Matrix Size) 
			if(Row2!=CurrCol)
				sum += a[Row2][CurrCol];
			Row1++;
			Row2--;
			CurrCol++;
		}
		return sum;
	}
	
	// Approach-2 O(n)
	public static int sumBoundry2(int a[][])
	{
	 return (TopBottom(a) + leftRight(a) + diagonal(a));
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- >0)
		{
			int myArray[][] = takeInput();
			System.out.println();	
			showOutput(myArray);
			System.out.println();	
			System.out.println(sumBoundry2(myArray));
		}
		sc.close();
	}
}
