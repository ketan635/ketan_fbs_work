//Print prime numbers in the given range 1 to n.
void main()
{
    int j, l;
    printf("Enter a starting number: ");
    scanf("%d", &j);
    printf("Enter ending number: ");
    scanf("%d", &l);

    for (int num = j; num <= l; num++)
    {
    	int status=0;
    	if(num<=1) continue;
    	for(int i=2;i<=num/2;i++)
    	{
    		if(num%i==0)
    		status=1;
    		break;
		}
		if(status==0)
		{
			printf("%d\n",num);
		}
	}
}