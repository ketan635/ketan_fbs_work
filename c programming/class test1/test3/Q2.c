#include <stdio.h>
void main (){
	int start,end,sum=0;
	printf("Enter the starting and ending range");
	scanf("%d%d",&start,&end);
	for (int i=start;i<=end;i=i+2){
		sum=sum+i;
	}
	printf("Sum=%d",sum);
}