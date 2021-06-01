package loops;
import java.util.Scanner;

public class TermsOfAP {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		for(int start=1; start<=N; start++)
		{
			int value = (3*start)+2;
			if(value%4 == 0)
			{
				N++;
				continue;
			}
			System.out.print(value+" ");
		}
	}
}
