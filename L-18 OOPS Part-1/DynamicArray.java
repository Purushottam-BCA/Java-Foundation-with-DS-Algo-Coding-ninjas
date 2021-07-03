package oopsPart1;

public class DynamicArray 
{
	private int SizeofArray;
	private int Arr[];
	
	public DynamicArray() // Constructor
	{
		SizeofArray=0;
		Arr = new int[5];
	}
	public void add(int item)  // Adding new Item in the dynamic Array
	{
		if(Arr.length==SizeofArray)
			doubleSize();	
		Arr[SizeofArray]=item;
		SizeofArray++;
	}
	
	public void add(int index,int item)  // Adding new Item at specific index in the dynamic Array
	{
		if(Arr.length==SizeofArray)
			doubleSize();
		for(int start=SizeofArray; start>index; start--)
			Arr[start]=Arr[start-1];
		Arr[index]= item;
		SizeofArray++;
	}
	
	private void doubleSize()
	{
		int temp[] = Arr;  // Temporary Will point to old array
		Arr = new int[SizeofArray*2];
		for(int i=0;i<SizeofArray; i++)
		{
			Arr[i]=temp[i];
		}
	}
	public void set(int index, int value)
	{
		if(index>=SizeofArray || index<0)
		{
			System.out.println("Invalid Index");
			return;
		}
		Arr[index]=value;
	}	
	public int get(int index)
	{
		if(index>=SizeofArray || index<0)
		{
			System.out.println("Invalid Index");
			return -1;
		}
		return(Arr[index]);
	}	
	public int size()
	{
		return SizeofArray;
	}	
	public int removeLast()
	{
		if(SizeofArray>=1)
		{
			SizeofArray--;
			return Arr[SizeofArray];
		}
		else 
			System.out.println("Array Empty");
		return -1;
	}	
	
	public int remove(int index)
	{
		if(SizeofArray>=1 && index<SizeofArray)
		{
			int temp = Arr[index];
			if(index!=SizeofArray-1)
			{
			for(int start=index;start<SizeofArray; start++)
				Arr[start]=Arr[start+1];
			SizeofArray--;
			return temp;
			}
		}
		else 
			System.out.println("Invalid Index");
		return -1;
	}
	public void print()
	{
		if(SizeofArray>0)
			for(int i=0; i<SizeofArray;i++)
				System.out.print(Arr[i]+" ");
		else 
			System.out.println("[ ]");
		System.out.println();
	}
	boolean isEmpty()
	{
		return (SizeofArray==0);
	}
}
