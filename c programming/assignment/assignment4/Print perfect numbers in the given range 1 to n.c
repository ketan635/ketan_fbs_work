// Print perfect numbers in the given range 1 to n.
void main()
{
    int j, l;
    printf("Enter a starting number: ");
    scanf("%d", &j);
    printf("Enter ending number: ");
    scanf("%d", &l);

    for (int num = j; num <= l; num++)
    {
    	int sum=0;
	for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;

		}
	}
	if(num==sum)
	printf("%d \n",num);

	}
}
