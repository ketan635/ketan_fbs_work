#include <stdio.h>
void main()
 {
    int arr[5];
    printf("Enter 5 elements: ");
    for (int i = 0; i < 5; i++) {
        scanf("%d", &arr[i]);
    }

    arrpalindrome(arr, 5);
}
void arrpalindrome(int arr[], int size) {
    int isPalindrome = 1;
    for (int i = 0; i < size / 2; i++) {
        if (arr[i] != arr[size - 1 - i]) {
            isPalindrome = 0;
            break;
        }
    }

    if (isPalindrome==1)
        printf("Array is a palindrome.\n");
    else
        printf("Array is not a palindrome.\n");
}


