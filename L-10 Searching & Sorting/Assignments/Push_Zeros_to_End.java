package assignments;

import java.util.Scanner;

public class Push_Zeros_to_End {

	public static void Push_zero_to_end(int [] ar)
	{
		int zeroPos = 0, current = 0;
		for( ; current<ar.length ; current++)
		{
			if(ar[current]!=0)
			{
			   int temp = ar[zeroPos]; 
			   ar[zeroPos]	= ar[current];
			   ar[current] = temp;
			   zeroPos++;
			}
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- >0)
		{
			int arraySize = sc.nextInt();
			int [] Array = new int[arraySize];
			for(int index=0; index < arraySize; index++)
				Array[index]= sc.nextInt();
			Push_zero_to_end(Array);
			System.out.println();
			for(int index=0; index<Array.length; index++)
				System.out.print(Array[index]+ " ");
		}
		sc.close();
	}
}
