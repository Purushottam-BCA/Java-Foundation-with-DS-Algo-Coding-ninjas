package strings;

import java.util.Scanner;

public class AllSubstrings {

	public static void printAllSubstring(String s)
	{
		for(int index=0;index<s.length(); index++)
		{
			for(int j=index+1;j<=s.length(); j++)
				System.out.println(s.substring(index, j));
		}
	}
	
	public static void printAllSubstring2(String s)
	{
		for(int length=1;length<=s.length(); length++) 
		{
			for(int start=0;start<=s.length()-length; start++) 
			{
				int end = start + length-1;
				System.out.println(s.substring(start,end+1));
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s2 = sc.nextLine();
		printAllSubstring2(s2);
		System.out.println();
		sc.close();
	}
}
