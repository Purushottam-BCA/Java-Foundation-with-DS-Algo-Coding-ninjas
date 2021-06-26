package assignments;
import java.util.Scanner;

public class CompressString {

	public static String Compress(String str) 
	{
		String temp="";
		int a[]=new int[256];
		
		char Current = str.charAt(0);
		
		for(int i=0; i<str.length();i++)
		{
			char ch=str.charAt(i);
			++a[ch];
			if(Current != ch)
			{
				if(a[Current]>1) // If Frequency is greater than One
					temp = (temp+Current) + a[Current];
				else if(a[Current]==1)
					temp = temp+Current;
				a[Current]=0;
				Current=ch;
			}
		}
		// Last Pattern will not be recognized inside loop so we have to define it separately.
		if(a[Current]>1) // If Frequency is greater than One
			temp = (temp+Current) + a[Current];
		else if(a[Current]==1)
			temp = temp+Current;
		return temp;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		while(T-- >0)
		{
			String str = sc.next();
			System.out.println(Compress(str));
		}
		sc.close();

	}

}
