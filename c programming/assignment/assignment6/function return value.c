
int positive();
int evenodd();
int prime();
int palindrom();
void main() {
	int no,res;
	printf("enter a  number to perform follos :\n1.is even or odd. \n2.prime or not.\n3.pallindrome or not.\n4.positive, negative or zero.\n5.To reverse a number.\n6.sum of digits.\n :");
	scanf("%d",&no);
	if(no==1) {
		int no;
		printf("enter the number :");
		scanf("%d",&no);
	 res=evenodd(no);
	if(res==0)
	{
		printf("number is even");
	}else
	{ 
	 	printf("number is odd");
	}
		
	} else if(no==2) {
		int no;
		printf("enter the number :");
		scanf("%d",&no);
		res = prime(no);
		if(res==1)
		{
			printf("number is prime");
		}
		else
		{
			printf("number is not prime");
		}
	} else if(no==3) {
		int no;
		printf("enter the number :");
		scanf("%d",&no);
		 res = palindrom( no);
		 if(res==1)
		 {
		 	printf("number is palindrom");
		 }
		 else
		 {
		 	printf("number is not palindrom");
		 }
	} else if(no==4) {
		int no;
		printf("enter the number :");
		scanf("%d",&no);
		res = positive(no);
		if(res==1)
		{
			printf("number is positive");
		}
		else
		{
			printf("number is nagetive");
		}
	} else if(no==5) {
		int no;
		printf("enter the number :");
		scanf("%d",&no);
	res=reverse(no);
	printf("%d",res);
		
	} else if(no==6) {
		int no;
		printf("enter the number :");
		scanf("%d",&no);
		res=sumdigit(no);
		printf("%d",res);
	}
}

int evenodd(int no) {
//	int number;
//	printf("\n\nenter number to chack odd or even :");
//	scanf("%d",&number);
	if(no%2==0)
	return 0;
	
}
int prime(int no) {
//	int number;
//	printf("\n\nenter number to chack prime  or not :");
//	scanf("%d",&number);
	int status=0;
	for(int i=2; i<no; i++) {
		if(no%i==0) {
		    return 0;
			status=1;
			break;
		}
	}
		return 1;	    
}

int palindrom(int no) {
	//int number;
	int rem,rev=0;
//	printf("\n\nenter number to chack palindrom  or not :");
//	scanf("%d",&number);
	int org=no;
	while(no!=0) {
		rem=no%10;
		rev=rev*10+rem;
		no /=10;
	}
	if(org==rev)
		return 1;
	else
	return 0;
}

int positive(int no) {
	//int number;
	//printf("\n\nenter number to chack positive  or nagative :");
//	scanf("%d",&number);
	if(no>0)
		return 1;
	else
	    return 2;
}

int reverse(int no) {
	//int no;
	int rem,rev=0;
	//printf("\n\nenter number to reverse :");
	//scanf("%d",&no);

	while(no!=0) {
		rem=no%10;
		rev=rev*10+rem;
		no /=10;
	}
	return rev;
//	printf("%d",rev);
}

int sumdigit(int no) {
//	int number;
	int sum,rem;
	//printf("\n\nenter number to find sum of digit :");
	//scanf("%d",&number);
	while(no!=0) {
		rem=no%10;
		sum=sum+rem;
		no/=10;
	}
	return sum;
//	printf("\nsum = %d",sum);
}