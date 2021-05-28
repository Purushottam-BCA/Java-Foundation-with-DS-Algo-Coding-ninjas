package pattern;

import java.util.Scanner;

public class Simple_pattern5 {

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
		 int j=1,num=i;
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

/*
 * 
 *    1              
 *   23
 *  345
 * 4567
 * 
 * */
 