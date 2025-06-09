// Print a half pyramid using numbers

void main()

{
	int count;
	for(int i=1;i<=5;i++)
	{
		printf(" ");
		for(int j=1;j<=i;j++)
		{
			count++;
			printf("%d ",count);
		}
		printf("\n");
	}
	
}
