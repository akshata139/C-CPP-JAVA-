/*

Accept one number from user and check whether it is armstrong number or not.

*/

#include<stdio.h>
#include<stdbool.h>

bool CheckArmstrong(int iNo)
{
	int iTemp = 0,iDigCnt = 0,iDigit = 0,iSum = 0,iCnt = 0,iPower = 1;
	
	if(iNo < 0)
	{
		iNo = -iNo;
	}
	
	iTemp = iNo;
	
	while(iTemp != 0)
	{
		iDigCnt++;
		
		iTemp = iTemp / 10;
	}
	
	iTemp = iNo;
	
	while(iTemp != 0)
	{
		iDigit = iTemp % 10;
		
		for(iCnt = 0;iCnt < iDigCnt;iCnt++)
		{
			iPower = iPower * iDigit;
		}
		
		iSum = iSum + iPower;
		
		iPower = 1;
		
		iTemp = iTemp / 10;
	}
	
	if(iSum == iNo)
	{
		return true;
	}
	else
	{
		return false;
	}
}

int main()
{
	int iValue = 0;
	bool bRet = false;
	
	printf("Enter value :\n");
	scanf("%d",&iValue);
	
	bRet = CheckArmstrong(iValue);
	
	if(bRet == true)
	{
		printf("It is an armstrong number !!\n");
	}
	else
	{
		printf("It is not armstrong number!!\n");
	}
	
	return 0;
}