package oopsPart1;

public class StaticKeyword {
		String name;
		private final int roll;
		final Double PI=3.14 ;
		static int TotStudent;
		
		public StaticKeyword(String name) // Constructor will be called only Once so 
		{									// Only One time initialization of final variable is possible.
			TotStudent++;
			this.roll = TotStudent;
			this.name = name;
		
		}
		
		public void show()
		{
			System.out.println("ROLL : "+this.roll + " NAME : "+this.name);
		}
		
		public static void main(String args[])
		{
			StaticKeyword S1 = new StaticKeyword("Purushottam");
			StaticKeyword S2 = new StaticKeyword("Purushottam");
			S1.show();
			S2.show();
			System.out.println(StaticKeyword.TotStudent);
			System.out.println(StaticKeyword.TotStudent);
		}
	}
