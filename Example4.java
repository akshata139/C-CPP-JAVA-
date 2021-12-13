import java.util.*;

class ArrayX
{
	public char Arr[];

	public ArrayX(int iNo1)
	{
		Arr = new char[iNo1];
	}

	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);

		int i = 0;

		System.out.println("Enter the elements of array : ");

		for(i = 0;i < Arr.length;i++)
		{
			Arr[i] = sobj.next().charAt(0);
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

	public int Difference()
	{
		int iCnt1 = 0,iCnt2 = 0,iDiff = 0;

		for(int i = 0;i < Arr.length;i++)
		{
			if((Arr[i] >= 'A') && (Arr[i] <= 'Z'))
			{
				iCnt1++;
			}
			else if((Arr[i] >= 'a') && (Arr[i] <= 'z'))
			{
				iCnt2++;
			}
		}

		iDiff = iCnt1 - iCnt2;

		return iDiff;
	}

}

class Example4
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
		System.out.println("Difference between no. of capital and no. of small characters are : "+mobj.Difference());
	}
}