package pattern;
import java.util.Scanner;

public class Star_pattern3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N= sc.nextInt();
		sc.close();
		int currRow=1;
		while(currRow<=N)
		{
			int space=1;
			while(space<=N-currRow)
			{
				System.out.print("  ");
				space++;
			}
			
			int currCol=1;
			while(currCol<=currRow)
			{
				System.out.print("* ");
				currCol++;
			}
			System.out.println();
			currRow++;
		}
	}
}
