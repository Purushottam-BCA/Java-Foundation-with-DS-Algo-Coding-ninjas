package pattern;
import java.util.Scanner;

public class Simple_pattern3{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		sc.close();
		int i=1,num=1;
		while(i<=N)
		{
		 int k=1;
		 while(k<=N-i) // Printing Space First
			 {
			  System.out.print("  ");
			  k++;
			 }
		 int j=1;
		 while(j<=i)
		 {
			 System.out.print(num+" ");
			 num++;
			 j++;
		 }
		 System.out.println();
		 i++;
		}
	}
}
