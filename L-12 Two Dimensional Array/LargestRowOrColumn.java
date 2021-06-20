package twoDarray;
import java.util.Scanner;

public class LargestRowOrColumn 
{
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
	//	sc.close();
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
		
	public static void MaxRowOrCloumnSum(int [][] ar)
	{
		int row = ar.length, col =ar[0].length;
		int sumRow=0,sumCol=0;
		int maxRow = Integer.MIN_VALUE, maxCol = Integer.MIN_VALUE;
		int rowNo=0, colNo=0;
		
		// Getting MaxRow Sum & Row Number
		for(int i=0; i<row; i++)
		{
			sumRow = 0;
			for(int j=0; j<col; j++)
			{
				sumRow += ar[i][j];
				if(sumRow>maxRow)
				{
					rowNo = i;
					maxRow = sumRow;
				}
			}
		}
		
		// Getting MaxCol Sum & Column Number
		for(int j=0; j<col; j++)
		{
			sumCol = 0;
			for(int i=0; i<row; i++)
			{
				sumCol += ar[i][j];
				if(sumCol>maxRow && sumCol>maxCol)
				{
					colNo = j;
					maxCol = sumCol;
				}
			}
		}
		
		if(maxRow>=maxCol)
			System.out.println("row "+rowNo+" "+ maxRow);
		else
			System.out.println("column "+colNo+" "+ maxCol);
	}
			
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- >0)
		{
			int myArray[][] = takeInput();
			showOutput(myArray);
			System.out.println();	
			MaxRowOrCloumnSum(myArray);
			System.out.println();	
		}
		sc.close();
	}
}