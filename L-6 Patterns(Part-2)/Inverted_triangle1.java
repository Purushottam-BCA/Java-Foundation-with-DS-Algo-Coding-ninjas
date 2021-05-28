package pattern_2;
import java.util.Scanner;

public class Inverted_triangle1 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int N= sc.nextInt();
		sc.close();
		int currRow=N;
		while(currRow>=1)
		{
			int currCol=1;
			while(currCol<=currRow)
			{
				System.out.print(currRow+" ");
				currCol++;
			}
			System.out.println();
			currRow--;
		}
	}
}
