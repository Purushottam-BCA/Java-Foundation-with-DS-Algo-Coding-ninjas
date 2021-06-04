package array;

public class Linear_Search {

	public static int LinearSearch(int []ar, int item)
	{
		for(int i=0;i<ar.length;i++)
			if(ar[i]==item)
				return i;
		return -1;
	}
	
	public static void main(String[] args) {
		int ar[]= {5,11,20,33,9,19,21};
		System.out.println(LinearSearch(ar,-95));

	}

}
