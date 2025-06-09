//Check the given number is Strong number or not.
//Input: n = 145
//Output: Strong
void main()
{
	int no;
	int rem,sum=0;
	
	printf("enter a number :");
	scanf("%d",&no);
	int org=no;
	while(no>0)
	{
		rem=no%10;
		int fact=1;
		while(rem>=1)
		{
			fact=fact*rem;
			rem--;		
		}
		sum=sum+fact;
		no=no/10;
		
	}
	if (sum==org)
	printf("no is strong");
	else
	printf("no is not strong");
		
}