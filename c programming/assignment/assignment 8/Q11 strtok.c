//strtok () tokenizing 	given string using delimeter
#include <stdio.h>
#include <string.h>
void main () {
	char str1 []="My name is Ketan And I am from India";
	char *str2 = strtok (str1," ");
while (str2 != NULL){
		printf("%s\n",str2);
		str2= strtok (NULL," ");
}
}