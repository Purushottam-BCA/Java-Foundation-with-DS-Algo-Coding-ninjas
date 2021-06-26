package assignments;
import java.util.Scanner;

public class HighestOccuringCharacter {

	public static char MaxOccuring(String str)
	{
		int a[] = new int[256];
		for(int i=0; i<str.length(); i++)
			++a[str.charAt(i)];
		
		int max=a[0],maxChar=0;
		for(int i=1; i<256; i++)
			if(a[i]>max)
			{
				max=a[i];
				maxChar = i;
			}
		return (char)maxChar;
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int T=sc.nextInt();
		while(T-- >0)
		{
			String str = sc.next();
			System.out.println(MaxOccuring(str));
		}
		sc.close();
	}
}
