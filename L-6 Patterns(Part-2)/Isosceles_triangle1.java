package pattern_2;
import java.util.Scanner;

public class Isosceles_triangle1 
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
			
			int currCol=1;     // Increasing part
			while(currCol<=currRow)
			{
				System.out.print(currCol+" ");
				currCol++;
			}
			
			currCol=currRow-1;  // Decreasing part
			while(currCol>=1)
			{
				System.out.print(currCol+" ");
				currCol--;
			}
			
			System.out.println();
			currRow++;
		}
	}
}