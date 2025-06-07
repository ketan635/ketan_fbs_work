
void main()
{
	int no;
	printf("enter a number :");
	scanf("%d",&no);
	 if(no%3==0)
	{
		if(no%5==0)
		{
			printf("Divisible by both");
		}
	}
    else if(no%3==0)
	{
		printf("divisible by 3 but not by 5");
	}else if(no%5==0)
	{
		printf("divisible by 5 but not by 3");
	}
	
}