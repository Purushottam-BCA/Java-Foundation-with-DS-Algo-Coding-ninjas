package assignments;
import java.util.Scanner;

public class RemoveConsecutiveDuplicate {

	public static StringBuffer RemoveDupl(String str)
	{
		if(str.length()==0) return null;
		
		StringBuffer tmp = new StringBuffer();
		char CurrChar = str.charAt(0);
		tmp.append(CurrChar); // Appending First Character
		for(int i=1;i<str.length(); i++)
		{
			if(CurrChar!=str.charAt(i))
			{
				CurrChar = str.charAt(i);
				tmp.append(CurrChar);
			}
		}
		return tmp;		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- >0)
		{
		String str = sc.next();
		System.out.println(RemoveDupl(str));
		}
		sc.close();
	}
}
