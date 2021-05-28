package pattern;
import java.util.Scanner;

public class Basic_pattern5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		sc.close();
		int currRow=1;
		while(currRow<=N)
		{
			int currCol=1;
			while(currCol<=currRow) 
			{
				System.out.print(currRow+" ");
				currCol++;
			}
		System.out.println();
		currRow++;
		}
	}
}