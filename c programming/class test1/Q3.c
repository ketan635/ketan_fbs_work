//Q.3 print last two dogit number
#include <stdio.h>

int main() {
    int number;
    
    printf("Enter a number: ");
    scanf("%d", &number);

    int lastTwoDigits = number % 100;

    if (lastTwoDigits < 0) {
        lastTwoDigits = -lastTwoDigits;
    }

    printf("Last two digits: %02d\n", lastTwoDigits);

    return 0;
}

