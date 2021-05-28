package assignment_pattern2;
import java.util.Scanner;

public class Odd_square 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int currRow=1;
		while(currRow<=N*2)
		{
			int currCol=currRow;
			while(currCol<N*2)
			{
				System.out.print(currCol+" ");
				currCol+=2;
			}
			currCol=1;
			while(currCol<currRow)
			{
				System.out.print(currCol+" ");
				currCol += 2;
			}
		System.out.println();
		currRow += 2;
		}
	}
}

/*
Input-5
Output-
		1 3 5 7 9
		3 5 7 9 1
		5 7 9 1 3
		7 9 1 3 5 
		9 1 3 5 7

*/