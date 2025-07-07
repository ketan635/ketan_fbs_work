//strncat
#include <stdio.h>
#include <string.h>
void main (){
	char str1[20] = "ketan ";
    char str2[] = "borhade";

    strncat(str1, str2, 3);  

    printf("%s\n", str1);
}