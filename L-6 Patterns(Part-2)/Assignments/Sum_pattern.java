package assignment_pattern2;
import java.util.Scanner;

public class Sum_pattern 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		sc.close();
		System.out.println("1=1");
		int currRow=2;
		while(currRow<=N)
		{
		int sum=1;
		 System.out.print(1);
		 int currCol=2;
		 while(currCol<=currRow)
		 {
			sum +=currCol;
			System.out.print("+"+currCol);
		    currCol++;
		 }
		 System.out.println("="+sum);
		 currRow++;
		}
	}// End of Main
}
/*

1=1
1+2=3
1+2+3=6
1+2+3+4=10
1+2+3+4+5=15 
  
 */