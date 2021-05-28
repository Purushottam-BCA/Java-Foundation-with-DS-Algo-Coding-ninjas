package assignment1;
import java.util.Scanner;

public class FactorOfNum {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int N=sc.nextInt();
	sc.close();
	int i = 2;
	while(i<N-1)
	{
		if(N%i==0)
			System.out.print(i+" ");
		i++;
	}
}
}
