#include<stdio.h>
// evenodd()
void main() {
	int no;
	printf("enter a  number to perform follos :\n1.is even or odd. \n2.prime or not.\n3.pallindrome or not.\n4.positive, negative or zero.\n5.To reverse a number.\n6.sum of digits.\n :");
	scanf("%d",&no);
	if(no==1) {
		evenodd();
	} else if(no==2) {
		prime();
	} else if(no==3) {
		palindrom();
	} else if(no==4) {
		positive();
	} else if(no==5) {
		reverse();
	} else if(no==6) {
		sumdigit();
	}
}

void evenodd() {
	int number;
	printf("\n\nenter number to chack odd or even :");
	scanf("%d",&number);
	if(number%2==0)
		printf("even");
	else
		printf("odd");
}
void prime() {
	int number;
	printf("\n\nenter number to chack prime  or not :");
	scanf("%d",&number);
	int status=0;
	for(int i=2; i<number; i++) {
		if(number%i==0) {
			status=1;
			break;
		}
	}
	if(status==0)
		printf("prime");
	else
		printf("not prime");
}

void palindrom() {
	int number;
	int rem,rev=0;
	printf("\n\nenter number to chack palindrom  or not :");
	scanf("%d",&number);
	int org=number;
	while(number!=0) {
		rem=number%10;
		rev=rev*10+rem;
		number /=10;
	}
	if(org==rev)
		printf("no is palindrome");
	else
		printf("no is not palindrome");
}

void positive() {
	int number;
	printf("\n\nenter number to chack positive  or nagative :");
	scanf("%d",&number);
	if(number>0)
		printf("no is positive");
	else
		printf("no is nagetive");
}

void reverse() {
	int number;
	int rem,rev=0;
	printf("\n\nenter number to reverse :");
	scanf("%d",&number);

	while(number!=0) {
		rem=number%10;
		rev=rev*10+rem;
		number /=10;
	}
	printf("%d",rev);
}

void sumdigit() {
	int number;
	int sum,rem;
	printf("\n\nenter number to find sum of digit :");
	scanf("%d",&number);
	while(number!=0) {
		rem=number%10;
		sum=sum+rem;
		number/=10;
	}
	printf("\nsum = %d",sum);
}