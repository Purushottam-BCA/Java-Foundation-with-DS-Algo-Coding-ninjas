package strings;
import java.util.Scanner;

public class StringInput {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s2 = sc.nextLine();
	for(int index=0; index<s2.length(); index++)
		System.out.println(s2.charAt(index));
	sc.close();
	}

}
