
package loops;
import java.util.Scanner;

public class Square_root_integer {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int Num = sc.nextInt();
		sc.close();
		int start=1;
		while(start*start<=Num)
		{
			start++;
		}
		System.out.println(start-1);
	}
}
