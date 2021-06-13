package strings;

import java.util.Scanner;

public class ReverseString {

	public static String reverseString(String s2)
	{
		String newone = "";
		int end=s2.length()-1;
		while(end>=0)
		{
			newone += s2.charAt(end);
			end--;
		}
		return newone;
	}
	
	public static String reverseString2(String s2)
	{
		String newone = "";
//		int current;
		for(int index=0; index<s2.length(); index++)
		{
//			current = s2.length()-index-1;
//			newone += s2.substring(current, current+1);
			newone += s2.charAt(s2.length()-1-index);
		}
		return newone;
	}
	
	public static String reverseString3(String s2)
	{
		String newone = "";
		for(int index=0; index<s2.length(); index++)
			newone = s2.charAt(index)+newone;
		return newone;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String s2 = sc.nextLine();
		System.out.println(reverseString3(s2));
		sc.close();
	}
}
