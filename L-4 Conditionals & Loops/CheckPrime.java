package while_loop;
import java.util.Scanner;
import java.lang.Math;

public class CheckPrime {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num = sc.nextInt();
	int i=2;
	while(i<=(int)Math.sqrt(num))
	{
		if(num%i==0)
			{
				System.out.println("Not Prime");
				return;
			}
		i++;
	}
	System.out.println("Prime Number");
	sc.close();
	}

}
