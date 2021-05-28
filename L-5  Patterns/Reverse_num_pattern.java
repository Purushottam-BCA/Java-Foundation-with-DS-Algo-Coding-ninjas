package pattern;
import java.util.Scanner;

public class Reverse_num_pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int currRow=1;
		while(currRow<=N)
		{
			int currCol=currRow;
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
