package strings;

public class BasicofString {

	public static void main(String[] args) {
		String str="ABCD";
		String str2 = "ABCDEF";
		System.out.println(str.length());
		for(int i=0;i<str.length();i++)
			System.out.print(str.charAt(i)+" ");
		
//		Concatenation
		System.out.println(str+str2);
		System.out.println(str.concat(str2));
		
// 		Comparing two Strings
		System.out.println(str.equals(str2));
		System.out.println(str.equalsIgnoreCase(str2));
	
// 		Returns Difference of Ascii of first unequal character
		System.out.println(str2.compareTo(str));
		System.out.println(str.compareToIgnoreCase(str2));
		
//		Checking substring within a String : return true or false
		System.out.println(str.contains("hot"));
//		
		substring( start_index , end_index )
		String str = "Purushottam";
		System.out.println(str.substring(0));
		System.out.println(str.substring(11).length());
		System.out.println(str.substring(1,4));		
	}
}
