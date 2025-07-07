
//Time (hour, min, sec)
#include <stdio.h>
typedef struct Time {
    int hour;
    int min;
    int sec;
} Time;
void main (){
	Time t;
	printf("Enter hour (0-23): ");
    scanf("%d", &t.hour);
    printf("Enter minute (0-59): ");
    scanf("%d", &t.min);
    printf("Enter second (0-59): ");
    scanf("%d", &t.sec);
    
      printf("Time: %02d:%02d:%02d\n", t.hour, t.min, t.sec);
}
