/*
Spiral Print

For a given two-dimensional integer array/list of size (N x M), print it in a spiral form. That is, you need to print in the order followed for every iteration:
a. First row(left to right)
b. Last column(top to bottom)
c. Last row(right to left)
d. First column(bottom to top)
 Mind that every element will be printed only once.

Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains two integer values, 'N' and 'M', separated by a single space. They represent the 'rows' and 'columns' respectively, for the two-dimensional array/list.

Second line onwards, the next 'N' lines or rows represent the ith row values.

Each of the ith row constitutes 'M' column values separated by a single space.
Output format :
For each test case, print the elements of the two-dimensional array/list in the spiral form in a single line, separated by a single space.

Output for every test case will be printed in a seperate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^3
0 <= M <= 10^3
Time Limit: 1sec
Sample Input 1:
1
4 4 
1 2 3 4 
5 6 7 8 
9 10 11 12 
13 14 15 16
Sample Output 1:
1 2 3 4 8 12 16 15 14 13 9 5 6 7 11 10 
Sample Input 2:
2
3 3 
1 2 3 
4 5 6 
7 8 9
3 1
10
20
30
Sample Output 2:
1 2 3 6 9 8 7 4 5 
10 20 30  

*/

package assignment;
import java.util.Scanner;

public class SpiralPrint 
{
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

	public static void Spiral(int a[][])
	{
		int row = a.length;
		if(row==0) return;

		int col = a[0].length;
		int startRow=0,endRow=row-1, startCol=0,endCol = col-1;
		int counter = 0;
		
		while(counter<row*col)
		{
		   for(int i=startCol; i<=endCol; i++) // FIrst Row
			   {
			   System.out.print(a[startRow][i]+ " ");
			   counter++;
			   }
		   startRow++; // Change startRow to Next Line
		 
		  for(int i=startRow; i<=endRow; i++) // Last COlumn
		   {
			 System.out.print(a[i][endCol]+ " ");
			 counter++;
		   }
		  endCol--; // Change Column to Previous Line
		  
		  for(int i=endCol; i>=startCol; i--) //Last Row
		   {
			 System.out.print(a[endRow][i]+ " ");
			 counter++;
		   }
		  endRow--; // Change Row end to one Line Up 
		   
		  for(int i=endRow; i>=startRow; i--) // Printing First Column
		   {
			 System.out.print(a[i][startCol]+ " ");
			 counter++;
		   }
		  startCol++; // Change Column to one line next			
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
			Spiral(myArray);
			System.out.println();
		}
		sc.close();
	}
}
