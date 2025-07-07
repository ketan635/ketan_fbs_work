#include <stdio.h>

typedef struct Employee{
	int id;
	char name[30];
	double salary;
}Employee;

void main (){
	Employee emp;
	printf("Enter the id : ");
	scanf("%d",&emp.id);
	printf("Enter the name :");
	scanf("%s",emp.name);
	printf("Enter the salary :");
	scanf("%lf",&emp.salary);
	
	printf("Id     : %d\n",emp.id);
	printf("Name   :%s\n",emp.name);
	printf("Salary :%lf\n",emp.salary);
	
	
	}
