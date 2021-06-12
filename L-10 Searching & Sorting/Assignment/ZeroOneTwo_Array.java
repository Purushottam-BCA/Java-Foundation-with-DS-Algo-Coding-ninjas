package assignments;
import java.util.Scanner;

public class ZeroOneTwo_Array {

	//----------- Method 1 -------------
	
	public static void ZeroOneTwo(int []a) 
	{
		int Zero=0,Last=a.length-1;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]==0)
			{
				a[i] = a[Zero];
				a[Zero++] = 0; 
			}
			else if(a[i]==2 && i<Last)
			{
				a[i] = a[Last];
				a[Last--] = 2;
				i--;  //  Since it can be any so must check whether 0, 1 or twwo.
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-- >0)
		{
			int arraySize = sc.nextInt();
			int [] Array = new int[arraySize];
			for(int index=0; index < arraySize; index++)
				Array[index]= sc.nextInt();
			ZeroOneTwo(Array);
			System.out.println();
			for(int index=0; index<Array.length; index++)
				System.out.print(Array[index]+ " ");
		}
		sc.close();

	}

}

/*

Trivia time! In case you didn’t know, this problem is a variation of a famous problemcalled the ‘Dutch National Flag Problem’Let’s discuss what we need to do in this problem. Basically, we need to push all 0s inthe array towards the front of the array and push all the 2s towards the end of the array.Notice that if we do this, the 1s will automatically come in between the 0s and 2s.We’ll use a three pointer approach to solve this problem; the three pointers will be:current​, ​zeroPos​ and ​twoPos​. Let’s discuss what will be the purpose of these threepointers:1.current​ - This will hold the position of the current element that we’re on duringthe iteration of the array. This will be initialised to 0.2.zeroPos​ - This will hold the index where we will push any 0s that we mayencounter. This will be initialised to 0.3.twoPos​ - This will hold the index where we will push any 2s that we mayencounter. This will be initialised to ​n - 1​, where ​n​ is the size of the array
Let’s discuss the approach to this problem in some detail. We’ll iterate through the arrayusing the ​current​ pointer. Every element is either 0, 1 or 2 so let’s see what we’ll bedoing in each of these cases.1.arr[current] = 0 - ​ In this case, we need to push the element towards thefront of the array. To do that we can swap ​arr[current]​ and ​arr[zeroPos]​,then we will increase both ​current​ and ​zeroPos​ by 1.2.arr[current] = 1 - ​In this case, we will just increase ​current​ by 1, sincewe are only concerned with push 0s to the front and 2s to the end of the array.3.arr[current] = 2 - ​In this case, we need to push the element towards theend of the array. Again, to do this, we’ll just swap ​arr[current]​ andarr[twoPos]​. We will decrease ​twoPos​ by 1. However, in this case we will ​notincrease ​current​ by 1 (we’ll discuss why later).Now let’s discuss why we didn’t increase ​current​ by 1 in the case wherearr[current] = 2​. But before that there’s one more thing that we need to discuss.What will be the condition that must be satisfied so that our loop can end? You mightthink that it’s when current reaches the end of the array but that’s not the case here.Let’s see why.Can you see what exactly the two pointers, ​zeroPos​ and ​twoPos​ are doing? As we gothrough the array, every element before ​zeroPos​ is a 0 and every element after ​twoPosis a 2. Also, every element after ​zeroPos​ but before current is a 1. Therefore, all theseelements are ‘sorted’. The element that remain to be sorted are the ones that liebetween the indices ​current​ and ​twoPos​. Therefore our loop will terminate whencurrent reaches the value of ​twoPos​.Now, let’s understand why we can’t increase the value of current when ​arr[current]= 2​. When we swap ​arr[current]​ with ​arr[twoPos]​, we don’t know what valuewas initially at index ​twoPos​ (before the swap happened), it could be any of the values0, 1, or 2. So, we can’t increase the value of current without checking what value wasswapped with ​twoPos​. We didn’t have to worry about this in the case where we wereswapping ​arr[current]​ with ​arr[zeroPos] ​because then we would always beswapping 0 and 1. The pseudo code at the next page will make this clear.The pseudo-code for this approach is shown on the next page
function sort012(arr):  current <- 0  zeroPos <- 0  twoPos <- arr.size - 1  while(current < twoPos):    if(arr[current] == 0):      swap(arr[current], arr[zeroPos]      current <- current + 1      zeroPos <- zeroPos + 1   else if(arr[current] == 1):      current <- current + 1   else:      swap(arr[current], arr[twoPos])      twoPos <- twoPos - 1

*/