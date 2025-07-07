//strstr () Finds last occurance of a character in string
#include <stdio.h>
#include <string.h>
void main (){
	char str []="My name is Ketu";
	char *str2=strstr(str,"is");
	printf("%s",str2);
	
}