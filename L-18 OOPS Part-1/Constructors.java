package oopsPart1;

public class Constructors {

	public static void main(String[] args) {
		Introduction I1 = new Introduction();
		Introduction I2 = new Introduction(10);
		Introduction I3 = new Introduction(10,"Ram");
		System.out.println(I1.getName() + " "+ I1.getRoll());
		System.out.println(I2.getName() + " "+ I2.getRoll());
		System.out.println(I3.getName() + " "+ I3.getRoll());
	}
}
