package functions;
import java.util.Scanner;
import java.lang.Math;

public class First_digit_of_Number {
	public static int getFirstDigit(int Num)
	{
	/* Method 1
		while(Num>10)
		{
			Num/=10;
		}
	*/
		// Method - 2
		int tempNum = (int)Math.log10(Num);
		tempNum =(int) Math.pow(10,tempNum);
		Num = Num/tempNum;
		return Num;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int Num = sc.nextInt();
		sc.close();
		int fDigit = getFirstDigit(Num);
		System.out.println(fDigit);
	}
}
