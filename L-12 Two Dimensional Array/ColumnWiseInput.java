package twoDarray;
import java.util.Scanner;

public class ColumnWiseInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER ROWS : ");
		int row = sc.nextInt();
		System.out.println("ENTER COLOUMNS : ");
		int col = sc.nextInt();
		
		int Matrix[][] = new int[row][col];
		
		for(int j=0;j<col;j++)
			for(int i=0; i<row; i++)
			{
				System.out.printf("ENTER [%d][%d] ELEMENT : ",i,j);
				Matrix[i][j] =sc.nextInt();
				System.out.println();
			}
		// Printing The Matrix
		
		for(int j=0;j<col;j++)
		{
			for(int i=0; i<row; i++)
				System.out.print(Matrix[i][j]+" ");
			System.out.println();
		}
		sc.close();

	}

}
