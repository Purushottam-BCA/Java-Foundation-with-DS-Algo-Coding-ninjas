package loops;
import java.util.Scanner;

public class Check_Number_Sequence {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int Num = sc.nextInt();
		int FirstNum = sc.nextInt();
		boolean IsDec =  true;
		for(int i=1;i<Num;i++)
		{
			int newNum = sc.nextInt();
			if(FirstNum == newNum)
			{
				IsDec = false;
				break;
			}
			else if (newNum < FirstNum)
			{
				if(!IsDec)
					break;
			}
			else if (newNum > FirstNum)
			{
				if(IsDec);
					IsDec = false;
			}
				FirstNum = newNum;
		}
		if(IsDec)
			System.out.println("true");
		else
			System.out.println("false");
		sc.close();
	}

}