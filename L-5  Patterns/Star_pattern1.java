package pattern;
import java.util.Scanner;

public class Star_pattern1{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		sc.close();
		int i=1;
		while(i<=N)
		{
		 int k=1;
		 while(k<=N-i)
		 {
			 System.out.print("  ");
			 k++;
		 }
		 int j=1;
		 while(j<=(2*i)-1)
		 {
			 System.out.print("* ");
			 j++;
		 }
		 System.out.println();
		 i++;
		}
	}
}

/*
   *
  ***
 *****
*******
 */
 