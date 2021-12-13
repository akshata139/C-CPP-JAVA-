package MarvellousNumbers;

import java.util.*;

public class ArrayX
{
	Scanner sobj = new Scanner(System.in);

	public int Arr[];			//characteristic

	public ArrayX(int iSize)				//behaviour  const = use to allocate resources.
	{
		Arr = new int[iSize];
	}

	public void Accept()				//behaviour
	{
		int iCnt = 0;
		System.out.println("Enter elements :");

		for(iCnt = 0;iCnt < Arr.length;iCnt++)
		{
			Arr[iCnt] = sobj.nextInt();
		}

	}

	public void Display()
	{
		int iCnt = 0;
		System.out.println("elements are :");
		for(iCnt = 0;iCnt < Arr.length;iCnt++)
		{
			System.out.println(Arr[iCnt]);
		}
	}
}

//javac ArrayX.java -d .