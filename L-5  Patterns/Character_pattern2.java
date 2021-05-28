package pattern;
import java.util.Scanner;

public class Character_pattern2 {

	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int N = sc.nextInt();
			sc.close();
			int currRow=1;
			char ch='A';
			while(currRow<=N)
			{
				int currCol=1;
				while(currCol<=currRow) 
				{
					System.out.print(ch+" ");
					currCol++;
				}
				System.out.println();
				currRow++;
				ch++;
			}
		 }
}
