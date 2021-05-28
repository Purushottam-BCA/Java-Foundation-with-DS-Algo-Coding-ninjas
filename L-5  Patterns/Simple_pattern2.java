package pattern;
import java.util.Scanner;

public class Simple_pattern2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		sc.close();
		int i=1,num=1;
		while(i<=N)
		{
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
