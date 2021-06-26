package assignments;
import java.util.Scanner;

public class ReverseEachWord 
{
	public static StringBuffer reverse(StringBuffer s,int low, int high)
	{
		char temp,temp2;
		while(low<high)
		{
			temp = s.charAt(low);
			temp2 = s.charAt(high);
			s.setCharAt(low, temp2);
			s.setCharAt(high, temp);
			low++;
			high--;
		}
		return s;
	}
	
	public static StringBuffer ReverseWord(StringBuffer str) // Part 1
	{
		int startIndex=0;
		for(int i=0; i<str.length(); i++) // For all words except the last one
		{
			if(str.charAt(i)==' ')  // If i found a space means before that there will be a word
			{
			str = reverse(str, startIndex, i-1);
			startIndex = i+1;
			}
		}
		// Since there is no space after the last word in the string, so we have to do it separately.
		return reverse(str,startIndex,str.length()-1);  // Return with Last modification
	} 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		while(T-- >0)
		{
			StringBuffer str = new StringBuffer();
			str.append(sc.nextLine());
			System.out.println(ReverseWord(str));
		}
		sc.close();
	}
}
