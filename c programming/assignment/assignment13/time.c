#include <stdio.h>

// Define a struct for Time
typedef struct time 
{
    int hour;
    int min;
    int sec;
} time;
time t;
void storeTime();
void display();

void main()
 {
    storeTime(); 
    display();    
}

void storeTime()
 {
    printf("Enter time (hour minute second): ");
    scanf("%d %d %d", &t.hour, &t.min, &t.sec);
}
void display()
 {
    printf("Time: %02d:%02d:%02d\n", t.hour, t.min, t.sec);
}
