import java.util.*;

class ArrayX
{
	public int Arr[];

	public ArrayX(int iNo1)
	{
		Arr = new int[iNo1];
	}

	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);

		int i = 0;

		System.out.println("Enter the elements of array : ");

		for(i = 0;i < Arr.length;i++)
		{
			Arr[i] = sobj.nextInt();
		}
	}

	public void Display()
	{
		int i = 0;

		System.out.println("Elements of array : ");
		for(i = 0;i < Arr.length;i++)
		{
			System.out.print("|"+Arr[i]+"|  ");
		}

		System.out.println();
	}
}

class MyArray extends ArrayX
{

	public MyArray(int iLen1)
	{
		super(iLen1);
	}

	public void Pattern()
	{
		for(int i = 0;i < Arr.length;i++)
		{
			if((Arr[i] % 2) == 0)
			{
				for(int j = 0;j < Arr[i];j++)
				{
					System.out.print("*  ");
				}
				System.out.println();
			}
		}
	}

}

class Example5
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);

		int iValue1 = 0;

		System.out.println("Enter the size of  array : ");
		iValue1 = sobj.nextInt();

		MyArray mobj = new MyArray(iValue1);

		mobj.Accept();
		mobj.Display();
		
		mobj.Pattern();
	}
}