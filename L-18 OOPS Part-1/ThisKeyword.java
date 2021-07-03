package oopsPart1;

import java.util.Scanner;

public class ThisKeyword {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Introduction s1 = new Introduction();
		System.out.println("S1 Address : "+s1);
		s1.setRoll(100);
		System.out.println(s1.getRoll() + " " + s1.name); // s1 is a reference
		
		Introduction s2 = new Introduction();
		System.out.println("S2 Address : "+s2);
		s2.setRoll(200);
		System.out.println(s2.getRoll() + " " + s2.name); // s1 is a reference
		sc.close();
	}
}
