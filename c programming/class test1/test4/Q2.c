//Write a program to find power of any number.
#include <stdio.h>
void main (){
	double base,exponent,res=1;
	printf("Enter the base :");
	scanf("%lf",&base);
	printf("Enter the exponent :");
	scanf("%lf",&exponent);
	for(int i=1;i<=exponent;i++){
		res=res*base;
	}
	printf("%.1lf",res);
}