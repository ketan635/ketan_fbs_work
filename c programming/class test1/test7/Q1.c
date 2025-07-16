#include <stdio.h>

void storearr(int arr[], int size, int x, int y);
void displayarr(int arr[], int size);

void main() {
    int arr[5];
    int X, Y;

    printf("Enter 5 elements:\n");
    for (int i = 0; i < 5; i++)
	 {
        scanf("%d", &arr[i]);
    }

    printf("Enter the X position: ");
    scanf("%d", &X);

    printf("Enter the Y position: ");
    scanf("%d", &Y);

    if (X < 0 || X >= 5 || Y < 0 || Y >= 5) 
	{
    } 
	else
	 {
        storearr(arr, 5, X, Y);
        displayarr(arr, 5);
    }
}

void storearr(int arr[], int size, int x, int y) {
    int temp;
    temp = arr[x];
    arr[x] = arr[y];
    arr[y] = temp;
}

void displayarr(int arr[], int size) {
  //  printf(" array: ");
    for (int i = 0; i < size; i++) {
        printf("%d ", arr[i]);
    }
}
