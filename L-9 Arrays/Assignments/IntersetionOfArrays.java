package assignment;
import java.util.Arrays;
import java.util.Scanner;

public class IntersetionOfArrays {

	public static void Array_intersection(int []arr1, int [] arr2)   // Brute-Force :: O(size1*size2)
	{
		for(int index1=0;index1<arr1.length; index1++)
		{
			for(int index2=0;index2<arr2.length; index2++)
				if(arr1[index1]==arr2[index2])
					{
						System.out.print(arr2[index2]+" ");
						arr2[index2] = Integer.MIN_VALUE;   		// Set Negative infinity so that it never match again
						break;
					}
		}
	}
	
	public static void Array_intersection_Optimized(int []arr1, int [] arr2)  //SORTING : (size1*log(size1) + size2*log(size2))
	{
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int indx1=0,indx2=0;
		while(indx1<arr1.length && indx2<arr2.length)
		{
			if(arr1[indx1]==arr2[indx2])
				{
					System.out.print(arr2[indx2]+" ");	// Printing Intersection  :  0(size1 + size2)
					indx1++;	
					indx2++;
				}
			else if(arr1[indx1]<arr2[indx2])
				indx1++;
			else
				indx2++;
		}
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
			int arraySize2 = sc.nextInt();
			int [] array2 = new int[arraySize2];
			for(int index=0; index<arraySize2; index++)
				array2[index]= sc.nextInt();
		//	Array_intersection(array,array2);
			Array_intersection_Optimized(array,array2);
			System.out.println();
		}
		sc.close();
	}
}

/*

Approach 3: ​​The best solution here is to use hashmaps to further reduce the time complexity of this problem. 
			To continue with the hashmaps we can proceed with the following steps : 
			1.Initialize an empty hashmap mapp.
			2.Iterate through the first array, and put every element of this array in the mapp with its corresponding count.
			3.Now for every element of the 2nd array, search it in the hashmap and if it is present then print it and decrement 
			its corresponding count. After decrement, if the corresponding count becomes zero, then we should remove the element 
			from the mapp.Time Complexity for this approach: ​
			
			Time complexity for this approach is O(m+n) as searching & inserting operations in hashmaps are performed in O(1) time.
			
Pseudo Code for this approach:
	Function intersection:
	    Create an empty hashmap mapp    
	    For i=0 to i less than size1:   
	        Increment the count of each element of this array in hashmap  
	    For i=0 to i less than size2:       
	    	If any element of array2 exists in hashmap:               
	    		Print(element)              
	    		Decrement the count of that element in hashmap.      
	    	If count corresponding to that element is zero 
	    		Delete(element, mapp)
	    		
❏Let us dry run the code for:                           

Size1 of arr1 = 6     arr1[] = 2 6 8 5 4 3
Size2 of arr2 = 4     arr2[] = 2 3 4 7                                           


Creating an empty hashmap.
Inserting each element of array1 with its count in the hashmap.
Going through each element of array2, 
here the first element is 2 and since 2 exists in hashmap so, print it and then decrement its count from the mapp and 
now move to the next element.
Now, the second element 3 exists in hashmap so print it and then decrement its count from the mapp and 
now move to the next element.
The third element, 4 exists in hashmap so print it and then decrement its count from the mapp and 
now move to the next element.
Now, when we move to 7, it does not exist in the hashmap, so, we do nothing.
*/