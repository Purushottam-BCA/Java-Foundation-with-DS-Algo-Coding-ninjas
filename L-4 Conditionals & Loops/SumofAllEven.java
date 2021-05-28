package while_loop;
import java.util.Scanner;

public class SumofAllEven {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int N=sc.nextInt();
	int i=2,tot=0;
	sc.close();
	while(i<=N)
	{
		tot+=i;
		i+=2;
	}
	System.out.println("Sum = "+tot);
	}

}
