package strings;
// String pool is a special area in heap used only for String.
public class StringPool {

	public static void main(String[] args) 
	{
		String s= "Hello";
		String p= "Hello";
		String m= new String("Hello");
		String n= new String("Hello");
		System.out.println(s==p);
		System.out.println(p==m);
		System.out.println(n==m);
	}
}
