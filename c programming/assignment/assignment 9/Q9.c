
//mystrstr function
#include <stdio.h>
#include <string.h>
char *mystrstr (char*,char*);
void main () {
	char str[] = "My name is chaitanya";
	char *res;
	res= mystrstr (str,"name");
	if (res==NULL)
		printf("Not found");
	else {
		printf("%s",res);
	}
}

char *mystrstr (char *str,char *substr) {
	int len=strlen (substr);
	int k,j;
	for (int i=0; str[i]!='\0'; i++) {
		k=i;
		for (j=0; j<=len-1; j++) {
			if (str[k] != substr[j])
				break;
			k++;
		}
		if(j==len)
			return &str[i];
	}
	return NULL;
}
