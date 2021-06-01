package loops;
import java.util.Scanner;

public class BinarytoDecimal {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int Num = sc.nextInt();
		sc.close();
		int Dec=0,product=1;
		while(Num>0) // 11101
		{
			int lastDigit = Num%2;
			Dec += lastDigit*product;
			product*=2;
			Num/=10;
		}
		System.out.println(Dec);
	}
}
