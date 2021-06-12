/*

Sum of Two Arrays

Two random integer arrays/lists have been given as ARR1 and ARR2 of size N and M respectively. Both the arrays/lists contain numbers from 0 to 9(i.e. single digit integer is present at every index). The idea here is to represent each array/list as an integer in itself of digits N and M.
You need to find the sum of both the input arrays/list treating them as two integers and put the result in another array/list i.e. output array/list will also contain only single digit at every index.
Note:
The sizes N and M can be different. 

Output array/list(of all 0s) has been provided as a function argument. Its size will always be one more than the size of the bigger array/list. Place 0 at the 0th index if there is no carry. 

No need to print the elements of the output array/list.
Input format :
The first line contains an Integer 't' which denotes the number of test cases or queries to be run. Then the test cases follow.

First line of each test case or query contains an integer 'N' representing the size of the first array/list.

Second line contains 'N' single space separated integers representing the elements of the first array/list.

Third line contains an integer 'M' representing the size of the second array/list.

Fourth line contains 'M' single space separated integers representing the elements of the second array/list.
Output Format :
For each test case, print the required sum of the arrays/list in a row, separated by a single space.

Output for every test case will be printed in a separate line.
Constraints :
1 <= t <= 10^2
0 <= N <= 10^5
0 <= M <= 10^5
Time Limit: 1 sec 
Sample Input 1:
1
3
6 2 4
3
7 5 6
Sample Output 1:
1 3 8 0
Sample Input 2:
2
3
8 5 2
2
1 3
4
9 7 6 1
3
4 5 9
Sample Output 2:
0 8 6 5
1 0 2 2 0 

*/

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
