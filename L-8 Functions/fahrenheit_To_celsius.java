package functions;
import java.util.Scanner;

public class FahrenheitToCelsius {

	public static void fahrenToCelsius(double S,double F, double gap)
	{
		for(double start = S; start<=F; start+=gap)
		{
			System.out.print((int)start + " ");
			double result = (5.0*(start-32))/9;
			System.out.println((int)result);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int begin = sc.nextInt();
		int end = sc.nextInt();
		int gap = sc.nextInt();
		sc.close();
		fahrenToCelsius(begin, end, gap);
	}

}
