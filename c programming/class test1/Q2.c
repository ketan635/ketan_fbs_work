// Q.2 WAP to check if the year is leap or not
#include<stdio.h>
int main()
{
	int year;
	printf("enter the year:");
	scanf("%d",&year);
if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
{
	printf(" leap year %d",year);
}
else
{
	printf(" not leap year %d",year);
}
}

