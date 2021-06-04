package array;

public class TrickyArray {

	public static void main(String[] args) {
		int a[] = new int[10];  // Declaration of array
		a[1] = 5;
		a = new int[2]; // new memory allocated to array so by default all values are ZERO.
		System.out.println(a[1]);
	}

}

