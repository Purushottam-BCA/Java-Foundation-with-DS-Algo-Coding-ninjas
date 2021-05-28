package assignment_pattern2;
import java.util.Scanner;

public class Parallelogram_pattern {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int currRow = 1;
		while(currRow<=N)
		{
			int space=1;
			while(space<currRow) 
			{
				System.out.print(" ");
				space++;
			}
			
			int currCol = 1;
			while(currCol<=N)
			{
				System.out.print("*");
				currCol++;
			}
			
			System.out.println();
			currRow++;
		}
	}
}