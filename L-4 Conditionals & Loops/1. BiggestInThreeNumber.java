package if_else;
import java.util.Scanner;

public class biggestThree {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		sc.close();
		if(a>=b && a>=c)
			System.out.println("A is bigger");
		else if(b>=c)
			System.out.println("B  is Bigget");
		else
			System.out.println("C is Biggest");
	}
}
