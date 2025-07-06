//Find sum of all numbers.
#include <stdio.h>
void store (int*,int);
void display (int*,int);
void sumofArray (int*,int,int);
void main (){
	int arr[10];
	printf("Enter the elements\n");
	store (arr,10);
	display (arr,10);
	int sum=0;
	sumofArray(arr,10,sum);
}
void store (int *ptr,int size) {
	for (int i=0; i<size; i++)
		scanf("%d",&ptr [i]);
}

void display (int *ptr,int size) {
	printf("[");
	for (int i=0; i<size; i++)
		printf("%d,",ptr[i]);
	printf("\b]\n");
}

void sumofArray (int *ptr,int size,int sum){
	for (int i=0;i<size;i++)
	sum=sum+ptr[i];
	printf("Sum of arrayElemet=%d",sum);
}