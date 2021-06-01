package loops;
import java.util.Scanner;

public class RevreseOfNum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int Num = sc.nextInt();
		sc.close();
		int revNum = 0;
		while(Num>0)
		{
			int lastDigit = Num%10;
			revNum = revNum * 10 + lastDigit;
			Num/=10;
		}
		System.out.println(revNum);
	}

}
