package assignment1;
import java.util.Scanner;

public class PowerOfNum {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int X = sc.nextInt(); 
		int N = sc.nextInt();
		sc.close();
		int product=1;
		while(N>0)
		{
			product *=X;
			N--;
		}
		System.out.println(product);
		
	}

}
