package strings;

import java.util.Scanner;

public class CountWords {

	public static int countWords(String s2)
	{
		if(s2.length()==0)
			return 0;
		int count = 1;
		for(int index=0; index<s2.length(); index++)
			{
			if(s2.charAt(index)==' ')
				count++;
			}
		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s2 = sc.nextLine();
		System.out.println(countWords(s2));
		sc.close();
	}
}
