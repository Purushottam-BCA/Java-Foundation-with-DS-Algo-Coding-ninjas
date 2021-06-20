package twoDarray;

public class JaggedArray {

	public static void main(String[] args) {
		int ar[][] = new int[4][];
		
		for(int i=0;i<ar.length; i++)
			ar[i] = new int[i+2];
		
		for(int i=0;i<ar.length; i++)
		{
			for(int j=0; j<ar[i].length ; j++)
				{
				System.out.print(ar[i][j]);
				}
			System.out.println();
		}
		// It will SHow NullPointerException
		// System.out.println(ar[2].length);
	}
}

/*  In Jagged array every row has different number of columns
 
  ARR   --->    [ ] -->  [ ]-[ ]-[ ]
  				[ ] -->  [ ]-[ ]
  				[ ] -->  [ ]-[ ]-[ ]-[ ]-[ ]
  			(References)	(1D Array)
 
*/