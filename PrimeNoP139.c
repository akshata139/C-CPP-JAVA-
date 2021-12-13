/*

Accept one number from user and check whether it is prime number or not.

*/

#include<stdio.h>
#include<stdbool.h>


bool CheckPrime(int iNo)
{
	bool bAns = true;;
	int iCnt = 0;
	
	for(iCnt = 2;iCnt <= iNo/2;iCnt++)
	{
		if((iNo % iCnt) == 0)
		{
			bAns = false;
		}
		else
		{
			bAns = true;
		}
	}
	
	return bAns;
	
}
 
int main()
{
	int iValue = 0;
	bool bRet = false;
	
	printf("Enter value :\t");
	scanf("%d",&iValue);
	
	bRet = CheckPrime(iValue);
	
	if(bRet == true)
	{
		printf("It is prime number !!");
	}
	else
	{
		printf("It is not prime number!!");
	}
	
	return 0;
}
