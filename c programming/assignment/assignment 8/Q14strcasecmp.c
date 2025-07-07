//strcasecmp 
#include <stdio.h>
#include <string.h>
void main (){
	char str [] = "ketanborhade";
	char str1 []="ketan";
int res =strcasecmp (str,str1);
if (res==0)
printf("Strings are equal");
else if (res<=0)
printf("String 1 is greater");
else
printf("String 2 is greater");

}