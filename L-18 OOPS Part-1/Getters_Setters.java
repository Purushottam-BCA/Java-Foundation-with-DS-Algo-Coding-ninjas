package oopsPart1;

import java.util.Scanner;

public class Getters_Setters {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Introduction s1 = new Introduction();
		s1.name = sc.next();
		s1.setRoll(sc.nextInt()); // Setters Function
		System.out.println(s1.getRoll() + " " + s1.name); // Getters Function
		sc.close();
	}
}
