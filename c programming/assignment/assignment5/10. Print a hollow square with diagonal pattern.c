void main()
{
	for(int i=1;i<=5;i++)
	{
		for(int j=1;j<=5;j++)
		if(i==1||i==5||j==1||j==5)
		printf("* ");
		else if(i==j||i+j==5+1||i+2==j+2)
		printf("  ");
		else
		printf("  ");
		printf("\n");
	}
}