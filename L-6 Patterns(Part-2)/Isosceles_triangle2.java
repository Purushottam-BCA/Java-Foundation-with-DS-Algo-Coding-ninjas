package pattern_2;
import java.util.Scanner;

public class Isosceles_triangle2 {

	public static void main(String[] args) {
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
			
			int currCol=1;    
			while(currCol<=2*currRow-1)
			{
				System.out.print("* ");
				currCol++;
			}
			
			System.out.println();
			currRow++;
		}

	}

}
