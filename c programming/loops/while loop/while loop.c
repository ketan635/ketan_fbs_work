void main()
{
int no=123652323;
int rem,sum=0;
while (no>0)
{
	rem=no%10;
	sum=sum+rem;
	no=no/10;
}
printf("sum: %d",sum);
	
}
