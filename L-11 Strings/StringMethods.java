package strings;

public class StringMethods {

	public static void main(String[] args) {
		
		String str= "Hello World";
		
// Getting Index of Char, String
		System.out.println(str.indexOf('o'));
		System.out.println(str.indexOf("World"));
		System.out.println(str.indexOf('o', 6));
		
// endsWith( ) :: returns Boolean
//		System.out.println(str.endsWith("W"));
		
// replaceAll , replaceFirst
//		System.out.println(str.replaceAll("o", "PP"));
// replaces the first Matching Index
//		System.out.println(str.replaceFirst("o", "PP"));
		

	}

}
