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

	public int CountVowels()
	{
		int iCnt = 0;

		for(int i = 0;i < Arr.length;i++)
		{
			if((Arr[i] == 'A') || (Arr[i] == 'E') || (Arr[i] == 'I') || (Arr[i] == 'O') || (Arr[i] == 'U') || (Arr[i] == 'a') || (Arr[i] == 'e') || (Arr[i] == 'i') || (Arr[i] == 'o') || (Arr[i] == 'u'))
			{
				iCnt++;
			}
		}

		return iCnt;
	}

}

class Example2
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
		System.out.println("Number of vowels in the given array is : "+mobj.CountVowels());
	}
}