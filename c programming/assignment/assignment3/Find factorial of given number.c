//Find factorial of given number
int main() 
{
    int number,fact=1,count=1;
    printf("Enter the number: ");
    scanf("%d",&number);
	while(count<=number)
	{
	fact=fact * count;
	count++;
	printf("factorial %d\n",fact);
	}
}