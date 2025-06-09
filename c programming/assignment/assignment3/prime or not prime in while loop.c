//Check the given number is prime or not.
//Input: n = 7
//Output: Prime
void main()
{
	int no,status=0,i=2;
	printf("enter the number :");
	scanf("%d",&no);
	while(i<no)
	{
		if(no%i==0){	
		status=1;
		break;
	}
	i++;	
	}
	if(status==0)
		printf("number is prime");
	else
		printf("number is not prime");
}