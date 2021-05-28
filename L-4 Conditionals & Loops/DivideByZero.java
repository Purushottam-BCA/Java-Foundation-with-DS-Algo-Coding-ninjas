package operators;

public class DivideByZero {
public static void main(String[] args) {
	int a=50;
	// double a=50 would give result as Hi.
	int b=Integer.MIN_VALUE;
	if(a/0 ==b)
			System.out.println("Hello");
	else
		System.out.println("Hi");
}
}
