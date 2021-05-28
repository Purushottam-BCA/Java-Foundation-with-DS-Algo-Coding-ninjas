package pattern_2;
import java.util.Scanner;

public class Isosceles_triangle 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int currRow=1;
		while(currRow<=N)
		{
			int space=1;	   // Spaces
			while(space<=N-currRow)
			{
				System.out.print("  ");
				space++;
			}
			
			int currCol=currRow;     // Increasing part :: start from Row number to 2*Row-1
			while(currCol<=2*currRow-1)
			{
				System.out.print(currCol+" ");
				currCol++;
			}
			
			currCol=currCol-2;  // Decreasing part :: Start from Column-2 to Row_no.
			while(currCol>=currRow)
			{
				System.out.print(currCol+" ");
				currCol--;
			}
			
			System.out.println();
			currRow++;
		}
	}
}