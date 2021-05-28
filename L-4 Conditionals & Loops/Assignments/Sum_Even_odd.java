package assignment1;
import java.util.Scanner;

public class Sum_Even_odd {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int even=0,odd=0;
		while(N>0)
		{
			int last = N%10;
			if(last %2==0)
				even+=last;
			else
				odd+=last;
			N/=10;
		}
		System.out.println("Sum of Even Diits : "+ even + "\nSum of Odd Digits : "+odd);
	}
}
