package assignment1;
import java.util.Scanner;
import java.lang.Math;

public class Total_salary {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int basic = sc.nextInt();
		char grade = sc.next().charAt(0);
		float hra = (float)(0.2 * basic);
		float da = (float)(0.5 * basic);
		int allow;
		if(grade=='A')
			allow = 1700;
		else if(grade=='B')
			allow = 1500;
		else
			allow = 1300;
		float pf = (float)((11.0/100) * basic);
		sc.close();
		float totalSalary = (basic + hra + da - pf + allow) ;
		System.out.println(Math.round(totalSalary));
	}

}
