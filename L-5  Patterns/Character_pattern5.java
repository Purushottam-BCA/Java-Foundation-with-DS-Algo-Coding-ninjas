package pattern;

import java.util.Scanner;

public class Character_pattern5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		int currRow=1;
		char ch=(char)('A'+N-1);
		while(currRow<=N)
		{
			int currCol=1;
			while(currCol<=currRow) 
			{
				System.out.print(ch+" ");
				currCol++;
				ch++;
			}
			System.out.println();
			currRow++;
			ch=(char)('A'+N-currRow);
		}

	}

}
