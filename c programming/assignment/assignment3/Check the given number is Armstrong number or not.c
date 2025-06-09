//Check the given number is Armstrong number or not..
int main()
 {
    int number, temp, digit, n = 0;
    int sum = 0;
    printf("Enter a number: ");
    scanf("%d", &number);
    temp = number;
    while (temp != 0) {
        n++;
        temp /= 10;
    }
    temp = number;
    while (temp != 0) {
        digit = temp % 10;
        sum += (int)pow(digit, n);
        temp /= 10;
    }
    if (sum == number)
        printf("%d is an Armstrong number.\n", number);
    else
        printf("%d is NOT an Armstrong number.\n", number);
    return 0;
}