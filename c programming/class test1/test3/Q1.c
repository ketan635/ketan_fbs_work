#include <stdio.h>
void main (){
	int start,end;
	printf("Enter the starting and ending range \n");
	scanf("%d%d",&start,&end);
	printf("Even=");
	for (int i=start;i<=end;i++){
		if (i%2==0)
		printf("%d,",i);
		
	}
	printf("\n");
	printf("Odd=");
	for (int i=start;i<=end;i++){
		if (i%2!=0)
		printf("%d,",i);
	}
}