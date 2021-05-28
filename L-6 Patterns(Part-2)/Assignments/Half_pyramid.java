package assignment_pattern2;
import java.util.Scanner;

public class Half_pyramid 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int N= sc.nextInt();
		sc.close();
		System.out.println("* ");  // For First Line
// First Half
		int currRow=1;
		while(currRow<=N)
		{
			System.out.print("* "); // Printing 1st Letter
			int currCol = 1;
			while(currCol <= currRow)  // Ascending Order 1 2
			{
				System.out.print(currCol+ " ");
				currCol++;
			}
			currCol-=2;
			while(currCol>=1) 	// Descending Order 2 1
			{
				System.out.print(currCol+ " ");
				currCol--;
			}
			System.out.println("* "); // Last letter
		 currRow++;
		}
// Second half
		currRow=N;
		while(currRow>1)
		{
			System.out.print("* "); // Printing 1st Letter
			int currCol = 1;
			while(currCol < currRow)  // Ascending Order 1 2
			{
				System.out.print(currCol+ " ");
				currCol++;
			}
			currCol-=2;
			while(currCol>=1) 	// Descending Order 2 1
			{
				System.out.print(currCol+ " ");
				currCol--;
			}
			System.out.println("* "); // Last letter
		 currRow--;
		}
System.out.println("*");  // last Line
	} // End of Function
} // End of Class

/* ---------------- My long Approaches ----------------

		int Firsthalf=N+1; //5
		int Secondhalf=N;  //4 

		int currRow=1;
		while(currRow<=Firsthalf)  // 1 <= 5 , 2 <= 5 , 3 <= 5, 
		{
			boolean isDone=false;
			int currCol=1;
			while(currCol<=2*currRow-1)  // 1<=5,2<=5,3<=5
			{
				if(currCol==1 || currCol==2*currRow-1) // Star present at first & last position
					System.out.print("* ");
				else if(!isDone)
				{
					int InnerCol=1;       // Increasing part
					while(InnerCol<currRow) // 1<3,2<3
					{
						System.out.print(InnerCol+" ");
						InnerCol++;
					}
					InnerCol=InnerCol-2;  // Decreasing part
					while(InnerCol>=1)// 1>=1
					{
						System.out.print(InnerCol+" ");
						InnerCol--;
					}	
					isDone=true;
				}
				currCol++;
			}
			System.out.println();
			currRow++;
		}
	// Second Half	
		currRow=Secondhalf;//4
		while(currRow>=1)
		{
			boolean isDone=false;
			int currCol=1;
			while(currCol<=2*currRow-1)
			{
				if(currCol==1 || currCol==2*currRow-1) // Star present at first & last position
					System.out.print("* ");
				else if(!isDone)
				{
					int InnerCol=1;       // Increasing part
					while(InnerCol<currRow)
					{
						System.out.print(InnerCol+" ");
						InnerCol++;
					}
					InnerCol=InnerCol-2;  // Decreasing part
					while(InnerCol>=1)
					{
						System.out.print(InnerCol+" ");
						InnerCol--;
					}
					isDone=true;
				}
				currCol++;
			}    
			System.out.println();
			currRow--;
		}  */

/*
 N=5

*
*1*
*121*
*12321*
*1234321*
*123454321*
*1234321*
*12321*
*121*
*1*
*

*/
