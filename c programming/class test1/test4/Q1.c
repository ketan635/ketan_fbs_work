//Write a program to print factors of number in given range.
#include <stdio.h>
void main () {
	int start,end;
	printf("Enter the starting range :");
	scanf("%d",&start);
	printf("Enter the ending range :");
	scanf("%d",&end);

	for (int i=start; i<=end; i++) {
		printf("%d=",i);
		for (int j=1; j<=i; j++) {
			if (i%j==0)
				printf("%d,",j);
		}
		printf("\n");

	}
}