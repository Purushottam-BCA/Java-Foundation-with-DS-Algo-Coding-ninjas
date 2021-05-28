package if_else;
import java.util.Scanner;

public class odd_even {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int num = sc.nextInt();
		if(num%2==0)
			System.out.println("Even");
		else
			System.out.print("Odd");
		sc.close();
	}

}
