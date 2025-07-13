#include <stdio.h>
// Date (date, month, year)
typedef struct date {
	int day;
	int month;
	int year;
} date;

date d;

void storeDate();
void display();

void main() {
	storeDate();
	display();
}


void storeDate() {
	printf("Enter the date (day month year): ");
	scanf("%d %d %d", &d.day, &d.month, &d.year);
}


void display() {
	printf("Date: %02d-%02d-%04d\n", d.day, d.month, d.year);
}
