package oopsPart1;

public class DynamicArrayTest {

	public static void main(String[] args)
	{
		DynamicArray d1 = new DynamicArray();
		for(int i=1;i<=5; i++)
			d1.add(100+i);
		
//		System.out.println(d1.size());
//		System.out.println(d1.get(2));
//		d1.set(3, 999);
//		System.out.println(d1.get(3));
		d1.print();
		d1.add(0, 2222);
		d1.print();
		d1.remove(3);
		d1.print();
		
//		System.out.println();
//		while(!d1.isEmpty())
//		{
//			d1.removeLast();
//			System.out.println("Size : "+d1.size());
//		}
//		d1.print();
//		d1.add(105);
//		d1.print();
	}
}
