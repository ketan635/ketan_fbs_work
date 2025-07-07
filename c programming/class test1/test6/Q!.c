
#include <stdio.h>

void store (int*,int);
void display (int*,int);
void commonElem (int*,int*,int);
void main (){
	int size;
	printf("Enter the size 1\n");
	scanf("%d",&size);
	int arr[size];
	store (arr,size);
//	display (arr,size);
	
	int brr[size];
	store (brr,size);
//	display (brr,size);
	commonElem (arr,brr,size);

}

void store (int *ptr,int size){
		printf("\nEnter the array element \n");
	for (int i=0;i<size;i++){
	
		scanf("%d",&ptr[i]);
	}
}

void display (int *ptr,int size){
	printf("[");
	for (int i=0;i<size;i++){
		printf("%d,",ptr[i]);
	}
	printf("\b]");
}

void commonElem (int *ptr1,int *ptr2,int size){
		display (ptr1,size);
		printf("\n");
		display (ptr2,size);
	
		printf("\nCommonElement :");
	for (int i=0;i<size;i++){
		for(int k=0;k<size;k++){
			if (ptr1[i]==ptr2[k])
			printf("%d,",ptr1[i]);
		}
	}
}
