package array;

public class PassArrayToFunction {

	public static void increment(int []ar)
	{
		for(int i =0;i<ar.length;i++)
			ar[i]+=1;
	}
	public static void printArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
	
	public static void main(String[] args) {
		int []arr = {1,2,3,4,5};
		increment(arr);
		printArray(arr);
	}

}
