package strings;
// String Buffer is mutable
public class StringBuffers {

	public static void main(String[] args) {
		StringBuffer str = new StringBuffer("Hello");
		str.replace(0, 2, "PK");
		str.append("HII-WORLD");
		System.out.println(str);
	}
}
