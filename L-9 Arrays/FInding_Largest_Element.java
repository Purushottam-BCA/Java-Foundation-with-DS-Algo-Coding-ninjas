package array;

public class FInding_Largest_Element {

	public static int getMax(int []ar)
	{
		int max = Integer.MIN_VALUE;
		for(int i=0;i<ar.length;i++)
			if(ar[i]>max)
				max= ar[i];
		return max;
	}
	
	public static void main(String[] args) {
		
		int ar[]= {5,11,20,33,9,19,21};
		System.out.println(getMax(ar));
	}

}
