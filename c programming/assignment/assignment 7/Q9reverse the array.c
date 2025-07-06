//Reverse given array
#include <stdio.h>
void array1 (int*,int);
void display (int*,int);
void main () {
	int arr [5];
	printf("Enter the element of arr\n");
	array1 (arr,5);
	display (arr,5);
}

void array1 (int *arr1,int size) {
	for (int i=0; i<size; i++) {
		scanf("%d",&arr1 [i]);
	}
}

void display (int *ptr,int size){
	printf("[");
	for (int i=size-1;i>=0;i--){
		printf("%d,",ptr[i]);
	}
	printf("]");
}