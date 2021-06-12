package assignments;
import java.util.Scanner;
import java.lang.Math;

public class SumofArray {

	public static void CalculateArrayum(int a[], int b[])
	{
		int [] c = new int[Math.max(a.length, b.length)+1];
		
		int i=a.length-1, j=b.length-1, k = c.length-1;
		int sum=0, carry=0;
		
		while(i>=0 && j>=0)
		{
			sum = carry + a[i]+b[j];
			carry = sum/10;
			c[k--]= (sum+10)%10;
			i--;
			j--;
		}
		
		while(i>=0)
		{
			sum = carry + a[i];
			carry = sum/10;
			c[k--]= sum%10;
			i--;
		}
		
		while(j>=0)
		{
			sum = carry + b[j];
			carry = sum/10;
			c[k--]= sum%10;
			j--;
		}
		
		if(carry>0)
			c[k]=carry;
		
		for(int index=0; index<c.length; index++ )
			System.out.print(c[index] + " ");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- >0)
		{
			int arraySize = sc.nextInt();
			int [] Array = new int[arraySize];
			for(int index=0; index < arraySize; index++)
				Array[index]= sc.nextInt();
			int arraySize2 = sc.nextInt();
			int [] Array2 = new int[arraySize2];
			for(int index=0; index < arraySize2; index++)
				Array2[index]= sc.nextInt();
			CalculateArrayum(Array,Array2);
			System.out.println();
		}
		sc.close();
	}
}
