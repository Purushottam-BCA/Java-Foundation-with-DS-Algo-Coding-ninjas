package assignment;
import java.util.Arrays;
import java.util.Scanner;

public class Pair_Sum {

	public static int pair_sum2(int []ar, int sum)   // O(n^2)
	{
		int counter=0;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=i+1;j<ar.length;j++)
				if(ar[i]+ar[j]==sum)
						counter++;
		}
		return counter;
	}
	
	
	
	public static int pair_sum(int []ar, int sum)  // nLogn + O(n)
	{
		int counter=0,val;
		Arrays.sort(ar);
		int left=0, right =ar.length-1;
		while(left<right)
		{
			val = ar[left]+ar[right];
			if(val==sum)
				{
					counter++;
					int temp=1;
					while(ar[left]+ar[right-temp]==sum && left<(right-temp))
					{
						temp++;
						counter++;
					}
					left++;
				}
			else if(val>sum)
				right--;
			else if(val<sum)
				left++;
		}
		return counter;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- >0)
		{
			int arraySize = sc.nextInt();
			int [] array = new int[arraySize];
			for(int index=0; index<arraySize; index++)
				array[index]= sc.nextInt();
			int sum = sc.nextInt();	
			System.out.println(pair_sum(array,sum));
		}
		sc.close();
	}
}
/* 
  We can improve the time complexity to O(n) at the cost of some extra space.The idea is that in the naive approach, 
  we are checking every possible pair that can be formed but we don’t have to do that.If we iterate through the array, 
  and we encounter some element ​arr[i]​, then all we need to do is to check whether we’ve encountered ​ (x - arr[i])​ 
  somewhere previously in the array and if yes, then how many times. Ideally, we would want to access this information in O(1) time.
  For this, we can use a HashMap.So, now we know how many times (​x - arr[i])​ has appeared. 
  Then we can print the pair ​(x - arr[i], arr[i])​ {frequency of ​x - arr[i]}​ times.The time complexity of this approach will be O(n)
  and so will the space complexity.
  
  Things to look out for!What happens if ‘x’ is even and there’s an element which is equal to x/2 in the array? 
  We’ll have to be careful that we don’t consider ​(x/2, x/2)​ as a valid pair. This problem has an easy fix. 
  Just make sure that you insert/update the current element after you’ve printed the pairs (if any) for that iteration.
  
The pseudo-code for this approach :
	function pairSum(arr, x):  
		HashMap(integer,integer) frequencyMap  
		for element in arr:    
			complement <- x - element if(frequencyMap contains the key ‘complement’):      
			//print pair frequencyMap[complement] times    
			 frequencyMap[element] <- frequencyMap[element] + 1    
			 //frequencyMap[element] is initially 0
     
     */
 