package pattern;
import java.util.Scanner;

public class Character_pattern1 
{
 public static void main(String[] args) 
   {
	Scanner sc=new Scanner(System.in);
	int N = sc.nextInt();
	sc.close();
	int currRow=1;
	while(currRow<=N)
	{
		char ch='A';
		int currCol=1;
		while(currCol<=N) 
		{
			System.out.print(ch+" ");
			currCol++;
			ch++;
		}
		System.out.println();
		currRow++;
	}
 }
}