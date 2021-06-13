package strings;
import java.util.Scanner;

public class ReverseStringWordWise {

	public static String ReverseWordWise(String str)
	{
		int start=0;
		String temp="";
		for(int i=0; i<str.length(); i++) // For all words except the last one
		{	if(str.charAt(i)==' ') 
			{
			temp = " "+str.substring(start,i)+temp;
			start = i+1;
			}
		}
		temp = str.substring(start,str.length())+temp;
		return temp;
	} 
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(ReverseWordWise(str));
		sc.close();
	}
}
