//Program to find Factorial of number

#include<stdio.h>

int main()
{
	int num,i,fact=1;
	
	printf("Enter the number to find factorial:- ");
	scanf("%d", &num);
	
	for(i=1;i<=num;i++)
	{
		fact = fact * i;
	}
	
	printf("The factorial of %d is %d",num, fact);
	return 0;
}
