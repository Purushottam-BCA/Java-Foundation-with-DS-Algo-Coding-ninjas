package oopsPart1;
import java.util.Scanner;

public class IntroductionPart2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Introduction s1 = new Introduction();
		Introduction s2 = new Introduction();
		s1.name = sc.next();
		s1.setRoll(sc.nextInt());
		System.out.println(s1.getRoll() + " " + s1.name); // s1 is a reference
		System.out.println(s2.getRoll() + " " + s2.name); // By Default INT-0 , String-null
		sc.close();
	}
}
