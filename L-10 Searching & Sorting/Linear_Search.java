package searching_sorting;
import java.util.Scanner;

public class Linear_Search {

	public static int linearSearch(int []a, int item)
	{
		for(int start=0; start<a.length; start++ )
			if(a[start]==item)
				return start;
		return -1;
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
			int item = sc.nextInt();
			System.out.println(linearSearch(array,item));
		}
		sc.close();
	}
}
