package assignment;
import java.util.*;

public class Find_Unique {

	public static void UniqueElements(int []arr)   // O(n^2)
	{
		int size  = arr.length;
		for(int start=0;start<size;start++)
		{
			int nextItem = 0;
			for(; nextItem<size; nextItem++)
				if((start!=nextItem) && (arr[start]==arr[nextItem]))
					break;
			if(nextItem==size)			
				System.out.println(arr[start]);
		}
	}
	
	public static void UniqueItem(int [] a)  // Approach-2 SORT then BINARY SEARCH (nlogn)
	{
		Arrays.sort(a);
		int left = 0, right=a.length-1;
		while(left < right)
		{
			int mid = left + (right-left)/2;
			if(mid%2==1) mid--; // ODD
			  {
				if(a[mid]==a[mid+1] )
					left = mid+2;
				else
					right = mid;
			  }
		}
		System.out.println(a[left]);
	}  //  1  2  2  3  *3*  6  6  9  9 - EVEN	   ||  1  2  2  *3*  3  6  6  - ODD	
	  //   1  1  2  2  *3*  3  6  6  9 - EVEN	   ||  1  1  2  *2*  6  6  7  - ODD	
/*
	Approach 3 : ​The best solution is to use XOR. Taking XOR of all the elements present in the array, 
	gives us the unique element present in the array.
	
    This approach uses 2 properties of XOR : 
       1.XOR of a number with itself is 0.
       2.XOR of a number with 0 is number itself.
    Let us understand this approach with the help of an example : arr[]= 2 3 1 6 3 6 2
    Taking their xor : Answer = 0 ^ (2 ^ 3 ^ 1 ^ 6 ^ 3 ^ 6 ^ 2) Now XOR is associative and commutative, 
    so I can write it as:Answer = (2^2) ^ (3^3) ^ 1 ^ (6 ^ 6)             
                                = 0 ^ 0 ^ 1 ^ 0             
                                = 1
    Time complexity of this solution is O(n).
    Pseudo Code for this approach:
       Function findUnique():     
       Answer=0     
       For i=0 to i less than size:          
       	  answer=answer xor input[i]    
       Return answer 
   */
	public static void UniqueElement2(int arr[])   //  O(n)
	{
		int answer=0;
		for(int i=0;i<arr.length;i++)
			answer = answer ^ arr[i];
		System.out.println(answer);
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
//			UniqueElements(array);
//			UniqueItem(array);
			UniqueElement2(array);
			System.out.println();
		}
		sc.close();
	}
}
