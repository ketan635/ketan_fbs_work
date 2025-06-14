
int main() {
    int j, l;
    printf("Enter a starting number: ");
    scanf("%d", &j);
    printf("Enter ending number: ");
    scanf("%d", &l);

    for (int num = j; num <= l; num++) {
        int no = num;
        int rem, sum = 0;
        int org = no;

        while (no > 0) {
            rem = no % 10;
            int fact = 1;
            for (int i = 1; i <= rem; i++) {
                fact *= i;
            }

            sum += fact;
            no /= 10;
        }

        if (sum == org) {
            printf("%d\n", org); 
        }
    }

    return 0;
}
