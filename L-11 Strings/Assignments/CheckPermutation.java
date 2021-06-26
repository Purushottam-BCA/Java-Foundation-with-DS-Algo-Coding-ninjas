package assignments;
import java.util.Scanner;

public class CheckPermutation
{
	public static boolean IsPermutation(String a, String b)
	{
		if(a.length()!=b.length())
			return false;
		for(int index=0; index<a.length(); index++)
		{
			if(b.indexOf(a.charAt(index))==-1)
				return false;
		}
		return true;
	}
	
  // 2nd Approach
	public static boolean IsPermutation2(String a, String b)
	{
		if(a.length()!=b.length())
			return false;
		
		int frequency[] =new int[256]; // for  256 characters create a frequency table that will keep count, By default 0
		for(int index=0; index<a.length(); index++)
		{
			++frequency[a.charAt(index)];
		}
		
		for(int index=0; index<b.length(); index++)
		{
			--frequency[b.charAt(index)];
		}
		for(int index=0; index<256; index++)
			if(frequency[index]!=0)
				return false;
		
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String str2 = sc.nextLine();
		System.out.println(IsPermutation2(str,str2));
		sc.close();
	}
}
