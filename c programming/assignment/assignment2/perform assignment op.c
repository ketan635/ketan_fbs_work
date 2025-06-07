//Accept two numbers from user and an operator (+,-,/,*,%) based on that perform the desired operations
int main()
{
	int no1,no2,sum;
	char ch;
	printf("enter two number :");
	scanf("%d%d",&no1,&no2);
	
	printf("enter opretor :");
	getchar();
	scanf("%c",&ch);
	
	if(ch=='+')
	{
		 sum=no1+no2;
		printf("addition is : %d",sum);
	}
	else if(ch=='-')
     {
     	sum=no1-no2;
     	printf("substraction is : %d",sum);
	 }
	 else if(ch=='*')
	 {
	 	sum=no1*no2;
	 	printf("multipication is : %d",sum);
	 }
	 else if(ch=='/')
	 {
	 	sum=no1/no2;
	 	printf("divisan is :%d",sum);
	 }
	 else if(ch=='%')
	 {
	 
	 sum=no1%no2;
	 printf("mod is : %d",sum);
     }
     else
     {
     	printf("opretor is not found");
	 }
}





