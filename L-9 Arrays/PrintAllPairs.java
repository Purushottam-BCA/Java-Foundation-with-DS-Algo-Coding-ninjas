package array;

public class PrintAllPairs {

	public static void printAllPair(int a[])
	{
		for(int i=0;i<a.length;i++)
			for(int j=i+1;j<a.length;j++)
				System.out.print("("+a[i]+","+a[j]+") ");
	}
	
	public static void main(String[] args) {
		int a[] = {1,4,7,6,5};
		printAllPair(a);	
	}
}
