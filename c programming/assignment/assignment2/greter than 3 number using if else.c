//Write a program to find greatest of three numbers using nested if-else.
void main()
{
	int a=20,b=55,c=9;
	
	if(a>b)
	{
		if(a>c)
		{
			printf("a is greter %d",a);
		}
		else
		{
			printf("c is grater %d",c);
		}
	}else if(b>c)
	    {
	   	  printf("b is grater %d",b);    
		}	
		else
		{
			printf("c is greter %d",c);
		}
	
	
}