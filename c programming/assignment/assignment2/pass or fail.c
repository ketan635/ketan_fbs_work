void main()
{
	int marks;
	printf("enter a marks :");
	scanf("%d",&marks);
	if(marks>=75)
	{
		printf("Distinction");
	}else if(marks>=65)
	{
		printf("first class");
	}else if(marks>=55)
	{
		printf("second class");
	}else if(marks>=35)
	{
		printf("pass");
	}else
	{
		printf("fail");
	}
}