package functions;
import java.util.Scanner;

public class NpR_NcR 
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt();
		int R = sc.nextInt();
		sc.close();
		long nCr = fact(N)/(fact(R)*fact(N-R));
		System.out.println(nCr);
		long nPr = fact(N)/fact(R);
		System.out.println(nPr);
	}

	public static long fact(int num)
	{
		if(num==0)
			return 1;
		return num*fact(num-1);
	}

}
