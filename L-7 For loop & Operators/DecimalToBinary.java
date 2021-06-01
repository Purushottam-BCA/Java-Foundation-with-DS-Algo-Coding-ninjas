package loops;
import java.util.Scanner;

public class DecimalToBinary {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int Num = sc.nextInt();
		sc.close();
		long Bin=0,product=1; 
		while(Num>0) // 5
		{
			int lastDigit = Num%2;
			Bin += lastDigit*product;  
			product *= 10;
			Num/=2;
		}
		System.out.println(Bin);
	}

}
