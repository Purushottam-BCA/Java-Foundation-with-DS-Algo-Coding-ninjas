package strings;
import java.util.Scanner;

public class ReverseEachWord {

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
	
	public static StringBuffer ReverseWord(StringBuffer str)
	{
		int start=0;
		for(int i=0; i<str.length(); i++) // For all words except the last one
		{
			if(str.charAt(i)==' ') 
			{
			str = reverse(str, start, i-1);
			start = i+1;
			}
			
//			if( i==str.length()-1) // Work for only last word
//				str = reverse(str, start, i);
		}
		return reverse(str,start,str.length()-1);  // Return with Last modification
	} 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuffer str = new StringBuffer();
		str.append(sc.nextLine());
		System.out.println(ReverseWord(str));
		sc.close();
	}
}
