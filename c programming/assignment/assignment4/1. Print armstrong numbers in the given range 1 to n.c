#include <stdio.h>
#include <math.h>
int main() {
    int j, l;
    printf("Enter a starting number: ");
    scanf("%d", &j);
    printf("Enter ending number: ");
    scanf("%d", &l);

    for (int num = j; num <= l; num++) {
        int temp = num, count = 0;

        while (temp != 0) {
            count++;
            temp /= 10;
        }

        temp = num;
        int sum = 0;

        while (temp != 0) {
            int rem = temp % 10;
            sum += pow(rem, count);
            temp /= 10;
        }
        if (sum == num) {
            printf("%d \n", num);
        }
    }
}
