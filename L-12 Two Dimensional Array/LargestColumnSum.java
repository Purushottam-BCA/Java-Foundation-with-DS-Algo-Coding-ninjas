package twoDarray;
import java.util.Scanner;

public class LargestColumnSum 
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
	
	public static int MaxCloumnSum(int [][] ar)
	{
		int row = ar.length,maxSum=Integer.MIN_VALUE;
		int col =ar[0].length,sum=0;
		for(int j=0;j<col;j++)
		{
			sum = 0;
			for(int i=0; i<row; i++)
				sum += ar[i][j];
			if(sum>maxSum)
				maxSum = sum;
		}
		return maxSum;
	}
		
		public static void main(String[] args) 
		{
			int myArray[][] = takeInput();
			showOutput(myArray);
			System.out.println(MaxCloumnSum(myArray));	
		}
}
