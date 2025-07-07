
//mystrrchr function
//mystrchr function
#include <stdio.h>
#include <string.h>
char *mystrrchr (char*,char);
void main () {
	char str [] ="chaitanyabhgaure";
	char ch;
	printf("Enter the character");
	scanf(" %c",&ch);
	char *res;
	res = mystrrchr (str,ch);
	if (res!=NULL)
		printf("%s",res);
	else
		printf("Not found");
}

char *mystrrchr (char *str,char ch) {
	int len=strlen(str);
	int i=len-1;
	while (i>=0) {
		if (str[i] == ch)
			return &str[i];
		i--;
	}
	return NULL;
}
