package assignment;
import java.util.Scanner;

public class FInd_Duplicate {
/*
 Approach-1 :: Double Loop  - O(n^2)
 Approach-2 :: A better solution for this problem can be by using XOR operator. 
 			   Using XOR operator, we can solve this problem in one traversal only. 
 			   The following facts about XOR operation will be useful for this question:
 	1. If we XOR a number by itself, even number of times then it will give you 0.
 	2. If we XOR a number with itself, odd number of times, then it will give you the number itself.
 	3. Also XOR of a number with 0 gives you that number again.
 	
 	So, if we take XOR of all the elements present in the array with every element in the range 0 to n-2, then 
 	all the elements of that array except the duplicate element are XORed 2 times and hence, their resultant is 0. 
 	But the duplicate element is XORed 3 times, hence, its resultant is the number itself. 
 	Hence, you will get you answer as the duplicate number present in the array.
 	
 	For example, if you are given with n=5 and let us say array is 0 1 3 2 2, then according to this approach, 
 	we have to XOR all elements present in the array with every element in the range 0 to 3.
 	Answer = (0^1^3^2^2)^(0^1^2^3) As XOR operation is associative and commutative, so, by rearranging 
 	Answer = (0^0) ^ (1^1) ^ (2^2^2) ^ (3^3)
 	       = 0 ^ 0 ^ 2 ^ 0             
 	       = 2
 	
 Pseudo Code :
 		Function Find_duplicate:
 			answer=0
 			For i = 0 to i less than n:  
 				answer = answer xor arr[i]
 			For i=0 to i less than or equal to n-2:
 				answer=answer xor i
 			Return answer
 
 */
	public static int DuplicateElements(int arr[])   // -- O(n)
	{
		int ans = 0;
		for(int index=0; index<arr.length; index++) // here we get the unique elements
			ans = ans ^ arr[index];
		for(int num=0; num<=arr.length-2;num++)     // next time all duplicate became zero only unique remains
			ans = ans ^ num;
		return ans;
	}
	
/*
 
 Approach 2:​ Another approach is to make use of the condition that all elements lies between 0 and n-2. 
             So first calculate the sum of all natural numbers between 0 to n-2 by direct formula ​((n-1)*(n-2))/2​
             and sum of all elements of the array. Now, subtract the sum of all natural numbers between 0 to n-2 from 
             sum of all elements of the array. This will give you the duplicate element present in the array.
             
Pseudo Code :
	Function find_duplicate:     
		sum=0    
		For i = 0 to input[size]-1:
			sum = sum + input[i];   
		n = size  
		sumOfNaturalNumbers = ((n - 1) * (n - 2)) / 2
		Ans = sum - sumOfNaturalNumbers
		return Ans

*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- >0)
		{
			int arraySize = sc.nextInt();
			int [] array = new int[arraySize];
			for(int index=0; index<arraySize; index++)
				array[index]= sc.nextInt();
			System.out.println(DuplicateElements(array));
		}
		sc.close();

	}

}
