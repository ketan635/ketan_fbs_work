
//mystrrev function
#include <stdio.h>
#include <string.h>
char mystrrev (char*,int);
void main () {
	char str [20];
	printf("Enter the string");
	scanf("%s",str);
	int len =strlen (str);
	mystrrev (str,len);
	printf("%s",str);
}

char mystrrev (char *str,int len) {
	int temp;
	for (int i=0; i<len/2; i++) {
		temp=str[i];
		str[i]=str[len-1-i];
		str[len-1-i]=temp;
	}
}
