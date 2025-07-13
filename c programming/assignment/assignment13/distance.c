#include <stdio.h>
typedef struct distance 
{
    int feet;
    int inch;
} distance;
distance d;
void storeDistance();
void display();
void main() 
{
    storeDistance();  
    display();        
}
void storeDistance() {
    printf("Enter distance (feet inch): ");
    scanf("%d %d", &d.feet, &d.inch);
    if (d.inch >= 12) 
	{
        d.feet += d.inch / 12;
        d.inch = d.inch % 12;
    }
}

void display() {
    printf("Distance: %d feet %d inches\n", d.feet, d.inch);
}
