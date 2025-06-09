// Check if a given number is a Perfect number or not
void main()
{
    int no, i = 1, sum = 0;

    printf("Enter the number: ");
    scanf("%d", &no);

    while (i <= no / 2)
    {
        if (no % i == 0)
        {
            sum = sum + i;
        }
        i++;
    }

    if (no == sum)
    {
        printf("%d is a perfect number.\n", no);
    }
    else
    {
        printf("%d is not a perfect number.\n", no);
    }
}
