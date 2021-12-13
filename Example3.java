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

	public int Search(char CNo)
	{
		int iCnt = 0;

		for(int i = 0;i < Arr.length;i++)
		{
			if((char)(Arr[i]) == (char)Cno)
			{
				iCnt++;
			}
		}

		return iCnt;
	}

}

class Example3
{
	public static void main(String args[])
	{
		Scanner sobj = new Scanner(System.in);

		int iValue1 = 0;
		char Cno = '\0';

		System.out.println("Enter the size of  array : ");
		iValue1 = sobj.nextInt();

		System.out.println("Enter Character to be search : ");
		Cno = sobj.next().charAt(0);

		MyArray mobj = new MyArray(iValue1);

		mobj.Accept();
		mobj.Display();
		System.out.println("Number of vowels in the given array is : "+mobj.Search(Cno));
	}
}