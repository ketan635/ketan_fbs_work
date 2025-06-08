//Find Sum of first and last digit of given number
void main()
{
int no;
int fdigit,lastdigit,sum;
printf("enter the number :");
scanf("%d",&no);
lastdigit=no%10;
while (no>0)
{
	fdigit=no%10;
	no=no/10;
}
sum=fdigit+lastdigit;
printf("%d",sum);
}