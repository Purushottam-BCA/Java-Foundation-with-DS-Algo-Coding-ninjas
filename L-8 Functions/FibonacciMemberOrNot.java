package functions;

import java.util.Scanner;

public class FibonacciMemberOrNot {
	public static boolean isValidFibonacci(int num) 
	{
		int a=0,b=1,c;
		while(a<num)
		{
			c=a+b;
			a=b;
			b=c;
		}
		if(a==num)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int Num = sc.nextInt();
		sc.close();
		System.out.println(isValidFibonacci(Num));
	}

}
