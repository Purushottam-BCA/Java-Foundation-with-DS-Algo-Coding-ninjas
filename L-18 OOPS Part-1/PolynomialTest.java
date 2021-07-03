package oopsPart1;

public class PolynomialTest {

	public static void main(String[] args) {
		Polynomial p1 = new Polynomial();
		p1.setCoefficient(0, 3);
		p1.setCoefficient(2, 2);
		p1.setCoefficient(3, 4);
		p1.setCoefficient(2, 9);
		p1.print();
		
		Polynomial p2 = new Polynomial();
		p2.setCoefficient(0, 5);
		p2.setCoefficient(1, 6);
		p2.setCoefficient(7, 8);
		p2.setCoefficient(2, 6);
		p2.print();
//		System.out.println("------------------------------------");
//		Polynomial p6 = p1.add(p2);
//		p6.print();
//		Polynomial p3 = Polynomial.multiply(p1, p2);
//		p3.print();
//		Polynomial p4 = Polynomial.add(p1, p2);
//		p4.print();
//		Polynomial p5 = Polynomial.subtract(p2, p1);
//		p5.print();
//		int ans = p1.evaluate(2);
//		System.out.println(ans);
	}

}
