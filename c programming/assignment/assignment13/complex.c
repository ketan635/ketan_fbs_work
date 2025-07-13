#include <stdio.h>
typedef struct complex {
    float real;
    float imag;
} complex;
complex c;
void storeComplex();
void display();

int main() 
{
    storeComplex();
    display();      
}
void storeComplex()
 {
    printf("Enter complex number (real imaginary): ");
    scanf("%f %f", &c.real, &c.imag);
}

void display() {
    if (c.imag >= 0)
        printf("Complex number: %.2f + %.2fi\n", c.real, c.imag);
    else
        printf("Complex number: %.2f - %.2fi\n", c.real, -c.imag);
}
