
//WAP to Take in Two Strings and Display the Larger String without Using Built-in
//Functions
#include <stdio.h>
int mystrcmp(char *str1, char *str2);
void main() {
    char str1[] = "chaitanya";
    char str2[] = "bhagure
//Write a program to check the string is palindrome or not.
#include <stdio.h>
#include <string.h>
int isPalinstr (char*);
void main (){
	char str [70] ;
	printf("Enter the string :");
	scanf("%s",str);
	int res=isPalinstr (str);
	if (res==1)
	printf("String is palindrome");
	else
	printf("String is not palindrome");
}

int isPalinstr (char* str){
	int i=0;
	int len=strlen (str);
	int j=len-1;
	while (i<j){
		if (str[i] != str[j])
		return 0;
		i++;
		j--;
	}
	return 1;
}
";

    int result = mystrcmp(str1, str2);

    if (result == 0)
        printf("Strings are equal\n");
    else if (result < 0)
        printf("String 2 is greater\n");
    else
        printf("String 1 is greater\n");
}

int mystrcmp(char *str1, char *str2) {
    int i = 0;
    while (str1[i] != '\0' && str2[i] != '\0') {
        if (str1[i] != str2[i])
            return str1[i] - str2[i];
        i++;
    }
    return str1[i] - str2[i];  
}
