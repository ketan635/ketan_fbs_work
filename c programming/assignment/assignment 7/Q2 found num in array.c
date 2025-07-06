// Search the given number in array
#include <stdio.h>
void store (int*,int);
void display (int*,int);
void searchNumber (int*,int,int);
void main () {
	int arr[10];
	printf("Enter the elements\n");
	store (arr,10);
	display (arr,10);
	int num;
	printf("Enter the number");
	scanf("%d",&num);
	searchNumber (arr,10,num);
}

void store (int *ptr,int size) {
	for (int i=0; i<size; i++)
		scanf("%d",&ptr[i]);
}

void display (int *ptr,int size) {
	printf("[");
	for (int i=0; i<size; i++)
		printf("%d,",ptr[i]);
	printf("\b]\n");
}

void searchNumber (int *ptr,int size,int num) {
	int found=0;
	for (int i=0; i<size; i++) {
		if (ptr[i]==num) {

			printf("Number is found at index %d\n",i);
			found=1;
		}
	}
	if (found==0)
		printf("Not found");
}