/*
  	Problem Description : ​You are​​given with a number n, put all elements from 1 to n in an array in order - 1,3......4,2
  	For example, if  N=6, then the output must be: 1 3 5 6 4 2
  
 	How to approach ? 
 	
 	To arrange the numbers in the given sequence, we can continue by taking 2 indices one from start(i) 
 	and the other from the end(j). Start with number =1, print it on the first index(i), then increment 
 	the number and index i, now print the number on the last index(j), again increment the number and 
 	decrement j, print number on the 2nd index(i)  and so on continue till i crosses j.
 	
 	Pseudo Code for this problem : 
 	Function arrange:      
 		i=0, j=n-1     
 		number=1 
 		While i is less than j:               
 			arr[i]=number               
 			Increment number by 1             
 			Increment i by 1.              
 			arr[j]= number             
 			Increment number by 1             
 			Decrement j by 1
 		If i is equal to j:            
 			arr[i]=number
 */
package array;
import java.util.Scanner;

public class Arrange_Array_elements {

	public static void Arrange_element(int num)   // Method-1
	{
		int []ar = new int[num];
		int number = 1;
		int i=0,j=ar.length-1;
		while(i<j)
		{
			ar[i++]=number++;
			ar[j--]=number++;
		}
		if(i==j) // In case of odd
			ar[i]=num;
		for(i=0;i<ar.length;i++)
			System.out.print(ar[i]+" ");   
	}
	
	public static void Arrange_element2(int num)   // Method-2
	{
		int []ar = new int[num];
		int val = 1;
		int i=0,j=ar.length-1;
		
		while(i<=j/2)  // Odd Elements
		{
			ar[i]=val;
			val+=2;
			i++;
		}
		
		val = 2;
		while(j>=i)	// Even Elements
		{
			ar[j]=val;
			val+=2;
			j--;
		}
		
		for(i=0;i<ar.length;i++)
			System.out.print(ar[i]+" ");   
	}
	
	public static void Arrange_element3(int num)   // Method-3
	{
		int []arr = new int[num];
		int val = 1;
		int left=0,right=arr.length-1;
		
		while(left<=right)
		{
			if(val %2 ==1)  // Odd Number 
				arr[left++]=val++;
			else
				arr[right--]=val++;
		}
		for(left=0;left<arr.length;left++)
			System.out.print(arr[left]+" ");   
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0)
		{
			int N=sc.nextInt();
			Arrange_element3(N);
		}
	sc.close();
	}
}
