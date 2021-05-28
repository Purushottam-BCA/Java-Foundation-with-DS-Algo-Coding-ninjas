package pattern_2;
import java.util.Scanner;

public class Diamond_pattern 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int currRow=1;
		int Firsthalf = (N/2)+1;
		int Secondhalf = N-Firsthalf; 
		while(currRow<=Firsthalf)	
		{
			int space=1;	   // Spaces
			while(space<=Firsthalf-currRow)
			{
				System.out.print("  ");
				space++;
			}	
			int currCol=1;     
			while(currCol<=2*currRow-1)
			{
				System.out.print("* ");
				currCol++;
			}
			System.out.println();
			currRow++;
		}
		// Second half pattern
		currRow=1;
		while(currRow<=Secondhalf)	
		{
			int space=1;	   // Spaces
			while(space<=currRow)
			{
				System.out.print("  ");
				space++;
			}	
			int currCol=2*Secondhalf-currRow;     
			while(currCol>=currRow)
			{
				System.out.print("* ");
				currCol--;
			}
			System.out.println();
			currRow++;
		}
	}
}
