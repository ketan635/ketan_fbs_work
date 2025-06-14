int isprime();
void main() {
int res=isprime();
	if(res==0)
	printf("number is prime");
	else
	printf("number is not prime");
}
int isprime() {
	int no,status=0;
	printf("enter the number :");
	scanf("%d",&no);
	for(int i=2; no%i==0; i++) {
	    return 1;
		status=1;
		break;
	}

   if(status==0)
	return 0;

}