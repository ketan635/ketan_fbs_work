
//strchr () use to find first occurance of a character in string

#include <stdio.h>
#include <string.h>
void main (){
	char str1 []="My name is ketan";
	char *str2 = strchr(str1,'n');
	printf("%s",str2);
}
