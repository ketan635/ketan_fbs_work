void main()
{
	int no =123;
	int r1,r2,r3,q1;
	r1=no%10;
	q1=no/10;
	r2=q1%10;
	r3=q1/10;
	int rev = r1*100+r2*10+r3;
	printf("%d",rev);
}