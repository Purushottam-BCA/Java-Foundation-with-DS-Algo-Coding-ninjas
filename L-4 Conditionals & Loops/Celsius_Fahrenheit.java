package while_loop;
import java.util.Scanner;

public class Celsius_Fahrenheit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int S = sc.nextInt();
		int E = sc.nextInt();
		int W = sc.nextInt();
		int C ;
		sc.close();
		while(S<=E)
		{
			C = (5*(S-32))/9;
			System.out.print(S+ " ");
			System.out.println(C);
			S+=W;
		}
	}

}
