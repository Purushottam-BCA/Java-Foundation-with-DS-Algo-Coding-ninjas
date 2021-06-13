package strings;

import java.util.Scanner;

public class CheckPalindrome {

	public static boolean Palindrome(String s)
	{
		if(s.length()==0)
			return true;
		String temp="";
		for(int index=0; index<s.length(); index++)
			temp = s.charAt(index)+ temp;
		
		if(s.equalsIgnoreCase(temp))
			return true;
		return false;
	}
	
	public static boolean Palindrome2(String s)
	{
		if(s.length()==0)
			return true;
		int start=0, end = s.length()-1;
		while(start<end)
		{
			if(s.charAt(start)!=s.charAt(end))
				return false;
			start++;
			end--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s2 = sc.nextLine();
		System.out.println(Palindrome2(s2));
		sc.close();
		
	}

}
