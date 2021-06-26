package assignments;

import java.util.Scanner;

public class RemoveCharacter {

	public static String RemoveChar(String str, char ch)
	{
		String tmp="";
		for(int index=0; index<str.length();index++)
		{
			if(str.charAt(index)!=ch)
				tmp +=str.charAt(index);
		}
		return tmp;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		while(T-- >0)
		{
			String str = sc.next();
			char ch = sc.next().charAt(0);
			System.out.println(RemoveChar(str,ch));
		}
		sc.close();
	}
}
